angular.module('frontend').config( 
	function($routeProvider,$locationProvider, $httpProvider){
		
		
		$httpProvider.defaults.withCredentials = true;
		$httpProvider.interceptors.push('APIInterceptor');
		
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