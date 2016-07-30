<script>
	var app = angular.module('townbookApp')

	app.service('authService', [ '$rootScope', function($rootScope) {
		this.login = function(user) {
			$.ajax({
				type : 'POST',
				url : '/townbook/api/login',
				contentType : 'application/json',
				data : JSON.stringify(user),
				dataType : 'json',
				success : function(json) {
					$rootScope.$broadcast('loginSuccess', json);
				},
				error : function(json) {
					$rootScope.$broadcast('loginError', json);
				}
			});
		}
	} ]);

	app.service('eventService', [ '$rootScope', function($rootScope) {
		this.postEvent = function() {
		  $.ajax({
		    type : 'POST',
		    url : '/townbook/api/events',
		    dataType : 'json',
		    success : function(json) {
		      $rootScope.$broadcast('postEventCompleted', json)
		    }
		  });
		}

    this.getEvents = function() {
			$.ajax({
				type : 'GET',
				url : '/townbook/api/events',
				dataType : 'json',
				success : function(json) {
					$rootScope.$broadcast('getEventsCompleted', json)
				}
			});
		}

		this.deleteEvent = function(id) {
			console.log("id : " + id);
			$.ajax({
				type : 'DELETE',
				url : '/townbook/api/events/' + id,
				dataType : 'json',
				success : function(json) {
				}
			});
		}
	} ]);
</script>
