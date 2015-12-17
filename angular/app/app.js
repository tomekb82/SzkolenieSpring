'use strict';

angular.module('usersManager', ['ngRoute', 'usersManager.users'])
    .config(['$routeProvider' ,function($routeProvider) {
        $routeProvider.otherwise({redirectTo: '/users'});
    }]);