$(function() {
	//查询按钮点击事件
	$("#query").click(function(){
		var keyWord = $("#keyWord").val();
		location.href = "/ksb/role/list?keyWord="+keyWord;
	});
	
	//重置按钮点击事件
	$("#reset").click(function(){
		$("#keyWord").val("");
		location.href = "/ksb/role/list";
	});
	
	//删除按钮点击事件
	$("input[name='delete_role']").click(function() {
		//摸态框居中
		$("#delete_modal").on('shown.bs.modal', function() {
			var $this = $(this);
			var $modal_dialog = $this.find('.modal-dialog');
			var m_top = ($(document).height() - $modal_dialog.height()) / 2;
			$modal_dialog.css({
				'margin' : m_top + 'px auto'
			});
		});
		//摸态框显示
		$("#delete_modal").modal();
	});
	
});