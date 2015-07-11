    <form class="form-horizontal" action="/townbook/events" method="post">
        <div class="form-group">
            <label for="title" class="control-label col-xs-2">イベント名</label>
            <div class="col-xs-10">
                <input type="text" class="form-control" id="title" name="title" placeholder="勉強会">
            </div>
        </div>
        <div class="form-group">
            <label for="prefecture" class="control-label col-xs-2">都道府県</label>
            <div class="col-xs-10">
				<select class="form-control" id="prefecture" name="prefecture">
    				<option value="hokkaido">北海道</option>
    				<option value="tokyo" selected="selected">東京都</option>
					<option value="okinawa">沖縄</option>
  				</select>
             </div>
        </div>
        <div class="form-group">
            <label for="town" class="control-label col-xs-2">区市町村</label>
            <div class="col-xs-10">
                <input type="text" class="form-control" id="town" name="town" placeholder="町田">
            </div>
        </div>
        <div class="form-group">
            <label for="content" class="control-label col-xs-2">内容</label>
            <div class="col-xs-10">
                <input type="text" class="form-control" id="content" name="content" placeholder="勉強します">
            </div>
        </div>
        <div class="form-group">
            <div class="col-xs-offset-2 col-xs-10">
                <button type="submit" class="btn btn-primary">登録する</button>
            </div>
        </div>
    </form>
