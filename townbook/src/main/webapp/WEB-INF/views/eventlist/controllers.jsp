<script>
var app = angular.module('townbookApp')

app.controller('eventMgmtController', ['$scope', 'eventService', function ($scope, eventService) {

  $scope.events = [];
  $scope.eventStatistics = null;

  $scope.currentPrefId;

  $scope.init = function (prefId) {
//    _getEventStatistics();
    _getEvents(prefId);
  }

  $scope.isActive = function (prefId) {
    return $scope.currentPrefId == prefId;
  }

  $scope.getEventsByPref = function (prefId) {
    _getEvents(prefId);
  }

  $scope.getCountByPref = function (prefId) {
	return 9;
  }

  $scope.$on('getEventsCompleted', function (event, params) {
    $scope.$apply(function () {
      angular.copy(params, $scope.events);
    });
    waitingDialog.hide();
  });

  $scope.$on('getEventStatisticsCompleted', function (event, params) {
    $scope.$apply(function () {
      angular.copy(params, $scope.eventStatistics);
    });
  });ß

  _getEventStatistics = function () {
    eventService.getEventStatistics();
  };

  _getEvents = function (prefId) {
    waitingDialog.show();
    $scope.currentPrefId = prefId;
    var params = {
      prefectureId : prefId
    }
    eventService.getEvents(params);
  }


}]);
</script>