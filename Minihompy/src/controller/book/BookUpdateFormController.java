package controller.book;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookDAO;
import vo.BookVO;

@WebServlet("/bookUpdateForm")
public class BookUpdateFormController extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BookVO book = new BookDAO().selectBookByNo(Integer.parseInt(request.getParameter("bookNo")));

		request.setAttribute("book", book);
		

		RequestDispatcher rd = request.getRequestDispatcher("/jsp/bookUpdateForm.jsp?no=" + book.getBookNo());
		rd.forward(request, response);
	}
}