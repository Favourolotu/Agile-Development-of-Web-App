$(document).ready(function () {

    $("form").submit(function (event) {
        var formData = {
            name: $("#name").val(),
        };
        $.ajax({
            type: "POST",
            url: "http://localhost:8080/addBuddyInfo",
            data: formData,
            dataType: "json",
        }).done(function (data) {

            if (data.success) {
                $.ajax({
                    url: "http://localhost:8080/addressBook"
                }).then(function (data) {
                    if (data) {
                        $('.bookID').append(data.id);
                        for (i = 0; i < data.buddies.length; i++) {
                            $('.bookContent').append("Name: " + data.buddies[i].name).append("<br>");
                        }
                    }
                });
            }
        });

        event.preventDefault();
    });


});