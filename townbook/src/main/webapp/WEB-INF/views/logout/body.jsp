<%@ include file="../common/variable.jsp" %>

<div class="row">
  <div class="col-md-4"></div>
  <div class="col-md-4">
    <h2 class="text-center">ログアウトしますか？</h2>
    <div class="well">
      <form class="form-inline" action="${contextPath}/logout" method="post">
        <div class="text-center">
          <input type="submit" class="btn btn-primary btn-lg" value="Logout" />
          <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </div>
      </form>
    </div>
  <div class="col-md-4"></div>
</div>
