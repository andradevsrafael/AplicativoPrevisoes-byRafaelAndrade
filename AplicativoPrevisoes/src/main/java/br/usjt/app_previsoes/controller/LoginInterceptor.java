package br.usjt.app_previsoes.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {
	
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler)

			throws Exception {
			//Aqui eu pego a sessão
			HttpSession session = request.getSession();
			//Se ainda não logou, ele manda para a página de login
			if (session.getAttribute("usuarioLogado") == null)
			response.sendRedirect("/login");
			//Caso contrário se já logou, a requisição passa e chega no controller
			return true;
			}
}
