<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <#include "/common/common.ftl">
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <link href="${path}/css/loginStyle.css" rel='stylesheet' type='text/css' />
    <!--webfonts-->
<#--    <link href='http://fonts.useso.com/css?family=PT+Sans:400,700,400italic,700italic|Oswald:400,300,700' rel='stylesheet' type='text/css'>-->
<#--    <link href='http://fonts.useso.com/css?family=Exo+2' rel='stylesheet' type='text/css'>-->
    <!--//webfonts-->
<#--    <script src="http://ajax.useso.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>-->
</head>
<body>
<!--SIGN UP-->
<h1>klasikal Login Form</h1>
<div class="login-form">
<#--    <div class="close"> </div>-->
    <div class="head-info">
        <label class="lbl-1"> </label>
        <label class="lbl-2"> </label>
        <label class="lbl-3"> </label>
    </div>
    <div class="clear"> </div>
    <div class="avtar">
        <img src="${path}/image/avtar.png" />
    </div>
    <form>
        <input type="text" class="text" placeholder="账号">
        <div class="key">
            <input type="password"  placeholder="密码">
        </div>
    </form>
    <div class="signin">
        <input type="submit" value="Login" >
    </div>
</div>
</body>
</html>