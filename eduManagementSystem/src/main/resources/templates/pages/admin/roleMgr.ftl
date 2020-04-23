<#include "../../common/common.ftl">
<!-- Content Header (Page header) -->
<section class="content-header">
    <div class="container-fluid">
        <div class="row mb-2">
            <div class="col-sm-6">
                <h1>角色管理</h1>
            </div>
            <div class="col-sm-6">
                <ol class="breadcrumb float-sm-right">
                    <li class="breadcrumb-item"><a href="${path}/index">Home</a></li>
                    <li class="breadcrumb-item active">角色管理</li>
                </ol>
            </div>
        </div>
    </div><!-- /.container-fluid -->
</section>

<!-- Main content -->
<section class="content">
    <div class="row">
        <div class="col-md-12">
            <div class="card">
                <div class="card-header">
                    <h3 class="card-title">角色列表</h3>

                    <div class="card-tools">
                        <button type="button" class="btn btn-tool" data-card-widget="collapse" data-toggle="tooltip"
                                title="Collapse">
                            <i class="fas fa-minus"></i></button>
                    </div>
                </div>
                <!-- /.card-header -->
                <div class="card-body">
                    <table id="roleTable" class="table table-striped">
                        <thead>
                        <tr>
                            <th>角色名称</th>
                            <th>角色描述</th>
                            <th>角色编码</th>
                            <th>学校</th>
                            <th>创建人</th>
                            <th>创建时间</th>
                            
                            <@shiro.hasPermission name ="roleLockOrUnLock">
                                <th>角色状态</th>
                            </@shiro.hasPermission>
                            <@shiro.hasPermission name="rolePermConfig">
                                <th>权限功能配置</th>
                            </@shiro.hasPermission>
                        </tr>
                        </thead>
                        <tbody>

                        </tbody>
                    </table>
                </div>
                <!-- /.card-body -->
            </div>
            <!-- /.card -->
        </div>
    </div>
    <div class="row">
        <@shiro.hasPermission name="addRole">
            <div class="col-md-6">
                <div class="card card-info">
                    <div class="card-header">
                        <h3 class="card-title">新增角色</h3>
                        <div class="card-tools">
                            <button type="button" class="btn btn-tool" data-card-widget="collapse" data-toggle="tooltip"
                                    title="Collapse">
                                <i class="fas fa-minus"></i>
                            </button>
                        </div>
                    </div>
                    <div class="card-body">
                        <div class="form-group">
                            <#--运营管理员权限-->
                            <label for="selectUniversity">选择学校</label>
                            <select id="selectUniversity" class="form-control">
                                <option value="">请选择</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="roleName">角色名称</label>
                            <input type="text" id="roleName" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="roleCode">角色编码</label>
                            <input type="text" id="roleCode" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="description">角色描述</label>
                            <textarea id="description" class="form-control" rows="4" style="margin-top: 0px; margin-bottom: 0px; height: 141px;"></textarea>
                        </div>
                        <div class="col-md-12">
                            <input type="submit" value="保存" class="btn btn-success float-right">
                        </div>
                    </div>
                    <!-- /.card-body -->
                </div>
            </div>
        </@shiro.hasPermission>
        <@shiro.hasPermission name="editRole">
            <div class="col-md-6">
                <div class="card card-warning">
                    <div class="card-header">
                        <h3 class="card-title">编辑角色</h3>
                        <div class="card-tools">
                            <button type="button" class="btn btn-tool" data-card-widget="collapse" data-toggle="tooltip"
                                    title="Collapse">
                                <i class="fas fa-minus"></i>
                            </button>
                        </div>
                    </div>
                    <div class="card-body">
                        <div class="form-group">
                            <label for="selectRole">选择角色</label>
                            <select id="selectRole" class="form-control">
                                <option value="">请选择</option>
                            </select>
                        </div>
                        <div id="editInfo">
                            <div class="col-md-12">
                                <input type="submit" value="保存" class="btn btn-success float-right">
                            </div>
                        </div>

                    </div>
                    <!-- /.card-body -->
                </div>
            </div>
        </@shiro.hasPermission>

    </div>
</section>
<!-- /.content -->

