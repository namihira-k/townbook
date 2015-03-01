<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
<jsp:include page="../header.jsp" flush="false"/>
</head>

<body>
<jsp:include page="../navbar.jsp" flush="false"/>
<form class="navbar-form navbar-left" role="search" action="/townbook/events" method="post">
  <div class="form-group">
     イベント名：<input type="text" name="title" class="form-control" placeholder=""><br>
    都道府県：<input type="text" name="prefecture" class="form-control" placeholder=""><br>
    街：<input type="text" name="town" class="form-control" placeholder=""><br>
     内容：<input type="text" name="content" class="form-control" placeholder=""><br>
  <button type="submit" class="btn btn-default">登録する</button>
  </div>
</form>

</body>
</html>
