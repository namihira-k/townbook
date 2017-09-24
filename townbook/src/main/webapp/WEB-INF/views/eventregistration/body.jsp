<%@ include file="../common/variable.jsp" %>

<div ng-controller="eventMgmtController">
  <div class="row" >
    <div class="col-md-3"></div>
    <div class="col-md-6" ng-if="!showComplete">
      <h3>イベント登録</h3>
      <form class="form-horizontal">
        <div class="form-group">
           <label for="title" class="control-label col-xs-2">イベント名</label>
           <div class="col-xs-10">
              <input type="text" class="form-control" id="title" name="title" ng-model="event.title" placeholder="勉強会">
           </div>
        </div>
        <div class="form-group">
          <label for="prefecture" class="control-label col-xs-2">都道府県</label>
          <div class="col-xs-10">
            <select class="form-control" id="prefectureId" name="prefectureId" ng-model="event.prefectureId">
              <c:forEach var="pref" items="${Prefectures}" >
                <c:set var="messageSource" value="${MessageSource}" />
                <option value="${pref.getId()}">${pref.getDisplayname(messageSource, request.getLocale())}</option>
              </c:forEach>
            </select>
          </div>
        </div>
        <div class="form-group">
          <label for="place" class="control-label col-xs-2">場所</label>
          <div class="col-xs-10">
            <input type="text" class="form-control" id="place" name="place" ng-model="event.place" placeholder="町田">
          </div>
        </div>
        <div class="form-group">
          <label for="startDateTime" class="control-label col-xs-2">開始日時</label>
          <div class="col-xs-10">
            <div id='id_startDateTime' class='input-group date'>
              <input type="text" class="form-control" id="startDateTime" name="startDateTime" ng-model="event.startDateTime" value="2016-08-06T9:33:00.000">
              <span class="input-group-addon" ng-click="setStartDateTime()"><span class="glyphicon glyphicon-calendar"></span></span>
            </div>
          </div>
        </div>
        <div class="form-group">
          <label for="endDateTime" class="control-label col-xs-2">終了日時</label>
          <div class="col-xs-10">
            <div id='id_endDateTime' class='input-group date'>
              <input type="text" class="form-control" id="endDateTime" name="endDateTime" ng-model="event.endDateTime" value="2016-08-06T9:33:00.000">
              <span class="input-group-addon" ng-click="setEndDateTime()"><span class="glyphicon glyphicon-calendar"></span></span>
            </div>
          </div>
        </div>
        <div class="form-group">
          <label for="content" class="control-label col-xs-2">内容</label>
          <div class="col-xs-10">
            <textarea class="form-control" id="content" name="content" rows="8" ng-model="event.content" placeholder="内容を書いて下さい" style="resize:none;"></textarea>
          </div>
        </div>
        <div class="form-group">
          <div class="col-xs-offset-2 col-xs-10">
            <button type="submit" class="btn btn-primary" ng-click="postEvent(event)">登録する</button>
          </div>
        </div>
      </form>
    </div>
    <div class="col-md-6" ng-if="showComplete">
      <h1>登録が完了しました</h1>
      <div class="text-center">
        <a class="btn btn-primary" role="button" href="${contextPath}/view/events">イベント一覧を見る</a>
      </div>
    </div>
    <div class="col-md-3"></div>
  </div>
</div>
