<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="static/js/jquery-1.12.3.min.js"></script>
    <script type="text/javascript">
        $(function(){
            $("#uploadFile").click(function(){
                // 获取要上传的文件
                var photoFile =$("#photo")[0].files[0]
                if(photoFile==undefined){
                    alert("您还未选中文件")
                    return;
                }
                // 将文件装入FormData对象
                var formData =new FormData();
                formData.append("headPhoto",photoFile)
                // ajax向后台发送文件
                $.ajax({
                    type:"post",
                    data:formData,
                    url:"fileUpload.do",
                    processData:false,
                    contentType:false,
                    success:function(result){
                        // 接收后台响应的信息
                        console.log(result)
                        // 图片回显
                    }
                })
            })
        })
    </script>
</head>
<body>
<form action="addPlayer" method="get">
    <p>账号<input type="text" name="name"></p>
    <p>密码<input type="text" name="password"></p>
    <p>昵称<input type="text" name="nickname"></p>
    <p>头像:
        <br/>
        <input id="photo" type="file">
        <a id="uploadFile" href="javascript:void(0)">立即上传</a>
    </p>
    <p><input type="submit" value="注册"></p>
</form>

</body>
</html>