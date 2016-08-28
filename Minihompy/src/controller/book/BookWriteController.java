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
		book.setUserNo(1);
		book.setWriterName(req.getParameter("writerUserName"));
		book.setContent(req.getParameter("content"));
		book.setWriterUserNo(Integer.parseInt(req.getParameter("writerUserNo")));
		
		//게시물 저장
		new BookDAO().insertBook(book);
		
		resp.sendRedirect("bookList");
	}
}