<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Iniciar Sesión</title>
    
    <link rel="stylesheet" type="text/css" href="css/estilos_movil.css" media="screen and (max-width:480px) and (min-width:1px)">
    <link rel="stylesheet" type="text/css" href="css/estilos_tablet.css" media="screen and (max-width:700px) and (min-width:481px)">
    <link rel="stylesheet" type="text/css" href="css/estilos_escritorio.css" media="screen and (max-width:1200px) and (min-width:701px)">
    <link rel="stylesheet" type="text/css" href="css/estilos_pchcl.css" media="screen and (max-width:3600px) and (min-width:1201px)">
</head>

<style>
    body  {
        background-image: url("imagenes/fondo.jpg");
        background-position: center;
        background-repeat: no-repeat;
        background-size: cover;
        background-attachment: fixed;
    }
</style>

<body>
    <header>
        <h1>Angel Brito</h1>
    </header>

    <div id="contenedor">
        <div id="logo">Logo</div>
        <ul>
            <a id="botones" href="index.html">Inicio</a>
            <a id="botones" href="galeria.html">Galeria</a>
            <a id="botones" href="entrevistas.html">Entrevistas</a>
            <a id="botones" href="exposiciones.html">Exposiciones</a>
            <a id="botones" href="pensamientos.html">Pensamientos</a>
            <a id="botones" href="contacto.jsp">Iniciar Sesión</a>
            <a id="botones" href="acercade.html">Acerca de</a>
        </ul>
    </div>

    <div id="contenedor2">
        <li><a id="años" href="2023.html">2023</a></li>
        <li><a id="años" href="2022.html">2022</a></li>
        <li><a id="años" href="2019.html">2019</a></li>
        <li><a id="años" href="2018.html">2018</a></li>
        <li><a id="años" href="2017.html">2017</a></li>
        <li><a id="años" href="2016.html">2016</a></li>
        <li><a id="años" href="2015.html">2015</a></li>
        <li><a id="años" href="2014.html">2014</a></li>
        <li><a id="años" href="2013.html">2013</a></li>
        <li><a id="años" href="2012.html">2012</a></li>
        <li><a id="años" href="2011.html">2011</a></li>
    </div>

    <div id="iniciar">
        <form action="Servlet" method="POST" id="iniciar" name="iniciar">
            <input type="hidden" name="option" value="iniciar">
            
            <fieldset>
                <h1 id="tituloformulario">Iniciar sesión</h1>
                <br>
                <div id="contenedorcontacto">
                    <label>Correo:</label>
                    <input type="email" name="email" id="email" class="cambio" required>
                    <br><br>
                    <label>Contraseña:</label>
                    <input type="password" name="contrasena" id="contrasena" class="cambio">
                    <br><br>   
                    <input type="submit" name="enviar" id="enviar" class="cambio" value="Enviar">
                    <input type="reset" name="borrar" id="borrar" value="Borrar" class="cambio">
                </div>
                	<div id="contenedor3">
                    	<h2><a id="registrar" href="registrar usuario.html">registrar</a></li></h2>
                   		<h2><a id="olvidecontraseña" href="registrar usuario.html">olvidé contraseña</a></li></h2>
                   	</div>
            </fieldset>
        </form>
    </div>

<footer id="footercontacto">
    <div id="copyright">
        Aviso legal <br><br>
        Copyright © Angel Brito 2023.
        Todos los derechos reservados. <br>
        Ninguna parte de esta publicación puede ser reproducida, distribuida o transmitida de ninguna <br>
        forma ni por ningún medio, incluidas fotocopias, grabaciones u otros métodos electrónicos o <br>
        mecánicos, sin el permiso previo del autor.
        <div id="redesfooter">
            Diseño hecho por: Angel Brito <br>
        </div>
        <img id="redes" src="imagenes/facebook.jpg">
        <img id="redes" src="imagenes/twitter.jpg">
        <img id="redes" src="imagenes/instagram.jpg">
    </div>
</footer>
</body>
</html>