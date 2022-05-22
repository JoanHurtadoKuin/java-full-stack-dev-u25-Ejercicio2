DROP TABLE IF EXISTS `departamento`;
DROP TABLE IF EXISTS `empleado`;


CREATE TABLE `departamento` (
  `codigo` INT NOT NULL,
  `nombre` VARCHAR(250) DEFAULT NULL,
  `presupuesto` INT DEFAULT NULL,
  PRIMARY KEY (`codigo`)
);

CREATE TABLE `empleado` (
  `dni` VARCHAR(8) NOT NULL,
  `nombre` VARCHAR(250) DEFAULT NULL,
  `apellidos` VARCHAR(250) DEFAULT NULL,
  `codigo_departamento` INT DEFAULT NULL,
  PRIMARY KEY (`dni`),
  CONSTRAINT `empleados_fk` FOREIGN KEY (`codigo_departamento`) 
  REFERENCES `departamento` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE
);


INSERT INTO `departamento` VALUES (14,'IT',65000),(37,'Accounting',15000),(59,'Human Resources',240000),(77,'Research',55000);

INSERT INTO `empleado` VALUES (12323487,'Michael','Rogers',14),(15293448,'Anand','Manikutty',14),(22236488,'Carol','Smith',37),(32658741,'Joe','Stevens',37),(33215471,'Mary-Anne','Foster',14),(33256984,'George','O\''Donnell',77),(54652347,'John','Doe',59),(63123148,'David','Smith',77),(65487321,'Zacary','Efron',59),(74568521,'Eric','Goldsmith',59),(94565723,'Luis','López',14),(83565722,'Elizabeth','Doe',14),(84905724,'Kumar','Swamy',14),(14565726,'Jose','Pérez',77);