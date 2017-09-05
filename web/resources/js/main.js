$(function () {

    $('#calendar').fullCalendar(
        {
            dayClick: function () {
                alert('Работает');
            },

            // defaultView: "agendaWeek",
            header: {
                center: 'month, agendaWeek'
            },

            eventSources: [{
                url: '/1'
            }]
        });

        $( "#dialog" ).dialog();
});
