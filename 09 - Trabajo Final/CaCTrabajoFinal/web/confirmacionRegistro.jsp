<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="styles/styles.css" />
    <!-- bootstrap -->
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
      crossorigin="anonymous"
    />
    <title>Login de Usuario</title>
  </head>
  <body>
    <!-- formulario de logueo -->

    <div class="container-fluid abs-center">
      <form class="" id="frmLogin" action="POST">
        <div class="col-lg-12 text-center">
          <img
            src="assets/logo.jpg"
            class="logoBsAs"
            alt="Logo Vamos Buenos Aires Educación"
          />
        </div>
        <div class="col-lg-12 mb-3 text-center">
          <br />
          <br />
          <p class="h4">Usuario registrado de manera exitosa</p>
        </div>
        <br />
        <br />
        <table class="table">
          <thead>
            <tr>
              <th scope="col">Usuario</th>
              <th scope="col">Nombre</th>
              <th scope="col">Apellido</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>Mark</td>
              <td>Otto</td>
              <td>@mdo</td>
            </tr>
          </tbody>
        </table>
        <br />
        <br />
        <div class="col-lg-12 mb-3 text-center">
          <p>
            Pasados cinco segundos será redireccionado a la pagina de logueo
          </p>
          <p>Presione <a href="login.html">aquí­</a> si no desea esperar</p>
        </div>
      </form>
    </div>

    <script>
      // script que redirecciona a la pagina de login
      var tiempo = 5000; //5 segundos de espera
      setTimeout(function () {
        window.location = 'login.html';
      }, tiempo);
    </script>

    <footer class="container-fluid col-lg-6 text-center fw-lighter">
      © 2017-2021
    </footer>

    <!-- bootstrap -->
    <script
      src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
      integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
      integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
