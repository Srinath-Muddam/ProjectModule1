<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css" integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt" crossorigin="anonymous">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="st" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl" %>
<%@ include file="index.jsp" %>
<div class="container">

    <h2 class="text-center">Product</h2>
	<div class="row justify-content-center">
		<div class="col-12 col-md-8 col-lg-6 pb-5">


                    <!--Form with header-->

                    <st:form action="saveproduct" method="post" commandName="pro"  enctype="multipart/form-data">
                        <div class="card border-primary rounded-0">
                            <div class="card-header p-1">
                                <div class="bg-info text-white text-center py-2">
                                    <h3 class="bg-secondary text-white"><i class="fa fa-cube"></i>Product Details</h3>
                                    <p class="bg-primary text-white">enter product details</p>
                                </div>
                            </div>
                            <div class="card-body p-3">

                                <!--Body-->
                                
                                Product Name:<br>
                                <div class="form-group">
                                    <div class="input-group mb-2">
                                        <div class="input-group-prepend">
                                            <div class="input-group-text"></i></div>
                                        </div>
                                        
                                        <st:input path="productName"   placeholder="product name" />
                                    </div>
                                </div>
                                
                                 Product Price:<br>
                                <div class="form-group">
                                    <div class="input-group mb-2">
                                        <div class="input-group-prepend">
                                            <div class="input-group-text"></i></div>
                                        </div>
                                        
                                        <st:input path="productPrice"   placeholder="product price" />
                                    </div>
                                </div>
                                
                                
                                
                                
                                                             

                                Upload Image:<br>
                                <div class="form-group">
                                    <div class="input-group mb-2">
                                        <div class="input-group-prepend">
                                            <div class="input-group-text"></i></div>
                                        </div>
                                        
                                        <st:input type="file" path="productImage"   />
                                    </div>
                                </div>
                                
                                
                                
                                
                                                                <div class="text-center">
                                    <input type="submit"  value="save product"  class="bg-warning text-white">
                                </div>
                            </div>


                        </div>
                    </st:form>
                    <!--Form with header-->


                </div>
	</div>
</div>
<div class="container">
<table class="table table-dark">
  <thead>
    <tr>
      <th scope="col">Product Id</th>
      <th scope="col">Product Name</th>
      <th scope="col">Product Price</th>
       <th scope="col">edit</th>
        <th scope="col">delete</th>
      
    </tr>
  </thead>
  <tbody>
    <jstl:forEach items="${pd}" var="p">
    <tr class="bg-warning text-white">
       <td>${p.productId}</td>
      <td>${p.productName}</td>
      <td>${p.productPrice}</td>
      <td><a href="editpro?proId=${p.productId}">edit</a></td>
      <td><a href="prodelete?proId=${p.productId}">delete</a></td>
      <td><a href="prodelete?proId=${p.productId}">delete</a></td>
    </tr>
    </jstl:forEach>
    
   
  </tbody>
</table>

</div>

