package vs.testapp.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchAction extends HttpServlet
{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        doPost(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String keyword = request.getParameter("keyword");
        // Add search logic here

        request.setAttribute("keyword", keyword);

        RequestDispatcher rd = request.getRequestDispatcher("/vulnerability/xss/search_result.jsp");
        rd.forward(request, response);
    }
}
