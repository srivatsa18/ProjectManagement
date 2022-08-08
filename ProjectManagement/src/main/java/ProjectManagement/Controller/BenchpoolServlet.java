package ProjectManagement.Controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ProjectManagement.Dao.ProjectAllocatedDao;
import ProjectManagement.Model.Benchpool;

/**
 * Servlet implementation class BenchpoolServlet
 */
@WebServlet("/BenchpoolServlet")
public class BenchpoolServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BenchpoolServlet() {
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
		ArrayList<Integer> benchList = new ArrayList<>();
		ArrayList<Integer> memList = new ArrayList<>();
		ArrayList<Integer> remList = new ArrayList<>();
		ArrayList<String> deptList = new ArrayList<>();
		
		ProjectAllocatedDao allocateDao = new ProjectAllocatedDao();
		
		String orgName = request.getParameter("orgName");
		
		try {
			ArrayList<Benchpool> benchpoolList = allocateDao.getBenchpool();
			
			for(int i = 0; i < benchpoolList.size(); i++) {
				String name = "";
				String members = request.getParameter(name+i);
				
				if(members != null) {
					int mem = Integer.parseInt(members);
					benchList.add(mem);
				}
				else benchList.add(0);
				memList.add(benchpoolList.get(i).getMembers());
				deptList.add(benchpoolList.get(i).getDeptName());
			}
			
			for(int i = 0; i < memList.size(); i++) {
				remList.add(memList.get(i) - benchList.get(i));
			}
			System.out.println(benchList);
			System.out.println(memList);
			System.out.println(deptList);
			System.out.println(remList);
			
			for(int i = 0; i < memList.size(); i++) {
				allocateDao.updateBenchpool(orgName, deptList.get(i), benchList.get(i), remList.get(i));
			}
			response.sendRedirect("Navigation.jsp");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			response.sendRedirect("AllocateError.jsp");
		}
	}

}
