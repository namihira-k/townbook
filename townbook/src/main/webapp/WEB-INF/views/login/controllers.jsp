<script>
	var app = angular.module('townbookApp')

	app.controller('loginController', [ '$scope', '$location', '$window', 'authService', function($scope, $location, $window, authService) {
		$scope.login = function() {
			$scope.disabled = true;
			var input = {
				userId : $scope.userId,
				password : $scope.password
			}
			authService.login(input);
		};

	    $scope.$on('loginSuccess', function (event, response) {
	    	$window.location.href = '/townbook/view/events';
	    });
	}]);

</script>