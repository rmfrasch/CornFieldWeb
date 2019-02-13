package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.FieldDescription;

/**
 * Servlet implementation class AddFieldServlet
 */
@WebServlet("/AddFieldServlet")
public class AddFieldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddFieldServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String field = request.getParameter("fieldName");
		
		FieldDescription fd = new FieldDescription(field);
		ListFieldHelper thisField = new ListFieldHelper();
		thisField.insertField(fd);
		
		getServletContext().getRequestDispatcher("/index.html").forward(request, response);
	}

}
