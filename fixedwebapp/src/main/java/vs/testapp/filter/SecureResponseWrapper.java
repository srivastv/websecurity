package vs.testapp.filter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class SecureResponseWrapper extends HttpServletResponseWrapper
{

    public SecureResponseWrapper(HttpServletResponse response) {
        super(response);
        // TODO Auto-generated constructor stub
    }

}
