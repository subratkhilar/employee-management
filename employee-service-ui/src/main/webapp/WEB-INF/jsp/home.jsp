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
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
	var URL = "http://localhost:8082/employees-api";

	$(document).ready(function() {
		callPrincipalDetails();
	});
	function callPrincipalDetails() {
		//alert("inside principal Details");
		$.ajax({
			headers : {
				"Access-Control-Allow-Origin" : "*"
			},
			url : URL + '/employees',
			contentType : "application/json; charset=utf-8",
			dataType : "json",

			success : function(data, textStatus, jqXHR) {
				var trHTML = '';
				$('#records_table').html('');
				trHTML = '<thead><tr><th>Employee Id</th><th>Name</th><th>Age</th><th>Blood Group</th><th>Address</th><th>Department</th></tr></thead>';
				$.each(data, function(i, item) {

					trHTML += '<tbody><tr><td>' + item.empId
							+ '</td><td>' + item.empName
							+ '</td><td>' + item.age
							+ '</td><td>' + item.bloodGroup
							+ '</td><td>' + item.address
							+ '</td><td>' + item.department
							+ '</td></tr></tbody>';

				});
				$('#records_table').append(trHTML);;

			}
		});
	}

	function submitData() {

		var arr = [];
		var regPrincipalMap = {};
		regPrincipalMap["empId"] = $("#empId").val();
		regPrincipalMap["empName"] = $("#empName").val();
		regPrincipalMap["age"] = $("#age").val();
		regPrincipalMap["bloodGroup"] = $("#bloodGroup").val();
		regPrincipalMap["address"] = $("#address").val();
		regPrincipalMap["department"] = $("#department").val();
		$('#messageDiv').html('');
		//alert(JSON.stringify(regPrincipalMap));
		$.ajax({
			headers : {
				"Access-Control-Allow-Origin" : "*"
			},
			url : URL + "/employee",
			contentType : "application/json; charset=utf-8",
			dataType : "html",
			data : JSON.stringify(regPrincipalMap),
			type : "POST",

			success : function(data) {
				var trHTML = '';
				
				trHTML = '<div class="alert alert-success"> <strong>Employee record sucessfully created!</strong> </div>';
				console.log("SUCCESS: ", data);
				//alert("SUCCESS: ");
				//messageDiv
				$('#messageDiv').append(trHTML);
				callPrincipalDetails();
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
					<li class="active"><a href="#">Home</a></li>
					<li><a href="/taskAssign">Task Assign</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container" id="regdContainer">

		<div class="starter-template">
			<h1></h1>

		</div>
		<div class="table-responsive">
			<h1>Employee Registration</h1>
			<form>
				<table class="table">
					<tr>
						<td>Employee Id</td>
						<td><input type="text" id="empId"></td>
					</tr>
					<tr>
						<td>Name</td>
						<td><input type="text" id="empName"></td>
					</tr>
					<tr>
						<td>Age:</td>
						<td><input type="text" id="age" name="age"></td>
					</tr>
					<tr>
						<td>Blood Group:</td>
						<td><input type="text" id="bloodGroup" name="bloodGroup"></td>
					</tr>
					<tr>
						<td>Address:</td>
						<td><input type="text" id="address" name="address"></td>
					</tr>
					<tr>
						<td>Department Name:</td>
						<td><input type="text" id="department" name="department"></td>
					</tr>
					<tr>
						<td colspan="2" align="right"><input type="button"
							onclick="submitData();" value="SAVE" class="mc-btn btn-style-1"></td>
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
