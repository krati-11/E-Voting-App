<%-- 
    Document   : registrationresponse
    Created on : 1 May, 2021, 2:11:56 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    boolean result, userfound;
    result =(Boolean) request.getAttribute("result");
    userfound = (Boolean) request.getAttribute("userfound");
//    System.out.println(request.getParameter("result"));
//    System.out.println(request.getParameter("userfound"));
    if (userfound == true) {
        out.print("uap");
    } else if (result == true) {
        out.print("success");
    } else {
        out.print("error");
    }
%>