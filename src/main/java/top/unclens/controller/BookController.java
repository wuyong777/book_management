package top.unclens.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import top.unclens.pojo.Books;
import top.unclens.service.BookService;

import java.util.List;

@Controller
@RequestMapping("/book")  //不注释会导致bootstrap失效—>为什么？
public class BookController {
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    /*    public void setBookService(BookService bookService) {
            this.bookService = bookService;
        }*/
    @RequestMapping("/allBooks")
    public String list(Model model) {
        List<Books> books = bookService.queryAllBook();
        model.addAttribute("books", books);
        return "allBooks";
    }

    @RequestMapping("/toAddBook")
    public String toAddBook() {
        return "addBook";
    }

    @RequestMapping("addBook")
    public String addBook(Books book) {
        bookService.addBook(book);
        return "redirect:/book/allBooks";
    }

    @RequestMapping("toUpdateBook")
    public String toUpdateBook(int id, Model model) {
        Books book = bookService.queryBookById(id);
        model.addAttribute("book", book);
        return "updateBook";
    }

    @RequestMapping("updateBook")
    public String updateBook(Books book) {
        bookService.updateBook(book);
        return "redirect:/book/allBooks";
    }

    @RequestMapping("deleteBookById")
    public String deleteBookById(int id) {
        bookService.deleteBookById(id);
        return "redirect:/book/allBooks";
    }
    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName,Model model){
        List<Books> books = bookService.queryBookByName(queryBookName);
        model.addAttribute("name",queryBookName);
        model.addAttribute("books", books);
        return "allBooks";
    }
}
