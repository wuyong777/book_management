package top.unclens.service;

import org.apache.ibatis.annotations.Param;
import top.unclens.pojo.Books;

import java.util.List;

public interface BookService {
    /**
     * 增加一本书
     * @param book
     * @return
     */
    int addBook(Books book);


    /**
     * 删除一本书
     * @param id
     * @return
     */
    int deleteBookById(@Param("bookId") int id);


    /**
     * 修改一本
     * @param book
     * @return
     */
    int updateBook(Books book);


    /**
     * 查询一本书
     * @param id
     * @return
     */
    Books queryBookById(@Param("bookId") int id);


    /**
     * 查询所有书
     * @return
     */
    List<Books> queryAllBook();
}
