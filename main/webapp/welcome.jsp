<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Welcome Page</title>
</head>
<body>
    <c:if test="${isLoggedIn}">
        <h1>Welcome back, User!</h1>
        <p>We're glad to see you again.</p>
    </c:if>
    <c:if test="${!isLoggedIn}">
        <h1>Please Log In</h1>
        <p>You need to log in to access this page.</p>
    </c:if>
</body>
</html>
