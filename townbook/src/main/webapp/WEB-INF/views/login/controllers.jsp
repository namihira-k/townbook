<script>
	var app = angular.module('townbookApp')

	app.controller('loginController', [ '$scope', '$location', 'authService', function($scope, $location, authService) {
		$scope.login = function() {
			$scope.disabled = true;
			var input = {
				userId : $scope.userId,
				password : $scope.password
			}
			authService.login(input);
		};

	    $scope.$on('loginSuccess', function (event, response) {
	    	$location.path('/townbook/view/events');
	    	$scope.$apply();
	    });
	}]);

</script>