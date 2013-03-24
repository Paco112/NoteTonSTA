package come.supinfo.notetonsta.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.supinfo.notetonsta.dao.CampusDao;
import com.supinfo.notetonsta.dao.DaoFactory;
import com.supinfo.notetonsta.entity.Campus;

/**
 * Servlet implementation class CampusServlet
 */
@WebServlet(name = "CampusServlet", urlPatterns = { "/campus" })
public class CampusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    private CampusDao campusDao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CampusServlet() {
    	
    	campusDao = DaoFactory.getInstance().getCampusDao();
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Campus> campus = campusDao.getAllCampus();
		request.setAttribute("campus", campus);
		request.getRequestDispatcher("/campus.jsp").forward(request, response);
	}

}
