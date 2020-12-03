-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3307
-- Tiempo de generación: 01-11-2020 a las 18:30:14
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
-- Base de datos: `emple_dep`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `departamento`
--

DROP TABLE IF EXISTS `departamento`;
CREATE TABLE IF NOT EXISTS `departamento` (
  `id_depto` int(11) NOT NULL,
  `nombre_depto` varchar(25) COLLATE utf8_spanish_ci NOT NULL,
  `dir_depto` varchar(25) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`id_depto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `departamento`
--

INSERT INTO `departamento` (`id_depto`, `nombre_depto`, `dir_depto`) VALUES
(1, 'Front-end', 'Ala Frontal'),
(2, 'Back-end', 'Ala Trasera'),
(3, 'UI/UX', 'Ala Central'),
(4, 'CiberSeguridad', 'Ala Superior'),
(5, 'Game Design', 'Ala Central');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

DROP TABLE IF EXISTS `empleado`;
CREATE TABLE IF NOT EXISTS `empleado` (
  `nro_legajo` int(11) NOT NULL,
  `nombre` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `apellido` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `dni` varchar(10) COLLATE utf8_spanish_ci NOT NULL,
  `fecha_nac` date NOT NULL,
  `fecha_incorp` date NOT NULL,
  `cargo` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `id_depto` int(11) NOT NULL,
  `sueldo` double NOT NULL,
  PRIMARY KEY (`nro_legajo`),
  KEY `id_departamento` (`id_depto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`nro_legajo`, `nombre`, `apellido`, `dni`, `fecha_nac`, `fecha_incorp`, `cargo`, `id_depto`, `sueldo`) VALUES
(1000, 'Denu', 'Chan', '11111111', '1996-02-05', '2020-11-01', 'Game Design', 5, 65000),
(1001, 'Facu', 'San', '11222111', '1990-02-25', '2020-10-01', 'BackEnd Dev', 2, 62059),
(1002, 'Lagertha', 'Viking', '11222222', '1995-04-18', '2020-11-01', 'Web Art Design', 3, 62999),
(1003, 'Bianca', 'San', '11111112', '1997-05-17', '2020-11-01', 'Web Art Design', 3, 64999),
(1004, 'Bjorn', 'Ironside', '11333222', '1977-10-27', '2020-11-01', 'Forense', 4, 90000),
(1005, 'Ragnar', 'Lothbrock', '111333111', '1977-10-27', '2020-11-01', 'FrontEnd Dev', 1, 85000),
(1006, 'Caidev', 'Sama', '11333000', '1990-02-25', '2020-11-01', 'Forense', 4, 90000),
(1007, 'Guada', 'San', '11222122', '1995-02-04', '2020-10-01', 'FrontEnd Dev', 1, 56000);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD CONSTRAINT `id_departamento` FOREIGN KEY (`id_depto`) REFERENCES `departamento` (`id_depto`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
