 <%@ include file="header.jsp" %>
 <%
 if(session.getAttribute("user")!=null)
{
    out.print("Hello "+session.getAttribute("user")+",");
}
 %>
 Test web app !<br/><br/>
 To test web application security
  <%@ include file="footer.jsp" %>