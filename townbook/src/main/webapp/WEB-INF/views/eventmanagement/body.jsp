<div ng-controller="eventManagementController"  ng-init="init()">
  <div class="well" ng-repeat="event in events">
    <p>イベント名：{{event.title}}</p>
    <input type="button" class="btn btn-danger" ng-click="deleteEvent(event)" value="削除する">
  </div>
</div>
