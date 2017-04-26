<html class="no-js" lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Foundation for Sites</title>
    <link rel="stylesheet" href="css/foundation.css">
    <link rel="stylesheet" href="css/app.css">
  </head>

  <body>
<%@ include file="header.jsp" %>
<div class="row">
<form id="form1" name="form1" method="POST" action="/search">
    <label>Please Enter Keyword:
    <input  type="text" name="keyword"/>
    </label>
<br>
<input type="submit" name="action" value="Search"/>
</form>
<br/>
</div>
 <%@ include file="footer.jsp" %>${message}
 </body>
 </html>