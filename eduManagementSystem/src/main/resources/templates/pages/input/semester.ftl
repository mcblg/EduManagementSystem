<#include "../../common/common.ftl">
<!-- Content Header (Page header) -->
<section class="content-header">
    <div class="container-fluid">
        <div class="row mb-2">
            <div class="col-sm-6">
                <h1>录入校历信息</h1>
            </div>
            <div class="col-sm-6">
                <ol class="breadcrumb float-sm-right">
                    <li class="breadcrumb-item"><a href="${path}/index">Home</a></li>
                    <li class="breadcrumb-item active">录入校历信息</li>
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
                    <h3 class="card-title">学期列表</h3>

                    <div class="card-tools">
                        <button type="button" class="btn btn-tool" data-card-widget="collapse" data-toggle="tooltip"
                                title="Collapse">
                            <i class="fas fa-minus"></i></button>
                    </div>
                </div>
                <!-- /.card-header -->
                <div class="card-body">
                    <table id="semesterTable" class="table table-striped">
                        <thead>
                        <tr>
                            <th>学期名称</th>
                            <th>学校名称</th>
                            <th>开始时间</th>
                            <th>结束时间</th>
                            <th>创建人</th>
                            <th>创建时间</th>
                            <th>类型状态</th>
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
            <div class="card card-info">
                <div class="card-header">
                    <h3 class="card-title">新增学期信息</h3>
                    <div class="card-tools">
                        <button type="button" class="btn btn-tool" data-card-widget="collapse" data-toggle="tooltip"
                                title="Collapse">
                            <i class="fas fa-minus"></i>
                        </button>
                    </div>
                </div>
                <div class="card-body">
                    <form id="addSemesterForm">
                        <div class="form-group">
                            <label for="positionName">学期名称</label>
                            <input type="text" id="positionName" name="positionName" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="semesterTime">时间</label>
                            <input type="text" class="form-control" id="semesterTime" name="semesterTime">
                        </div>
                        <div class="col-md-12">
                            <input type="submit" value="保存" class="btn btn-success float-right">
                        </div>
                    </form>
                </div>
                <!-- /.card-body -->
            </div>
            <div class="card card-warning">
                <div class="card-header">
                    <h3 class="card-title">编辑学期信息</h3>
                    <div class="card-tools">
                        <button type="button" class="btn btn-tool" data-card-widget="collapse" data-toggle="tooltip"
                                title="Collapse">
                            <i class="fas fa-minus"></i>
                        </button>
                    </div>
                </div>
                <div class="card-body">
                    <div class="form-group">
                        <label for="selectSemester">选择学期</label>
                        <select id="selectSemester" class="form-control">
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
            <!-- /.card -->
        </div>
    </div>
    <div class="row">

        <div class="col-md-8">
            <div class="card">
                <div class="card-header">
                    <h3 class="card-title">假期列表</h3>

                    <div class="card-tools">
                        <button type="button" class="btn btn-tool" data-card-widget="collapse" data-toggle="tooltip"
                                title="Collapse">
                            <i class="fas fa-minus"></i></button>
                    </div>
                </div>
                <!-- /.card-header -->
                <div class="card-body">
                    <table id="vacationTable" class="table table-striped">
                        <thead>
                        <tr>
                            <th>假期名称</th>
                            <th>学校名称</th>
                            <th>学期名称</th>
                            <th>开始时间</th>
                            <th>结束时间</th>
                            <th>类型</th>
                            <th>创建人</th>
                            <th>创建时间</th>
                            <th>类型状态</th>
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
            <div class="card card-info">
                <div class="card-header">
                    <h3 class="card-title">新增假期信息</h3>
                    <div class="card-tools">
                        <button type="button" class="btn btn-tool" data-card-widget="collapse" data-toggle="tooltip"
                                title="Collapse">
                            <i class="fas fa-minus"></i>
                        </button>
                    </div>
                </div>
                <div class="card-body">
                    <form id="addVacationForm">
                        <div class="form-group">
                            <label for="vacationName">假期名称</label>
                            <input type="text" id="vacationName" name="vacationName" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="selectSemester-vacation">选择学期</label>
                            <select id="selectSemester-vacation" name="selectSemester-vacation" class="form-control">
                                <option value="">请选择</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="vacationTime">时间</label>
                            <input type="text" class="form-control" id="vacationTime" name="vacationTime">
                        </div>
                        <div class="form-group">
                            <label for="selectVacationType">选择类型</label>
                            <select id="selectVacationType" name="selectVacationType" class="form-control">
                                <option value="">请选择</option>
                            </select>
                        </div>
                        <div class="col-md-12">
                            <input type="submit" value="保存" class="btn btn-success float-right">
                        </div>
                    </form>
                </div>
                <!-- /.card-body -->
            </div>
            <div class="card card-warning">
                <div class="card-header">
                    <h3 class="card-title">编辑假期信息</h3>
                    <div class="card-tools">
                        <button type="button" class="btn btn-tool" data-card-widget="collapse" data-toggle="tooltip"
                                title="Collapse">
                            <i class="fas fa-minus"></i>
                        </button>
                    </div>
                </div>
                <div class="card-body">
                    <div class="form-group">
                        <label for="selectVacation">选择假期</label>
                        <select id="selectVacation" class="form-control">
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
            <!-- /.card -->
        </div>
    </div>
    <div class="row">

        <div class="col-md-8">
            <div class="card">
                <div class="card-header">
                    <h3 class="card-title">作息时间列表</h3>

                    <div class="card-tools">
                        <button type="button" class="btn btn-tool" data-card-widget="collapse" data-toggle="tooltip"
                                title="Collapse">
                            <i class="fas fa-minus"></i></button>
                    </div>
                </div>
                <!-- /.card-header -->
                <div class="card-body">
                    <table id="timeTable" class="table table-striped">
                        <thead>
                        <tr>
                            <th>作息名称</th>
                            <th>学校名称</th>
                            <th>对应时间</th>
                            <th>创建人</th>
                            <th>创建时间</th>
                            <th>类型状态</th>
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
            <div class="card card-info">
                <div class="card-header">
                    <h3 class="card-title">新增作息信息</h3>
                    <div class="card-tools">
                        <button type="button" class="btn btn-tool" data-card-widget="collapse" data-toggle="tooltip"
                                title="Collapse">
                            <i class="fas fa-minus"></i>
                        </button>
                    </div>
                </div>
                <div class="card-body">
                    <form id="addTimeForm">
                        <div class="form-group">
                            <label for="timeName">作息名称</label>
                            <input type="text" id="timeName" name="timeName" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="period">对应时间</label>
                            <input type="text" id="period" name="period" class="form-control">
                        </div>
                        <div class="col-md-12">
                            <input type="submit" value="保存" class="btn btn-success float-right">
                        </div>
                    </form>
                </div>
                <!-- /.card-body -->
            </div>
            <div class="card card-warning">
                <div class="card-header">
                    <h3 class="card-title">编辑作息信息</h3>
                    <div class="card-tools">
                        <button type="button" class="btn btn-tool" data-card-widget="collapse" data-toggle="tooltip"
                                title="Collapse">
                            <i class="fas fa-minus"></i>
                        </button>
                    </div>
                </div>
                <div class="card-body">
                    <div class="form-group">
                        <label for="selectTime">选择作息时间</label>
                        <select id="selectTime" class="form-control">
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

        $("#semesterTable").DataTable({
            "responsive": true,
            "autoWidth": false,
            "ordering": false,
            "processing": true,
            "stateSave": true,
            "language": {
                "url": "https://cdn.datatables.net/plug-ins/1.10.20/i18n/Chinese.json"
            },
            "ajax": {
                "url": "${path}/semesterInfoList",
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
                    }
                    return json.data;
                }
            },
            "columns": [
                {"data": "name"},
                {"data": "universityName"},
                {"data": "beginTime"},
                {"data": "endTime"},
                {"data": "createUserName"},
                {"data": "createTime"},
                {"data": "status"}
            ]
        });

        $("#selectSemester").select2({
            theme: 'bootstrap4',
        })

        $("#semesterTime").daterangepicker({
            showDropdowns: true,
            locale: {
                format: "YYYY-MM-DD",
                separator: " ~ ",
                daysOfWeek: ["日", "一", "二", "三", "四", "五", "六"],
            }
        })

        $("#vacationTable").DataTable({
            "responsive": true,
            "autoWidth": false,
            "ordering": false,
            "processing": true,
            "stateSave": true,
            "language": {
                "url": "https://cdn.datatables.net/plug-ins/1.10.20/i18n/Chinese.json"
            },
            "ajax": {
                "url": "${path}/vacationInfoList",
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
                        if (json.data[i].type == 0) {
                            json.data[i].type = "<span class='badge bg-info'>放假</span>";
                        } else if (json.data[i].type == 1) {
                            json.data[i].type = "<span class='badge bg-danger'>调休上课</span>"
                        }
                    }
                    return json.data;
                }
            },
            "columns": [
                {"data": "vacationName"},
                {"data": "universityName"},
                {"data": "semesterName"},
                {"data": "beginTime"},
                {"data": "endTime"},
                {"data": "type"},
                {"data": "createUserName"},
                {"data": "createTime"},
                {"data": "status"}
            ]
        });

        $("#selectSemester-vacation").select2({
            theme: 'bootstrap4',
        })

        $("#vacationTime").daterangepicker({
            showDropdowns: true,
            locale: {
                format: "YYYY-MM-DD",
                separator: " ~ ",
                daysOfWeek: ["日", "一", "二", "三", "四", "五", "六"],
            }
        })

        $("#timeTable").DataTable({
            "responsive": true,
            "autoWidth": false,
            "ordering": false,
            "processing": true,
            "stateSave": true,
            "language": {
                "url": "https://cdn.datatables.net/plug-ins/1.10.20/i18n/Chinese.json"
            },
            "ajax": {
                "url": "${path}/timeTableInfoList",
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
                    }
                    return json.data;
                }
            },
            "columns": [
                {"data": "name"},
                {"data": "universityName"},
                {"data": "period"},
                {"data": "createUserName"},
                {"data": "createTime"},
                {"data": "status"}
            ]
        });
    })

</script>