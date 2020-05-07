<html>
<body>
<h2>Login validate system</h2>
</body>
</html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
</head>
<script>
    function registration(){
        document.formRegistration.action="/registration";
        document.formRegistration.submit();
    }
    function login(){
        document.formLogin.action="/login";
        document.formLogin.submit();
    }
</script>
<style>
    body{ text-align:center}
    .div{ margin:0 auto; width:400px; height:100px; border:1px }
</style>
<body>
<div class="container">
    <div class="div">

        <form name="formRegistration" id="formRegistration" action="" method="post">
            <div class="container">
                <h2>注册</h2>
                <p> Registration Action:</p>
                <button type="button" class="btn btn-primary" onclick="registration()">Registration</button>
            </div>
        </form>
        <form name="formLogin" id="formLogin" action="" method="post">
            <div class="container">
                <h2>登录</h2>
                <p>Login Action:</p>
                <button type="button" class="btn btn-primary"  onclick="login()">Login</button>
            </div>
        </form>

    </div>
</div>
</body>
</html>