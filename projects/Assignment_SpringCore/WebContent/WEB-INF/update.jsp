<%--
  Created by IntelliJ IDEA.
  User: ChiZhou
  Date: 2019/10/24
  Time: 11:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
<%--<script src="../js/jquery-1.8.2.min.js"></script>--%>

<html>

<head>
    <title>Login</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

</head>
<SCRIPT>

    function main(){

        document.formMain.action="/main";
        document.formMain.submit();
    }
    function butSubmit(flag) {
        if(flag=='img'){
            var imgSrc = $("#imgObj");
            console.log(imgSrc);
            var src = imgSrc.attr("src");
            console.log(chgUrl(src));
            imgSrc.attr("src", chgUrl(src));
        }
        if(flag=='sub'){
            // document.formLogin.action="/views/login";
            // document.formLogin.submit();
            var vUsername=document.getElementById("Username").value;
            var  vPassword=document.getElementById("Password").value;
            var vcode=document.getElementById("code").value;
            var  vName=document.getElementById("Name").value;
            var vEmail=document.getElementById("Email").value;
            console.log(vcode+vUsername);
            jQuery.ajax({
                method: "post",
                url: "/views/update",
                async: false,
                dataType: "text",
                data: {
                    Username: vUsername,
                    Password: vPassword,
                    code: vcode,
                    name:vName,
                    email:vEmail

                },
                success: function (res) {
                    console.log("res:"+res);
                    if(res=="success"){
                        alert("更新成功");
                        document.fromMain.action="/views/main";
                        document.fromMain.submit();
                    }else{
                        alert("更新失败");
                    }


                }, error: function (err) { //
                    console.log("err:"+err);
                    alert("更新失败");
                }
            });
        }
        if(flag=='ret'){
            document.getElementById("Username").value="";
            document.getElementById("Password").value="";
            document.getElementById("code").value="";
        }
    }
    function getVerify() {
        // $("#imgCode").on("click", function() {
        $("#imgVerify").attr("src", 'login/getVerify?' + Math.random());//jquery方式
        // });
    }

    function aVerify(){
        var value =$("#verify_input").val();
        // alert(value);
        $.ajax({
            async: false,
            type: 'post',
            url: 'login/checkVerify',
            dataType: "json",
            data: {
                verifyInput: value
            },
            success: function (result) {
                if (result) {
                    alert("success!");
                } else {
                    alert("failed!");
                }
                // window.location.reload();
                getVerify();
            }
        });
    }

    // 时间戳
    // 为了使每次生成图片不一致，即不让浏览器读缓存，所以需要加上时间戳
    function chgUrl(url) {
        var timestamp = (new Date()).valueOf();
        // url = url.substring(0, 20);
        if ((url.indexOf("&") >= 0)) {
            url = url + "×tamp=" + timestamp;
        } else {
            url = url + "?timestamp=" + timestamp;
        }
        return url;
    }
</SCRIPT>
<body>
<form name="fromMain" id="fromMain" action="" method="post">

</form>
<div class="container">
    <div class="jumbotron">
        <h1>Update</h1>
    </div>
    <div class="row">
        <div class="col-sm-2">
            <p> </p>
        </div>
        <div class="col-sm-8">
            <div style="padding: 100px 100px 10px;">
                <form id="formLogin"  name="formLogin" action="" method="post">
                    <div class="input-group">
                        <span class="input-group-addon">Role</span>
                        <input type="text" class="form-control" name="Role" id="role" style="width: 200px " >
                    </div>
                    <br>
                    <div class="input-group">
                        <span class="input-group-addon">Email</span>
                        <input type="text" class="form-control" name="Email" id="mail" style="width: 200px " >
                    </div>
                    <br>
                    <div class="input-group">
                        <span class="input-group-addon">Username</span>
                        <input type="text" class="form-control" name="Username" id="Username" style="width: 200px " >
                    </div>
                    <br>
                    <div class="input-group">
                        <span class="input-group-addon">Password</span>
                        <input type="text" class="form-control" name="Password" id="Password" style="width: 200px "  >

                    </div>
                    <br>
                   <div class="row">
					<div class="col-xs-6 pull_left">
					        <div class="form-group">
					            <input class="form-control" type="tel" id="verify_input" placeholder="请输入验证码" maxlength="4">
					        </div>
					    </div>
					    <div class="col-xs-6 pull_left">
					        <a href="javascript:void(0);" title="Click to change">
					            <img id="imgVerify" src="login/getVerify" alt="Click to change" height="36" width="170" onclick="getVerify(this);">
					        </a>
					    </div>
					    <input type="button" onclick="aVerify()" value="Check">
					</div>
                    <br>
                    <button type="button" class="btn btn-primary" style="height: 50px;width: 100px " onclick="butSubmit('sub')">Update</button>
                </form>
            </div>

        </div>
        <div class="col-sm-2">
        </div>
    </div>
</div>

</body>
</html>