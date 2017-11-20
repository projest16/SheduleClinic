$(function () {

    $('#calendar').fullCalendar(
        {
            dayClick: function(date, allDay, jsEvent, view) {
                var newDate = $.fullCalendar.formatDate(date, format);
                event_start.val(newDate);
                event_end.val(newDate);
                formOpen('add');
            },

            // defaultView: "agendaWeek",
            header: {
                center: 'month, agendaWeek'
            },

            timezone:'local',

            eventSources: [{
                url: '/1'
            }]
        });

    // $( "#dialog" ).dialog();

    var event_start = $('#event_start_date' + ' ' + '#event_start_time');
    console.log(event_start.val());
    var event_end = $('#event_end');
    console.log(event_end.val());
    var event_type = $('#event_type');
    var calendar = $('#calendar');
    var form = $('#dialog-form');
    var event_id = $('#event_id');
    var format = "yyyy-MM-dd HH:mm";

    /* кнопка добавления события */
    $('#add_event_button').button().click(function(){
        formOpen('add');
    });
    /** функция очистки формы */
    // function emptyForm() {
    //     event_start.val("");
    //     event_end.val("");
    //     event_type.val("");
    //     event_id.val("");
    // }
    /* режимы открытия формы */
    function formOpen(mode) {
        if(mode == 'add') {
            /* скрываем кнопки Удалить, Изменить и отображаем Добавить*/
            $('#add').show();
            $('#edit').hide();
            $("#delete").button("option", "disabled", true);
        }
        else if(mode == 'edit') {
            /* скрываем кнопку Добавить, отображаем Изменить и Удалить*/
            $('#edit').show();
            $('#add').hide();
            $("#delete").button("option", "disabled", false);
        }
        form.dialog('open');
    }

    form.dialog({
        position: { at: calendar },
        autoOpen: true,
        buttons: [{
            id: 'add',
            text: 'Добавить',
            click: function() {
                var data = {
                    title: event_type.val(),
                    start: event_start.val(),
                    end: event_end.val()
                    //op: 'add'
                    // op: 'add'
                }
                $.ajax({
                    type: "POST",
                    contentType : "application/json",
                    url: "/2",
                    data: JSON.stringify(data)
                    // success: function(id){
                    //     calendar.fullCalendar('renderEvent', {
                    //         id: id,
                    //         title: event_type.val(),
                    //         start: event_start.val(),
                    //         end: event_end.val(),
                    //         allDay: false
                    //     });
                    // }
                });
                //emptyForm();
            }
        },
            {   id: 'edit',
                text: 'Изменить',
                click: function() {
                    //some code
                }
            },
            {   id: 'cancel',
                text: 'Отмена',
                click: function() {
                    $(this).dialog('close');
                    emptyForm();
                }
            },
            {   id: 'delete',
                text: 'Удалить',
                click: function() {
                    //some code
                },
                disabled: true
            }]
    });


});
