'use strict';

angular.module('usersManager.users')
    .service('usersService', function () {
        var service = this;

        function findUserIndex(user) {
            var index = -1;
            $.each(service.users, function(idx, currentUser) {
                if (user.id === currentUser.id) {
                    index = idx;
                }
            });
            return index;
        }

        service.users = [
            {
                id: 1,
                firstName: 'Jan',
                lastName: 'Kowalski',
                email: 'jan.kowalski@wp.pl'
            },
            {
                id: 2,
                firstName: 'Marek',
                lastName: 'Nowak',
                email: 'marek.nowak@wp.pl'
            }
        ];

        service.save = function(user) {
            var id = findUserIndex(user);
            if (id === -1) {
                user.id = service.users.length + 1;
                service.users.push(user);
            } else {
                service.users[id] = user;
            }
        };

        service.delete = function(user) {
            service.users.splice(findUserIndex(user), 1);
        }

    });