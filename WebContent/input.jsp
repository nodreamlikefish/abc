<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta charset="UTF-8">
<title>Area&Areaplus</title>
<script type="text/javascript">
	var xmlHttpRequest;
	function create(){
		if(window.XMLHttpRequest){
			xmlHttpRequest = new XMLHttpRequest();
		}else{
			xmlHttpRequest = new ActiveXObject("Microsoft.XMLHttp");
		}
	}
	window.onload = function() {
		document.getElementById("area").addEventListener("change",function(){
			aid = this.value ;
			if (aid != "") {
				create() ;	// 创建XMLHttpRequest对象
				// 定义要进行处理的程序路径
				xmlHttpRequest.open("get","areaplus?aid=" + aid) ;
				// 进行请求的发送处理
				xmlHttpRequest.send(null) ;	// 此时参数通过地址重写传递了
				xmlHttpRequest.onreadystatechange = function() {	// 定义信息返回的回调处理函数
					if (xmlHttpRequest.readyState == 4 && xmlHttpRequest.status == 200) {
						cityObj = JSON.parse(xmlHttpRequest.responseText);
						cityElement = document.getElementById("areaplus") ;
						cityElement.length = 1 ;
						for (x = 0 ; x < cityObj.allplus.length ; x ++) {
							optionElement = document.createElement("option") ;
							optionElement.setAttribute("value",cityObj.allplus[x].apid) ;
							optionElement.appendChild(document.createTextNode(cityObj.allplus[x].title)) ;
							cityElement.appendChild(optionElement) ;
						}
					}
				}
			} else {
				cityElement = document.getElementById("city") ;
				cityElement.length = 1 ;
			}
		},false) ;
	}
</script>
</head>
<body>
	<form action="" method="post">
		省份: <select id="area">
			<option value="">====下列省份====</option>
			<c:forEach items="${allAreas}" var="area">
				<option value="${area.aid}">${area.title}</option>
			</c:forEach>
		</select> 城市 : <select id="areaplus">
			<option value="">====下列城市====</option>
		</select>
	</form>
</body>
</html> 	