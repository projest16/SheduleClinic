$(function () {
    $('#calendar').fullCalendar({
        dayClick: function(date, jsEvent, view) {
            document.getElementById("text_dateStart").innerHTML = date.format();
            document.getElementById("text_dateEnd").innerHTML = date.format();
        }
    });

    function event1() {
        "alert('Клик!')";


    }

    $( function() {

    } );
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
    var string_date_start = document.getElementById('text_dateStart').value;
    var date_start = new Date(string_date_start);
    document.getElementById("hiddenarea").innerHTML = date_start;
}