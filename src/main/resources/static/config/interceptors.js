angular.module('frontend')
.service('APIInterceptor', function($rootScope) {
    var service = this;

    service.responseError = function(response) {
       if(response.status==401) {
    	   //console.log(response);
    	   $rootScope.openLoginForm();
       } else {
    	   //$rootScope.authInfo();
       }
       return response;
    };
})