package com.levi.web.controller;

import com.levi.web.model.Book;
import com.levi.web.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("books")
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("list")
    public String List(Model model){
        //查
        List<Book> allbook = bookService.findAllbook();
        //存
        model.addAttribute("books",allbook);
        //System.out.println(allbook);
        return "books/list";
    }
    @RequestMapping("save")
    public String Save(Model model){
        Book book  = new Book();
        book.setBookName("化学");
        book.setIsbn("1234");
        bookService.saveorupdate(book);
        return "forward:list.do";
    }

    @RequestMapping("delete")
    public String delete(Integer id,Model model){
       bookService.delById(id);
        return "forward:list.do";
    }

    @RequestMapping("edit")
    public String edit(Integer id,Model model){
        Book book = bookService.findById(id);
        if (book!=null){
            model.addAttribute("book",book);
        }
        return "books/edit";
    }

    @RequestMapping("update")
    public String update(Book book,Model model){
        //System.out.println(book);
        bookService.saveorupdate(book);
        return "forward:list.do";
    }
}
