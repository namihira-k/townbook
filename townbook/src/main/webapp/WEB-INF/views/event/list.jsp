<c:forEach var="event" items="${events}">
<div class="well">
イベント名：<c:out value="${event.title}"/><br>
都道府県：<c:out value="${event.prefecture}"/><br>
区市町村：<c:out value="${event.town}"/><br>
内容：<c:out value="${event.content}"/><br>
</div>
</c:forEach>