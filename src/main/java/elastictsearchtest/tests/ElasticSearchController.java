package elastictsearchtest.tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class ElasticSearchController {

    @Autowired
    private ElasticSearchQuery elasticSearchQuery;

    @PostMapping("/createOrUpdateDocument")
    public ResponseEntity<product> createDocument(@RequestBody  product p) throws IOException {
        System.out.println(p.getName());
        product newProduct=elasticSearchQuery.createOrUpdateDocument(p);
        return new ResponseEntity<>(newProduct, HttpStatus.CREATED);
    }

    @GetMapping("/welcome")
    public ResponseEntity<String> greetings() {
        return new ResponseEntity<>("Hello", HttpStatus.CREATED);
    }
}