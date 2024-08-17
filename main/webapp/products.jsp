<html>
<head>
Product List
</head>
<body>
<h2> Product Lists </h2>
<ul>
<% java.util.ArrayList<String> product = new java.util.ArrayList();
product.add("product 1");
product.add("product 2");
product.add("product 4");
product.add("product 3");
product.add("product 5");

for(int i=0;i<product.size();i++){
out.println("<li>" + product.get(i) + "</li>");
}
%>
</ul>
</body>
</html>