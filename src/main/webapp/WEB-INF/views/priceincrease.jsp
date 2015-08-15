<%--
  Created by IntelliJ IDEA.
  User: wilson
  Date: 8/15/15
  Time: 12:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/WEB-INF/views/include.jsp"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ftm" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>

<head>
    <title><ftm:message key="title"/></title>
    <style type="text/css">
        .error{ color:red;}
    </style>

</head>

<body>
    <form:form method="post" commandName="priceIncrease">
        <table width="95%" bgcolor="f8f8ff" border="0" cellspacing="0" cellpadding="5">
            <tr>
                <td align="right" width="20%">Increase (%):</td>
                <td width="20%">
                    <form:input path="percentage"/>
                </td>
                <td width="60%">
                    <form:errors path="percentage" cssClass="error"/>
                </td>
            </tr>
        </table>
        <br>
        <input type="submit" value="Execute">
    </form:form>
    <a href="<c:url value="hello.html"/>">Home</a>
</body>

</html>