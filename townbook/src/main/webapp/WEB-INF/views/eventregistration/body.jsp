<div ng-controller="eventMgmtController">
  <div class="row" >
    <div class="col-md-3"></div>
    <div class="col-md-6">
      <h1>イベント登録</h1>
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
                <option value="${pref.getId()}">${pref.getDisplayname(null, request.getLocale())}</option>
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
            <input type="text" class="form-control" id="startDateTime" name="startDateTime" ng-model="event.startDateTime" value="2016-08-06T9:33:00.000">
          </div>
        </div>
        <div class="form-group">
          <label for="endDateTime" class="control-label col-xs-2">終了日時</label>
          <div class="col-xs-10">
            <input type="text" class="form-control" id="endDateTime" name="endDateTime" ng-model="event.endDateTime" value="2016-08-06T9:33:00.000">
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
    <div class="col-md-3"></div>
  </div>
</div>

