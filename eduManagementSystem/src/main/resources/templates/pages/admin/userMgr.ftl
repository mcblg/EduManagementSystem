<#include "../../common/common.ftl">
<!-- Content Header (Page header) -->
<section class="content-header">
    <div class="container-fluid">
        <div class="row mb-2">
            <div class="col-sm-6">
                <h1>用户管理</h1>
            </div>
            <div class="col-sm-6">
                <ol class="breadcrumb float-sm-right">
                    <li class="breadcrumb-item"><a href="${path}/index">Home</a></li>
                    <li class="breadcrumb-item active">用户管理</li>
                </ol>
            </div>
        </div>
    </div><!-- /.container-fluid -->
</section>

<!-- Main content -->
<section class="content">
    <div class="row">
        <div class="col-12">
            <div class="card">
                <div class="card-header">
                    <h3 class="card-title">用户列表</h3>

                    <div class="card-tools">
                        <button type="button" class="btn btn-tool" data-card-widget="collapse" data-toggle="tooltip"
                                title="Collapse">
                            <i class="fas fa-minus"></i></button>
                    </div>
                </div>
                <!-- /.card-header -->
                <div class="card-body">
                    <table id="userTable" class="table table-striped">
                        <thead>
                        <tr>
                            <th>用户名</th>
                            <th>姓名</th>
                            <th>学校</th>
                            <th>用户类型</th>
                            <th>创建人</th>
                            <th>创建时间</th>
                            <th>账号状态</th>
                            <th>修改密码</th>
                            <th>角色配置</th>
                        </tr>
                        </thead>
                        <tbody>

                        </tbody>
                    </table>
                </div>
                <!-- /.card-body -->
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-6">
            <div class="card card-info">
                <div class="card-header">
                    <h3 class="card-title">新增用户</h3>

                    <div class="card-tools">
                        <button type="button" class="btn btn-tool" data-card-widget="collapse" data-toggle="tooltip"
                                title="Collapse">
                            <i class="fas fa-minus"></i></button>
                    </div>
                </div>
                <div class="card-body">
                    <div class="form-group">
                        <label for="inputName">用户名</label>
                        <input type="text" id="userName" class="form-control">
                    </div>
                    <div class="form-group">
                        <label for="password">密码</label>
                        <input type="password" id="password" class="form-control">
                    </div>
                    <div class="form-group">
                        <label for="password-confirm">确认密码</label>
                        <input type="password" id="password-confirm" class="form-control">
                    </div>
                    <div class="form-group">
                        <label for="userType">用户类型</label>
                        <select class="form-control custom-select" id="userType">
                            <option selected disabled>请选择</option>
                            <option value="1">学生</option>
                            <option value="2">教职员工</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="name">姓名</label>
                        <input type="text" id="name" class="form-control">
                    </div>
                    <div class="form-group">
                        <label for="identification">身份证</label>
                        <input type="text" id="identification" class="form-control">
                    </div>
                    <div class="form-group">
                        <label for="sex">性别</label>
                        <select class="form-control custom-select" id="sex">
                            <option selected disabled>请选择</option>
                            <option value="0">男</option>
                            <option value="1">女</option>
                            <option value="2">不详</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="birthday">生日</label>
                        <div>
                            <input type="text" id="birthday" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="commType">联系方式类型</label>
                        <select class="form-control custom-select" id="commType">
                            <option selected disabled>请选择</option>
                            <option value="0">QQ</option>
                            <option value="1">微信</option>
                            <option value="2">邮箱</option>
                            <option value="3">移动电话号码</option>
                            <option value="4">办公室电话号码</option>
                            <option value="5">家庭电话号码</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="commContent">联系方式</label>
                        <input type="text" id="commContent" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>国家</label>
                        <select class="form-control" id="country">
                        </select>
                    </div>
                    <div class="form-group">
                        <label>省份</label>
                        <select class="form-control" id="province">
                        </select>
                    </div>
                    <div class="form-group">
                        <label>城市</label>
                        <select class="form-control" id="city">
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="address">详细地址</label>
                        <input type="text" id="address" placeholder="XX区（镇）XX街道 XXXX" class="form-control">
                    </div>

                    <#--后期加入图片上传-->
                    <div class="form-group">
                        <label for="university">学校</label>
                        <select id="university" class="form-control"></select>
                    </div>
                    <div class="form-group">
                        <label for="college">学院</label>
                        <select id="college" class="form-control"></select>
                    </div>
                    <div class="form-group">
                        <label for="major">专业</label>
                        <select id="major" class="form-control"></select>
                    </div>

                    <div class="callout callout-info">
                        <h5>更多信息</h5>
                    </div>
                    <div id="stuInfo" style="display: none">
                        <div class="form-group">
                            <label for="clazz">班级</label>
                            <select id="clazz" class="form-control"></select>
                        </div>
                        <div class="form-group">
                            <label for="liveRoom">宿舍</label>
                            <select id="liveRoom" class="form-control"></select>
                        </div>
                        <div class="form-group">
                            <label for="grade">入学时间</label>
                            <div>
                                <input type="text" id="grade" class="form-control">
                            </div>
                        </div>
                    </div>
                    <div id="empInfo" style="display: none">
                        <div class="form-group">
                            <label for="title">职称</label>
                            <select class="form-control custom-select" id="title">
                                <option selected disabled>请选择</option>
                                <option value="0">助教</option>
                                <option value="1">讲师</option>
                                <option value="2">副教授</option>
                                <option value="3">教授</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="position">行政岗位</label>
                            <select id="position" class="form-control"></select>
                        </div>
                        <div class="form-group">
                            <label for="beginTeach">入职时间</label>
                            <div>
                                <input type="text" id="beginTeach" class="form-control">
                            </div>
                        </div>
                    </div>
                    <div class="col-md-12">
                        <input type="submit" value="保存" class="btn btn-success float-right">
                    </div>

                </div>
                <!-- /.card-body -->
            </div>
            <!-- /.card -->
        </div>

        <div class="col-md-6">
            <div class="card card-warning">
                <div class="card-header">
                    <h3 class="card-title">编辑用户</h3>
                    <div class="card-tools">
                        <button type="button" class="btn btn-tool" data-card-widget="collapse" data-toggle="tooltip"
                                title="Collapse">
                            <i class="fas fa-minus"></i>
                        </button>
                    </div>
                </div>
                <div class="card-body">
                    <div class="form-group">
                        <label for="selectUser">选择用户</label>
                        <select id="selectUser" class="form-control">
                            <option value="">请选择</option>
                        </select>
                    </div>
                    <div id="editInfo">

                    </div>

                </div>
                <!-- /.card-body -->
            </div>
            <!-- /.card -->
        </div>
    </div>
