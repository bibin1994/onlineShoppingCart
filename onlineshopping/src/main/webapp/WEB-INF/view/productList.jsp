<div class="container">

	<div class="row">


		<!-- TO DISPLAY SIDE BAR -->

		<div class="col-md-3">

			<%@ include file="./shared/listcontent.jsp"%>
			>

		</div>

		<!-- TO DISPLAY THE PRODUCT LIST -->
		<div class="col-md-9">

		<div class="row">

			<div class="col-lg-12">
			
				<!-- for All product -->
				
				<c:if test="${userClickAllItems==true }">
					<ol class="breadcrumb">
						<li><a href="${contextRoot}/home">Home</a></li>
						<li class="active">/All Product</li>

					</ol>
				</c:if>

				<!-- for single category product -->
				
				<c:if test="${userClickCategoryItem==true }">
					<ol class="breadcrumb">
						<li><a href="${contextRoot}/home">Home</a></li>
						<li class="active">/Category</li>
						<li class="active">/${category.name }</li>
					</ol>
				</c:if>
				
			</div>


		</div>

</div>
	</div>




</div>