<%@page isELIgnored="false" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<b>Current Locale :: ${pageContext.response.locale}</b>

<fmt:setLocale value="${pageContext.response.locale}"/>

<fmt:formatNumber var="fsal" value="${amt}" type="currency"/>

<h1>Currency:: ${fsal}</h1>

<fmt:formatDate var="fDate" value="${sysDate}" type="both"/>
<h1>Sys Date:: ${fDate}</h1>

<h1>${cust}</h1>
