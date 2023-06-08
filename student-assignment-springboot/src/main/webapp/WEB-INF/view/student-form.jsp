<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Assignment Springboot</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body>
	<div class="container">
		<div class="col-md-offset-2 col-md-7">
			<h2 class="text-center">Springboot + JSP + MySQL Assignment </h2>
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Add New Student</div>
			</div>
			<br>
			<div class="panel-body">
				<form:form action="saveStudent" cssClass="form-horizontal"
						method="post" modelAttribute="student">

						<!-- need to associate this data with student id -->
						<form:hidden path="studentId" />
						<div class="form-group">
							<label for="name" class="col-md-3 control-label">Student Name</label>
							<div class="col-md-9">
								<form:input path="name" cssClass="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="enteringDate" class="col-md-3 control-label">Entering Date</label>
							<div class="col-md-9">
								<form:input path="enteringDate" cssClass="form-control" />
							</div>
						</div>

						<div class="form-group">
							<label for="nationality" class="col-md-3 control-label">Nationality</label>
							<div class="col-md-9">
								<form:input path="nationality" cssClass="form-control" />
							</div>
						</div>
						
						<div class="form-group">
							<label for="code" class="col-md-3 control-label">Code</label>
							<div class="col-md-9">
								<form:input path="code" cssClass="form-control" />
							</div>
						</div>
<br>
						<div class="form-group">
							<!-- Button -->
							<div class="col-md-offset-3 col-md-9">
								<form:button cssClass="btn btn-primary">Submit</form:button>
							</div>
						</div>

					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>