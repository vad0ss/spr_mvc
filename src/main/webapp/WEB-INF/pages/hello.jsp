<html>
<body>
	<h1>${message}</h1>
    <h2>${username}</h2>

	<form id="loginForm" action="HelloController" method="POST">
		<div id="registerDiv">
     		Username:<br>
			<input id="rName" type="text" name="rName">
			<br>
			Password:<br>
			<input id="rPassword" type="text" name="rPassword">
			<br>
			<button type="submit" value="submit">Login</button>
		</div>
	</form>
</body>
</html>