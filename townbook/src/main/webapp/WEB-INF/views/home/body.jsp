<%@ include file="../common/variable.jsp" %>

<div class="jumbotron">
  <div class="container">
    <h1>townbookへようこそ！</h1>
    <p>街の気になるイベントを見つけましょう！</p>
    <p><a href="${contextPath}/view/events">イベント一覧を見る <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span></a></p>
  </div>
</div>
<div class="row">
  <div class="col-md-1"></div>
  <div class="col-md-10">
    <div class="col-md-4">
      <div class="thumbnail">
        <img src="${contextPath}/resources/img/spread.png" class="img-circle">
        <div class="caption text-center">
          <h3>広める</h3>
        </div>
      </div>
    </div>
    <div class="col-md-4">
      <div class="thumbnail">
        <img src="${contextPath}/resources/img/search.png" class="img-circle">
        <div class="caption text-center">
          <h3>探す</h3>
        </div>
      </div>
    </div>
    <div class="col-md-4">
      <div class="thumbnail">
        <img src="${contextPath}/resources/img/join.png" class="img-circle">
        <div class="caption text-center">
          <h3>参加する</h3>
        </div>
      </div>
    </div>
  </div>
  <div class="col-md-1"></div>
</div>