<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
pageContext.setAttribute("cxt",request.getContextPath());
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>首页</title>
<!--导入JS文件-->

<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/jquery-3.3.1.js"></script>
<!--导入JS文件-->
<style type="text/css">
.tablediv{

width:800px;
margin:40px auto;
border-collapse:collapse;

}

.tablediv tbody td{
border:1px solid #7FFFD4;

}

.tablemenu{
width:800px;
margin:40px auto;
border-collapse:collapse;
}


</style>
<script type="text/javascript">
$(function(){
	//点击搜索按钮
	$("button[class='seach1']").click(function(){
		var likename=$("#likeName").val() ;

		window.location.href="seacherGoodsByLikeName.do?likename="+likename;
		 
	});
	
	//点击删除按钮
	$("button[class='delete']").click(function(){
		var id=$(this).parents("tr").children().eq(0).html();
		var name = $(this).parents("tr").children().eq(1).html();
		if(confirm("是否要删除<"+name+">的信息")){
			$(this).parents("tr").remove();
			
			window.location.href="delete.do?id="+id;
		}
	});
	
	//点击批量删除按钮
	$("button[class='delCheckGoods']").click(function(){
		var r=confirm("是否确认删除？");    
		if(r==true){
		var ckall = document.getElementsByName("ckall");
		var ids="";
		var n=0;
		for(var i = 0; i < ckall.length; i++) {
			if(ckall[i].checked == true){
				var id=ckall[i].value;
				if(n==0){
					ids+=id;
				}else{
					ids+="-"+id;
				}
				n++;
			}
		} 
	
		window.location.href="deleteCheckGoods.do?ids="+ids;
		}else{
			return false;
		}
	});
	

	
});

//全选
function setall() {
	var thisec = event.srcElement.checked;
	var ckall = document.getElementsByName("ckall");
	for(var i = 0; i < ckall.length; i++) {
		ckall[i].checked = thisec;
	}
}

</script>
</head>
<body>
首页，${uname}你好<br>

<div>
<table class="tablemenu">
	<thead>
	<tr>
	<td>商品查询：<input  type="text" id="likeName" value="" name="likeName">
	<button class="seach1">搜索</button></td>
	</tr>
	
	<form action="seacherGoodsByPrice.do" method="post">
	<tr style="border:0px;">
	<td>商品名称：<input name="goodsName" value="${serchPrice.goodsName }">价格：<input type="text" name="minPrice" value="<c:if test="${serchPrice.minPrice!=0 }">${serchPrice.minPrice }</c:if> "/>
	-<input type="text" name="maxPrice" value="<c:if test="${serchPrice.maxPrice!=0 }">${serchPrice.maxPrice }</c:if> "/>
	<button type="submit">搜索</button></td>
	</tr>
		</form>
	<tr>
	<td style="border:0px;"><a href="toAddGoods.do"><button>添加商品</button></a>
	<button class="delCheckGoods">批量删除</button>
	</td></tr>
	</thead>
</table>
</div>


<table class="tablediv" id="table1">

	<tr>
	<td><label><input type="checkbox" name="" id="" value="" onclick="setall()" />全选</label></td>
	<td>id</td>
	<td>商品名</td>
	<td>商品价格</td>
	<td>商品图片</td>
	<td>商品状态</td>
	<td>操作</td>
	</tr>


	<c:forEach items="${goodsList}" var="goods">
	<tr>
	<td><input type="checkbox" name="ckall" value="${goods.id }" ></td>
	<td>${goods.id }</td>
	<td>${goods.goodsName }</td>
	<td>${goods.goodsPrice }元</td>
	<td><img style="width:80px;height:70px" src="${goods.goodsPic }"/></td>
	<td><c:if test="${goods.state ==1 }">正常</c:if>
	<c:if test="${goods.state ==0}">待确认</c:if>
	</td>
	
	<td><button class="delete">删除</button>
	<a href="findGoodsById.do?id=${goods.id }"><button>修改</button></a>
	</td>
	</tr>
	</c:forEach>

</table>



</body>
</html>