<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="x-ua-compatible" content="ie=edge">

    <title>Edu-administration-system</title>

    <!-- Font Awesome Icons -->
    <link rel="stylesheet" href="plugins/fontawesome-free/css/all.min.css">
    <!-- overlayScrollbars -->
    <link rel="stylesheet" href="plugins/overlayScrollbars/css/OverlayScrollbars.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="dist/css/adminlte.min.css">
    <!-- Google Font: Source Sans Pro -->
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
    <!-- daterange picker -->
    <link rel="stylesheet" href="plugins/daterangepicker/daterangepicker.css">
    <link rel="stylesheet" href="plugins/select2/css/select2.min.css">
    <link rel="stylesheet" href="plugins/select2-bootstrap4-theme/select2-bootstrap4.min.css">
    <!-- DataTables -->
    <link rel="stylesheet" href="plugins/datatables-bs4/css/dataTables.bootstrap4.min.css">
    <link rel="stylesheet" href="plugins/datatables-responsive/css/responsive.bootstrap4.min.css">
    <#include "../common/common.ftl">
</head>
<body class="hold-transition sidebar-mini layout-fixed layout-navbar-fixed layout-footer-fixed">
<div class="wrapper">
    <#--头部-->
    <!-- Navbar -->
    <nav class="main-header navbar navbar-expand navbar-white navbar-light">
        <!-- Left navbar links -->
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" data-widget="pushmenu" href="#" role="button"><i class="fas fa-bars"></i></a>
            </li>
            <li class="nav-item d-none d-sm-inline-block">
                <a href="${path}/index" class="nav-link">Home</a>
            </li>
        </ul>

        <!-- Right navbar links -->
        <ul class="navbar-nav ml-auto">
            <li class="nav-item">
                <a class="nav-link" href="${path}/logout" role="button">
                    <ion-icon name="exit-outline"></ion-icon>
                </a>
            </li>
        </ul>
    </nav>
    <!-- /.navbar -->

    <!-- Main Sidebar Container -->
    <aside class="main-sidebar sidebar-dark-primary elevation-4">
        <#--    返回首页-->
        <a href="${path}/index" class="brand-link">
            <img src="dist/img/AdminLTELogo.png" alt="AdminLTE Logo" class="brand-image img-circle elevation-3"
                 style="opacity: .8">
            <span class="brand-text font-weight-light">Edu-administration-system</span>
        </a>


        <div class="sidebar">
            <#--    用户名字/头像-->
            <!-- Sidebar user panel (optional) -->
            <div class="user-panel mt-3 pb-3 mb-3 d-flex">
                <div class="image">
                    <img src="dist/img/user2-160x160.jpg" class="img-circle elevation-2" alt="User Image">
                </div>
                <div class="info">
                    <a href="#" class="d-block">
                        <#if Session["user"]?exists>
                            ${Session["user"].userName}
                        </#if>
                    </a>
                </div>
            </div>

            <#--     侧边栏-->
            <nav class="mt-2">
                <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu"
                    data-accordion="false" id="menu">
                    <!-- Add icons to the links using the .nav-icon class
                         with font-awesome or any other icon font library -->

                </ul>
            </nav>
            <!-- /.sidebar-menu -->
        </div>
        <!-- /.sidebar -->
    </aside>

    <#--内容-->
    <div class="content-wrapper">

    </div>
    <!-- /.content-wrapper -->

    <!-- Control Sidebar -->
    <aside class="control-sidebar control-sidebar-dark">
        <!-- Control sidebar content goes here -->
    </aside>
    <!-- /.control-sidebar -->

    <!-- Main Footer -->
<#--    <footer class="main-footer">-->
<#--        <div class="float-right d-none d-sm-inline-block">-->
<#--            <b>Version</b> 1.0-->
<#--        </div>-->
<#--    </footer>-->
</div>
<!-- ./wrapper -->