</section>
<!-- /.content -->

<#--模态框-->
<div class="modal fade" id="roleConfig" tabindex="-1" role="dialog" aria-labelledby="roleConfigModal" aria-hidden="true" data-backdrop="static">
    <div class="modal-dialog modal-lg" role="dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">角色配置</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <div class="row" id="roleList">

                </div>
            </div>
        </div>
    </div>
</div>

<!-- Select2 -->
<script src="plugins/select2/js/select2.full.min.js"></script>
<!-- Bootstrap4 Duallistbox -->
<script src="plugins/bootstrap4-duallistbox/jquery.bootstrap-duallistbox.min.js"></script>
<script src="plugins/moment/moment.min.js"></script>
<!-- date-range-picker -->
<script src="plugins/daterangepicker/daterangepicker.js"></script>

<!-- DataTables -->
<script src="plugins/datatables/jquery.dataTables.min.js"></script>
<script src="plugins/datatables-bs4/js/dataTables.bootstrap4.min.js"></script>
<script src="plugins/datatables-responsive/js/dataTables.responsive.min.js"></script>
<script src="plugins/datatables-responsive/js/responsive.bootstrap4.min.js"></script>
<!-- Bootstrap Switch -->
<script src="plugins/bootstrap-switch/js/bootstrap-switch.min.js"></script>
<script>
    $(document).ready(function () {
        $.fn.dataTable.ext.errMode = 'none';
        //加载json文件
        var areaJson = {}
        $.ajax({
            url: "area.json",
            async: false,
            success: function (result) {
                areaJson = result;
            }
        });


        $('#birthday').daterangepicker({
            singleDatePicker: true,
            showDropdowns: true,
            locale: {
                format: "YYYY-MM-DD",
                separator: " - ",
                daysOfWeek: ["日", "一", "二", "三", "四", "五", "六"],
            }
        });
        $('#country').select2({
            theme: 'bootstrap4',
            data: areaJson.country
        })
        $('#province').select2({
            theme: 'bootstrap4'
        });
        $('#city').select2({
            theme: 'bootstrap4'
        });

        $('#country').change(function () {
            let province = []
            if ($('#country option:checked').text() == "中国") {
                province = areaJson.province
            } else {
                province = ["--"]
            }
            $('#province').empty();
            $('#province').select2({
                theme: 'bootstrap4',
                data: province
            });
        })

        $('#city').change(function () {

        })

        $("#userType").change(function () {
            if ($(this).val() == 1) {
                $("#stuInfo").css("display", "block").siblings("#empInfo").css("display", "none");
            } else if ($(this).val() == 2) {
                $("#empInfo").css("display", "block").siblings("#stuInfo").css("display", "none");
            }
        })

        $('#selectUser').select2({
            theme: 'bootstrap4',
            data: [{"id": 1, "text": "admin"}, {"id": 2, "text": "blg"}]
        })

        $("#selectUser").change(function () {
            $("#editInfo").html('<div class="form-group">\n' +
                '    <label for="inputName">用户名</label>\n' +
                '    <input type="text" id="userName" class="form-control">\n' +
                '</div>\n' +
                '<div class="form-group">\n' +
                '    <label for="password">密码</label>\n' +
                '    <input type="password" id="password" class="form-control">\n' +
                '</div>\n' +
                '<div class="form-group">\n' +
                '    <label for="password-confirm">确认密码</label>\n' +
                '    <input type="password" id="password-confirm" class="form-control">\n' +
                '</div>\n' +
                '<div class="form-group">\n' +
                '    <label for="userType">用户类型</label>\n' +
                '    <select class="form-control custom-select" id="userType">\n' +
                '        <option selected disabled>请选择</option>\n' +
                '        <option value="1">学生</option>\n' +
                '        <option value="2">教职员工</option>\n' +
                '    </select>\n' +
                '</div>\n' +
                '<div class="form-group">\n' +
                '    <label for="name">姓名</label>\n' +
                '    <input type="text" id="name" class="form-control">\n' +
                '</div>\n' +
                '<div class="form-group">\n' +
                '    <label for="identification">身份证</label>\n' +
                '    <input type="text" id="identification" class="form-control">\n' +
                '</div>\n' +
                '<div class="form-group">\n' +
                '    <label for="sex">性别</label>\n' +
                '    <select class="form-control custom-select" id="sex">\n' +
                '        <option selected disabled>请选择</option>\n' +
                '        <option value="0">男</option>\n' +
                '        <option value="1">女</option>\n' +
                '        <option value="2">不详</option>\n' +
                '    </select>\n' +
                '</div>\n' +
                '<div class="form-group">\n' +
                '    <label for="birthday">生日</label>\n' +
                '    <div>\n' +
                '        <input type="text" id="birthday" class="form-control">\n' +
                '    </div>\n' +
                '</div>\n' +
                '<div class="form-group">\n' +
                '    <label for="commType">联系方式类型</label>\n' +
                '    <select class="form-control custom-select" id="commType">\n' +
                '        <option selected disabled>请选择</option>\n' +
                '        <option value="0">QQ</option>\n' +
                '        <option value="1">微信</option>\n' +
                '        <option value="2">邮箱</option>\n' +
                '        <option value="3">移动电话号码</option>\n' +
                '        <option value="4">办公室电话号码</option>\n' +
                '        <option value="5">家庭电话号码</option>\n' +
                '    </select>\n' +
                '</div>\n' +
                '<div class="form-group">\n' +
                '    <label for="commContent">联系方式</label>\n' +
                '    <input type="text" id="commContent" class="form-control">\n' +
                '</div>\n' +
                '<div class="form-group">\n' +
                '    <label>国家</label>\n' +
                '    <select class="form-control" id="country">\n' +
                '    </select>\n' +
                '</div>\n' +
                '<div class="form-group">\n' +
                '    <label>省份</label>\n' +
                '    <select class="form-control" id="province">\n' +
                '    </select>\n' +
                '</div>\n' +
                '<div class="form-group">\n' +
                '    <label>城市</label>\n' +
                '    <select class="form-control" id="city">\n' +
                '    </select>\n' +
                '</div>\n' +
                '<div class="form-group">\n' +
                '    <label for="address">详细地址</label>\n' +
                '    <input type="text" id="address" placeholder="XX区（镇）XX街道 XXXX" class="form-control">\n' +
                '</div>\n' +
                '<div class="form-group">\n' +
                '    <label for="university">学校</label>\n' +
                '    <select id="university" class="form-control"></select>\n' +
                '</div>\n' +
                '<div class="form-group">\n' +
                '    <label for="college">学院</label>\n' +
                '    <select id="college" class="form-control"></select>\n' +
                '</div>\n' +
                '<div class="form-group">\n' +
                '    <label for="major">专业</label>\n' +
                '    <select id="major" class="form-control"></select>\n' +
                '</div>\n' +
                '<div id="stuInfo" style="display: none">\n' +
                '    <div class="form-group">\n' +
                '        <label for="clazz">班级</label>\n' +
                '        <select id="clazz" class="form-control"></select>\n' +
                '    </div>\n' +
                '    <div class="form-group">\n' +
                '        <label for="liveRoom">宿舍</label>\n' +
                '        <select id="liveRoom" class="form-control"></select>\n' +
                '    </div>\n' +
                '    <div class="form-group">\n' +
                '        <label for="grade">入学时间</label>\n' +
                '        <div>\n' +
                '            <input type="text" id="grade" class="form-control">\n' +
                '        </div>\n' +
                '    </div>\n' +
                '</div>\n' +
                '<div id="empInfo" style="display: none">\n' +
                '    <div class="form-group">\n' +
                '        <label for="title">职称</label>\n' +
                '        <select class="form-control custom-select" id="title">\n' +
                '            <option selected disabled>请选择</option>\n' +
                '            <option value="0">助教</option>\n' +
                '            <option value="1">讲师</option>\n' +
                '            <option value="2">副教授</option>\n' +
                '            <option value="3">教授</option>\n' +
                '        </select>\n' +
                '    </div>\n' +
                '    <div class="form-group">\n' +
                '        <label for="position">行政岗位</label>\n' +
                '        <select id="position" class="form-control"></select>\n' +
                '    </div>\n' +
                '    <div class="form-group">\n' +
                '        <label for="beginTeach">入职时间</label>\n' +
                '        <div>\n' +
                '            <input type="text" id="beginTeach" class="form-control">\n' +
                '        </div>\n' +
                '    </div>\n' +
                '</div>' +
                '<div class="col-md-12">\n' +
                '    <input type="submit" value="保存" class="btn btn-success float-right">\n' +
                '</div>')
        })

        $("#userTable").DataTable({
            "responsive": true,
            "autoWidth": false,
            "ordering": false,
            "processing": true,
            "stateSave": true,
            "language": {
                "url": "https://cdn.datatables.net/plug-ins/1.10.20/i18n/Chinese.json"
            },
            "ajax": {
                "url": "${path}/userList",
                "dataSrc": function (json) {
                    if (json.code == 0) {
                        for (let i = 0; i < json.data.length; i++) {
                            if (json.data[i].userType == 1) {
                                json.data[i].userType = "<span class='badge bg-success'>学生</span>"
                            } else if (json.data[i].userType == 2) {
                                json.data[i].userType = "<span class='badge bg-primary'>教职员工</span>"
                            }
                            if (json.data[i].userStatus == 0) {
                                json.data[i].userStatus = '<div class="btn-group btn-group-toggle" data-toggle="buttons">\n' +
                                    '  <label class="btn bg-olive btn-xs">\n' +
                                    '    <input type="radio" name="options" id="lock" autocomplete="off">锁定' +
                                    '  </label>\n' +
                                    '  <label class="btn bg-olive btn-xs active">\n' +
                                    '    <input type="radio" name="options" id="enable" autocomplete="off" checked>正常' +
                                    '  </label>\n' +
                                    '</div>'
                            } else if (json.data[i].userStatus == 1) {
                                json.data[i].userStatus = '<div class="btn-group btn-group-toggle" data-toggle="buttons">\n' +
                                    '  <label class="btn bg-olive btn-xs active">\n' +
                                    '    <input type="radio" name="options" id="lock" autocomplete="off" checked>锁定' +
                                    '  </label>\n' +
                                    '  <label class="btn bg-olive btn-xs">\n' +
                                    '    <input type="radio" name="options" id="enable" autocomplete="off">正常' +
                                    '  </label>\n' +
                                    '</div>'
                            }
                            json.data[i].changePwd = '<button type="button" class="btn btn-warning btn-xs">修改密码</button>'
                            json.data[i].roleConfig = '<button type="button" class="btn btn-info btn-xs btn-role-config" data-toggle="modal" data-target="#roleConfig" id="'+json.data[i].id+'">角色配置</button>'
                        }
                        return json.data;
                    }
                }
            },
            "columns": [
                {"data": "userName"},
                {"data": "name"},
                {"data": "university"},
                {"data": "userType"},
                {"data": "createUser"},
                {"data": "createTime"},
                {"data": "userStatus"},
                {"data": "changePwd"},
                {"data": "roleConfig"}
            ]
        });

        var user_roleConfig_Id = '';
        $(document).on('click', '.btn-role-config', function () {
            user_roleConfig_Id = $(this).prop('id');
        })

        $("#roleConfig").on('show.bs.modal',function (e) {
            $.get("${path}/roleInfoList", {}, function (rs) {
                console.log(rs)
                if (rs.code == 0) {
                    var html = '';
                    for (let i = 0; i < rs.data.length; i++) {
                        html += '<div class="col-md-4">\n' +
                            '<div class="form-group">\n' +
                            '<div class="custom-control custom-switch custom-switch-off-danger custom-switch-on-success">\n' +
                            '<input type="checkbox" class="custom-control-input" id="roleSwitch-'+rs.data[i].id+'">\n' +
                            '<label class="custom-control-label" for="roleSwitch-'+rs.data[i].id+'">'+rs.data[i].name+'</label>\n' +
                            '</div>\n' +
                            '</div>\n' +
                            '</div>'
                    }
                    $("#roleList").html(html);
                }else {
                    alert(rs.message)
                }

            })
        })
        $("#roleConfig").on('shown.bs.modal',function (e) {
            $.get("${path}/roleList", {"userId": user_roleConfig_Id}, function (rs) {
                console.log(rs)
                if (rs.code == 0) {
                    for (let i = 0; i < rs.data.length; i++) {
                        $("#roleSwitch-"+rs.data[i].id).prop("checked", true)
                    }
                }else {
                    alert(rs.message)
                }

            })
        })

        $(document).on('change', '#roleList input[type="checkbox"]', function () {
            let roleId = $(this).prop("id").substr(11);
            let param = {"userId": user_roleConfig_Id, "roleId": roleId};
            if ($(this).prop('checked')) {
                //add
                $.ajax({
                    type: "post",
                    url: "${path}/userRoleAdd",
                    contentType: "application/json",
                    data: JSON.stringify(param),
                    dataType: "json",
                    success: function (rs) {
                        if (rs.code == 0) {
                            alert("已添加")
                        }else {
                            alert("配置异常")
                        }
                    }
                })
            }else {
                //delete
                $.ajax({
                    type: "post",
                    url: "${path}/userRoleDelete",
                    contentType: "application/json",
                    data: JSON.stringify(param),
                    dataType: "json",
                    success: function (rs) {
                        if (rs.code == 0) {
                            alert("已删除")
                        }else {
                            alert("配置异常")
                        }
                    }
                })
            }

        })
    })

</script>