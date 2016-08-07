<div class="row" ng-controller="eventMgmtController" ng-init="init()">
  <div class="col-md-3"></div>
  <div class="col-md-6">
    <h1>イベント一覧</h1>
    <div class="well" ng-repeat="event in events">
      <dl class="dl-horizontal">
        <dt>イベント名</dt>
        <dd>{{ event.title }}</dd>
        <dt>都道府県</dt>
        <dd>{{ event.prefectureName }}</dd>
        <dt>場所</dt>
        <dd>{{ event.place }}</dd>
        <dt>説明</dt>
        <dd>{{ event.content }}</dd>
      </dl>
    </div>
  </div>
  <div class="col-md-3"></div>
</div>
