package ProjectManagement.Controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ProjectManagement.Dao.ProjectAllocatedDao;
import ProjectManagement.Dao.ProjectDetailsDao;
import ProjectManagement.Model.Project;

/**
 * Servlet implementation class ProjectManagementServlet
 */
@WebServlet("/AddProjectServlet")
public class AddProjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProjectServlet() {
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
		Project projectdetails = new Project();
		projectdetails.setProject_ID(request.getParameter("projectID"));
		projectdetails.setprojOrgName(request.getParameter("projOrgName"));
		projectdetails.setProj_Requirement(request.getParameter("projRequirement"));
		projectdetails.setprojManager(request.getParameter("projManager"));
		projectdetails.setsolutionArchitect(request.getParameter("solutionArchitect"));
		projectdetails.setdateOfReceivingProj(request.getParameter("dateOfReceivingProj"));
		projectdetails.setexpectedCompletionDate(request.getParameter("expectedCompletionDate"));
		
		ProjectDetailsDao projectDetailsDao = new ProjectDetailsDao();
		ProjectAllocatedDao allocateDao = new ProjectAllocatedDao();
		try {
			projectDetailsDao.addProjectDetails(projectdetails);
			projectDetailsDao.initialiseBenchpool(projectdetails.getprojOrgName());
			request.setAttribute("project", projectdetails);
			request.setAttribute("benchpool", allocateDao.getBenchpool());
			request.getRequestDispatcher("/ProjectAllocate.jsp").forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			response.sendRedirect("AddError.jsp");
		}	
	}
}
