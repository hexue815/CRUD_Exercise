package bean;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.HeroDAO;

public class HeroAddServlet extends HttpServlet{
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		//response.getWriter().println("<h1>adfadfadfa</h1>");
		Hero hero = new Hero();
		hero.setName(request.getParameter("name"));
		hero.setDamage(Integer.parseInt(request.getParameter("damage")));
		hero.setHp(Float.parseFloat(request.getParameter("hp")));
		new HeroDAO().add(hero);
		
		//response.sendRedirect("/listHero");
		response.sendRedirect(request.getServletContext().getContextPath() + "/listHero");
	}
}
