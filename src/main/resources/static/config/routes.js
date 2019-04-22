angular.module('frontend').config( 
	function($routeProvider,$locationProvider){
		$routeProvider
		
		.when('/main',{
			templateUrl:'views/main.html',
			controller: 'MainController'
		})
		
		.when('/productos',{
			templateUrl:'views/productos.html',
			controller: 'ProductosController'
		})
		.otherwise({
			redirectTo : '/main'
		})
		
	}  
);