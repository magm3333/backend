app=angular.module('frontend');

app.service('productosService',
function($http){
	
	var servicio={
		datos:[],
		listar:function(){
			$http.get('/api/v1/productos').then(
					function(resp){
						this.datos=resp.data;
					},
					function(err){}
			);
		},
		agregar:function(producto) {
			return $http.post("api/v1/productos",producto);
		},
		eliminar:function(producto){
			return $http.delete('/api/v1/productos/'+producto.id);
			
			
		},
		sumaTotal:function(){
			var total=0;
			this.datos.forEach(     
					function(o,i){     
						total+=o.precio;
					}            
			);
			return total;
		}
	};
	return servicio;
	
}
);