package servlet.manager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Servlet implementation class Quit
 */
@WebServlet("/bookmanager/quit")
public class Quit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = req.getSession();
		if (session.getAttribute("manager") != null) {
			session.removeAttribute("manager");
		}
		resp.sendRedirect(req.getContextPath() + "/loginManager.html");
	}

}
