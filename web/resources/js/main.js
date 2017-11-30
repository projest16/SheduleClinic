$(function () {
    var doctor_id = document.getElementById("choosedDoctorId").innerHTML;
    $('#calendar').fullCalendar({
        locale: 'ru',
        themeSystem: 'jquery-ui',
        dayClick: function(date, jsEvent, view) {
            $( "#dialog-form" ).dialog( "open" );
            //var format = "yyyy-MM-dd HH:mm";
            //var newDate = $.fullCalendar.formatDate(date, format);
            //var moment = $('#calendar').fullCalendar('getDate');
            //alert("The current date of the calendar is " + moment.format("YYYY-MM-DD"));

            document.getElementById("dateStart").value = date.format("YYYY-MM-DD");
            document.getElementById("dateEnd").value = date.format("YYYY-MM-DD");
        },
        
        eventClick: function (calEvent, jsEvent, view) {
            $( "#dialog-form-edit" ).dialog( "open" );
            document.getElementById("sheduleID").value = calEvent.id;


        },



        timezone: 'local',



        header: {
            center: 'month, agendaWeek'
        },

        eventSources: [{
            url: '/1',
            data: {
                doctor_id: doctor_id
            }
        }]
    });

    function event1() {
        "alert('Клик!')";


    }


    $("#dialog-form").dialog({
        autoOpen: false
    });

    $("#dialog-form-edit").dialog({
        autoOpen: false
    });

});


var b = 5;

function event1() {
    var i = $('#event_1');
    // var date_start = document.getElementById('text_date').value + ' ' + document.getElementById('event_hour').value + ':' + document.getElementById('event_minut').value;
    // var date_end = document.getElementById('text_date').value + ' ' + document.getElementById('event_hour').value + ':' + document.getElementById('event_minut').value + ':05';
    // var date_start = "2017-10-17";
    // var date_end = date_start;

    // alert(date_start);


    var string_date_start = document.getElementById('text_dateStart').value + ' ' + document.getElementById('eventStart_hour').value + ':' + document.getElementById('eventStart_minute').value;
    var string_date_end = document.getElementById('text_dateEnd').value + ' ' + document.getElementById('eventEnd_hour').value + ':' + document.getElementById('eventEnd_minute').value;

    var doctor_id = Number(document.getElementById('doctor').value);

    var date_start = new Date(string_date_start);
    var date_end = new Date(string_date_end);

    //date_start = document.getElementById('text_date').value;

    //document.getElementById("text_test").innerHTML = doctor_id;

    var data = {
        start: date_start,
        end: date_end
    }



    $.ajax({
        type: "POST",
        contentType : "application/json",
        url: "/2",
        data: JSON.stringify(data)
    });
}

function event2() {
    var string_date_start = document.getElementById('text_dateStart').value + ' ' + document.getElementById('eventStart_hour').value + ':' + document.getElementById('eventStart_minute').value;
    var string_date_end = document.getElementById('text_dateEnd').value + ' ' + document.getElementById('eventEnd_hour').value + ':' + document.getElementById('eventEnd_minute').value;
    var date_start = new Date(string_date_start);
    var date_end = new Date(string_date_end);
    document.getElementById("start").innerHTML = date_start;
    document.getElementById("end").innerHTML = date_end;
    alert(document.getElementById("start").value);

}

function event3() {
    var date_start = document.getElementById('dateStart').value + ' ' + document.getElementById('eventStart_hours').value + ':' + document.getElementById('eventStart_minutes').value + ':00';
    var date_end = document.getElementById('dateEnd').value + ' ' + document.getElementById('eventEnd_hours').value + ':' + document.getElementById('eventEnd_minutes').value + ':00';

    document.getElementById('hide_dateStart').value = date_start;
    document.getElementById('hide_dateEnd').value = date_end;
    var tmp = document.getElementById('patient');
    document.getElementById('text_title').value = tmp.options[tmp.selectedIndex].text;
    //alert(date_start);
}