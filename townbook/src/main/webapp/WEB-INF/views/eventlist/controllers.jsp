<script>
var app = angular.module('townbookApp')

app.controller('eventMgmtController', ['$scope', 'eventService', function ($scope, eventService) {
    
  $scope.events = [];

  $scope.init = function () {
    waitingDialog.show();
    eventService.getEvents();
  }

  $scope.getEventsByPref = function (prefectureId) {
    console.log(prefectureId)
    var params = {
      prefectureId : prefectureId
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