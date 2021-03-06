<%@ include file="variable.jsp" %>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="${contextPath}/view/home">townbook</a>
    </div>

    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><a href="${contextPath}/view/events">イベント一覧を見る<span class="sr-only">(current)</span></a></li>
      </ul>
      <sec:authorize access="hasRole('USER')">
	      <ul class="nav navbar-nav">
	        <li><a href="${contextPath}/view/events/registration">イベントを登録する<span class="sr-only">(current)</span></a></li>
	      </ul>
      </sec:authorize>
      <ul class="nav navbar-nav navbar-right">
        <sec:authorize access="hasRole('USER')">
          <li><a href="${contextPath}/view/events/management">イベントを管理する</a></li>
        </sec:authorize>
        <sec:authorize access="!isAuthenticated()">
          <li><a href="${contextPath}/view/login">ログインする</a></li>
        </sec:authorize>
        <sec:authorize access="isAuthenticated()">
          <li><a href="${contextPath}/view/logout">ログアウトする</a></li>
        </sec:authorize>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
