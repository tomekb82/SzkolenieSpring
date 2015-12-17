'use strict';

if (!core) {
    throw new Error('Core library not found');
}

core.namespace('core').remote = (function($, undefined) {
    const  FINISH_STATE = 4,
           STATUS_OK = 200,
           STATUS_UNASSIGNED = 299;

    function noop() {}

    function ajax(config) {
        var settings = {
                url: '',
                method: 'GET',
                success: noop,
                failure: noop,
                data: {}
            },
            xhr;


        $.mix(config, settings);
        xhr = new XMLHttpRequest();
        xhr.open(settings.method, settings.url);
        xhr.onreadystatechange = function() {
            if (xhr.readyState === FINISH_STATE) {
                if (xhr.status >= STATUS_OK && xhr.status < STATUS_UNASSIGNED) {
                    settings.success(JSON.parse(xhr.responseText), xhr);
                } else {
                    settings.failure(xhr);
                }
            }
        };
        xhr.send(settings.data);
    }

    return {
        ajax: ajax
    };
})(core);

