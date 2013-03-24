<%@ include file="/tpl/header.jsp" %>
	<div class="header-bar">
		<div class="header content clearfix">
			<div class="logo">Note ton STA</div>
		    <div class="menu"><a href="<%= contextPath %>/login/register">Register</a></div>
		    <span class="signin-button">
				<a href="<%= contextPath %>/login/" class="g-button" id="link-signin">Login</a>
			</span>
		</div>
	</div>
	<div class="content">
		<div class="signin-box" style="width:350px">
		  <form method="post" action="<%= contextPath %>/login/register" id="createaccount" class="createaccount-form">
		    <div id="name-form-element" class="form-element multi-field name">
		      <label class="lastname"><strong>Lastname </strong>
		        <input type="text" name="lastname" value="">
		      </label>
		      <label class="firstname"><strong>Firstname </strong>
		        <input type="text" name="firstname" value="">
		      </label>		      
		    </div>
		    <div id="gmail-address-form-element" class="form-element gmail-address">
		      <label><strong>Email </strong>
		      <input type="text" value="" name="email" autocomplete="off" maxlength="40">
		      </label>
		    </div>
		    <div id="password-form-element" class="form-element">
		      <label><strong>Password</strong>
		        <input type="password" name="passwd">
		      </label>
		    </div>
		    <div id="confirm-password-form-element" class="form-element">
		      <label><strong>Confirmation password </strong>
		        <input type="password" name="passwdAgain">
		      </label>
		    </div>
		    <div class="form-element nextstep-button">
		      <input type="submit" class="g-button g-button-submit" value="Submit" name="submit">
		    </div>
		  </form>
		</div>		
	</div>
<%@ include file="/tpl/footer.jsp" %>