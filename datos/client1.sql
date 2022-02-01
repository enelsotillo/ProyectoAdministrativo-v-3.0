-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-07-2020 a las 03:42:16
-- Versión del servidor: 10.4.13-MariaDB
-- Versión de PHP: 7.4.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `servicios`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `client1`
--

CREATE TABLE `client1` (
  `Id_client1` int(10) NOT NULL,
  `BdNombres` varchar(40) NOT NULL,
  `BdApellidos` varchar(40) NOT NULL,
  `BdDc` varchar(40) NOT NULL,
  `BdCuil` varchar(40) NOT NULL,
  `BdCuit` varchar(40) NOT NULL,
  `BdCalle` varchar(40) NOT NULL,
  `BdNro` varchar(40) NOT NULL,
  `BdZona` varchar(40) NOT NULL,
  `BdProvincia` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `client1`
--

INSERT INTO `client1` (`Id_client1`, `BdNombres`, `BdApellidos`, `BdDc`, `BdCuil`, `BdCuit`, `BdCalle`, `BdNro`, `BdZona`, `BdProvincia`) VALUES
(1, 'Enel', 'Sotillo', '10', '123', '234', 'baca', '234', 'floresta', 'capital'),
(2, 'Rachel', 'Sotillo', '11', '345', '343', 'Baca', '222', 'floresta', 'capital'),
(3, 'Dulce', 'Gonzalez', '12', '345', '567', 'Baca', '222', 'flores', 'capital'),
(4, 'Richard', 'Gonzalez', '13', '345', '321', 'Valencia', '200', 'floresta', 'capital');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `client1`
--
ALTER TABLE `client1`
  ADD PRIMARY KEY (`Id_client1`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `client1`
--
ALTER TABLE `client1`
  MODIFY `Id_client1` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
