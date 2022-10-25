# User Guide

- [User Guide](#user-guide)
  - [Sample data](#sample-data)
  - [Create an index](#create-an-index)
  - [Index data](#index-data)
  - [Search for the document](#search-for-the-document)
  - [Search documents using a match query](#search-documents-using-a-match-query)
  - [Aggregations](#aggregations)
  - [Delete the document](#delete-the-document)
  - [Delete the index](#delete-the-index)
  - [Aggregations](#aggregations)

## Sample data

### IndexData class

```java
static class IndexData {
  private String firstName;
  private String lastName;

  public IndexData(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return String.format("IndexData{first name='%s', last name='%s'}", firstName, lastName);
  }
}
```

## Create an index

```java
String index = "sample-index";
CreateIndexRequest createIndexRequest = new CreateIndexRequest.Builder().index(index).build();
client.indices().create(createIndexRequest);
```

## Index data

```java
IndexData indexData = new IndexData("John", "Doe");
IndexRequest<IndexData> indexRequest = new IndexRequest.Builder<IndexData>().index(index).id("1").document(indexData).build();
client.index(indexRequest);

indexData = new IndexData("John", "Joe");
indexRequest = new IndexRequest.Builder<IndexData>().index(index).id("2").document(indexData).build();
client.index(indexRequest);
```

## Search for the documents

```java
SearchResponse<IndexData> searchResponse = client.search(s -> s.index(index), IndexData.class);
for (int i = 0; i < searchResponse.hits().hits().size(); i++) {
  System.out.println(searchResponse.hits().hits().get(i).source());
}
```

## Search documents using a match query

```java
SearchRequest searchRequest = new SearchRequest.Builder().query(q -> q.match(m -> m.field("firstName")
                                                                                   .query(FieldValue.of("John"))))
                                                         .build();

SearchResponse<IndexData> searchResponse = client.search(searchRequest, IndexData.class);
for (int i = 0; i < searchResponse.hits().hits().size(); i++) {
  System.out.println(searchResponse.hits().hits().get(i).source());
}
```

## Aggregations

```java
SearchRequest searchRequest = new SearchRequest.Builder().query(q -> q.match(m -> m.field("firstName")
                                                                                   .query(FieldValue.of("John"))))
                                                         .aggregations("firstNames", new Aggregation.Builder().terms(t -> t.field("firstName.keyword"))
                                                                                                              .build())
                                                         .build();

SearchResponse<IndexData> searchResponse = client.search(searchRequest, IndexData.class);
for (Map.Entry<String, Aggregate> entry : searchResponse.aggregations().entrySet()) {
  System.out.println("Agg - " + entry.getKey());
  entry.getValue().sterms().buckets().array().forEach(b -> System.out.printf("%s : %d%n", b.key(), b.docCount()));
}
```

## Delete the document

The following sample code deletes a document whose ID is 1.

```java
client.delete(d -> d.index(index).id("1"));
```

## Delete the index

```java
DeleteIndexRequest deleteIndexRequest = new DeleteRequest.Builder().index(index).build();
DeleteIndexResponse deleteIndexResponse = client.indices().delete(deleteIndexRequest);
```