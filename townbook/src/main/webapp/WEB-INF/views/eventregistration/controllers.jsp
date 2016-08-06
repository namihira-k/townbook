<script>
var app = angular.module('townbookApp')

app.controller('eventMgmtController', ['$scope', 'eventService', function ($scope, eventService) {
    
  $scope.postEvent = function(event){
    eventService.postEvent(event);
  }

  $scope.$on('postEventCompleted', function (event, params) {
    console.log("postEventCompleted");
  });
  
}]);
</script>