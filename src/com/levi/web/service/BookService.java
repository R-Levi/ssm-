package com.levi.web.service;

import com.levi.web.model.Book;

import java.util.List;

public interface BookService {
    public List<Book> findAllbook();
    public Book findById(int id);
    public void saveorupdate(Book book);
    public void delById(int id);
}
