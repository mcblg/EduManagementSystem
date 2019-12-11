<!DOCTYPE html>
<html lang="en">
<head>
    <title>Home</title>
    <!-- Meta tags -->
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content=""/>
    <#include "/common/common.ftl">
    <script>
        addEventListener("load", function () { setTimeout(hideURLbar, 0); }, false); function hideURLbar() { window.scrollTo(0, 1); }
    </script>
    <!-- Meta tags -->
    <!--stylesheets-->
    <link href="${path}/css/loginStyle.css" rel='stylesheet' type='text/css' media="all">
    <!--//style sheet end here-->
    <link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:400,600,700" rel="stylesheet">
</head>
<body>
<div class="mid-class">
    <div class="art-right-w3ls">
        <h2>登录</h2>
        <form action="${path}/login/doLogin" method="post">
            <div class="main">
                <div class="form-left-to-w3l">
                    <input type="text" name="userName" placeholder="用户名" autocomplete="off" required="">
                </div>
                <div class="form-left-to-w3l ">
                    <input type="password" name="password" placeholder="密码" autocomplete="off" required="">
                    <div class="clear"></div>
                </div>
                <p>${loginMsg! '123'}</p>
                <#if loginMsg?? && loginMsg!=''>
                    <div class="form-left-to-w3l">
                        <p>${loginMsg}</p>
                    </div>
                <#else>
                </#if>
            </div>
            <div class="left-side-forget">
                <input type="checkbox" class="checked">
                <span class="remenber-me">记住我</span>
            </div>
            <div class="right-side-forget">
                <a href="#" class="for">忘记密码?</a>
            </div>
            <div class="clear"></div>
            <div class="btnn">
                <button type="submit">登录</button>
            </div>
        </form>
        <div class="w3layouts_more-buttn">
            <h3><a href="#content1">还没有账号?</a></h3>
        </div>
        <!-- popup-->
        <div id="content1" class="popup-effect">
            <div class="popup">
                <!--login form-->
                <div class="letter-w3ls">
                    <form action="#" method="post">
                        <div class="form-left-to-w3l">
                            <input type="text" name="name" placeholder="Username" required="">
                        </div>
                        <div class="form-left-to-w3l">
                            <input type="text" name="name" placeholder="Phone" required="">
                        </div>
                        <div class="form-left-to-w3l">
                            <input type="email" name="email" placeholder="Email" required="">
                        </div>
                        <div class="form-left-to-w3l">
                            <input type="password" name="password" placeholder="Password" required="">
                        </div>
                        <div class="form-left-to-w3l margin-zero">
                            <input type="password" name="password" placeholder="Confirm Password" required="">
                        </div>
                        <div class="btnn">
                            <button type="submit">注册</button>
                            <br>
                        </div>
                    </form>
                    <div class="clear"></div>
                </div>
                <!--//login form-->
                <a class="close" href="#">&times;</a>
            </div>
        </div>
        <!-- //popup -->
    </div>
    <div class="art-left-w3ls">
        <h1 class="header-w3ls">
            XXXX<br/>教务系统
        </h1>
    </div>
</div>
<footer class="bottem-wthree-footer">
    <p>Copyright &copy; blg 2019</p>
</footer>
</body>
</html>