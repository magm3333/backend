app=angular.module('frontend');
app.controller('ProductosController',function($scope,productosService){
	
	productosService.listar();
	
	
});