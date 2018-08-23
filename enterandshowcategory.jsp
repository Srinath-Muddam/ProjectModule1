<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css" integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt" crossorigin="anonymous">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="st" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl" %>
<%@ include file="index.jsp" %>
<div class="container">

    <h2 class="text-center">Category</h2>
	<div class="row justify-content-center">
		<div class="col-12 col-md-8 col-lg-6 pb-5">


                    <!--Form with header-->

                    <st:form action="savecategory" method="post" commandName="cat" >
                        <div class="card border-primary rounded-0">
                            <div class="card-header p-1">
                                <div class="bg-info text-white text-center py-2">
                                    <h3 class="bg-secondary text-white"><i class="fa fa-cubes"></i>Category Details</h3>
                                    <p class="bg-primary text-white">enter category details</p>
                                </div>
                            </div>
                            <div class="card-body p-3">

                                <!--Body-->
                              
                                Category Name:<br>
                                <div class="form-group">
                                    <div class="input-group mb-2">
                                        <div class="input-group-prepend">
                                            <div class="input-group-text"></i></div>
                                        </div>
                                        
                                        <st:input path="categoryName"   placeholder="category name" />
                                    </div>
                                </div>
                                Category Description:<br>
                                <div class="form-group">
                                    <div class="input-group mb-2">
                                        <div class="input-group-prepend">
                                            <div class="input-group-text"></i></div>
                                        </div>
                                        
                                        <st:input path="categoryDescription"  placeholder="category description" />
                                    </div>
                                </div>

                                <div class="text-center">
                                    <input type="submit"  value="save category"  class="bg-warning text-white">
                                </div>
                            </div>

                        </div>
                    </st:form>
                    <!--Form with header-->


                </div>
	</div>
</div>
<div>
<table class="table table-dark table-striped">
  <thead>
    <tr>
      <th scope="col">Category Id</th>
      <th scope="col">Category Name</th>
      <th scope="col">Category Description</th>
       <th scope="col">edit</th>
        <th scope="col">delete</th>
    </tr>
  </thead>
  <tbody>
  
    <jstl:forEach items="${cd}" var="p">
    <body link="red">
    <tr class="p-3 mb-2 bg-dark text-white">
       <td>${p.categoryId}</td>
      <td>${p.categoryName}</td>
      <td>${p.categoryDescription}</td>
      
      <td><a href="#">edit</a> </td>
      <td><a href="deletecat?catid=${p.categoryId}">delete</a></td>
   
    </tr>
     </body>
    </jstl:forEach>
    
   
  </tbody>
</table>

</div>

