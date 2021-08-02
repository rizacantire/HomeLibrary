package com.rza.HomeLibrary.dataAccess.abstracts;

import com.rza.HomeLibrary.entities.concretes.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDao extends JpaRepository<Book, Integer> {
}
