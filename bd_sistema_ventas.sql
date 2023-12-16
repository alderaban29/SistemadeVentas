-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3308
-- Tiempo de generación: 16-07-2023 a las 00:35:39
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_sistema_ventas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_cabecera_venta`
--

CREATE TABLE `tb_cabecera_venta` (
  `idCabeceraVenta` int(11) NOT NULL,
  `idCliente` int(11) NOT NULL,
  `valorPagar` double(10,2) NOT NULL,
  `fechaVenta` date NOT NULL,
  `estado` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tb_cabecera_venta`
--

INSERT INTO `tb_cabecera_venta` (`idCabeceraVenta`, `idCliente`, `valorPagar`, `fechaVenta`, `estado`) VALUES
(1, 1, 403.20, '2022-12-14', 1),
(2, 1, 168.00, '2022-12-14', 1),
(3, 6, 117.60, '2022-12-18', 1),
(4, 5, 33.60, '2022-12-18', 1),
(5, 7, 67.20, '2022-12-18', 1),
(6, 0, 50.40, '2022-12-18', 1),
(7, 9, 224.00, '2023-07-07', 1),
(8, 9, 0.00, '2023-07-12', 1),
(9, 9, 0.00, '2023-07-12', 1),
(10, 9, 0.00, '2023-07-12', 1),
(11, 9, 882.00, '2023-07-13', 1),
(12, 9, 882.00, '2023-07-13', 1),
(13, 9, 940.80, '2023-07-13', 1),
(14, 9, 0.00, '2023-07-13', 1),
(15, 9, 0.00, '2023-07-13', 1),
(16, 9, 484.40, '2023-07-13', 1),
(17, 9, 1235.00, '2023-07-14', 1),
(18, 9, 1235.00, '2023-07-14', 1),
(19, 9, 1155.00, '2023-07-14', 1),
(20, 9, 1680.00, '2023-07-14', 1),
(21, 9, 660.00, '2023-07-14', 1),
(22, 9, 1100.00, '2023-07-14', 1),
(23, 9, 1100.00, '2023-07-14', 1),
(24, 9, 800.00, '2023-07-14', 1),
(25, 9, 800.00, '2023-07-14', 1),
(26, 9, 387.00, '2023-07-14', 1),
(27, 9, 10.00, '2023-07-14', 1),
(28, 9, 84.00, '2023-07-14', 1),
(29, 9, 15.00, '2023-07-14', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_categoria`
--

CREATE TABLE `tb_categoria` (
  `idCategoria` int(11) NOT NULL,
  `descripcion` varchar(200) NOT NULL,
  `estado` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tb_categoria`
--

INSERT INTO `tb_categoria` (`idCategoria`, `descripcion`, `estado`) VALUES
(1, 'bebida', 1),
(3, 'abarrotes', 1),
(4, 'enlatados', 1),
(8, 'harinas', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_cliente`
--

CREATE TABLE `tb_cliente` (
  `idCliente` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `cedula` varchar(15) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `direccion` varchar(100) NOT NULL,
  `estado` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tb_cliente`
--

INSERT INTO `tb_cliente` (`idCliente`, `nombre`, `apellido`, `cedula`, `telefono`, `direccion`, `estado`) VALUES
(9, 'Carlos', 'Caceres', '123', '987654321', 'en el cerro', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_detalle_venta`
--

CREATE TABLE `tb_detalle_venta` (
  `idDetalleVenta` int(11) NOT NULL,
  `idCabeceraVenta` int(11) NOT NULL,
  `idProducto` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precioUnitario` double(10,2) NOT NULL,
  `subtotal` double(10,2) NOT NULL,
  `descuento` double(10,2) NOT NULL,
  `iva` double(10,2) NOT NULL,
  `totalPagar` double(10,2) NOT NULL,
  `estado` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tb_detalle_venta`
--

INSERT INTO `tb_detalle_venta` (`idDetalleVenta`, `idCabeceraVenta`, `idProducto`, `cantidad`, `precioUnitario`, `subtotal`, `descuento`, `iva`, `totalPagar`, `estado`) VALUES
(1, 1, 1, 30, 12.00, 360.00, 0.00, 43.20, 403.20, 1),
(2, 2, 2, 10, 15.00, 150.00, 0.00, 18.00, 168.00, 1),
(3, 3, 2, 5, 15.00, 75.00, 0.00, 9.00, 84.00, 1),
(4, 3, 2, 2, 15.00, 30.00, 0.00, 3.60, 33.60, 1),
(5, 4, 2, 2, 15.00, 30.00, 0.00, 3.60, 33.60, 1),
(6, 5, 2, 4, 15.00, 60.00, 0.00, 7.20, 67.20, 1),
(7, 6, 3, 3, 15.00, 45.00, 0.00, 5.40, 50.40, 1),
(8, 7, 4, 5, 40.00, 200.00, 0.00, 24.00, 224.00, 1),
(9, 13, 4, 21, 40.00, 840.00, 0.00, 100.80, 940.80, 1),
(10, 16, 5, 21, 2.00, 42.00, 0.00, 0.00, 42.00, 1),
(11, 16, 3, 21, 15.00, 315.00, 0.00, 37.80, 352.80, 1),
(12, 16, 4, 2, 40.00, 80.00, 0.00, 9.60, 89.60, 1),
(13, 25, 4, 20, 40.00, 800.00, 0.00, 0.00, 800.00, 1),
(14, 26, 3, 23, 15.00, 345.00, 0.00, 0.00, 345.00, 1),
(15, 26, 5, 21, 2.00, 42.00, 0.00, 0.00, 42.00, 1),
(16, 27, 5, 2, 5.00, 10.00, 0.00, 0.00, 10.00, 1),
(17, 28, 11, 21, 4.00, 84.00, 0.00, 0.00, 84.00, 1),
(18, 29, 3, 1, 15.00, 15.00, 0.00, 0.00, 15.00, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_producto`
--

CREATE TABLE `tb_producto` (
  `idProducto` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precio` double(10,2) NOT NULL,
  `descripcion` varchar(200) NOT NULL,
  `porcentajeIva` int(2) NOT NULL,
  `idCategoria` int(11) NOT NULL,
  `estado` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tb_producto`
--

INSERT INTO `tb_producto` (`idProducto`, `nombre`, `cantidad`, `precio`, `descripcion`, `porcentajeIva`, `idCategoria`, `estado`) VALUES
(3, 'atun filete de caballa', 15, 15.00, 'atun gloria', 1, 1, 1),
(4, 'avena ', 12, 40.00, 'avena 3 ositos', 12, 3, 1),
(5, 'pan frances', 35, 5.00, 'pan', 1, 1, 1),
(10, 'cereal', 234, 4.00, 'trigo', 1, 1, 1),
(11, 'gaseoss', 213, 4.00, 'cola', 1, 1, 1),
(12, 'sabritas', 234, 4.00, 'trigo', 1, 1, 1),
(13, 'leche', 234, 5.00, 'leche de soya', 1, 1, 1),
(14, 'tallarin', 234, 2.00, 'Molitalia', 1, 1, 1),
(15, 'cafe', 34, 4.00, 'cafe Kirma', 1, 1, 1),
(16, 'quinoa', 23, 2.00, 'quinoa organica', 1, 1, 1),
(17, 'agua', 23, 2.00, 'agua mineral', 0, 1, 1),
(18, 'limonada', 23, 2.00, 'limonada fresca', 12, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_usuario`
--

CREATE TABLE `tb_usuario` (
  `idUsuario` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `usuario` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `rol` varchar(20) NOT NULL,
  `estado` int(1) NOT NULL,
  `palabra_secreta` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tb_usuario`
--

INSERT INTO `tb_usuario` (`idUsuario`, `nombre`, `apellido`, `usuario`, `password`, `telefono`, `rol`, `estado`, `palabra_secreta`) VALUES
(1, 'Antony', 'Ccaccya', 'antony', '123', '9876556', 'Administrador', 1, 'rojo'),
(2, 'Adrian', 'Granados', 'adrian', '123', '987987987', 'Registrador', 1, 'azul'),
(3, 'Jhon', 'Baldeon', 'jhon', '123', '987654321', 'EncargadoVentas', 1, 'verde'),
(11, 'Jhon', 'Baldeon', 'baldeon', '123', '987654321', 'Registrador', 1, 'amarillo');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tb_cabecera_venta`
--
ALTER TABLE `tb_cabecera_venta`
  ADD PRIMARY KEY (`idCabeceraVenta`);

--
-- Indices de la tabla `tb_categoria`
--
ALTER TABLE `tb_categoria`
  ADD PRIMARY KEY (`idCategoria`);

--
-- Indices de la tabla `tb_cliente`
--
ALTER TABLE `tb_cliente`
  ADD PRIMARY KEY (`idCliente`);

--
-- Indices de la tabla `tb_detalle_venta`
--
ALTER TABLE `tb_detalle_venta`
  ADD PRIMARY KEY (`idDetalleVenta`);

--
-- Indices de la tabla `tb_producto`
--
ALTER TABLE `tb_producto`
  ADD PRIMARY KEY (`idProducto`),
  ADD KEY `idCategoria` (`idCategoria`);

--
-- Indices de la tabla `tb_usuario`
--
ALTER TABLE `tb_usuario`
  ADD PRIMARY KEY (`idUsuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tb_cabecera_venta`
--
ALTER TABLE `tb_cabecera_venta`
  MODIFY `idCabeceraVenta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- AUTO_INCREMENT de la tabla `tb_categoria`
--
ALTER TABLE `tb_categoria`
  MODIFY `idCategoria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `tb_cliente`
--
ALTER TABLE `tb_cliente`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `tb_detalle_venta`
--
ALTER TABLE `tb_detalle_venta`
  MODIFY `idDetalleVenta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT de la tabla `tb_producto`
--
ALTER TABLE `tb_producto`
  MODIFY `idProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT de la tabla `tb_usuario`
--
ALTER TABLE `tb_usuario`
  MODIFY `idUsuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `tb_producto`
--
ALTER TABLE `tb_producto`
  ADD CONSTRAINT `tb_producto_ibfk_1` FOREIGN KEY (`idCategoria`) REFERENCES `tb_categoria` (`idCategoria`),
  ADD CONSTRAINT `tb_producto_ibfk_2` FOREIGN KEY (`idCategoria`) REFERENCES `tb_categoria` (`idCategoria`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
