<div ng-controller="eventManagementController"  ng-init="init()">
    <div class="well" ng-repeat="event in events">
       <form ng-submit="deleteEvent()">
                    イベント名：{{event.title}}<br>
       <button type="submit" class="btn btn-danger">削除する</button>
      </form>
    </div>
</div>
