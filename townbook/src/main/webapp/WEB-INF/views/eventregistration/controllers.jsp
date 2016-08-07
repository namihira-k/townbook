<script>
var app = angular.module('townbookApp')

app.controller('eventMgmtController', ['$scope', 'eventService', function ($scope, eventService) {
    
  $scope.event = {
    title: "勉強会" + new Date(),
    prefectureId: "tokyo",
    place: "町田",
    startDateTime: "2016-08-07T10:00:00.000",
    endDateTime: "2016-08-10T10:30:00.000",
    content: "テスト勉強をします。"
  }
  
  $scope.postEvent = function(event){
    eventService.postEvent(event);
  }

  $scope.$on('postEventCompleted', function (event, params) {
    console.log("postEventCompleted");
  });
  
}]);
</script>