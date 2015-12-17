'use strict';

angular.module('usersManager.users')
    .controller('UsersController', ['usersService', function(usersService) {
        this.users = usersService.users;

        this.delete = function(user) {
            usersService.delete(user);
        };

        this.save = function() {
            usersService.save(this.currentUser);
            this.currentUser = null;
        };

        this.setCurrentUser = function(user) {
            this.currentUser = angular.copy(user);
        };
    }]);
