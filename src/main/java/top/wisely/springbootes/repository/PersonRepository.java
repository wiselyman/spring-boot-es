package top.wisely.springbootes.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import top.wisely.springbootes.domain.Person;

import java.util.List;

public interface PersonRepository extends ElasticsearchRepository<Person,Long> {
    List<Person> findByNameContaining(String name);
    List<Person> findBySchoolNameContaining(String schoolName);
}
