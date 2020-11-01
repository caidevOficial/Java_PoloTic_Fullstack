-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3307
-- Tiempo de generación: 01-11-2020 a las 03:02:20
-- Versión del servidor: 10.4.13-MariaDB
-- Versión de PHP: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `emp_seguros`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE IF NOT EXISTS `cliente` (
  `id_cliente` int(11) NOT NULL,
  `dni` varchar(10) COLLATE utf8_spanish_ci NOT NULL,
  `nombre` varchar(25) COLLATE utf8_spanish_ci NOT NULL,
  `apellido` varchar(25) COLLATE utf8_spanish_ci NOT NULL,
  `fecha_nac` date NOT NULL,
  `sueldo` double NOT NULL,
  PRIMARY KEY (`id_cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id_cliente`, `dni`, `nombre`, `apellido`, `fecha_nac`, `sueldo`) VALUES
(1, '11111111', 'Caidev', 'Sama', '1990-02-25', 65000),
(2, '11222222', 'Denu', 'Chan', '1996-02-05', 64999),
(3, '11222333', 'Bian', 'Chan', '1995-02-20', 50999),
(4, '111222444', 'Cata', 'San', '1995-04-04', 45000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `propiedad`
--

DROP TABLE IF EXISTS `propiedad`;
CREATE TABLE IF NOT EXISTS `propiedad` (
  `id_propiedad` int(11) NOT NULL,
  `direccion` varchar(25) COLLATE utf8_spanish_ci NOT NULL,
  `metros_cuad` varchar(8) COLLATE utf8_spanish_ci NOT NULL,
  `zona` varchar(25) COLLATE utf8_spanish_ci NOT NULL,
  `valor_mercado` double NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `id_servicio` int(11) NOT NULL,
  PRIMARY KEY (`id_propiedad`),
  KEY `id_cliente` (`id_cliente`),
  KEY `id_servicio` (`id_servicio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `propiedad`
--

INSERT INTO `propiedad` (`id_propiedad`, `direccion`, `metros_cuad`, `zona`, `valor_mercado`, `id_cliente`, `id_servicio`) VALUES
(1, 'calle falsa 123', '45', 'Berazategui', 8500456, 1, 1),
(2, 'Avenida siempreviva 1234', '56', 'Springfield', 7500899, 2, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicio`
--

DROP TABLE IF EXISTS `servicio`;
CREATE TABLE IF NOT EXISTS `servicio` (
  `codigo_servicio` int(11) NOT NULL,
  `tipo` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `detalle` varchar(40) COLLATE utf8_spanish_ci NOT NULL,
  `precio` double NOT NULL,
  PRIMARY KEY (`codigo_servicio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `servicio`
--

INSERT INTO `servicio` (`codigo_servicio`, `tipo`, `detalle`, `precio`) VALUES
(1, 'Seguro', 'Contra incendios total', 450),
(2, 'Seguro', 'Robo total y parcial', 480);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `propiedad`
--
ALTER TABLE `propiedad`
  ADD CONSTRAINT `id_cliente` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`),
  ADD CONSTRAINT `id_servicio` FOREIGN KEY (`id_servicio`) REFERENCES `servicio` (`codigo_servicio`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
