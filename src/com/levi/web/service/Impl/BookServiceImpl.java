package com.levi.web.service.Impl;

import com.levi.web.mapper.BookMapper;
import com.levi.web.model.Book;
import com.levi.web.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public List<Book> findAllbook() {
        return bookMapper.findAllBook();
    }

    @Override
    public Book findById(int id) {
        return bookMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveorupdate(Book book) {
        if (book.getId()==null){
            bookMapper.insert(book);

            //测试事务
            // int i = 1/0;
        }else {
            bookMapper.updateByPrimaryKey(book);
            /*bookMapper.updateByPrimaryKeySelective(book);*/
        }
    }

    @Override
    public void delById(int id) {
        bookMapper.deleteByPrimaryKey(id);
    }
}
