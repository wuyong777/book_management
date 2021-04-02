package top.unclens.dao;

import org.apache.ibatis.annotations.Param;
import top.unclens.pojo.Books;

import java.util.List;

public interface BookMapper {
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

    List<Books> queryBookByName(String queryBookName);
}
