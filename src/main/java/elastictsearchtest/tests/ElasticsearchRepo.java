package elastictsearchtest.tests;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElasticsearchRepo extends ElasticsearchRepository<product,String> {
}
