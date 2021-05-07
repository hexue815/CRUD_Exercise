package bean;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.HeroDAO;
import net.sf.json.JSONObject;

public class SubmitServlet extends HttpServlet{
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String data =  request.getParameter("data");
		
		System.out.println("1: "+data);
		
		JSONObject json=JSONObject.fromObject(data);
		
		System.out.println("2: "+json);
		
		Hero hero = (Hero) JSONObject.toBean(json,Hero.class);
		System.out.println("3: "+hero);
		System.out.println(hero.name);
		System.out.println(hero.hp);
		System.out.println(hero.damage);
		
		//new HeroDAO().add(hero);
		
		//response.sendRedirect(request.getServletContext().getContextPath()+"/listHero");
	}
}
