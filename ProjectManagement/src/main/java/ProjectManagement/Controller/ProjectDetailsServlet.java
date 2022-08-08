package ProjectManagement.Controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ProjectManagement.Dao.ProjectAllocatedDao;
import ProjectManagement.Dao.ProjectDetailsDao;
import ProjectManagement.Model.Benchpool;
import ProjectManagement.Model.Project;

/**
 * Servlet implementation class ProjectDetailsServlet
 */
@WebServlet("/ProjectDetailsServlet")
public class ProjectDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProjectDetailsServlet() {
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
		ArrayList<Project> projectList = new ArrayList<>();
		
		ProjectDetailsDao projectDao = new ProjectDetailsDao();
		ProjectAllocatedDao allocateDao = new ProjectAllocatedDao();
		try {
			ResultSet rs = projectDao.getProjectDetails();
			while(rs.next()) {
				Project project = new Project();
				project.setProject_ID(rs.getString("project_ID"));
				project.setprojOrgName(rs.getString("proj_Org_Name"));
				project.setProj_Requirement(rs.getString("proj_Requirement"));
				project.setprojManager(rs.getString("proj_Manager"));
				project.setsolutionArchitect(rs.getString("Solution_Architect"));
				project.setdateOfReceivingProj(rs.getString("Date_of_receiving_proj"));
				project.setexpectedCompletionDate(rs.getString("Expected_Completion_Date"));
				projectList.add(project);
			}
			
			request.setAttribute("benchpool", allocateDao.getBenchpool());
			request.setAttribute("project", projectList);
			request.getRequestDispatcher("/ProjectDetails.jsp").forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
