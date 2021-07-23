package driver;

import java.io.IOException;
import java.io.Reader;
import java.util.stream.Collector;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import Dao.loginDao;
import obj.user;

//@WebServlet("*");
public class HelloServlet extends HttpServlet {
	private Gson gson=new Gson();
	String registerForm ="html/mainPage.html";
	//RequestDispatcher dispatcher = request.getRequestDispatcher(registerForm);
	//dispatcher.forward(request, response);

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Content-Type", "application/json");
		//String uri =request.getRequestURI();
		//System.out.println(uri);
		/*int i=Integer.parseInt(request.getParameter("num1"));
		int j=Integer.parseInt(request.getParameter("num2"));
		int k=i+j;
		response.setContentType("text/plain");
		PrintWriter out=response.getWriter();
		out.println("The sum is: " + k);
		//gson.*/
		response.getWriter().append("it works but get?");
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		response.setHeader("Access-Control-Allow-Origin", "*");
		//response.setHeader("Content-Type", "application/json");
		//response.setHeader("Access-Control-Allow-Origin", "*");
		user u=gson.fromJson(request.getReader(),user.class);
		if(u!=null){
			loginDao dao=new loginDao();
			String arr[]=dao.getAll(u);
			System.out.println(arr[0]);
			response.getWriter().append(gson.toJson(arr[0]+arr[1]));
			//response.getWriter().append(gson.toJson(arr[1]));
		}
		//response.getWriter().append("it works?");
		//gson.toJson
		//SONObject o=
		//response.getWriter().append(request.getSession().getAttribute("banana"));
		
	}
	
}
