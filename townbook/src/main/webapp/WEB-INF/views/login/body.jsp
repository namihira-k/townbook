<form class="form-inline" ng-controller="loginController" ng-submit="login()">
    <input type="text" class="form-control" placeholder="userId" ng-model="userId">
    <input type="password" class="form-control" placeholder="password" ng-model="password">
    <button type="submit" class="btn btn-default" ng-disabled="disabled">Login</button>
    <span class="text-danger" ng-show="alert">{{alert.msg}}</span>
</form>