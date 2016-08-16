<%@ include file="../common/variable.jsp" %>

<div class="row">
  <div class="col-md-4"></div>
  <div class="col-md-4">
    <h2 class="text-center">ユーザー情報を入力してください</h2>
    <div class="well">
      <c:if test="${isError}">
        <div class="alert alert-danger alert-dismissible" role="alert">
          <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
          <strong>Login Error</strong>
        </div>
      </c:if>
      <c:if test="${fromLogout}">
        <div class="alert alert-success alert-dismissible" role="alert">
          <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
          <strong>Success logout</strong>
        </div>
      </c:if>
      <form class="form center-block" action="${contextPath}/authentication" method="post">
        <div class="form-group">
          <input type="text" class="form-control input-lg" name="username" placeholder="username">
        </div>
        <div class="form-group">
          <input type="password" class="form-control input-lg" name="password" placeholder="password">
        </div>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <div class="form-group">
          <button type="submit" class="btn btn-primary btn-lg btn-block">ログイン</button>
        </div>
      </form>
    </div>
    <div class="col-md-4"></div>
  </div>
</div>
