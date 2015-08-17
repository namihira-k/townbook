<script>
var app = angular.module('townbookApp')

app.controller('eventManagementController', ['$scope', 'eventService', function ($scope, eventService) {
	$scope.events = [];

	$scope.eventId;

	$scope.init = function () {
		eventService.getEvents();
	}

	$scope.deleteEvent = function(){
		console.log("eventId : " + $scope.eventId);
		eventService.deleteEvent($scope.eventId);
	}

    $scope.$on('getEventsCompleted', function (event, params) {
        $scope.$apply(function () {
            angular.copy(params, $scope.events);
        });
    });

}]);
</script>