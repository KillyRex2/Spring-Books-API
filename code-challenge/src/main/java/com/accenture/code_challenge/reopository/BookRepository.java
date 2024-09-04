package com.accenture.code_challenge.reopository;

import com.accenture.code_challenge.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
