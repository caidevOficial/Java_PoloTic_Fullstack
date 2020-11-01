-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3307
-- Tiempo de generación: 01-11-2020 a las 03:02:54
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
-- Base de datos: `cel_center`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

DROP TABLE IF EXISTS `producto`;
CREATE TABLE IF NOT EXISTS `producto` (
  `cod_prod` int(5) NOT NULL,
  `marca` varchar(25) COLLATE utf8_spanish_ci NOT NULL,
  `modelo` varchar(25) COLLATE utf8_spanish_ci NOT NULL,
  `precio` double NOT NULL,
  `stock` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`cod_prod`, `marca`, `modelo`, `precio`, `stock`) VALUES
(354321, 'Samsung', 'S7 Edge', 20000, 15),
(354350, 'Samsung', 'S8+', 29000, 20),
(354380, 'Xiaomi', 'Redmi Note 7', 15000, 36),
(354390, 'Xiaomi', 'MI 8', 21000, 12),
(354500, 'Iphone', 'XI Pro', 201000, 8);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
