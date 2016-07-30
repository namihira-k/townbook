<script>
var app = angular.module('townbookApp')

app.controller('eventManagementController', ['$scope', 'eventService', function ($scope, eventService) {
  $scope.events = [];

  $scope.init = function () {
    _getEvent();
  }

  $scope.deleteEvent = function(event){
    eventService.deleteEvent(event.id);
    $scope.init();
  }

  $scope.$on('getEventsCompleted', function (event, params) {
    $scope.$apply(function () {
      angular.copy(params, $scope.events);
    });
  });

  _getEvent = function() {
	eventService.getEvents();
  }
  
}]);
</script>