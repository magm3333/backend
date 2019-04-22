angular.module('frontend')
.run( function($rootScope,$location){
	
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