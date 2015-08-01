<script>
var app = angular.module('townbookApp')

app.service('eventService', ['$rootScope', function ($rootScope) {
		this.getEvents = function () {
    	    $.ajax({
        		type: 'GET',
            	url: '/townbook/api/events',
            	dataType: 'json',
            	success: function (json) {
                	$rootScope.$broadcast('getEventsCompleted', json)
            	}
        	});
	    }
}]);

app.controller('eventManagementController', ['$scope', 'eventService', function ($scope, eventService) {
	$scope.events = []

	$scope.init = function () {
		eventService.getEvents()
	}

    $scope.$on('getEventsCompleted', function (event, params) {
        $scope.$apply(function () {
            angular.copy(params, $scope.events);
        });
    });

}]);
</script>