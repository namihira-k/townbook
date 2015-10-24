<div class="row">
	<div class="col-md-3"></div>
	<div class="col-md-6">
		<h1>イベント情報</h1>
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
				<dt>場所</dt>
				<dd>
					<c:out value="${event.town}" />
				</dd>
			</dl>
		</div>
	</div>
	<div class="col-md-3"></div>
</div>