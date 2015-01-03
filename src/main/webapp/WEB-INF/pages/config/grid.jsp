<script>
var mydata = [];

	
	
	function createGrid(myUrl)
	{
		
		var grid = $("#list2");
		//console.log("url : "+myUrl);
		grid.jqGrid({
			url:myUrl,
		    loadonce: false,
		    datatype: "json",
		    				
						   	colNames:[
						   	          '<spring:message code="prop.school.board.rest.grid.col.grno.text"/>',
						   			  '<spring:message code="prop.school.board.rest.grid.col.student.fname.text"/>',
						   			  '<spring:message code="prop.school.board.rest.grid.col.student.lname.text"/>',
						   			  '<spring:message code="prop.school.board.rest.grid.col.class.text"/>',
						   			  '<spring:message code="prop.school.board.rest.grid.col.parent.name.text"/>',
						   			  '<spring:message code="prop.school.board.rest.grid.col.parent.mobile.text"/>',
						   			  '<spring:message code="prop.school.board.rest.grid.col.parent.relation.text"/>'
						   	          ],
						   	colModel:[
						   		
						   		{name:'grno',index:'grno',align:"center", width:80},
						   		{name:'firstName',index:'firstName', width:250},
						   		{ name: 'lastName',index:'lastName', width:250},
						   		{ name: 'classAdmission',index:'classAdmission', width:50, formatter:funClassFormat},
						   		{ name: 'parent.name', width:250},
						   		{ name: 'parent.phoneMobile01', width:100,align:"right"},
						   		{ name: 'parent.relation', width:80,align:"right"}
						   		
						   		
						   	],
		    pager: '#pager2',
		    ignoreCase: true,
		    direction:'ltr',
		    rowNum: 10,
		    rowList: [5, 10, 20, 50,100],
		    sortorder: 'asc',
		    viewrecords: true,
		    height: "50%",
		    caption: 'Admission Board Data'
		});
		grid.jqGrid('navGrid', '#pager2', { add: false, edit: false, del: false, search: true, refresh: true });
	}
	
	
	function funClassFormat(cellvalue, options, rowObject)
	{
		
		var html = '';
		if(cellvalue == '-1')
			{
				html = 'KG - 1';
			}
		if(cellvalue == '-2')
			{
				html = 'KG - 2';
			}
		if(cellvalue == '1')
			{
				html = 'Grade 1';
			}
		if(cellvalue == '2')
			{
				html = 'Grade 2';
			}
		if(cellvalue == '3')
			{
				html = 'Grade 3';
			}
		if(cellvalue == '4')
			{
				html = 'Grade 4';
			}
		
		if(cellvalue == '5')
			{
				html = 'Grade 5';
			}
		if(cellvalue == '6')
			{
				html = 'Grade 6';
			}
		if(cellvalue == '7')
			{
				html = 'Grade 7';
			}
		if(cellvalue == '8')
			{
				html = 'Grade 8';
			}
		if(cellvalue == '9')
			{
				html = 'Grade 9';
			}
		if(cellvalue == '10')
			{
				html = 'Grade 10';
			}
		if(cellvalue == '11')
			{
				html = 'Grade 11';
			}
		if(cellvalue == '12')
			{
				html = 'Grade 12';
			}
		return html;
		
		
	}
	
</script>