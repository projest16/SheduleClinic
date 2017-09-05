$(function () {

    $('#calendar').fullCalendar(
        {
            eventSources: [{
                url: '/1'
            }]
            // dayClick: function () {
            //     alert('Работает');
            // }
            // events:[
            //     {
            //         "title" : "1",
            //         "start" : "2017-09-02"
            //     }
            // ]
        });
});
