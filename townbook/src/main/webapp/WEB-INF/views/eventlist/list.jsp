
<div class="row">
	<div class="col-md-3"></div>
	<div class="col-md-6">
		<h1>イベント一覧</h1>
		<c:forEach var="event" items="${events}">
			<div class="well">
				<dl class="dl-horizontal">
					<dt>イベント名</dt>
					<dd>
						<c:out value="${event.title}" />
					</dd>
					<dt>都道府県</dt>
					<dd>
						<c:out value="${event.prefectureName}" />
					</dd>
					<dt>街</dt>
					<dd>
						<c:out value="${event.town}" />
					</dd>
					<dt>概要</dt>
					<dd>
						<c:out value="${event.content}" />
					</dd>
				</dl>
			</div>
		</c:forEach>
	</div>
	<div class="col-md-3"></div>
</div>
