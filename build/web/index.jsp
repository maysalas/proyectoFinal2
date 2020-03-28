<!-- ------------------- VISTA ------------------------ -->

<!-- 
Modelo 1 con:
    Nombre, Editorial, Fecha de publicación,  Autor, Categoría, Número de consultas

Vista con:
    Formulario , Imagenes, CSS responsivo

Controlador con:
    Comunicacion entre vista y Función suma consultas

Modelo 2 con:
    Usuario, Contraseña, Fecha de Nacimiento


Crear una página función que encripte una cadena (Sha256)
-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="CSS/style.css"/>
        <title>Biblioteca</title>
    </head>
    <body id="mainbdy">
        <div id="maindiv">
            <div id="container">
            <div id="logTitle">
                <h1>Bienvenido</h1>
                <h3>Mi Biblioteca</h3>
            </div>
            <div style="height: 50px"></div>
            <div>
                <form action="validacion">
                    <label><strong>Usuario</strong></label><br>
                    <input type="text" name="user">
                    <div style="height: 15px"></div>
                    <label><strong>Contraseña</strong></label><br>
                    <input type="password" name="pass">
                    <div style="height: 50px"></div>
                    <input type="submit" class="boton_pro" value="Ingresar">
                </form>
            </div>
            
        </div>
            
        </div><div>
        
    </body>
</html>
