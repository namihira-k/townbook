<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
<jsp:include page="../header.jsp" flush="false"/>
</head>

<body>
<jsp:include page="../navbar.jsp" flush="false"/>

<c:forEach var="event" items="${events}">
イベント名：<c:out value="${event.title}"/><br>
都道府県：<c:out value="${event.prefecture}"/><br>
街：<c:out value="${event.town}"/><br>
内容：<c:out value="${event.content}"/><br>
<hr>
</c:forEach>

</body>
</html>
