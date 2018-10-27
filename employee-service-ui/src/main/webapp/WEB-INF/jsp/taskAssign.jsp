<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>

<link rel="stylesheet" type="text/css"
	href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />

<!-- 
	<spring:url value="/css/main.css" var="springCss" />
	<link href="${springCss}" rel="stylesheet" />
	 -->
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />
<script
	src="/js/jquery-1.11.0.min.js"></script>

<!-- <script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script> -->
<script type="text/javascript">
	//var URL = "http://localhost:8082/tasks-api";
var URL = "http://localhost:3333";
	$(document).ready(function() {
		fetchTaskDetails();
	});
	function fetchTaskDetails() {
		//alert("inside principal Details");
		$.ajax({
			headers : {
				"Access-Control-Allow-Origin" : "*"
			},
			url : URL + '/tasks',
			contentType : "application/json; charset=utf-8",
			dataType : "json",

			success : function(data, textStatus, jqXHR) {
				var trHTML = '';
				$('#records_table').html('');
				trHTML = '<thead><tr><th>Employee Id</th><th>TaskId</th><th>Description</th></tr></thead>';
				$.each(data, function(i, item) {

					trHTML += '<tbody><tr><td>' + item.empId
							+ '</td><td>' + item.taskId
							+ '</td><td>' + item.taskDescription
							+ '</td></tr></tbody>';

				});
				$('#records_table').append(trHTML);;

			}
		});
	}

	function submitTaskData() {

		var arr = [];
		var regPrincipalMap = {};
		regPrincipalMap["empId"] = $("#tempId").val();
		regPrincipalMap["taskId"] = $("#taskId").val();
		regPrincipalMap["taskDescription"] = $("#description").val();
		
		$.ajax({
			headers : {
				"Access-Control-Allow-Origin" : "*"
			},
			url : URL + "/tasks",
			contentType : "application/json; charset=utf-8",
			dataType : "html",
			data : JSON.stringify(regPrincipalMap),
			type : "POST",

			success : function(data) {
				//console.log("SUCCESS: ", data);
				//alert("SUCCESS: ");
				var trHTML = '';
				
				trHTML = '<div class="alert alert-success"> <strong>Task  Sucessfully Assigned!</strong> </div>';
				
				//alert("SUCCESS: ");
				//messageDiv
				$('#messageDiv').append(trHTML);
				fetchTaskDetails();
				//display(data);
			},
			error : function(e) {
				//console.log("ERROR: ", e);
				alert("ERROR: " + JSON.stringify(e));
			}
		});
	}
	
</script>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container">
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li ><a href="./">Home</a></li>
					<li><a href="/taskAssign;" class="active">Task Assign</a></li>
				</ul>
			</div>
		</div>
	</nav>

	
	<div class="container" >

		<div class="starter-template">
			<h1></h1>

		</div>
		<div class="table-responsive">
			<h1>Task Assign</h1>
			<form>
				<table class="table">
					<tr>
						<td>Employee Id</td>
						<td><input type="text" id="tempId"></td>
					</tr>
					<tr>
						<td>Task Id</td>
						<td><input type="text" id="taskId"></td>
					</tr>
					<tr>
						<td>Task Description:</td>
						<td><input type="text" id="description" name="description"></td>
					</tr>
					
					<tr>
						<td colspan="2" align="right"><input type="button"
							onclick="submitTaskData();" value="ASSIGN" class="mc-btn btn-style-1"></td>
					</tr>
				</table>
			</form>
		</div>
		<div id="messageDiv">
		</div>
		<div class="table-responsive">
			<table class="table table-bordered table-hover "
				style="margin-top: 10px" id="records_table">
			</table>
		</div>
	</div>
	<!-- /.container -->

	<script type="text/javascript"
		src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>

</html>
