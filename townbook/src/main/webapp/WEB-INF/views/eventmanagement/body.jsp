<div ng-controller="eventManagementController"  ng-init="init()">
    <div class="well" ng-repeat="event in events">
       <form ng-submit="deleteEvent()">
                    イベント名：{{event.title}}<br>
       <input type="hidden" ng-model="eventId" name="eventId" value="2" />
       <button type="submit" class="btn btn-danger">削除する</button>
      </form>
    </div>
</div>
