CREATE DATABASE `clinica` /*!40100 DEFAULT CHARACTER SET ascii */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE clinica;

CREATE TABLE `usuario` (
  `idusuario` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `edad` int NOT NULL,
  `correo` varchar(100) NOT NULL,
  `fechacreacion` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `fechaactualizar` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`idusuario`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=ascii;

DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `pro_nuevo_usuario`(IN pnombre VARCHAR(50), IN papellido VARCHAR(50), IN pedad INT, IN pcorreo VARCHAR(100))
BEGIN 
DECLARE error INT; 
START TRANSACTION; 
INSERT INTO usuari(nombre, apellido, edad, correo) VALUES(pnombre, papellido, pedad, pcorreo); 
SET error=(SELECT @error); 
IF(error=0)THEN ROLLBACK; 
ELSE COMMIT; 
END IF; 
END$$
DELIMITER ;

DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `pro_actualizar_usuario`()
BEGIN

END$$
DELIMITER ;

DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `pro_eliminar_usuario`()
BEGIN

END$$
DELIMITER ;

DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `pro_ver_usuario`()
BEGIN

END$$
DELIMITER ;