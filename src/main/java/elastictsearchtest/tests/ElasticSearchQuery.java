package elastictsearchtest.tests;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.core.*;
import co.elastic.clients.elasticsearch.core.search.Hit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class ElasticSearchQuery {

    @Autowired
    private ElasticsearchRepo elasticsearchRepo;

    private final String indexName = "products";


    public product createOrUpdateDocument(product p) throws IOException {
             return elasticsearchRepo.save(p);
    }

}
