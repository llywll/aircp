(function ($) {
    "use strict";


    $(function () {
        for (var nk = window.location, o = $(".nano-content li a").filter(function () {
            return this.href == nk;
        })
            .addClass("active")
            .parent()
            .addClass("active"); ;) {
            if (!o.is("li")) break;
            o = o.parent()
                .addClass("d-block")
                .parent()
                .addClass("active");
        }
    });


    /* 
    ------------------------------------------------
    Sidebar open close animated humberger icon
    ------------------------------------------------*/

    $(".hamburger").on('click', function () {
        $(this).toggleClass("is-active");
    });

    $("#place_b").on('click', function () {
        $('.content-wrap').load('/templates/table-jsgrid-place.html')
    })
    $("#place_u").on('click', function () {
        $('.content-wrap').load('/templates/table-jsgrid-user.html')
    })
    $("#place_o").on('click', function () {
        $.ajax({
            url: "/order/getByPage",
            type: 'get',
            contentType: 'application/x-www-form-urlencoded',
            dataType: 'json',
            success: function (hdata) {
                let oTemp = Handlebars.compile($('#orderTemp').html())
                let orderList = {
                    sdata: hdata.data
                }
                let html = oTemp(orderList);
                console.log(hdata.data)
                $('.content-wrap').html(html)
            }
        })

    })
    $("#place_h").on('click', function () {
        $('.content-wrap').load('/templates/table-jsgrid-ho.html')
    })

    $(".showInfoBtn").on("click",
        function (id) {
            let oId = $(this).data("id")
            $.ajax({
                url: "/order/getById?id=" + idd,
                type: 'get',
                contentType: 'application/x-www-form-urlencoded',
                dataType: 'json',
                success: function (hdata) {
                    let oTemp = Handlebars.compile($('#infoModalTemp').html())
                    let orderList = {
                        sdata: hdata.data
                    }
                    let html = oTemp(orderList);
                    $('.modal_Box').html(html)
                    $('#infoModal').modal('toggle')
                }
            })
        })

    /* TO DO LIST
    --------------------*/
    $(".tdl-new").on('keypress', function (e) {
        var code = (e.keyCode ? e.keyCode : e.which);
        if (code == 13) {
            var v = $(this).val();
            var s = v.replace(/ +?/g, '');
            if (s == "") {
                return false;
            } else {
                $(".tdl-content ul").append("<li><label><input type='checkbox'><i></i><span>" + v + "</span><a href='#' class='ti-close'></a></label></li>");
                $(this).val("");
            }
        }
    })

    $(".tdl-content a").on("click", function () {
        var _li = $(this).parent().parent("li");
        _li.addClass("remove").stop().delay(100).slideUp("fast", function () {
            _li.remove();
        });
        return false;
    });

    // for dynamically created a tags
    $(".tdl-content").on('click', "a", function () {
        var _li = $(this).parent().parent("li");
        _li.addClass("remove").stop().delay(100).slideUp("fast", function () {
            _li.remove();
        });
        return false;
    });


})(jQuery);