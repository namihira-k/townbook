<script>
var app = angular.module('townbookApp')

app.controller('eventMgmtController', ['$scope', 'eventService', function ($scope, eventService) {

  $scope.postEvent = function(){
    console.log("called postEvent");
    eventService.postEvent();
  }

  $scope.$on('postEventCompleted', function (event, params) {
    console.log("postEventCompleted");
  });
  
}]);
</script>