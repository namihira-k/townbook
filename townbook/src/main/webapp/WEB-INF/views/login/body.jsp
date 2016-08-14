<%@ include file="../common/variable.jsp" %>

<div class="row">
	<div class="col-md-4"></div>
	<div class="col-md-4">
		<h2 class="text-center">ユーザー情報を入力してください</h2>
		<div class="well">
			<form class="form center-block" action="${contextPath}/authentication" method="post">
				<div class="form-group">
					<input type="text" class="form-control input-lg" name="j_username" placeholder="username">
				</div>
				<div class="form-group">
					<input type="password" class="form-control input-lg" name="j_password" placeholder="password">
				</div>
				<div class="form-group">
					<button type="submit" class="btn btn-primary btn-lg btn-block">ログイン</button>
				</div>
			</form>
		</div>
	<div class="col-md-4"></div>
</div>
