angular.module('frontend')
.constant('URL_API_BASE', '/api/v1/')
.constant('URL_BASE', '/')
.run( function($rootScope,$location,$uibModal,coreService,$localStorage){
	
	$rootScope.loginOpen=false;
	//$rootScope.loginData=false;
	//$rootScope.loggedIn=false;
	
	$rootScope.loginData=$localStorage.userdata;
	$rootScope.loggedIn=$localStorage.logged;
	
	
	$rootScope.openLoginForm = function(size) {
		if (!$rootScope.loginOpen) {
			$rootScope.loginOpen = true;
			$uibModal.open({
				animation : true,
				backdrop : 'static',
				keyboard : false,
				templateUrl : 'views/loginForm.html',
				controller : 'LoginFormController',
				size : 'md'
			});
		}
	};
	
	//coreService.authInfo().then(
	//		function(resp){
	//			$rootScope.loginData=resp.data;
	//			$rootScope.loggedIn=true;	
	//			$rootScope.loginOpen = false;
	//		}
	//);
	
	$rootScope.logout=function() {
		//$rootScope.loginData=false;
		//$rootScope.loggedIn=false;
		delete $localStorage.userdata;
		$localStorage.logged=false;
		$rootScope.loginOpen = false;
		coreService.logout().then(function(resp){
			//$rootScope.loginData=false;
			//$rootScope.loggedIn=true;	
			
		},function(){});
	};
	
	$rootScope.oldLoc=false;
	$rootScope.relocate=function(loc){
		$rootScope.oldLoc=$location.$$path;
		$location.path(loc);
	};
	$rootScope.backLocation=function() {
		if($rootScope.oldLoc)
			$location.path($rootScope.oldLoc);
	};
} 
);