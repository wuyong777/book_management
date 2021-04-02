package top.unclens.service;

import top.unclens.dao.BookMapper;
import top.unclens.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService {
    //service层调用dao层，  Spring注入
    private BookMapper bookMapper;
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }



    public int addBook(Books book) {
        return bookMapper.addBook(book);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books book) {
        return bookMapper.updateBook(book);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    public List<Books> queryBookByName(String queryBookName) {
        return bookMapper.queryBookByName(queryBookName);
    }
}
