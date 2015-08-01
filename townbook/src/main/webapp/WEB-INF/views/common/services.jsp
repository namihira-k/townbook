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

</script>
