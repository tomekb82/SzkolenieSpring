'use strict';

angular.module('usersManager.users', ['ngRoute'])
    .config(['$routeProvider' ,function($routeProvider) {
        $routeProvider.when('/users', {
            templateUrl: 'app/users/users.html',
            controller: 'UsersController',
            controllerAs: 'usersCtrl'
        });
    }]);