<%@ include file="/tpl/header.jsp" %>
	<div class="header-bar">
		<div class="header content clearfix">
			<div class="logo">Note ton STA</div>
		    <div class="menu"><a href="<%= contextPath %>/login/register.jsp">Register</a></div>
		</div>
	</div>
	<div class="content">
		<div class="signin-box" style="width:275px;">
		  <h2>Connexion <strong></strong></h2>
		    <form method="post" action="" id="formLogin">
		        <label>
		          <strong class="email-label">E-mail</strong>
		          <input type="text" value="" id="Email" name="Email" spellcheck="false">
		        </label>
		        <label>
		          <strong class="passwd-label">Mot de passe</strong>
		          <input type="password" id="Passwd" name="Passwd">
		        </label>
		        <input type="submit" value="Connexion" id="signIn" name="signIn" class="g-button g-button-submit">
		        <label class="remember">
		        <input type="checkbox" checked="checked" value="yes" id="PersistentCookie" name="PersistentCookie">
		        <strong class="remember-label">
		        Rester connecté
		        </strong>
		        </label>
		    </form>
		</div>
	</div>
<%@ include file="/tpl/footer.jsp" %>