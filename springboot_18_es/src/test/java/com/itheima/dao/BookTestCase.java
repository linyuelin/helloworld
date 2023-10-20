package com.itheima.dao;

import com.alibaba.fastjson.JSON;
import com.itheima.domain.Book;
import org.elasticsearch.action.admin.indices.create.CreateIndexRequest;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.List;

@SpringBootTest
public class BookTestCase {

    @Autowired
    private RestHighLevelClient client;

    @Autowired
    private  BookDao bookDao;


//    @Autowired
//    public BookTestCase(RestHighLevelClient client) {
//        this.client = client;
//    }



//    @Test
//    void testCreate() throws IOException {
//        HttpHost host = HttpHost.create("http://localhost:9200");
//        RestClientBuilder builder = RestClient.builder(host);
//        client = new RestHighLevelClient(builder);
//        client.close();
//
//
//    }




    @Test
    void testCreateIndex() throws IOException {


        CreateIndexRequest request = new CreateIndexRequest("books");
        client.indices().create(request, RequestOptions.DEFAULT);

    }


    @Test
    void testCreateIndexByIK() throws IOException {


        CreateIndexRequest request = new CreateIndexRequest("books");

        String json = "{\n" +
                "  \"mappings\": {\n" +
                "    \"properties\": {\n" +
                "      \"id\": {\n" +
                "        \"type\": \"keyword\"\n" +
                "      },\n" +
                "      \"name\": {\n" +
                "        \"type\": \"text\"\n" +
                "      },\n" +
                "      \"description\": {\n" +
                "        \"type\": \"text\"\n" +
                "      },\n" +
                "      \"type\": {\n" +
                "        \"type\": \"keyword\"\n" +
                "      }\n" +
                "    }\n" +
                "}";


        // 设置参数
        request.source(json, XContentType.JSON);
        client.indices().create(request, RequestOptions.DEFAULT);



    }

    @Test
    void testCreateDoc() throws IOException {
        Book book = bookDao.selectById(1);
        IndexRequest request = new IndexRequest("books").id(book.getId().toString());
        String json = JSON.toJSONString(book);
        request.source(json,XContentType.JSON);
        client.index(request,RequestOptions.DEFAULT);
    }

    @Test
    void testCreateDocAll() throws IOException {
        List<Book> list = bookDao.selectList(null);
        BulkRequest bulkRequest = new BulkRequest();

        for (Book book : list) {
            IndexRequest request = new IndexRequest("books").id(book.getId().toString());
            String json = JSON.toJSONString(book);
            request.source(json,XContentType.JSON);

            bulkRequest.add(request);

        }

        client.bulk(bulkRequest,RequestOptions.DEFAULT);
    }

    @Test
    void testGet() throws IOException {

        GetRequest request  = new GetRequest("books","1");
        GetResponse documentFields = client.get(request, RequestOptions.DEFAULT);
        String sourceAsString = documentFields.getSourceAsString();
        System.out.println(sourceAsString);
    }

    @Test
    void testSearch() throws IOException {
        SearchRequest request = new SearchRequest("books");
        SearchSourceBuilder builder = new SearchSourceBuilder();
        builder.query(QueryBuilders.termQuery("type","文学"));
        request.source(builder);

        SearchResponse search = client.search(request, RequestOptions.DEFAULT);
        SearchHits hits = search.getHits();
        for (SearchHit hit : hits) {
            String sourceAsString = hit.getSourceAsString();
//            System.out.println(sourceAsString);
            Book book = JSON.parseObject(sourceAsString, Book.class);
            System.out.println(book);
        }

    }
}









