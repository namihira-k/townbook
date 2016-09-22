<script>
var app = angular.module('townbookApp')

app.controller('eventMgmtController', ['$scope', 'eventService', function ($scope, eventService) {
    
  $scope.events = [];
  
  $scope.currentPrefId;

  $scope.init = function (prefId) {
    $scope.currentPrefId = prefId;
    waitingDialog.show();
    eventService.getEvents();
  }

  $scope.isActive = function (prefId) {
    return $scope.currentPrefId == prefId;
  }
  
  $scope.getEventsByPref = function (prefId) {
    $scope.currentPrefId = prefId;
    var params = {
      prefectureId : prefId
    }
    eventService.getEvents(params);
  }
  
  $scope.$on('getEventsCompleted', function (event, params) {
    $scope.$apply(function () {
      angular.copy(params, $scope.events);
    });
    waitingDialog.hide();
  });

}]);
</script>