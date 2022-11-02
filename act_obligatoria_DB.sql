-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 31-10-2022 a las 16:18:14
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
-- Base de datos: `codoacodo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `act_obligatoria`
--

CREATE TABLE `act_obligatoria` (
  `id` int(11) NOT NULL,
  `nombre` varchar(40) CHARACTER SET latin1 NOT NULL,
  `apellido` varchar(40) CHARACTER SET latin1 NOT NULL,
  `edad` tinyint(2) NOT NULL,
  `fecha` timestamp NOT NULL DEFAULT current_timestamp(),
  `provincia` varchar(30) CHARACTER SET latin1 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `act_obligatoria`
--

INSERT INTO `act_obligatoria` (`id`, `nombre`, `apellido`, `edad`, `fecha`, `provincia`) VALUES
(1, 'Ludmila', 'Viale', 28, '2022-10-31 15:10:06', 'Santa Fe'),
(2, 'Julia', 'Lopez', 26, '2022-10-28 15:14:27', 'Entre Ríos'),
(3, 'Sebastián', 'Rodríguez', 31, '2022-10-25 10:15:10', 'Salta'),
(4, 'Estefanía', 'Salas', 24, '2022-10-25 13:16:04', 'Buenos Aires'),
(5, 'Felipe', 'Díaz', 29, '2022-10-19 16:16:43', 'Corrientes');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `act_obligatoria`
--
ALTER TABLE `act_obligatoria`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `act_obligatoria`
--
ALTER TABLE `act_obligatoria`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
