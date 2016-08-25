package controller.book;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookDAO;
import vo.BookVO;

@WebServlet("/booklist")
public class BookListController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<BookVO> list = new BookDAO().selectBook();
		
		req.setAttribute("list", list);
		RequestDispatcher rd = req.getRequestDispatcher("/jsp/showBook.jsp");
		rd.forward(req, resp);
	}
	
}
