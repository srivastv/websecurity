package vs.testapp.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CSRFFilter implements Filter
{

    public void destroy() {
        // TODO Auto-generated method stub

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
            throws IOException, ServletException {
        // TODO Auto-generated method stub

        System.out.println("REACHED DO FILTER FOR CSRF FILTER");
        HttpServletResponse myResponse = (HttpServletResponse) response;
        HttpServletRequest myRequest = (HttpServletRequest) request;
//        SecureResponseWrapper responseWrapper = new SecureResponseWrapper(myResponse);
//        //responseWrapper.addHeader("Access-Control-Allow-Origin", "VARUN");
//        //responseWrapper.addHeader("Content-Security-Policy", "script-src 'self' 'unsafe-inline'");
//        //responseWrapper.addHeader("Content-Security-Policy", "script-src 'self' 'unsafe-inline'; report-uri /cspViolation;");
//        responseWrapper.addHeader("Content-Security-Policy-Report-Only", "script-src 'self' 'unsafe-inline'; report-uri /cspViolation;");
//
//        responseWrapper.addHeader("X-Custom header", "VARUN123");
//        System.out.println("HEADERS ADDED .... ");

        String cookie = getCookieValue("csrf_token_id", myRequest);

        System.out.println("CSRF TOKEN FROM COOKIE : " + cookie);

        filterChain.doFilter(request, myResponse);

    }

    public void init(FilterConfig arg0) throws ServletException {
        // TODO Auto-generated method stub

    }

    public static String getCookieValue(
        String cookieName, HttpServletRequest request)
    {
        if (request == null || cookieName == null) {
            return null;
        }

        javax.servlet.http.Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(cookieName)) {
                    return cookie.getValue();
                }
            }
        }
        return null;
    }



}
