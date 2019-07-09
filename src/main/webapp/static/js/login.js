let username = $('#userName')
let password = $('#password')
let loginBtn=$('#login_button')
username.on('focus', () => {
    $('.label_text label')[0].innerHTML = '账户'
    $('.label_text .icon')[0].style = "display:none"
    $($('.label_text')[0]).addClass('label_focus')
    $($('.name_box')[0]).addClass('name_box_focus')
    $($('.label_text')[0]).removeClass('error_label')
})
username.on('blur', () => {
    if (!username.val())
        $($('.label_text')[0]).removeClass('label_focus')
    $($('.name_box')[0]).removeClass('name_box_focus')
})
password.on('focus', () => {
    $('.label_text label')[1].innerHTML = '密码'
    $('.label_text .icon')[1].style = "display:none"
    if($('.message_box').hasClass('error_me_box')){
        $('#password').val('')
        $('.message_box').removeClass('error_me_box')
    }
    $($('.label_text')[1]).addClass('label_focus')
    $($('.password_box')[0]).addClass('name_box_focus')
    $($('.label_text')[1]).removeClass('error_label')
    password.keypress(function (e) {
        if (e.which == 13 & password.val()!='' & username.val()!='') {
            $('#login_button').trigger('click')
        }
    });
})
password.on('blur', () => {
    if (!password.val())
        $($('.label_text')[1]).removeClass('label_focus')
    $($('.password_box')[0]).removeClass('name_box_focus')
})
loginBtn.on('click', () => {
    if (!username.val()) {

        $('.label_text label')[0].innerHTML = '账户名不能为空'
        $('.label_text .icon')[0].style = "display:unset"
        $($('.label_text')[0]).addClass('error_label')
    }
    if (!password.val()) {
        $('.label_text label')[1].innerHTML = '密码不能为空'
        $('.label_text .icon')[1].style = "display:unset"
        $($('.label_text')[1]).addClass('error_label')
    }
    if (username.val() != '' & password.val() != '') {
        $($('.submit_box')[0]).addClass('login_loading')
        $('#login_button')[0].innerHTML = ' '
        $('.ac')[0].innerHTML = '登陆中'
        $.ajax({
            url: '/user/login',
            type: 'post',
            contentType: 'application/x-www-form-urlencoded',
            data: {
                userName: username.val(),
                password: password.val()
            },
            dataType: 'json',
            success: function (data) {
                switch (data.state) {
                    case 'error' :
                        $('.ac').html('')
                        $('.ms_lab').html(data.message)
                        $('#login_button')[0].innerHTML = '→'
                        $('.message_box').addClass('error_me_box')
                        $($('.submit_box')[0]).removeClass('login_loading')
                        break;
                    case 'success' :
                        $('.ac').html('')
                        $($('.submit_box')[0]).removeClass('login_loading')
                        $('#login_button')[0].innerHTML = '已登入'
                        window.location.href = '/index'
                        break;
                }
            },
            error: function (error) {
            }
        })
    }

})