<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>Insert title here</title>
</head>
<body>
<%!
public String codeToString(String str)
{
    //处理中文字符串的函数
    String s=str;
    try{
        byte tempByte[]=s.getBytes("gb2312");
        s=new String(tempByte);
        return s;
    }catch(Exception e){
        return s;
    }
}
%>

</body>
</html>