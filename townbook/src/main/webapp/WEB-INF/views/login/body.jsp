<div class="row">
	<div class="col-md-4"></div>
	<div class="col-md-4">
		<h2 class="text-center">ユーザー情報を入力してください</h2>
		<div class="well">
			<form class="form center-block" ng-controller="loginController" ng-submit="login()">
				<span class="text-danger" ng-show="alert">{{alert.msg}}</span>
				<div class="form-group">
					<input type="text" class="form-control input-lg" placeholder="username" ng-model="userId">
				</div>
				<div class="form-group">
					<input type="password" class="form-control input-lg" placeholder="password" ng-model="password">
				</div>
				<div class="form-group">
					<button type="submit" class="btn btn-primary btn-lg btn-block" ng-disabled="disabled">ログイン</button>
				</div>
			</form>
		</div>
	<div class="col-md-4"></div>
</div>
