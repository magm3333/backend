angular.module('frontend')
.controller('LoginFormController', 
function LoginFormController(
		$rootScope, $scope, 
		$uibModalInstance, 
		coreService,$log) {
	$scope.title="Ingreso";
	
	$scope.user={name:"",password:""};
	
	
	$scope.login = function () {
		coreService.login($scope.user).then(
			function(resp){ 
				if(resp.status===200) {
					$rootScope.loginData=resp.data;
					$rootScope.loggedIn=true;	
					$rootScope.loginOpen = false;
					$uibModalInstance.dismiss(true);
				}else{
					$rootScope.loginData=false;
					$rootScope.loggedIn=false;	
				}
			},
			function(respErr){
				$log.log(respErr);
			}
		);
	  };  
}); //End LoginFormController




