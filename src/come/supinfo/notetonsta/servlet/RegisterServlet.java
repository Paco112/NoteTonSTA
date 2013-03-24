package come.supinfo.notetonsta.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.supinfo.notetonsta.dao.DaoFactory;
import com.supinfo.notetonsta.dao.SpeakerDao;
import com.supinfo.notetonsta.entity.Speaker;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/login/register")
public class RegisterServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	private SpeakerDao speakerDao;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
    	speakerDao = DaoFactory.getInstance().getSpeakerDao();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("null")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("submit") != null)
		{
			try
			{
				Speaker newSpeaker = new Speaker();
				newSpeaker.setSpeaker_lastname(request.getParameter("lastname"));
				newSpeaker.setSpeaker_firstname(request.getParameter("firstname"));
				newSpeaker.setSpeaker_email(request.getParameter("email"));
				newSpeaker.setSpeaker_password(request.getParameter("passwd"));			
				speakerDao.addSpeaker(newSpeaker);
			}
			finally
			{
				
			}
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("/login/register.jsp").forward(req, resp);
	}

}
