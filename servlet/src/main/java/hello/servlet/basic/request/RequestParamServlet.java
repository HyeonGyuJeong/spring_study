package hello.servlet.basic.request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 1. �Ķ���� ���� ��� http://localhost:8080/request-param?username=hello&age=20
 *
 */
@WebServlet(name = "requestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[��ü �Ķ���� ��ȸ] - start");

		request.getParameterNames().asIterator()
				.forEachRemaining(paramName -> System.out.println(paramName + " = " + request.getParameter(paramName)));

		System.out.println("[��ü �Ķ���� ��ȸ] - end");
		System.out.println();
		
		System.out.println("[���� �Ķ���� ��ȸ]");
		String username = request.getParameter("username");
		String age = request.getParameter("age");
		
		System.out.println("username = " + username);
		System.out.println("age = " + age);
		
		System.out.println("[�̸��� ���� ���� �Ķ���� ��ȸ]");
		String[] usernames = request.getParameterValues("username");
		for (String name : usernames) {
			System.out.println("username = " + name);
		}
		
		response.getWriter().write("OK");
	}

}
