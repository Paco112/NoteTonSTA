<%@ include file="/tpl/header.jsp" %>
	<div class="header-bar">
		<div class="header content clearfix">
			<div class="logo">Note ton STA</div>
		    <div class="menu"><a href="<%= contextPath %>/login/register.jsp">Register</a></div>
		    <span class="signin-button">
				<a href="<%= contextPath %>/login/" class="g-button" id="link-signin">Login</a>
			</span>
		</div>
	</div>
	<div class="content">
		<div class="signin-box" style="width:275px;">
		  <h2>Campus Selection<strong></strong></h2>
		    <form method="post" action="" id="formLogin">
		        <div  class="form-element">
		        <label>
		          <strong class="email-label">Please select your campus :</strong>
		          	<select name="campus_name" onChange="javascript:submit();">
			  			<option value="0">-- Campus --</option>
			  			<c:forEach items="${campus}" var="campus">
							<option value="<c:out value="${campus.campus_id}"/>"><c:out value="${campus.campus_name}"/></option>
						</c:forEach>
		    		</select>
		        </label>
		        </div>
		    </form>
		 </div>  
	</div>
<%@ include file="/tpl/footer.jsp" %>