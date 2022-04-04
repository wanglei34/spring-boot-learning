package com.wl.book.service;

import com.wl.book.entity.Book;
import org.springframework.data.domain.Page;

import javax.persistence.criteria.CriteriaBuilder;

/**
 * @author 17997
 */
public interface BookService {
    /**
     * 不带条件查书
     * @param page
     * @param size
     * @return Page<Book>
     */
    Page<Book> findBookNoCriteria(Integer page, Integer size);

    /**
     * 带条件查书
     * @param page
     * @param size
     * @param book
     * @return Page<Book>
     */
    Page<Book> findBookCriteria(Integer page,Integer size,Book book);
}
