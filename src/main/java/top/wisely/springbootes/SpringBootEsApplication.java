package top.wisely.springbootes;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import top.wisely.springbootes.domain.Person;
import top.wisely.springbootes.domain.School;
import top.wisely.springbootes.repository.PersonRepository;

import java.util.List;

@SpringBootApplication
@Slf4j
public class SpringBootEsApplication {
	@Bean
	CommandLineRunner saveCLR(PersonRepository personRepository){
		School school1 = new School("XX大学","合肥");
		Person person1 = new Person(1l,"王某某",school1);

		School school2 = new School("YY大学","武汉");
		Person person2 = new Person(2l,"汪某某",school2);

		return e -> {
			personRepository.save(person1);
			personRepository.save(person2);

			log.info(String.valueOf("数据量为:" + personRepository.count()));

			List<Person> people = personRepository.findByNameContaining("某某");
			for (Person person : people){
				log.info(person.toString());
			}

			List<Person> people2 = personRepository.findBySchoolNameContaining("XX");
			for (Person person : people2){
				log.info(person.toString());
			}

		};

	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootEsApplication.class, args);
	}
}
