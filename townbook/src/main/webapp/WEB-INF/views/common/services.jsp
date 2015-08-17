<script>
var app = angular.module('townbookApp')

app.service('eventService', ['$rootScope', function ($rootScope) {
		this.getEvents = function(){
    	    $.ajax({
        		type: 'GET',
            	url: '/townbook/api/events',
            	dataType: 'json',
            	success: function (json) {
                	$rootScope.$broadcast('getEventsCompleted', json)
            	}
        	});
	    }

		this.deleteEvent = function(id){
			console.log("id : " + id);
    	    $.ajax({
        		type: 'DELETE',
            	url: '/townbook/api/events/' + id,
            	dataType: 'json',
            	success: function (json) {
            	}
        	});
		}
}]);

</script>
