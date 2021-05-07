package bean;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

public class GetOneServlet extends HttpServlet{
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Hero gailun = new Hero();
		gailun.setName("Gailun");
		gailun.setHp(353);
		
		JSONObject json = new JSONObject();
		json.put("gailun", JSONObject.fromObject(gailun));
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().print(json);
	}
}
