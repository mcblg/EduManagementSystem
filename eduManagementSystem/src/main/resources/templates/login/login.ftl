<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>AdminLTE 3 | Log in</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <#include "../common/common.ftl">

    <!-- Font Awesome -->
    <link rel="stylesheet" href="plugins/fontawesome-free/css/all.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
    <!-- icheck bootstrap -->
    <link rel="stylesheet" href="plugins/icheck-bootstrap/icheck-bootstrap.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="dist/css/adminlte.min.css">
    <!-- Google Font: Source Sans Pro -->
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
    <!-- jQuery -->
    <script src="plugins/jquery/jquery.min.js"></script>
    <script>
        $(document).ready(function () {
            <#if Session["user"]?exists>
                <#--window.location.href = "${path}/index";-->
                window.location.replace("${path}/index");
            </#if>
        })
    </script>
</head>
<body class="hold-transition login-page">
<div class="login-box">
    <div class="login-logo">
        <a href="#"><b>EDU-ADMINISTRATION-SYSTEM</b></a>
    </div>
    <!-- /.login-logo -->
    <div class="card">
        <div class="card-body login-card-body">
            <p class="login-box-msg">登录</p>

            <form id="loginForm">
                <div class="input-group mb-3">
                    <input type="text" name="userName" class="form-control" autocomplete="off" placeholder="账号">
                    <div class="input-group-append">
                        <div class="input-group-text">
                            <span class="fas fa-envelope"></span>
                        </div>
                    </div>
                </div>
                <div class="input-group mb-3">
                    <input type="password" name="password" class="form-control" placeholder="密码">
                    <div class="input-group-append">
                        <div class="input-group-text">
                            <span class="fas fa-lock"></span>
                        </div>
                    </div>
                </div>
                <span id="error-msg"></span>
                <div class="row">
                    <div class="col-8">
<#--                        <div class="icheck-primary">-->
<#--                            <input type="checkbox" id="remember">-->
<#--                            <label for="remember">-->
<#--                                Remember Me-->
<#--                            </label>-->
<#--                        </div>-->
                    </div>
                    <!-- /.col -->
                    <div class="col-4">
                        <button type="submit" class="btn btn-primary btn-block">登录</button>
                    </div>
                    <!-- /.col -->
                </div>
            </form>
        </div>
        <!-- /.login-card-body -->
    </div>
</div>
<!-- /.login-box -->

<!-- Bootstrap 4 -->
<script src="plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="dist/js/adminlte.min.js"></script>

<script src="plugins/jquery-validation/jquery.validate.min.js"></script>
<script src="plugins/jquery-validation/additional-methods.min.js"></script>

<script src="https://cdn.bootcss.com/blueimp-md5/2.13.0/js/md5.min.js"></script>

<script>
    $(document).ready(function () {
        $.validator.setDefaults({
            submitHandler: function () {
                login()
            }
        });
        $('#loginForm').validate({
            rules: {
                userName: {
                    required: true,
                },
                password: {
                    required: true,
                },
            },
            messages: {
                userName: {
                    required: "请输入用户名",
                },
                password: {
                    required: "请输入密码",
                },
                terms: "Please accept our terms"
            },
            errorElement: 'span',
            errorPlacement: function (error, element) {
                error.addClass('invalid-feedback');
                element.closest('.input-group').append(error);
            },
            highlight: function (element, errorClass, validClass) {
                $(element).addClass('is-invalid');
            },
            unhighlight: function (element, errorClass, validClass) {
                $(element).removeClass('is-invalid');
            }
        });
    });

    //登录
    function login() {
        let userName = $("input[name='userName']").val();
        let password = $("input[name='password']").val();
        if (userName)
            $.post("${path}/doLogin", {userName: userName, password: md5(password)}, function (rs) {
                console.log(rs)
                if (rs.code == 0) {
                    window.location.href = "${path}/index";
                }else if (rs.code == 2001){
                    $("#error-msg").text("用户不存在")
                }else if (rs.code == 2002) {
                    $("#error-msg").text("密码错误")
                }else if (rs.code == 2003) {
                    $("#error-msg").text("用户已锁定，请联系管理员")
                }else if (rs.code == 2000) {
                    $("#error-msg").text("登录错误")
                }else {
                    $("#error-msg").text("系统异常")
                }
            })
    }
</script>

</body>
</html>
