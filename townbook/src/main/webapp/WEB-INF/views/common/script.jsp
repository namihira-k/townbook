<script>
  angular.module('townbookApp', []);

  $(function () {
    $('.date').datetimepicker({
      locale: 'ja',
      format : 'YYYY-MM-DDTHH:mm:ss.000'
    });
  });
</script>
