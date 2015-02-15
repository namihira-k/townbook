<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
<jsp:include page="header.jsp" flush="false"/>
</head>

<body>
<jsp:include page="navbar.jsp" flush="false"/>
<form class="navbar-form navbar-left" role="search" action="/townbook/events" method="post">
  <div class="form-group">
     タイトル：<input type="text" name="title" class="form-control" placeholder=""><br>
  <button type="submit" class="btn btn-default">登録</button>
  </div>
</form>

</body>
</html>
