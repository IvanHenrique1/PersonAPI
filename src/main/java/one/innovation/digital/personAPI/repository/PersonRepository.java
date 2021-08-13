package one.innovation.digital.personAPI.repository;

import one.innovation.digital.personAPI.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
