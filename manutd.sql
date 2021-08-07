CREATE DATABASE  IF NOT EXISTS `manutd_directory`;
USE `manutd_directory`;

--
-- Table structure for table `manutd`
--

DROP TABLE IF EXISTS `manutd`;

CREATE TABLE `manutd` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `position` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `manutd`
--

INSERT INTO `manutd` VALUES 
	(1,'Rashford','Marcus','forward'),
	(2,'Fernandes','Bruno','midfilder')
	

