package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.FieldDescription;

/**
 * Servlet implementation class editItemServlet
 */
@WebServlet("/editItemServlet")
public class editItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editItemServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ListFieldHelper lfh = new ListFieldHelper();
		String fieldName = request.getParameter("fieldName");
		Integer tempId = Integer.parseInt(request.getParameter("fieldID"));
		FieldDescription itemToUpdate = lfh.searchForItemByFieldID(tempId);
		itemToUpdate.setFieldName(fieldName);
		lfh.updateField(itemToUpdate);
		getServletContext().getRequestDispatcher("/viewAllFieldsServlet").forward(request, response);
		doGet(request, response);
	}

}
