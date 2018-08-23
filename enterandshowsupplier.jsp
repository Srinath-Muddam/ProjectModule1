<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css" integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt" crossorigin="anonymous">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="st" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl" %>
<%@ include file="index.jsp" %>
<div class="container">

    <h2 class="text-center">Supplier</h2>
	<div class="row justify-content-center">
		<div class="col-12 col-md-8 col-lg-6 pb-5">


                    <!--Form with header-->

                    <st:form action="savesupplier" method="post" commandName="sup" >
                        <div class="card border-primary rounded-0">
                            <div class="card-header p-1">
                                <div class="bg-info text-white text-center py-2">
                                    <h3 class="bg-secondary text-white"><i class="fas fa-hand-holding-heart"></i>Supplier Details</h3>
                                    <p class="bg-primary text-white">enter supplier details</p>
                                </div>
                            </div>
                            <div class="card-body p-3">

                                <!--Body-->
                                 
                                Supplier Name:<br>
                                <div class="form-group">
                                    <div class="input-group mb-2">
                                        <div class="input-group-prepend">
                                            <div class="input-group-text"></i></div>
                                        </div>
                                        
                                        <st:input path="supplierName"   placeholder="supplier name" />
                                    </div>
                                </div>
                                
                                                                <div class="text-center">
                                    <input type="submit"  value="save supplier"  class="bg-warning text-white">
                                </div>
                            </div>

                        </div>
                    </st:form>
                    <!--Form with header-->


                </div>
	</div>
</div>
<div>
<table class="table table-dark">
  <thead>
    <tr>
      <th scope="col">Supplier Id</th>
      <th scope="col">Supplier Name</th>
        <th scope="col">edit</th>
        <th scope="col">delete</th>
    </tr>
  </thead>
  <tbody>
    <jstl:forEach items="${sd}" var="p">
    <tr class=""text-danger">
       <td>${p.supplierId}</td>
      <td>${p.supplierName}</td>
      <td><a href="#">edit</a></td>
      <td><a href="delsupplier?supId=${p.supplierId}">delete</a></td>
    </tr>
    </jstl:forEach>
  </tbody>
</table>

</div>