<!-- REQUIRED SCRIPTS -->
<!-- jQuery -->
<script src="plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap -->
<script src="plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- overlayScrollbars -->
<script src="plugins/overlayScrollbars/js/jquery.overlayScrollbars.min.js"></script>
<!-- AdminLTE App -->
<script src="dist/js/adminlte.js"></script>

<!-- OPTIONAL SCRIPTS -->
<script src="dist/js/demo.js"></script>

<!-- PAGE PLUGINS -->
<!-- jQuery Mapael -->
<script src="plugins/jquery-mousewheel/jquery.mousewheel.js"></script>
<script src="plugins/raphael/raphael.min.js"></script>
<script src="plugins/jquery-mapael/jquery.mapael.min.js"></script>
<script src="plugins/jquery-mapael/maps/usa_states.min.js"></script>
<!-- ChartJS -->
<script src="plugins/chart.js/Chart.min.js"></script>

<script src="plugins/jquery-validation/jquery.validate.min.js"></script>
<script src="plugins/jquery-validation/localization/messages_zh.js"></script>

<script src="https://unpkg.com/ionicons@5.0.0/dist/ionicons.js"></script>

<script>
    $(document).ready(function () {
        menuClick("/userInfo")

        $(document).on('click', '.mt-2 .nav-link', function (e) {
            if (!$(this).parent().hasClass('has-treeview')) {
                $(".mt-2").find('.active').removeClass('active')
                $(this).addClass('active')
                if ($(this).parent().parent().hasClass('nav-treeview')) {
                    $(this).parent().parent().siblings('a').addClass('active')
                }
            }
        })

        $.get("${path}/getMenu", {}, function (rs) {
            console.log(rs)
            if (rs.code == 0) {
                let menu = '<li class="nav-item">\n' +
                    '    <a href="javascript:void(0);" onclick="menuClick(\'/userInfo\')" id="userInfo" class="nav-link active">\n' +
                    '        <i class="nav-icon fas fa-tachometer-alt"></i>\n' +
                    '        <p>\n' +
                    '            主页\n' +
                    '        </p>\n' +
                    '    </a>\n' +
                    '</li>'
                for (let i = 0; i < rs.data.length; i++) {
                    let html = '';
                    if (rs.data[i].level == 1) {
                        let html1 = '<li class="nav-item">\n' +
                            '    <a href="javascript:void(0);" onclick="menuClick(\''+rs.data[i].url+'\')" id="userInfo" class="nav-link">\n' +
                            '        <i class="nav-icon fas fa-tachometer-alt"></i>\n' +
                            '        <p>\n' +
                                        rs.data[i].name +
                            '        </p>\n' +
                            '    </a>\n'
                        let html2 = '';
                        for (let j = 0; j < rs.data.length; j++) {
                            if (rs.data[j].level == 2 && rs.data[j].parentId == rs.data[i].id) {
                                html2 += '<li class="nav-item">\n' +
                                    '     <a href="javascript:void(0);" onclick="menuClick(\''+rs.data[j].url+'\')" class="nav-link">\n' +
                                    '         <i class="far fa-circle nav-icon"></i>\n' +
                                    '         <p>'+rs.data[j].name+'</p>\n' +
                                    '     </a>\n' +
                                    ' </li>'
                            }
                        }
                        if (html2 != '') {
                            html = html1 + '<ul class="nav nav-treeview">' + html2 + '</ul></li>'
                        }else {
                            html = html + '</li>'
                        }
                        menu += html
                    }
                }
                $("#menu").html(menu)


            }else {
                alert("获取菜单失败，{"+rs.message+"}")
            }

        })

    })

    function menuClick(url) {
        if (url == '/' || url == '' || url == null) {
            return false;
        }
        $(".content-wrapper").load("${path}"+url, function (rs, status, xhr) {
            if (status == 'error') {
                window.location.href = "${path}/error/403.html"
            }
        });
    }
</script>
</body>
</html>
