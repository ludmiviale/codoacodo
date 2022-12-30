<%@ page contentType="text/html" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Venta de Tickets</title>
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
        <p class="text-center">VENTA DE TICKETS</p>
        <h2 class="text-center">AÑADIR COMPRADOR</h2>
        <form class="mx-10" action="createbuyer" method="post">
            <div class="row my-3">
                <div class="col">
                    <label for="name"></label>
                    <input type="text" id="name" name="name" class="form-control" placeholder="Nombre"
                        aria-label="First name" required>
                </div>
                <div class="col">
                    <label for="surname"></label>
                    <input type="text" id="surname" name="surname" class="form-control" placeholder="Apellido"
                        aria-label="Last name" required>
                </div>
            </div>
            <div class="row my-3">
                <div class="col">
                    <label for="quantity" class="form-label">Cantidad</label>
                    <input type="number" id="quantity" name="quantity" min=0 class="form-control" required>
                </div>
                <div class="col">
                    <label for="category" class="form-label">Categoría</label>
                    <select id="category" name="category" class="form-select" aria-label="Default select example" required>
                        <option value="Estudiante">Estudiante</option>
                        <option value="Trainee">Trainee</option>
                        <option value="Junior">Junior</option>
                    </select>
                </div>
            </div>
            <div class="row">
                <div class="col">
                    <button class="btn btn-warning w-100" type="reset" id="reset">Borrar</button>
                </div>
                <div class="col">
                    <button class="btn btn-success w-100" type="submit" id="save">Guardar</button>
                </div>
            </div>
        </form>
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