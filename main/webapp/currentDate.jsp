<html>
<head>
    <title>Current Date and Time</title>
</head>
<body>
    <h2>Current Date and Time</h2>
    <p>
        <%
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            java.util.Date now = new java.util.Date();
        %>
        <%= sdf.format(now) %>
    </p>
</body>
</html>
