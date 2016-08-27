package controller.book;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import dao.BookDAO;
import vo.BookVO;
@WebServlet("/bookWrite")
public class BookWriteController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		BookVO book= new BookVO();
		book.setWriterUserNo(1);
		book.setUserNo(21);
		book.setContent("content");
		
		//게시물 저장
		BookDAO dao = new BookDAO();
		dao.insertBook(book);
		resp.sendRedirect("/bookList");
	}
}