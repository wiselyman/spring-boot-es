package top.wisely.springbootes.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
@Data
@AllArgsConstructor
@Document(indexName = "person", type = "person", shards = 1, replicas = 0, refreshInterval = "-1")
public class Person {
    @Id
    private Long id;
    private String name;
    private School school;
}
