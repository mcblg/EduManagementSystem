<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>教务系统</title>
    <#include "/common/common.ftl">
</head>
<body>
    <div>
        <p id="user">${user.name}</p>
        <p>${user.id}</p>
        <p>${user.pwd}</p>
        <p>${path}</p>
        <button id="btm" class="btn btn-info">点我隐藏</button>
    </div>
    <script type="text/javascript">
    </script>
</body>
</html>