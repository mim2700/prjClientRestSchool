<%@ taglib prefix="spring"  uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@include file="config/config.jsp" %>
<%@include file="config/menu.jsp" %>
<%@include file="config/grid.jsp" %>

<script>
	$(function (){
		$('#opType').click(function(){
			
			if($('#opType option:selected').val()=="1")
				{
					$('#divGrNo').show();
					$('#divClass').hide();
				}
			if($('#opType option:selected').val()=="2")
			{
				$('#divClass').show();
				//$('#divGrNo').css("visibility", "hidden");
				$('#divGrNo').hide();
			}
		});	
		
	});
	
	$(function () {
		$('#btnDataFetch').click(function (){
			var urlBoardServer='';
			if($('#opType').val()=='2')
				{
					urlBoardServer = '<spring:message code="prop.school.url.rest.board.class"/>'+$('#classId').val();

				}
			if($('#opType').val()=='1')
				{
					urlBoardServer = '<spring:message code="prop.school.url.rest.board.grno"/>'+$('#grNumber').val();
	
				}
			
			$("#list2").GridUnload();
			$("#list2").trigger('reloadGrid');
			createGrid(urlBoardServer);
			
			
		});
	});
	
</script>

<div class="col-md-4"></div>

<div class="col-md-4">
	<div class="box box-primary">
		<div class="box-header">
			<spring:message code="prop.school.board.rest.search.text"/> 
		</div>
		<div class="box-body">
			<form:form modelAttribute="schoolRestModel" >
				<div >
						<div class="col-md-6">
							<div class="input-group">
								<span class="input-group-addon"><spring:message code="prop.school.board.rest.search.type.text" /></span>
								<form:select path="opType">
									<form:option value=""><spring:message code="prop.school.board.rest.search.select.type.text"/></form:option>
									<form:option value="1"><spring:message code="prop.school.board.rest.search.grno.text"/></form:option>
									<form:option value="2"><spring:message code="prop.school.board.rest.search.class.text"/></form:option>	
								</form:select>
							</div>
						</div>
						<div class="col-md-6">
							<div class="input-group">
								<span class="input-group-addon"><spring:message code="prop.school.board.rest.search.value.text" /></span>
								<div id="divGrNo" style="display:none;">
									<form:input path="grNumber"/>
								</div>
								<div id="divClass" style="display:none;">
									<form:select path="classId">
										<form:options items="${classNames}" itemLabel="name" itemValue="value"/>
									</form:select>
								</div>
							</div>
						</div>
				</div>
			</form:form>
		</div>
		<div class="box-footer">
			
				<button id="btnDataFetch" class="btn btn-primary"><spring:message code="prop.school.board.rest.search.bttn.fetch.text"/></button>
			 
			
				<button class="btn btn-success" ><spring:message code="prop.school.board.rest.search.bttn.save.text"/></button>
			
			
		</div>
	</div>
</div>

<div class="col-md-4"></div>

<div class="col-md-12">
	<div class="box box-primary">
		<div class="box-header">
			<spring:message code="prop.school.board.rest.search.result.text" />
		</div>
		<div class="box-body">
			<table id="list2" class="table table-bordered"></table>
			<div id="pager2"></div>
		</div>
		<div class="box-footer">
			
		</div>
	</div>
</div>
