package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import util.MyAppSqlConfig;
import vo.BookVO;

public class BookDAO {

	private static SqlSession session;

	public BookDAO() {
		session = MyAppSqlConfig.getSqlSessionInstance();
	}

	// 방명록 보기
	public List<BookVO> selectBook() {
		return session.selectList("dao.bookDAO.selectBook");
	}

	// 방명록 등록
	public void insertBook(BookVO book) {
		session.insert("dao.BookDAO.insertBook", book);
		session.commit();
	}

	// 방명록 수정
	public int updateBook(BookVO book){
		int cnt = session.update("dao.BookDAO.updateBook", book);
		session.commit();
		return cnt;
	}
	//방명록 삭제
	
		public int deleteBook(int delNo){
		int cnt = session.delete("dao.BookDAO.deleteBook", delNo);
		session.commit();
		return cnt;
	}
}
