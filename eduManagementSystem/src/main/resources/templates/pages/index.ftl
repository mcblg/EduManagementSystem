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
                    data-accordion="false">
                    <!-- Add icons to the links using the .nav-icon class
                         with font-awesome or any other icon font library -->
                    <li class="nav-item">
                        <a href="javascript:void(0);" onclick="menuClick('/userInfo')" id="userInfo" class="nav-link active">
                            <i class="nav-icon fas fa-tachometer-alt"></i>
                            <p>
                                主页
                            </p>
                        </a>
                    </li>
                    <li class="nav-item has-treeview">
                        <a href="javascript:void(0);" class="nav-link">
                            <i class="nav-icon fas fa-copy"></i>
                            <p>
                                录入信息
                                <i class="fas fa-angle-left right"></i>
                            </p>
                        </a>
                        <ul class="nav nav-treeview">
                            <li class="nav-item">
                                <a href="javascript:void(0);" onclick="menuClick('/university')" class="nav-link">
                                    <i class="far fa-circle nav-icon"></i>
                                    <p>学校信息</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="javascript:void(0);" onclick="menuClick('/universityArea')" class="nav-link">
                                    <i class="far fa-circle nav-icon"></i>
                                    <p>学校功能区信息</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="javascript:void(0);" onclick="menuClick('/field')" class="nav-link">
                                    <i class="far fa-circle nav-icon"></i>
                                    <p>学校场地信息</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="javascript:void(0);" onclick="menuClick('/fieldType')" class="nav-link">
                                    <i class="far fa-circle nav-icon"></i>
                                    <p>学校场地类型信息</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="javascript:void(0);" onclick="menuClick('/department')" class="nav-link">
                                    <i class="far fa-circle nav-icon"></i>
                                    <p>学校部门信息</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="javascript:void(0);" onclick="menuClick('/college')" class="nav-link">
                                    <i class="far fa-circle nav-icon"></i>
                                    <p>学校学院信息</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="javascript:void(0);" onclick="menuClick('/clazz')" class="nav-link">
                                    <i class="far fa-circle nav-icon"></i>
                                    <p>学校班级信息</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="javascript:void(0);" onclick="menuClick('/position')" class="nav-link">
                                    <i class="far fa-circle nav-icon"></i>
                                    <p>学校岗位信息</p>
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="javascript:void(0);" onclick="menuClick('/semester')" class="nav-link">
                                    <i class="far fa-circle nav-icon"></i>
                                    <p>录入校历信息</p>
                                </a>
                            </li>
                        </ul>
                    </li>
                    <li class="nav-header">后台管理系统</li>
                    <li class="nav-item has-treeview">
                        <a href="#" class="nav-link">
                            <i class="nav-icon fas fa-chart-pie"></i>
                            <p>
                                后台管理
                                <i class="right fas fa-angle-left"></i>
                            </p>
                        </a>
                        <ul class="nav nav-treeview">
                            <li class="nav-item">
                                <a href="javascript:void(0);" onclick="menuClick('/userMgr')" class="nav-link">
                                    <i class="far fa-circle nav-icon"></i>
                                    <p>用户管理</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="javascript:void(0);" onclick="menuClick('/roleMgr')" class="nav-link">
                                    <i class="far fa-circle nav-icon"></i>
                                    <p>角色管理</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="javascript:void(0);" onclick="menuClick('/permMgr')" class="nav-link">
                                    <i class="far fa-circle nav-icon"></i>
                                    <p>权限管理</p>
                                </a>
                            </li>
                        </ul>
                    </li>
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
    <footer class="main-footer">
        <strong>Copyright &copy; 2014-2019 <a href="http://adminlte.io">AdminLTE.io</a>.</strong>
        All rights reserved.
        <div class="float-right d-none d-sm-inline-block">
            <b>Version</b> 3.0.3-pre
        </div>
    </footer>
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
        $("#userInfo").click()

        $(".mt-2 .nav-link").click(function () {
            if (!$(this).parent().hasClass('has-treeview')) {
                $(".mt-2").find('.active').removeClass('active')
                $(this).addClass('active')
                if ($(this).parent().parent().hasClass('nav-treeview')) {
                    $(this).parent().parent().siblings('a').addClass('active')
                }
            }
        })
    })

    function menuClick(url) {
        $(".content-wrapper").load("${path}"+url);
    }
</script>
</body>
</html>
