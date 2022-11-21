// 第一步：新用户的注册 验证用户的昵称有/w规则定义，密码长度5-12
$(function() {
    // 绑定点击事件
    $("#btn_sub").click(function() {
        // 获取用户提交的信息
        var usernameVar = $("#username").val(); //用户名
        var usernamePatt = /^\w{5,12}$/;
        if(!usernamePatt.test(usernameVar))
        {
            $("#usernameError").text("用户名不合法");
            return false;
        }
        $("#usernameError").text(""); //合法就重新为空
        var passwordVar = $("#password").val(); // 密码
        var passwordPatt = /^\w{5,12}$/;
        if(!passwordPatt.test(passwordVar)){
            $("#usernameError").text("密码不合法");
            return false;
        }
        $("#usernameError").text(""); //合法就重新为空
        var emailVar = $("#email").val();       // 邮箱
        var emailPatt = /^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$/;
       if(!emailPatt.test(emailVar)){
           $("#usernameError").text("邮箱不合法");
           return false;
       }
        $("#usernameError").text(""); //合法就重新为空
        var nameVar = $("#name").val(); //真实姓名
        var telVar = $("#tel").val(); //电话
        var td_rightVar = $("input[name='gender']:checked")[0].nextSibling.nodeValue;
        var checkcodeVar = $("#checkcode").val();
//      //   验证各个是否正确
    });
});
// xml文件作用  1、0 保存数据、数据具有自我描述性质
// tomcat 已经安装在阿里云服务器上，目录是/etc/tomcat8 /usr/share/tomcat8 使用whereis 命令可以快速找到 such as whereis tomcat8