<#--模态框-->
<div class="modal fade" id="permConfig" tabindex="-1" role="dialog" aria-labelledby="permConfigModal" aria-hidden="true" data-backdrop="static">
    <div class="modal-dialog modal-lg" role="dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">权限功能配置</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <div class="row" id="permList">
                    <div class="col-sm-12">
                        <!-- checkbox -->

                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary btn-sm" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary btn-sm" id="confirm-permConfig">确定</button>
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

        $('#selectUniversity').select2({
            theme: 'bootstrap4',
            data: [{"id": 1, "text": "肇庆学院"}]
        })

        $("#roleTable").DataTable({
            "responsive": true,
            "autoWidth": false,
            "ordering": false,
            "processing": true,
            "stateSave": true,
            "language": {
                "url": "https://cdn.datatables.net/plug-ins/1.10.20/i18n/Chinese.json"
            },
            "ajax": {
                "url": "${path}/roleInfoList",
                "dataSrc": function (json) {
                    for (let i = 0; i < json.data.length; i++) {
                        if (json.data[i].status == 0) {
                            json.data[i].status = '<@shiro.hasPermission name ="roleLockOrUnLock"><div class="btn-group btn-group-toggle" data-toggle="buttons">\n' +
                                '  <label class="btn bg-olive btn-xs">\n' +
                                '    <input type="radio" name="options" id="lock" autocomplete="off">锁定' +
                                '  </label>\n' +
                                '  <label class="btn bg-olive btn-xs active">\n' +
                                '    <input type="radio" name="options" id="enable" autocomplete="off" checked>正常' +
                                '  </label>\n' +
                                '</div></@shiro.hasPermission>'
                        }else if (json.data[i].status == 1){
                            json.data[i].status = '<@shiro.hasPermission name ="roleLockOrUnLock"><div class="btn-group btn-group-toggle" data-toggle="buttons">\n' +
                                '  <label class="btn bg-olive btn-xs active">\n' +
                                '    <input type="radio" name="options" id="lock" autocomplete="off" checked>锁定' +
                                '  </label>\n' +
                                '  <label class="btn bg-olive btn-xs">\n' +
                                '    <input type="radio" name="options" id="enable" autocomplete="off">正常' +
                                '  </label>\n' +
                                '</div></@shiro.hasPermission>'
                        }
                        json.data[i].permConfig = '<@shiro.hasPermission name ="rolePermConfig"><button type="button" class="btn btn-info btn-xs btn-perm-config" data-toggle="modal" data-target="#permConfig" id="'+json.data[i].id+'">权限功能配置</button></@shiro.hasPermission>'
                    }
                    return json.data;
                }
            },
            "columns": [
                {"data": "name"},
                {"data": "description"},
                {"data": "roleCode"},
                {"data": "uname"},
                {"data": "createUserName"},
                {"data": "createTime"}
                <@shiro.hasPermission name ="roleLockOrUnLock">
                , {"data": "status"}
                </@shiro.hasPermission>
                <@shiro.hasPermission name ="rolePermConfig">
                , {"data": "permConfig"}
                </@shiro.hasPermission>
            ]
        });

        $("#selectRole").select2({
            theme: 'bootstrap4',
        })

        var role_permConfig_id = '';
        $(document).on('click', '.btn-perm-config', function (e) {
            role_permConfig_id = $(this).prop('id')
        })

        $("#permConfig").on('show.bs.modal',function (e) {
            $.get("${path}/permInfoList", {status: 0}, function (rs) {
                // console.log(rs)
                if (rs.code == 0) {
                    let html = '';
                    for (let i = 0; i < rs.data.length; i++) {
                        if (rs.data[i].level == 1) {
                            let html1 = '<div class="form-group">\n' +
                                '<div class="form-check">\n' +
                                '<input class="form-check-input level1" type="checkbox" id="perm-'+rs.data[i].id+'" value="'+rs.data[i].id+'">\n' +
                                '<label class="form-check-label" for="perm-'+rs.data[i].id+'">\n' +
                                '<span class=\'badge bg-success\'>'+rs.data[i].name+'</span>\n' +
                                '</label>\n' +
                                '</div>\n';
                            let html2 = '';
                            for (let j = 0; j < rs.data.length; j++) {
                                if (rs.data[j].parentId == rs.data[i].id) {
                                    if (rs.data[j].perType == 1) {
                                        html2 += '<div class="form-check form-check-inline">\n' +
                                            '<input class="form-check-input level2" type="checkbox" id="perm-'+rs.data[j].id+'" value="'+rs.data[j].id+'">\n' +
                                            '<label class="form-check-label" for="perm-'+rs.data[j].id+'"><span class=\'badge bg-info\'>'+rs.data[j].name+'</span></label>\n' +
                                            '</div>';
                                    }else if (rs.data[j].perType == 2) {
                                        html2 += '<div class="form-check form-check-inline">\n' +
                                            '<input class="form-check-input level2" type="checkbox" id="perm-'+rs.data[j].id+'" value="'+rs.data[j].id+'">\n' +
                                            '<label class="form-check-label" for="perm-'+rs.data[j].id+'"><span class=\'badge bg-maroon\'>'+rs.data[j].name+'</span></label>\n' +
                                            '</div>';
                                    }
                                }
                            }
                            html += html1 + '<div style="margin: 20px">' + html2 + '</div>';
                        }
                    }
                    $('#permList').html(html);
                }else {
                    alert(rs.message)
                }
            })
        })

        $("#permConfig").on('shown.bs.modal',function (e) {
            $.get("${path}/permList", {"roleId": role_permConfig_id}, function (rs) {
                // console.log(rs)
                if (rs.code == 0) {
                    for (let i = 0; i < rs.data.length; i++) {
                        $("#perm-"+rs.data[i].id).prop('checked',true)
                    }
                }else {
                    alert(rs.message)
                }
            })
        })

        $(document).on('change', '.level2', function (e) {
            if ($(this).prop('checked')) {
                $(this).parent().parent().prev().children('.level1').prop('checked',true);
            }
        })
        $(document).on('change', '.level1', function (e) {
            if (!$(this).prop('checked')) {
                $(this).parent().next().find('.level2').prop('checked',false);
            }
        })

        $('#confirm-permConfig').click(function (e) {
            let list = $('#permList input[type="checkbox"]:checked');
            let permIds = [];
            for (let i = 0; i < list.length; i++) {
                permIds.push(list.eq(i).val())
            }
            // console.log(permIds)
            $.post("${path}/rolePermConfig", {"roleId": role_permConfig_id, "permIds": permIds}, function (rs) {
                // console.log(rs)
                if (rs.code == 0) {
                    alert("配置成功")
                    $('#permConfig').modal('hide');
                }else {
                    alert("配置异常")
                }
            })


        })
    })

</script>