<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="static/js/jquery-1.12.3.min.js"> </script>
    <script>
        $(function(){
            $("#btn").click(function(){
              $.get("testAjax",{pname:"aaaa",page:"10"},function(data){
                 console.log(data)
                  console.log(data.name)
                    },"json")
            })
        })
    </script>
</head>
<body>

<input id="btn" type="button" value="testJson">

</body>
</html>