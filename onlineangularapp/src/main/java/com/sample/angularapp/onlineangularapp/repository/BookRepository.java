package com.sample.angularapp.onlineangularapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.angularapp.onlineangularapp.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
