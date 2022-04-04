package com.wl.book.dao;

import com.wl.book.entity.Book;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author 17997
 */
public interface BookRepository extends JpaRepository<Book,Integer>, JpaSpecificationExecutor <Book>{
}
