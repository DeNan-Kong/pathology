<!DOCTYPE html>
<html>
<head>
<#include "shared/page-head.ftl">
</head>
<body>
<div class="container">
    <div class="page-header">
        <h1>Post Json 例子</h1>
        <p class="lead">发送一个Json对象,然后从服务器端返回一个Json对象</p>
    </div>

    <div class="row">
        <div class="col-lg-12">
            <div class="panel panel-default">
                <div id="outMessage" class="panel-body">

                </div>
            </div>
            <button id="postData" type="button" class="btn btn-primary btn-lg btn-block">Post Data</button>
        </div>
    </div>

</div>

<#include "shared/common-js.ftl">

<script>
    $(document).ready(function () {
        $("#postData").click(function(){
            var data = {"id":"1","name":"Yu.Miao"};
            var json = JSON.stringify(data);
            $.ajax({
                type: "post",
                url: "rest/submit",
                data: json,
                contentType: "application/json; charset=utf-8",
                dataType: "json",
                success: function (responseData) {
                    var result = JSON.stringify(responseData);
                    $("#outMessage").html(result);
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    alert(errorThrown);
                }
            });

        });
    });
</script>
</body>
</html>