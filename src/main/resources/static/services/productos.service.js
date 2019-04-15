app=angular.module('frontend');

app.factory('productosService',
function($http){
	//productos=[
	//	{id:1,producto:"Arroz",precio:50.58},		
	//	{id:2,producto:"Leche",precio:45.12},
	//	{id:3,producto:"Chupetín",precio:6},	
	//];
	
	//listar=function(){
	//	return productos;
	//}
	listarHttp=function(){
		return $http.get('/api/v1/productos');
	}
	
	//agregar=function(producto){
	//	producto.id=productos.length+10;
	//	productos.push(producto);
	//}
	agregarHttp=function(producto) {
		return $http.post("api/v1/productos",producto);
	}
	eliminar=function(producto){
		return $http.delete('/api/v1/productos/'+producto.id);
		
		
	}
	sumaTotal=function(productos){
		var total=0;
		productos.forEach(     
				function(o,i){     
					total+=o.precio;
				}            
		);
		return total;
	}
	
	return { 
		listar:listarHttp,
		eliminar:eliminar, 
		sumaTotal:sumaTotal
	};
}
);