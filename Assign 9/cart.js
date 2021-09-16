var app=angular.module('myapp',[]);
	app.controller('CartForm', function($scope)
    {
    $scope.cart = {
        items: [{description: '', cost: ''}]
    }

    $scope.addItem = function() {
        $scope.cart.items.push({ description: '', cost: ''});
    }

    $scope.removeItem = function(index) {
        $scope.cart.items.splice(index, 1);
    }

    $scope.total = function() {
        var total = 0;
        angular.forEach($scope.cart.items, function(item) {
            total += item.cost;
        })
        return total;
    }
}
);
