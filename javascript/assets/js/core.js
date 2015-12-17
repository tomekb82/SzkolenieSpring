'use strict';

var core = (function () {
    var api = {
            each: each,
            on: function (target, event, callback, context) {
                target.addEventListener(event, bind(context || target, callback));
            },
            onReady: function (callback) {
                this.on(window, 'load', callback, core);
            },
            namespace: namaspace,
            mix: mix
        },
        namespaceBase = {};

    function each(arr, callback) {
        for (var idx = 0; idx < arr.length; idx++) {
            callback(arr[idx], idx);
        }
    }

    function bind(context, fn) {
        return function () {
            return fn.apply(context, arguments);
        }
    }

    function mix(source, destination) {
        for (var key in source) {
            if (source.hasOwnProperty(key)) {
                destination[key] = source[key];
            }
        }
    }

    function namaspace(path) {
        var currentSegment = namespaceBase;
        each(path.split('.'), function(pathElement) {
            if (currentSegment[pathElement] === undefined) {
                currentSegment[pathElement] = {};
            }
            currentSegment = currentSegment[pathElement];
        });
        return currentSegment;
    }

    if (window.addEventListener === undefined) {
        api.on = function (target, event, callback, context) {
            target.attachEvent('on' + event, bind(context || target, callback));
        };
    }

    return api;
})();
