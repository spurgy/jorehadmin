/**
 * Script for all pages
 */

$(function(){
	//Initialize Select2 Elements
	$('.select2').select2()
	
	//Money Euro
	$('[data-mask]').inputmask()
	
	//Date picker
	$('#datepicker').datepicker({
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