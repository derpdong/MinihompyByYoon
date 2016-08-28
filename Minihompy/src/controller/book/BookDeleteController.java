package controller.book;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookDAO;

@WebServlet("/bookDelete")
public class BookDeleteController extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		new BookDAO().deleteBook(Integer.parseInt(request.getParameter("bookNo")));
		
		response.sendRedirect(request.getContextPath()+"/bookList");
	}
	
}
