package controller.book;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.BookDAO;
import vo.BookMainVO;
import vo.BookVO;

@WebServlet("/bookList")
public class BookListController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		HttpSession session = req.getSession();
//		UserVO user = (UserVO)session.getAttribute("LOGIN_USER_INFO");
		List<BookMainVO> list = new BookDAO().selectBook(1);
		
//		System.out.println("방명록 주인한테 쓴 글들" + list);
		
		req.setAttribute("list", list);
		RequestDispatcher rd = req.getRequestDispatcher("/jsp/bookList.jsp");
		rd.forward(req, resp);
	}
}