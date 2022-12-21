-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 21-12-2022 a las 15:43:10
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `trabajo_final_integrador`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Compradores`
--

CREATE TABLE `Compradores` (
  `id` int(11) NOT NULL,
  `nombre` text COLLATE utf8mb4_spanish_ci NOT NULL,
  `apellido` text COLLATE utf8mb4_spanish_ci NOT NULL,
  `cantidad` int(3) DEFAULT NULL,
  `tipoentrada` varchar(20) COLLATE utf8mb4_spanish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `Compradores`
--

INSERT INTO `Compradores` (`id`, `nombre`, `apellido`, `cantidad`, `tipoentrada`) VALUES
(1, 'Luis', 'González', 2, 'Estudiante'),
(2, 'Joel', 'Castañeda', 3, 'Trainee'),
(3, 'Luciana', 'Marquez', 1, 'Junior'),
(4, 'Matías', 'Robles', 1, 'Estudiante');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `Compradores`
--
ALTER TABLE `Compradores`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `Compradores`
--
ALTER TABLE `Compradores`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
