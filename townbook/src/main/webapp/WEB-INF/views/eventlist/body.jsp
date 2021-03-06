<div class="row" ng-controller="eventMgmtController" ng-init="init( '' )">
  <div class="col-md-2" style="height:100%; overflow:scroll;">
    <c:set var="messageSource" value="${MessageSource}" />
    <div div class="list-group">
      <a href="#all" class="list-group-item" ng-class="{active: isActive('')}" ng-click="getEventsByPref( '' )">すべて</a>
      <c:forEach var="pref" items="${Prefectures}" >
        <a href="#${pref.getId()}" class="list-group-item" ng-class="{active: isActive( '${pref.getId()}' )}" ng-click="getEventsByPref( '${pref.getId()}' )">${pref.getDisplayname(messageSource, request.getLocale())}</a>
      </c:forEach>
    </div>
  </div>
  <div class="col-md-10" style="height:100%; overflow:scroll;">
    <h3>イベント一覧 <span class="badge">{{ events.length }}</span></h3>
    <div class="alert alert-warning" role="alert" ng-if="events.length == 0">
      <p>イベント情報はありません</p>
    </div>
    <div class="well" ng-repeat="event in events">
      <dl class="dl-horizontal">
        <dt>イベント名</dt>
        <dd>{{ event.title }}</dd>
        <dt>都道府県</dt>
        <dd>{{ event.prefectureName }}</dd>
        <dt>場所</dt>
        <dd>{{ event.place }}</dd>
        <dt>開始日時</dt>
        <dd>{{ event.startDateTimeStr }}</dd>
        <dt>終了日時</dt>
        <dd>{{ event.endDateTimeStr }}</dd>
        <dt>説明</dt>
        <dd>{{ event.content }}</dd>
      </dl>
    </div>
  </div>
</div>
