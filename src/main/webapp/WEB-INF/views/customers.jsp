<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=ISO-8859-1">
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <title>Products</title>
</head>
<body>
<section>
    <div class="jumbotron">
        <div class="container">
            <h1>Products</h1>
            <p>All the available products in our store</p>
        </div>
    </div>
</section>
<section class="container">
    <div class="row">
        <c:forEach items="${customers}" var="customers">
            <div class="col-sm-6 col-md-3">
                <div class="thumbnail">
                    <div class="caption">
                        <h3>${customers.name}</h3>
                        <p>${customers.address}</p>
                        <p>${customers.customerId}</p>
                        <p>Available ${customers.noOfOrdersMade} units in stock</p>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</section>
</body>
</html>