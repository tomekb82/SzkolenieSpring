    core.onReady(function() {
    var me = this;

    function refreshTable(data) {
        var template = document.querySelector('#userTableBody').innerHTML,
            tableBody = document.querySelector('#users tbody');

        Mustache.parse(template);
        me.each(data.users, function(user, idx) {
            user.idx = idx + 1;
        })
        tableBody.innerHTML = Mustache.render(template, data);
    }

    this.namespace('core.remote').ajax({
        url: 'data.json',
        success: refreshTable
    });
});