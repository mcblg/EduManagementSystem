<#include "../../common/common.ftl">
<!-- Content Header (Page header) -->
<section class="content-header">
    <div class="container-fluid">
        <div class="row mb-2">
            <div class="col-sm-6">
                <h1>权限管理</h1>
            </div>
            <div class="col-sm-6">
                <ol class="breadcrumb float-sm-right">
                    <li class="breadcrumb-item"><a href="${path}/index">Home</a></li>
                    <li class="breadcrumb-item active">权限管理</li>
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
                    <h3 class="card-title">权限列表</h3>

                    <div class="card-tools">
                        <button type="button" class="btn btn-tool" data-card-widget="collapse" data-toggle="tooltip"
                                title="Collapse">
                            <i class="fas fa-minus"></i></button>
                    </div>
                </div>
                <!-- /.card-header -->
                <div class="card-body">
                    <table id="permTable" class="table table-striped">
                        <thead>
                        <tr>
                            <th>权限名称</th>
                            <th>URL</th>
                            <th>权限编码</th>
                            <th>权限类型</th>
                            <th>创建人</th>
                            <th>创建时间</th>
                            <@shiro.hasPermission name="permLockOrUnLock">
                                <th>角色状态</th>
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
            <@shiro.hasPermission name="editPerm">
                <div class="card card-info">
                    <div class="card-header">
                        <h3 class="card-title">新增权限</h3>
                        <div class="card-tools">
                            <button type="button" class="btn btn-tool" data-card-widget="collapse" data-toggle="tooltip"
                                    title="Collapse">
                                <i class="fas fa-minus"></i>
                            </button>
                        </div>
                    </div>
                    <div class="card-body">
                        <form id="addPermForm">
                            <div class="form-group">
                                <label for="permName">权限名称</label>
                                <input type="text" id="permName" name="name" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="permCode">权限编码</label>
                                <input type="text" id="permCode" name="perCode" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="url">URL</label>
                                <input type="text" id="url" name="url" class="form-control" placeholder="格式： /****">
                            </div>
                            <div class="form-group">
                                <label for="selectPermType">选择权限类型</label>
                                <select id="selectPermType" name="type" class="form-control">
                                    <option selected disabled value="">请选择</option>
                                    <option value="1">菜单</option>
                                    <option value="2">功能</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="selectParentPerm">选择所属菜单(一级菜单)</label>
                                <select id="selectParentPerm" name="parent" class="form-control">
                                </select>
                            </div>
                            <div class="col-md-12">
                                <input type="submit" value="保存" class="btn btn-success float-right">
                            </div>
                        </form>
                    </div>
                    <!-- /.card-body -->
                </div>
            </@shiro.hasPermission>
            <@shiro.hasPermission name="editPerm">
                <div class="card card-warning">
                    <div class="card-header">
                        <h3 class="card-title">编辑权限</h3>
                        <div class="card-tools">
                            <button type="button" class="btn btn-tool" data-card-widget="collapse" data-toggle="tooltip"
                                    title="Collapse">
                                <i class="fas fa-minus"></i>
                            </button>
                        </div>
                    </div>
                    <div class="card-body">
                        <form id="editPermForm">
                            <div class="form-group">
                                <label for="selectPerm">选择权限</label>
                                <select id="selectPerm" class="form-control" name="permId">
                                </select>
                            </div>
                            <div id="editInfo" style="display: none">

                                <div class="form-group">
                                    <label for="permName-edit">权限名称</label>
                                    <input type="text" id="permName-edit" name="name" class="form-control">
                                </div>
                                <div class="form-group">
                                    <label for="permCode-edit">权限编码</label>
                                    <input type="text" id="permCode-edit" name="perCode" class="form-control">
                                    <input type="hidden" id="permCode-old">
                                </div>
                                <div class="form-group">
                                    <label for="url-edit">URL</label>
                                    <input type="text" id="url-edit" name="url" class="form-control"
                                           placeholder="格式： /****">
                                </div>
                                <div class="form-group">
                                    <label for="selectPermType-edit">选择权限类型</label>
                                    <select id="selectPermType-edit" name="type" class="form-control">
                                        <option selected disabled value="">请选择</option>
                                        <option value="1">菜单</option>
                                        <option value="2">功能</option>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label for="selectParentPerm-edit">选择所属菜单(一级菜单)</label>
                                    <select id="selectParentPerm-edit" name="parent" class="form-control">
                                    </select>
                                </div>
                                <div class="col-md-12">
                                    <input type="submit" value="保存" class="btn btn-success float-right">
                                </div>
                            </div>
                        </form>
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

        $("#permTable").DataTable({
            "responsive": true,
            "autoWidth": false,
            "ordering": false,
            "processing": true,
            "stateSave": true,
            "language": {
                "url": "https://cdn.datatables.net/plug-ins/1.10.20/i18n/Chinese.json"
            },
            "ajax": {
                "url": "${path}/permInfoList",
                "dataSrc": function (json) {
                    for (let i = 0; i < json.data.length; i++) {
                        if (json.data[i].status == 0) {
                            json.data[i].status = '<@shiro.hasPermission name="permLockOrUnLock"><div class="btn-group btn-group-toggle" data-toggle="buttons">\n' +
                                '  <label class="btn bg-olive btn-xs lock">\n' +
                                '    <input type="radio" name="options" value="1" id="'+json.data[i].id+'" autocomplete="off">锁定' +
                                '  </label>\n' +
                                '  <label class="btn bg-olive btn-xs lock active">\n' +
                                '    <input type="radio" name="options" value="0" id="'+json.data[i].id+'" autocomplete="off" checked>正常' +
                                '  </label>\n' +
                                '</div></@shiro.hasPermission>'
                        } else if (json.data[i].status == 1) {
                            json.data[i].status = '<@shiro.hasPermission name="permLockOrUnLock"><div class="btn-group btn-group-toggle" data-toggle="buttons">\n' +
                                '  <label class="btn bg-olive btn-xs lock active">\n' +
                                '    <input type="radio" name="options" value="1" id="'+json.data[i].id+'" autocomplete="off" checked>锁定' +
                                '  </label>\n' +
                                '  <label class="btn bg-olive btn-xs lock">\n' +
                                '    <input type="radio" name="options" value="0" id="'+json.data[i].id+'" autocomplete="off">正常' +
                                '  </label>\n' +
                                '</div></@shiro.hasPermission>'
                        }
                        if (json.data[i].perType == 2) {
                            json.data[i].perType = '功能'
                        } else if (json.data[i].perType == 1) {
                            json.data[i].perType = '菜单'
                        }
                    }
                    return json.data;
                }
            },
            "columns": [
                {"data": "name"},
                {"data": "url"},
                {"data": "perCode"},
                {"data": "perType"},
                {"data": "createUserName"},
                {"data": "createTime"}
                <@shiro.hasPermission name="permLockOrUnLock">
                ,
                {"data": "status"}
                </@shiro.hasPermission>
            ]
        });

        $("#selectPerm").select2({
            theme: 'bootstrap4',
            ajax: {
                url: "${path}/permInfoList",
                dataType: 'json',
                data: function (params) {
                    return {
                        text: params.term,
                    }
                },
                processResults: function (data, page) {
                    let arr = data.data;
                    for (let i = 0; i < arr.length; i++) {
                        arr[i].text = arr[i].name;
                    }
                    return {
                        results: arr
                    }
                },
                cache: true
            },
            placeholder: '请选择',
        })

        $('#selectPerm').on('change', function (e) {
            let permId = $(this).val();
            $.get("${path}/getPermissionById", {"permId": permId}, function (rs) {
                if (rs.code == 0) {
                    $('#permName-edit').val(rs.data.name)
                    $("#permCode-edit").val(rs.data.perCode)
                    $("#permCode-old").val(rs.data.perCode)
                    $("#url-edit").val(rs.data.url)
                    $("#selectPermType-edit").val(rs.data.perType)
                    $("#selectParentPerm-edit").val(rs.data.parentId).trigger("change")
                    $("#editInfo").css("display", "block")

                } else {
                    alert(rs.message)
                }
            })


        })

        $("#selectParentPerm").select2({
            theme: 'bootstrap4',
            ajax: {
                url: "${path}/getParentPerm",
                dataType: 'json',
                data: function (params) {
                    return {
                        text: params.term,
                    }
                },
                processResults: function (data, page) {
                    let arr = data.data;
                    for (let i = 0; i < arr.length; i++) {
                        arr[i].text = arr[i].name;
                    }
                    arr.unshift({"id": 0, "text": "无"})
                    return {
                        results: arr
                    }
                },
                cache: true
            },
            placeholder: '请选择',
        })


        $('#addPermForm').validate({
            rules: {
                name: {
                    required: true,
                },
                perCode: {
                    required: true,
                    remote: {
                        url: "${path}/validatePerCode",
                        type: "post",
                        data: {
                            perCode: function () {
                                return $('#permCode').val();
                            }
                        }
                    }
                },
                url: {
                    required: true,
                },
                type: {
                    required: true,
                },
                parent: {
                    required: true,
                }
            },
            messages: {
                perCode: {
                    remote: '编码已存在'
                }
            },
            errorElement: 'span',
            errorPlacement: function (error, element) {
                error.addClass('invalid-feedback');
                element.closest('.form-group').append(error);
            },
            highlight: function (element, errorClass, validClass) {
                $(element).addClass('is-invalid');
            },
            unhighlight: function (element, errorClass, validClass) {
                $(element).removeClass('is-invalid');
            },
            submitHandler: function (form) {
                console.log($('#addPermForm').serialize())
                $.post("${path}/addPerm", $('#addPermForm').serialize(), function (rs) {
                    if (rs.code == 0) {
                        $("#permTable").DataTable().ajax.reload();
                        alert("添加成功")
                    } else {
                        alert(rs.message)
                    }

                })
                return false;
            },
            invalidHandler: function (form, validator) {
                return false;
            }
        });


        $("#selectParentPerm-edit").select2({
            theme: 'bootstrap4',
            ajax: {
                url: "${path}/getParentPerm",
                dataType: 'json',
                data: function (params) {
                    return {
                        text: params.term,
                    }
                },
                processResults: function (data, page) {
                    let arr = data.data;
                    for (let i = 0; i < arr.length; i++) {
                        arr[i].text = arr[i].name;
                    }
                    arr.unshift({"id": 0, "text": "无"})
                    return {
                        results: arr
                    }
                },
                cache: true
            },
            placeholder: '请选择',
        })
        $('#editPermForm').validate({
            rules: {
                name: {
                    required: true,
                },
                perCode: {
                    required: true,
                    remote: {
                        url: "${path}/validatePerCode",
                        type: "post",
                        data: {
                            perCode: function () {
                                if ($("#permCode-edit").val() == $("#permCode-old").val()) {
                                    return false;
                                }
                                return $('#permCode-edit').val();
                            }
                        }
                    }
                },
                url: {
                    required: true,
                },
                type: {
                    required: true,
                },
                parent: {
                    required: true,
                }
            },
            messages: {
                perCode: {
                    remote: '编码已存在'
                }
            },
            errorElement: 'span',
            errorPlacement: function (error, element) {
                error.addClass('invalid-feedback');
                element.closest('.form-group').append(error);
            },
            highlight: function (element, errorClass, validClass) {
                $(element).addClass('is-invalid');
            },
            unhighlight: function (element, errorClass, validClass) {
                $(element).removeClass('is-invalid');
            },
            submitHandler: function (form) {
                // console.log($('#editPermForm').serialize())
                $.post("${path}/editPermission", $('#editPermForm').serialize(), function (rs) {
                    // console.log(rs)
                    if (rs.code == 0) {
                        $("#permTable").DataTable().ajax.reload()
                        alert("修改成功")
                    } else {
                        alert(rs.message)
                    }
                })
                return false;
            },
            invalidHandler: function (form, validator) {
                return false;
            }
        });

        $(document).on('click', ".lock", function (e) {
            let status = $(this).children().val();
            let permId = $(this).children().prop("id");
            console.log(permId)
            $.post("${path}/PermLockOrUnLock", {permId: permId, status: status}, function (rs) {
                console.log(rs)

            })
        })
    })

</script>