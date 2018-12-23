
$(function () {
    $("input[name=uphone]").blur(function () {
        if ($("input[name=uphone]").val() ==""){
            $("#sp1").text("手机号不能为空");
        } else{
            if((/^1(3|4|5|7|8|9)\d{9}$/).test($("input[name=uphone]").val())){
                $("#sp1").text("");
            }else {
                $("#sp1").text("手机号错误");
            }
        }
    })

    $("input[name=password]").blur(function () {
        if(/^[A-Za-z][A-Za-z0-9_]{5,9}$/.test($.trim($("input[name=password]").val()))){
            $("#sp2").text("");
        }else{
            $("#sp2").text("密码不符合");
        }

    })

    $("input[name=password1]").blur(function () {
            if($("input[name=password]").val() == $("input[name=password1]").val()){
                $("#sp3").text("");
            }else {
                $("#sp3").text("密码不相同");
            }
    })

    $("input[name=change]").click(function () {
        if($("input[name=password]").attr("type")=="password"){
            $("input[name=password]").attr("type","text");
            $("input[name=password1]").attr("type","text");
        }else{
            $("input[name=password]").attr("type","password");
            $("input[name=password1]").attr("type","password");
        }
    })


    $("input[name=tijiao]").click(function () {
        var  ba = $("input[type=checkbox]").prop('checked')
        alert(ba);

    })

    $("input[name=reg]").blur(function () {
        if(""==$("input[name=reg]").val()){
            $("#sp5").text("未输入验证码");
        }else {
            $("#sp5").text("");
        }

    })

    $("input[name=code]").click(function () {
            location.href="getCode";
    })



})