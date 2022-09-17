package ru.grashchenko.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.grashchenko.springcourse.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
