package controller.book;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookDAO;
import vo.BookVO;

@WebServlet("/bookUpdate")
public class BookUpdateController extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 필터 적용함
//		request.setCharacterEncoding("utf-8");
		
		BookVO book = new BookVO();
		book.setBookNo(Integer.parseInt(request.getParameter("bookNo")));

		//동적으로 받아야댐
		book.setContent(request.getParameter("content"));
		new BookDAO().updateBook(book);
		
		response.sendRedirect("bookList");
	}

}