<#include "../../common/common.ftl">
<!-- Content Header (Page header) -->
<section class="content-header">
    <div class="container-fluid">
        <div class="row mb-2">
            <div class="col-sm-6">
                <h1>录入学院信息</h1>
            </div>
            <div class="col-sm-6">
                <ol class="breadcrumb float-sm-right">
                    <li class="breadcrumb-item"><a href="${path}/index">Home</a></li>
                    <li class="breadcrumb-item active">录入学院信息</li>
                </ol>
            </div>
        </div>
    </div><!-- /.container-fluid -->
</section>

<!-- Main content -->
<section class="content">
    <div class="row">

        <div class="col-md-8">
            <div class="card">
                <div class="card-header">
                    <h3 class="card-title">学校学院列表</h3>

                    <div class="card-tools">
                        <button type="button" class="btn btn-tool" data-card-widget="collapse" data-toggle="tooltip"
                                title="Collapse">
                            <i class="fas fa-minus"></i></button>
                    </div>
                </div>
                <!-- /.card-header -->
                <div class="card-body">
                    <table id="universityTable" class="table table-striped">
                        <thead>
                        <tr>
                            <th>学院名称</th>
                            <th>英文名称</th>
                            <th>学校名称</th>
                            <th>部门名称</th>
                            <th>负责人</th>
                            <th>负责人办公室</th>
                            <th>联系电话</th>
                            <th>创建人</th>
                            <th>创建时间</th>
                            <@shiro.hasPermission name ="collegeLockOrUnLock">
                            <th>类型状态</th>
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

        <div class="col-md-4">
            <@shiro.hasPermission name ="addCollege">
            <div class="card card-info">
                <div class="card-header">
                    <h3 class="card-title">新增学院信息</h3>
                    <div class="card-tools">
                        <button type="button" class="btn btn-tool" data-card-widget="collapse" data-toggle="tooltip"
                                title="Collapse">
                            <i class="fas fa-minus"></i>
                        </button>
                    </div>
                </div>
                <div class="card-body">
                    <form id="addCollegeForm">
                        <div class="form-group">
                            <label for="departmentName">学院名称</label>
                            <input type="text" id="departmentName" name="departmentName" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="eName">英文名称</label>
                            <input type="text" id="eName" name="eName" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="selectDepartment">选择部门</label>
                            <select id="selectDepartment" name="selectDepartment" class="form-control">
                                <option value="">请选择</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="selectHead">选择负责人</label>
                            <select id="selectHead" name="selectHead" class="form-control">
                                <option value="">请选择</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="selectOfficeRoom">选择负责人办公室</label>
                            <select id="selectOfficeRoom" name="selectOfficeRoom" class="form-control">
                                <option value="">请选择</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="departmentTel">联系电话</label>
                            <input type="text" id="departmentTel" name="departmentTel" class="form-control">
                        </div>
                        <div class="col-md-12">
                            <input type="submit" value="保存" class="btn btn-success float-right">
                        </div>
                    </form>
                </div>
                <!-- /.card-body -->
            </div>
            </@shiro.hasPermission>
            <@shiro.hasPermission name ="editCollege">
            <div class="card card-warning">
                <div class="card-header">
                    <h3 class="card-title">编辑学院信息</h3>
                    <div class="card-tools">
                        <button type="button" class="btn btn-tool" data-card-widget="collapse" data-toggle="tooltip"
                                title="Collapse">
                            <i class="fas fa-minus"></i>
                        </button>
                    </div>
                </div>
                <div class="card-body">
                    <div class="form-group">
                        <label for="selectCollege">选择学院</label>
                        <select id="selectCollege" class="form-control">
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
            </@shiro.hasPermission>
            <!-- /.card -->
        </div>
    </div>
</section>
<!-- /.content -->

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

        $("#universityTable").DataTable({
            "responsive": true,
            "autoWidth": false,
            "ordering": false,
            "processing": true,
            "stateSave": true,
            "language": {
                "url": "https://cdn.datatables.net/plug-ins/1.10.20/i18n/Chinese.json"
            },
            "ajax": {
                "url": "${path}/collegeInfoList",
                "dataSrc": function (json) {
                    for (let i = 0; i < json.data.length; i++) {
                        if (json.data[i].status == 0) {
                            json.data[i].status = '<@shiro.hasPermission name ="collegeLockOrUnLock"><div class="btn-group btn-group-toggle" data-toggle="buttons">\n' +
                                '  <label class="btn bg-olive btn-xs">\n' +
                                '    <input type="radio" name="options" id="lock" autocomplete="off">锁定' +
                                '  </label>\n' +
                                '  <label class="btn bg-olive btn-xs active">\n' +
                                '    <input type="radio" name="options" id="enable" autocomplete="off" checked>正常' +
                                '  </label>\n' +
                                '</div></@shiro.hasPermission>'
                        } else if (json.data[i].status == 1) {
                            json.data[i].status = '<@shiro.hasPermission name ="collegeLockOrUnLock"><div class="btn-group btn-group-toggle" data-toggle="buttons">\n' +
                                '  <label class="btn bg-olive btn-xs active">\n' +
                                '    <input type="radio" name="options" id="lock" autocomplete="off" checked>锁定' +
                                '  </label>\n' +
                                '  <label class="btn bg-olive btn-xs">\n' +
                                '    <input type="radio" name="options" id="enable" autocomplete="off">正常' +
                                '  </label>\n' +
                                '</div></@shiro.hasPermission>'
                        }
                    }
                    return json.data;
                }
            },
            "columns": [
                {"data": "name"},
                {"data": "englishName"},
                {"data": "universityName"},
                {"data": "departmentName"},
                {"data": "headName"},
                {"data": "officeRoomName"},
                {"data": "telephone"},
                {"data": "createUserName"},
                {"data": "createTime"}
                <@shiro.hasPermission name ="collegeLockOrUnLock">
                , {"data": "status"}
                </@shiro.hasPermission>
            ]
        });

        $("#selectUniversity").select2({
            theme: 'bootstrap4',
        })

    })

</script>