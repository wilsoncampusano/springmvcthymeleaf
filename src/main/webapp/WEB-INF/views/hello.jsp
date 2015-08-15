<%@include file="/WEB-INF/views/include.jsp"%>
<html>
<head>
    <title><fmt:message key="title" /></title>
</head>
<body>
<h1><fmt:message key="title" /></h1>

<p><fmt:message key="greeting" />  <c:out value="${model.nowDate}"/> </p>
<h3><fmt:message key="heading" /></h3>

<c:forEach items="${model.products}" var="product">
    <c:out value="${product.description}"/> <i>$<c:out value="${product.price}"/> </i><br/><br/>
</c:forEach>

<br/>
<a href="<c:url value="priceincrease.html"/>">Increase Price</a>
</body>
</html>
