package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import util.MyAppSqlConfig;
import vo.BookMainVO;
import vo.BookVO;

public class BookDAO {

	private static SqlSession session;

	public BookDAO() {
		session = MyAppSqlConfig.getSqlSessionInstance();
	}

	// 방명록 보기
	public List<BookMainVO> selectBook(int userNo) {
		return session.selectList("dao.BookDAO.selectBook", userNo);
	}

	// 방명록 등록
	public void insertBook(BookVO book) {
		session.insert("dao.BookDAO.insertBook", book);
		session.commit();
	}

	// 방명록 수정
	public void updateBook(BookVO book){
		session.update("dao.BookDAO.updateBook", book);
		session.commit();		
	}
	//수정을 위한 방명록 부르기
	public BookVO selectBookByNo(int i) {
		BookVO book = session.selectOne("dao.BookDAO.selectBookByNo", i);
		return book;
	}
	
	//방명록 삭제
		public int deleteBook(int delNo){
		int cnt = session.delete("dao.BookDAO.deleteBook", delNo);
		session.commit();
		return cnt;
	}
}
