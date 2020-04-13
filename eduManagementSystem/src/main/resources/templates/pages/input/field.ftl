<#include "../../common/common.ftl">
<!-- Content Header (Page header) -->
<section class="content-header">
    <div class="container-fluid">
        <div class="row mb-2">
            <div class="col-sm-6">
                <h1>录入学校场地信息</h1>
            </div>
            <div class="col-sm-6">
                <ol class="breadcrumb float-sm-right">
                    <li class="breadcrumb-item"><a href="${path}/index">Home</a></li>
                    <li class="breadcrumb-item active">录入学校场地信息</li>
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
                    <h3 class="card-title">学校场地列表</h3>

                    <div class="card-tools">
                        <button type="button" class="btn btn-tool" data-card-widget="collapse" data-toggle="tooltip"
                                title="Collapse">
                            <i class="fas fa-minus"></i></button>
                    </div>
                </div>
                <!-- /.card-header -->
                <div class="card-body">
                    <table id="universityAreaTable" class="table table-striped">
                        <thead>
                        <tr>
                            <th>场地名称</th>
                            <th>所属学校</th>
                            <th>功能区</th>
                            <th>楼层</th>
                            <th>房间编号</th>
                            <th>长度</th>
                            <th>宽度</th>
                            <th>高度</th>
                            <th>容纳人数</th>
                            <th>场地类型</th>
                            <th>主管部门</th>
                            <th>管理人员</th>
                            <th>管理开始时间</th>
                            <th>管理结束时间</th>
                            <th>环境</th>
                            <th>创建人</th>
                            <th>创建时间</th>
                            <th>场地状态</th>
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
        <div class="col-md-6">
            <div class="card card-info">
                <div class="card-header">
                    <h3 class="card-title">新增学校场地</h3>
                    <div class="card-tools">
                        <button type="button" class="btn btn-tool" data-card-widget="collapse" data-toggle="tooltip"
                                title="Collapse">
                            <i class="fas fa-minus"></i>
                        </button>
                    </div>
                </div>
                <div class="card-body">
                    <div class="form-group">
                        <label for="universityAreaName">学校场地名称</label>
                        <input type="text" id="universityAreaName" class="form-control">
                    </div>
                    <div class="form-group">
                        <label for="selectUniversityArea">选择功能区</label>
                        <select id="selectUniversityArea" class="form-control">
                            <option value="">请选择</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="floor">楼层</label>
                        <input type="text" id="flooe" class="form-control">
                    </div>
                    <div class="form-group">
                        <label for="room">房间编号</label>
                        <input type="text" id="room" class="form-control">
                    </div>
                    <div class="form-group">
                        <label for="length">长度</label>
                        <input type="text" id="length" class="form-control">
                    </div>
                    <div class="form-group">
                        <label for="width">宽度</label>
                        <input type="text" id="width" class="form-control">
                    </div>
                    <div class="form-group">
                        <label for="height">高度</label>
                        <input type="text" id="height" class="form-control">
                    </div>
                    <div class="form-group">
                        <label for="maxVolumn">容纳人数</label>
                        <input type="text" id="maxVolumn" class="form-control">
                    </div>
                    <div class="form-group">
                        <label for="selectFieldType">选择场地类型</label>
                        <select id="selectFieldType" class="form-control">
                            <option value="">请选择</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="selectManagement">选择主管部门</label>
                        <select id="selectManagement" class="form-control">
                            <option value="">请选择</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="selectAdministrator">选择管理人员</label>
                        <select id="selectAdministrator" class="form-control">
                            <option value="">请选择</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="selectFieldType">选择场地类型</label>
                        <select id="selectFieldType" class="form-control">
                            <option value="">请选择</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="chargeTime">管理时段</label>
                        <input type="text" class="form-control" id="chargeTime">
                    </div>
                    <div class="form-group">
                        <label for="selectInOutDoor">选择场地环境</label>
                        <select id="selectInOutDoor" class="form-control">
                            <option value="">请选择</option>
                            <option value="0">室内</option>
                            <option value="1">室外</option>
                        </select>
                    </div>
                    <div class="col-md-12">
                        <input type="submit" value="保存" class="btn btn-success float-right">
                    </div>
                </div>
                <!-- /.card-body -->
            </div>
        </div>
        <div class="col-md-6">
            <div class="card card-warning">
                <div class="card-header">
                    <h3 class="card-title">编辑学校场地</h3>
                    <div class="card-tools">
                        <button type="button" class="btn btn-tool" data-card-widget="collapse" data-toggle="tooltip"
                                title="Collapse">
                            <i class="fas fa-minus"></i>
                        </button>
                    </div>
                </div>
                <div class="card-body">
                    <div class="form-group">
                        <label for="selectUniversityArea">选择功能区</label>
                        <select id="selectUniversityArea" class="form-control">
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

        $("#universityAreaTable").DataTable({
            "responsive": true,
            "autoWidth": false,
            "ordering": false,
            "processing": true,
            "stateSave": true,
            "language": {
                "url": "https://cdn.datatables.net/plug-ins/1.10.20/i18n/Chinese.json"
            },
            "ajax": {
                "url": "${path}/fieldInfoList",
                "dataSrc": function (json) {
                    for (let i = 0; i < json.data.length; i++) {
                        if (json.data[i].status == 0) {
                            json.data[i].status = '<div class="btn-group btn-group-toggle" data-toggle="buttons">\n' +
                                '  <label class="btn bg-olive btn-xs">\n' +
                                '    <input type="radio" name="options" id="lock" autocomplete="off">锁定' +
                                '  </label>\n' +
                                '  <label class="btn bg-olive btn-xs active">\n' +
                                '    <input type="radio" name="options" id="enable" autocomplete="off" checked>正常' +
                                '  </label>\n' +
                                '</div>'
                        } else if (json.data[i].status == 1) {
                            json.data[i].status = '<div class="btn-group btn-group-toggle" data-toggle="buttons">\n' +
                                '  <label class="btn bg-olive btn-xs active">\n' +
                                '    <input type="radio" name="options" id="lock" autocomplete="off" checked>锁定' +
                                '  </label>\n' +
                                '  <label class="btn bg-olive btn-xs">\n' +
                                '    <input type="radio" name="options" id="enable" autocomplete="off">正常' +
                                '  </label>\n' +
                                '</div>'
                        }
                        if (json.data[i].inOutDoor == 0) {
                            json.data[i].inOutDoor = "<span class='badge bg-info'>室内</span>";
                        } else if (json.data[i].inOutDoor == 1) {
                            json.data[i].inOutDoor = "<span class='badge bg-danger'>室外</span>"
                        }
                    }
                    return json.data;
                }
            },
            "columns": [
                {"data": "name"},
                {"data": "universityName"},
                {"data": "areaName"},
                {"data": "floor"},
                {"data": "room"},
                {"data": "length"},
                {"data": "width"},
                {"data": "height"},
                {"data": "maxVolumn"},
                {"data": "typeName"},
                {"data": "managementName"},
                {"data": "administratorName"},
                {"data": "chargeBeginTime"},
                {"data": "chargeEndTime"},
                {"data": "inOutDoor"},
                {"data": "createUserName"},
                {"data": "createTime"},
                {"data": "status"}
            ]
        });

        $("#selectUniversityArea").select2({
            theme: 'bootstrap4',
        })

        $("#chargeTime").daterangepicker({
            showDropdowns: true,
            locale: {
                format: "YYYY-MM-DD",
                separator: " ~ ",
                daysOfWeek: ["日", "一", "二", "三", "四", "五", "六"],
            }
        })
    })

</script>