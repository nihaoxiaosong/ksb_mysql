<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>模块管理</title>
		
		<link href="<@s.url '/plugin/bootstrap/css/bootstrap.min.css'/>" type="text/css" rel="stylesheet"/>
		<link href="<@s.url '/plugin/bootstrap/css/bootstrap-theme.min.css'/>" type="text/css" rel="stylesheet"/>
		
	</head>

	<body>
		<div class="container">
			<div class="page-header">
				<h1 style="color: #286090;">考试宝后台管理系统
					<small style="float: right;">欢迎您,张三. &nbsp;
						<a href="#"><span class="glyphicon glyphicon-off" aria-hidden="true"></span>退出</a>
					</small>
				</h1>
			</div>
			<div class="row" style="height: 60px;">
				<ul class="nav nav-pills">
					<li role="" class="">
						<a href="#"><span class="glyphicon glyphicon-home" aria-hidden="true"></span> 首页</a>
					</li>
					<li role="">
						<a href="#"><span class="glyphicon glyphicon-education" aria-hidden="true"></span> 考生管理</a>
					</li>
					<li role="">
						<a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">
							<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> 试题管理 <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#"><span class="glyphicon glyphicon-wrench" aria-hidden="true"></span> 技能题管理</a></li>
							<li><a href="#"><span class="glyphicon glyphicon-book" aria-hidden="true"></span> 理论题管理</a></li>
							<li><a href="#"><span class="glyphicon glyphicon-tags" aria-hidden="true"></span> 预选项管理</a></li>
							<li><a href="#"><span class="glyphicon glyphicon-check" aria-hidden="true"></span> 试题审核</a></li>
						</ul>
					</li>
					<li role="">
						<a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">
							<span class="glyphicon glyphicon-duplicate" aria-hidden="true"></span> 试卷管理 <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#"><span class="glyphicon glyphicon-wrench" aria-hidden="true"></span> 技能卷管理</a></li>
							<li><a href="#"><span class="glyphicon glyphicon-book" aria-hidden="true"></span> 理论卷管理</a></li>
							<li><a href="#"><span class="glyphicon glyphicon-check" aria-hidden="true"></span> 试卷审核</a></li>
						</ul>

					</li>
					<li role="">
						<a href="#"><span class="glyphicon glyphicon-hourglass" aria-hidden="true"></span> 考试管理</a>
					</li>
					<li role="" class="active">
						<a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">
							<span class="glyphicon glyphicon-cog" aria-hidden="true"></span> 系统设置 <span class="caret"></span>
						</a>
						<ul class="dropdown-menu">
							<li><a href="#"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> 用户管理</a></li>
							<li><a href="#"><span class="glyphicon glyphicon-align-center" aria-hidden="true"></span> 角色管理</a></li>
							<li><a href="#"><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span> 权限管理</a></li>
						</ul>
					</li>
					<li role="">
						<a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">
							<span class="glyphicon glyphicon-tag" aria-hidden="true"></span> 成绩查询 <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#"><span class="glyphicon glyphicon-signal" aria-hidden="true"></span> 成绩分析</a></li>
						</ul>
					</li>
					<li role="">
						<a href="#"><span class="glyphicon glyphicon-retweet" aria-hidden="true"></span> 制作考试宝</a>
					</li>
				</ul>
			</div>
			<div class="row" style="height: 60px;">
				<ol class="breadcrumb">
					<span>您当前的位置:</span>
					<li><a href="#">首页</a></li>
					<li><a href="#">系统设置</a></li>
					<li class="active">模块管理</li>
				</ol>
			</div>
			<div class="row">
				<table class="table table-hover">
					<tr>
						<td><label></label></td>
						<td><label>编码</label></td>
						<td><label>模块名称</label></td>
						<td><label>url地址</label></td>
						<td><label>排序</label></td>
						<td><label>操作</label></td>
					</tr>
					<tr class="info">
						<td></td>
						<td></td>
						<td><label>考生管理</label></td>
						<td></td>
						<td></td>
						<td>
							<input type="button" class="btn btn-default" value="修改">
							<input type="button" class="btn btn-warning" value="删除">
						</td>
					</tr>
					<tr>
						<td></td>
						<td>ksxx</td>
						<td>考生信息</td>
						<td>/ksxx/list</td>
						<td>1</td>
						<td>
							<input type="button" class="btn btn-default" value="修改">
							<input type="button" class="btn btn-warning" value="删除">
						</td>
					</tr>
					<tr class="info">
						<td></td>
						<td></td>
						<td><label>试题管理<label></td>
						<td></td>
						<td></td>
						<td>
							<input type="button" class="btn btn-default" value="修改">
							<input type="button" class="btn btn-warning" value="删除">
						</td>
					</tr>
					<tr>
						<td></td>
						<td>jntgl</td>
						<td>技能题管理</td>
						<td>/jntgl/list</td>
						<td>1</td>
						<td>
							<input type="button" class="btn btn-default" value="修改">
							<input type="button" class="btn btn-warning" value="删除">
						</td>
					</tr>
					<tr>
						<td></td>
						<td>lltgl</td>
						<td>理论题管理</td>
						<td>/lltgl/list</td>
						<td>2</td>
						<td>
							<input type="button" class="btn btn-default" value="修改">
							<input type="button" class="btn btn-warning" value="删除">
						</td>
					</tr>
					<tr>
						<td></td>
						<td>yxxgl</td>
						<td>预选项管理</td>
						<td>/yxxgl/list</td>
						<td>3</td>
						<td>
							<input type="button" class="btn btn-default" value="修改">
							<input type="button" class="btn btn-warning" value="删除">
						</td>
					</tr>
					<tr>
						<td></td>
						<td>stsh</td>
						<td>试题审核</td>
						<td>/stsh/list</td>
						<td>4</td>
						<td>
							<input type="button" class="btn btn-default" value="修改">
							<input type="button" class="btn btn-warning" value="删除">
						</td>
					</tr>
					<tr class="info">
						<td></td>
						<td></td>
						<td><label>试卷管理</label></td>
						<td></td>
						<td></td>
						<td>
							<input type="button" class="btn btn-default" value="修改">
							<input type="button" class="btn btn-warning" value="删除">
						</td>
					</tr>
					<tr>
						<td></td>
						<td>jntgl</td>
						<td>技能卷管理</td>
						<td>/jntgl/list</td>
						<td>1</td>
						<td>
							<input type="button" class="btn btn-default" value="修改">
							<input type="button" class="btn btn-warning" value="删除">
						</td>
					</tr>
					<tr>
						<td></td>
						<td>lltgl</td>
						<td>理论卷管理</td>
						<td>/lltgl/list</td>
						<td>2</td>
						<td>
							<input type="button" class="btn btn-default" value="修改">
							<input type="button" class="btn btn-warning" value="删除">
						</td>
					</tr>
					<tr>
						<td></td>
						<td>stsh</td>
						<td>试卷审核</td>
						<td>/stsh/list</td>
						<td>3</td>
						<td>
							<input type="button" class="btn btn-default" value="修改">
							<input type="button" class="btn btn-warning" value="删除">
						</td>
					</tr>
				</table>
			</div>
		</div>
	</body>

	<script src="<@s.url '/plugin/jquery/jquery-1.12.3.min.js'/>" type="text/javascript"></script>
	<script src="<@s.url '/plugin/bootstrap/js/bootstrap.min.js'/>" type="text/javascript"></script>
		
</html>