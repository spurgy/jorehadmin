/**
 * Script for all pages
 */

$(function(){
	//Initialize Select2 Elements
	$('.select2').select2();
	
	//Money Euro
	$('[data-mask]').inputmask();
	
//	$('.phonemask').inputmask();
	
	//Date picker
	$('.datepicker').datepicker({
		autoclose: true
	})
	
	//Timepicker
	$('.timepicker').timepicker({
		showInputs: false
	})
	
	//Bill page ------ saved bills table
	$('#savedBillsTable').DataTable({
		  'paging'      : true,
		  'lengthChange': false,
		  'searching'   : false,
		  'scrollY':        "190px",
		  'ordering'    : true,
		  'info'        : true,
		  'autoWidth'   : false
	})
	//---------Bill page ------ saved bills table--------
	
	//Inventory Page
	$('[data-toggle="tooltip"]').tooltip();
	//Tables
	$('#inventoryProducttable').DataTable()
    $('#inventoryCategorytable').DataTable()
	$('#inventoryBrandtable').DataTable()
	$('#inventoryOrderstable').DataTable()
	//----Inventory Page Tables----
	
	
	
	//Staff Page Tables
	
	$("#servicesCPDtable").DataTable()
	$('#servicesServiceTable').DataTable()
	servicepacTable = $('#servicesPackagesTable').DataTable();
	
		
	 datatable = $('#staffTable').DataTable({
		"sAjaxSource": "/util/getStaff",
		"sAjaxDataProp": "",
		"asStripeClasses": [ 'strip1', 'strip2', 'strip3', 'strip4', 'strip5' ],
		"order": [[ 0, "asc" ]],
		"aoColumns": [
		      { "mData": "id"},
	          { "mData": "name" },
			  { "mData": "phoneNumber" },
			  { "mData": "email" },
			  { "mData": "salary"}
		]
	});
	
	 $('#staffTable tbody').on( 'click', 'tr', function () {
		    console.log( datatable.row( this ).data() );
		} );
	
	// Staff Table Load designations
	$.post( "/util/getDesignations", function( data ) {
		$.each(data, function(key, value){
	        $("#staffDesignations").append('<option value="'+ key +'">'+ value +'</option>')
		})
	});
	//-------Staff Page Tables-----
	
	//Setup Page Tables
	$('#setupMembershipTable').DataTable()
	$('#setupDurationTable').DataTable()
	
	
	//-------Setup Page Tables-----
	
	
})

//Inventory Functions
function inventoryAddBtn(value){
	console.log(value);
	if(value == "addProduct"){
		$("#inventoryAddProductModal").modal({backdrop: "static"});
		$("#inventoryAddProductModal").modal('show');
	}else if(value == "addCategory"){
		$("#inventoryModal").modal({backdrop: "static"});
		$("#inventoryModal").modal('show');
		
		$("#inventoryModalLabel").text("Category name :");
		$(".inventoryModalTitle").text("Add Category");
		$(".inventoryModalInput").attr("placeholder", "Enter Category Name");
	}else if(value =="addBrand"){
		$("#inventoryModal").modal({backdrop: "static"});
		$("#inventoryModal").modal('show');
		
		$("#inventoryModalLabel").text("Brand name :");
		$(".inventoryModalTitle").text("Add Brand");
		$(".inventoryModalInput").attr("placeholder", "Enter Brand Name");
	}else if(value == "addOrder"){
		
		}
}

//service page functions

$(function(){
	
	
	
	//cpd dropdown function
	$(".servicesAddCPDdropdown").change(function(){
		console.log(this.value);
		if((this.value != 'Select')){
			$(".servicesAddCpdBtn").removeAttr('disabled');
			if(this.value == 'Category'){
				$(".servicesAddCpdBtn").attr('title', 'Add Category');
				$(".servicesAddCpdBtn").attr('value', 'addcategory');
			}else if(this.value == 'Package'){
				$(".servicesAddCpdBtn").attr('title', 'Add Package');
				$(".servicesAddCpdBtn").attr('value', 'addpackage');
			}else if(this.value == 'Deals & Discounts'){
				$(".servicesAddCpdBtn").attr('title', 'Add Deals and Discounts');
				$(".servicesAddCpdBtn").attr('value', 'addDd');
			}
		}else{
			$(".servicesAddCpdBtn").attr("disabled","disabled");
			//$(".servicesAddCpdBtn").text("Add");
		}
	});
	//---------cpd dropdown function
	//-----
	//cpd add button function
	$(".servicesAddCpdBtn").click(function(){
		if(this.value == 'addcategory'){			//Add Category Button function
			console.log(this.value);
			$("#servicesAddCPDmodal").modal({backdrop: "static"});
			$("#servicesAddCPDmodal").modal('show');
			$("#servicesaddCPDmodalinput").attr('placeholder', 'Enter Category Name');
			$("#servicesaddCPDmodalLabel").text('Category Name :');
			$("#servicesaddCPDmodalTitle").text('Add Category');
		}else if(this.value == 'addpackage'){		//Add Package Button function
			console.log(this.value);
			$("#servicesAddCPDmodal").modal({backdrop: "static"});
			$("#servicesAddCPDmodal").modal('show');
			$("#servicesaddCPDmodalinput").attr('placeholder', 'Enter Package Name');
			$("#servicesaddCPDmodalLabel").text('Package Name :');
			$("#servicesaddCPDmodalTitle").text('Add Package');
		}else if(this.value == 'addDd'){		//Add Deals & Discounts Button function
			console.log(this.value);
			$("#servicesAddCPDmodal").modal({backdrop: "static"});
			$("#servicesAddCPDmodal").modal('show');
			$("#servicesaddCPDmodalinput").attr('placeholder', 'Enter Deal Name');
			$("#servicesaddCPDmodalLabel").text('Deal Name :');
			$("#servicesAddCPDmodalTitle").text('Add Deals and Discount');
		}
	});
})

function servicesCatAddService(){
	$("#servcesAddtoCatModal").modal({backdrop: "static"});
	$("#servcesAddtoCatModal").modal('show');
}

$(function () {
   $('.addservicestaffcheckboxInput').iCheck({
	 checkboxClass: 'icheckbox_square-blue',
	 radioClass: 'iradio_square-blue',
	 increaseArea: '20%' /* optional */
   });
 });
//--------service page functions--------

//Staff Page function

$(".addStaffBtn").click(function() {
	
	$("#staffAddModal").modal({backdrop: "static"});
	$("#staffAddModal").modal('show');
});

$(".addStaffSaveBtn").click(function() {
	$("#StaffForm").submit();
});

$(".strip1").click(function() {
	console.log(this);
});


$(function () {
   $('#staffcheckboxInput').iCheck({
	 checkboxClass: 'icheckbox_square-blue',
	 radioClass: 'iradio_square-blue',
	 increaseArea: '20%' /* optional */
   });
 });





//------Staff Page function------

//Setup Page function

function setupAddBtn(value){
	if(value == "addMembership"){
		$("#setupAddMembershipModal").modal({backdrop: "static"});
		$("#setupAddMembershipModal").modal('show');
	}
	if(value=="addDuration"){
		$("#setupAddDurationModal").modal({backdrop: "static"});
		$("#setupAddDurationModal").modal('show');
	}
}


//------Setup Page function------