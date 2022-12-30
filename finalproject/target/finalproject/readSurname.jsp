<%@ page contentType="text/html" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Buscador</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" />
    <link rel="stylesheet" href="mystiles.css" />
</head>
<body>
    <nav class="navbar text-bg-dark p-3">
        <div class="container-fluid">
            <a class="navbar-brand text-white" href="#">
                Charlas TED
            </a>
            <ul class="nav justify-content-end">
                <li class="nav-item">
                    <a class="nav-link link-secondary" href="readId.jsp">Buscar por ID</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link link-secondary" href="readSurname.jsp">Buscar por Apellido</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link link-success" href="index.jsp">Añadir Comprador</a>
                </li>
            </ul>
        </div>
    </nav>

    <section class="m-3">
        <p class="text-center">BUSCADOR</p>
        <h2 class="text-center">BUSCAR COMPRADOR POR APELLIDO</h2>

        <form class="mx-10" action="readSurname" method="get">
            <div class="row my-3">
                <div class="col">
                    <label for="name"></label>
                    <input type="text" id="surname" name="surname" class="form-control" placeholder="Apellido" required>
                </div>
            </div>
            <div class="row my-3">
                <div class="col">
                    <button class="btn btn-success w-100" type="submit" id="consultar">Consultar</button>
                </div>
            </div>
        </form>
        <a class="btn btn-link w-100" href="index.jsp" type="button">Volver</a>
    </section>

    <footer>
        <div class="bg-footer p-3">
            <ul class="nav justify-content-center">

                <li class="nav-item">
                    <a class="nav-link link-active" aria-current="page" href="#">Preguntas frecuentes</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link link-active" href="#">Prensa</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link link-active" href="#">Conferencias</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link link-active" href="#">Términos y condiciones</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link link-active" href="#">Privacidad</a>
                </li>
            </ul>
        </div>
    </footer>
</body>
</html>