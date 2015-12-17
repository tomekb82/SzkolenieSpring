'use strict';

var arr = [2, 4, 5, 6];

function each(arr, callback) {
    for (var i = 0; i < arr.length; i++) {
        callback(arr[i], i);
    }
}

var filter = function(arr, criteria) {
    var result = [];
    each(arr, function(val, idx) {
        var match = criteria(val);
        if (match) {
            result.push(val);
        }
    });
    return result;
};

function isEven(val) {
    return val % 2 === 0;
}


function print(data) {
    console.log(data);
}

var test = print;

each(arr, print);

print(filter(arr, isEven));


var user = {
    firstName: 'Jan',
    lastName: 'Kowalski',
    sayHello: function() {
        console.log('Hello ' + this.firstName + ' ' + this.lastName);
    }
};

var user2 = {};

user2.firstName = 'Jan';
delete user2.firstName;


user.sayHello();


function Account(number) {
    if (!(this instanceof  Account)) {
        return new Account(number);
    }
    this.number = number;
    this.balance = 0;
    this.getBalance = function() {
        return this.balance;
    };
}

Account.prototype = {};

Account.prototype.deposit = function(funds) {
    this.balance += funds;
};

var account1 = new Account('00000001');

account1.deposit(100);
console.log(account1.getBalance());



var color = 'red';

function printColor() {
    console.log('Color:' + this.color);
}


printColor();

var config = {
    color: 'blue'
};

printColor.call(color);


















































