<script>
var app = angular.module('townbookApp');

app.controller('eventMgmtController', ['$scope', 'eventService', function ($scope, eventService) {

  $scope.showComplete = false;

  $scope.event = {
    title: "勉強会" + new Date(),
    prefectureId: "tokyo",
    place: "町田",
    startDateTime: "2016-08-07T10:00:00.000",
    endDateTime: "2016-08-10T10:30:00.000",
    content: "テスト勉強をします。"
  }

  $scope.setStartDateTime = function(){
    $("#id_startDateTime").datetimepicker().on("dp.change", function (data) {
       $scope.$apply(function(){
         $scope.event.startDateTime = data.date.toISOString().replace("Z", "");
       })
    });
  }

  $scope.setEndDateTime = function(){
    $("#id_endDateTime").datetimepicker().on("dp.change", function (data) {
      $scope.$apply(function(){
        $scope.event.endDateTime = data.date.toISOString().replace("Z", "");
      })
    });
  }

  $scope.postEvent = function(event){
    waitingDialog.show();
    eventService.postEvent(event);
  }

  $scope.$on('postEventCompleted', function (event, params) {
    waitingDialog.hide();
    $scope.$apply(function(){
      $scope.showComplete = true;
    });
  });


}]);
</script>