<div class="row" >
  <div class="col-md-3"></div>
  <div class="col-md-6" ng-controller="eventMgmtController">
	  <h1>イベント登録</h1>
	  <form class="form-horizontal">
	    <div class="form-group">
	       <label for="title" class="control-label col-xs-2">イベント名</label>
	       <div class="col-xs-10">
	          <input type="text" class="form-control" id="title" name="title" placeholder="勉強会">
	       </div>
	    </div>
	    <div class="form-group">
	      <label for="prefecture" class="control-label col-xs-2">都道府県</label>
	      <div class="col-xs-10">
	        <select class="form-control" id="prefectureId" name="prefectureId">
					<option value="hokkaido">北海道</option>
					<option value="aomori">青森</option>
					<option value="iwate">岩手</option>
					<option value="miyagi">宮城</option>
					<option value="akita">秋田</option>
					<option value="yamagata">山形</option>
					<option value="fukushima">福島</option>
					<option value="ibaraki">茨城</option>
					<option value="tochigi">栃木</option>
					<option value="gunma">群馬</option>
					<option value="saitama">埼玉</option>
					<option value="chiba">千葉</option>
					<option value="tokyo" selected="selected">東京</option>
					<option value="kanagawa">神奈川</option>
					<option value="niigata">新潟</option>
					<option value="toyama">富山</option>
					<option value="ishikawa">石川</option>
					<option value="fukui">福井</option>
					<option value="yamanashi">山梨</option>
					<option value="nagano">長野</option>
					<option value="gifu">岐阜</option>
					<option value="shizuoka">静岡</option>
					<option value="aichi">愛知</option>
					<option value="mie">三重</option>
					<option value="shiga">滋賀</option>
					<option value="kyoto">京都</option>
					<option value="ohsaka">大阪</option>
					<option value="hyogo">兵庫</option>
					<option value="nara">奈良</option>
					<option value="wakayama">和歌山</option>
					<option value="tottori">鳥取</option>
					<option value="shimane">島根</option>
					<option value="okayama">岡山</option>
					<option value="hiroshima">広島</option>
					<option value="yamaguchi">山口</option>
					<option value="tokushima">徳島</option>
					<option value="kagawa">香川</option>
					<option value="ehime">愛媛</option>
					<option value="kohti">高知</option>
					<option value="fukuoka">福岡</option>
					<option value="saga">佐賀</option>
					<option value="nagasaki">長崎</option>
					<option value="kumamoto">熊本</option>
					<option value="ohita">大分</option>
					<option value="miyazaki">宮崎</option>
					<option value="kagoshima">鹿児島</option>
					<option value="okinawa">沖縄</option>
	        </select>
	      </div>
	    </div>
	    <div class="form-group">
	      <label for="place" class="control-label col-xs-2">場所</label>
	      <div class="col-xs-10">
	        <input type="text" class="form-control" id="place" name="place" placeholder="町田">
	      </div>
	    </div>
	    <div class="form-group">
	      <label for="startDateTime" class="control-label col-xs-2">開始日時</label>
	      <div class="col-xs-10">
	        <input type="text" class="form-control" id="startDateTime" name="startDateTime" value="2016-07-30 12:00:00,000">
	      </div>
	    </div>
	    <div class="form-group">
	      <label for="endDateTime" class="control-label col-xs-2">終了日時</label>
	      <div class="col-xs-10">
	        <input type="text" class="form-control" id="endDateTime" name="endDateTime" value="2016-08-01 12:00:00,000">
	      </div>
	    </div>
	    <div class="form-group">
	      <label for="content" class="control-label col-xs-2">内容</label>
	      <div class="col-xs-10">
	        <textarea class="form-control" id="content" name="content" rows="8" placeholder="内容を書いて下さい" style="resize:none;"></textarea>
	      </div>
	    </div>
	    <div class="form-group">
	      <div class="col-xs-offset-2 col-xs-10">
	        <button type="submit" class="btn btn-primary" ng-click="postEvent()">登録する</button>
	      </div>
	    </div>
	  </form>
  </div>
  <div class="col-md-3"></div>
</div>