<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css" integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt" crossorigin="anonymous">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="st" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl" %>


<div class="container">
<table class="table table-dark">
  <thead>
    <tr>
      <th scope="col">Product Id</th>
      <th scope="col">Product Name</th>
      <th scope="col">Product Price</th>
       <th scope="col">Show details</th>
        
    </tr>
  </thead>
  <tbody>
    <jstl:forEach items="${pd}" var="p">
    <tr class="success">
       <td>${p.productId}</td>
      <td>${p.productName}</td>
      <td>${p.productPrice}</td>
      <td><a href="details?proId=${p.productId}">View details</a></td>
    
      
    </tr>
    </jstl:forEach>
    
   
  </tbody>
</table>

</div>

