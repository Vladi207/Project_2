package ru.grashchenko.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.grashchenko.springcourse.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
