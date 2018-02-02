-- MySQL dump 10.16  Distrib 10.1.26-MariaDB, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: goods
-- ------------------------------------------------------
-- Server version	10.1.26-MariaDB-0+deb9u1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Manager`
--

DROP TABLE IF EXISTS `Manager`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Manager` (
  `phone` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `pass` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`phone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Manager`
--

LOCK TABLES `Manager` WRITE;
/*!40000 ALTER TABLE `Manager` DISABLE KEYS */;
INSERT INTO `Manager` VALUES ('15589522081','123','zhu');
/*!40000 ALTER TABLE `Manager` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `application`
--

DROP TABLE IF EXISTS `application`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `application` (
  `acnum` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `boss` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `phone` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `goods` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `start` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `destination` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `drivernum` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `statue` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `car` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `weight` double(255,10) DEFAULT NULL,
  `lockversion` int(255) DEFAULT '1',
  `lat` varchar(255) COLLATE utf8_unicode_ci NOT NULL DEFAULT ' ',
  `longt` varchar(255) COLLATE utf8_unicode_ci NOT NULL DEFAULT ' ',
  `latdes` varchar(255) COLLATE utf8_unicode_ci NOT NULL DEFAULT ' ',
  `longdes` varchar(255) COLLATE utf8_unicode_ci NOT NULL DEFAULT ' ',
  PRIMARY KEY (`acnum`),
  KEY `bossname` (`boss`),
  KEY `bossphone` (`phone`),
  KEY `drivernum` (`drivernum`),
  KEY `statue` (`statue`),
  KEY `car` (`car`),
  KEY `weight` (`weight`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `application`
--

LOCK TABLES `application` WRITE;
/*!40000 ALTER TABLE `application` DISABLE KEYS */;
INSERT INTO `application` VALUES ('20181123281517498908853','zhubaoliang','1558952081','gold','china','america',' ','1',' ',12.5300000000,1,' ',' ',' ',' '),('20181123291517498999985','baoliangzhu','15589522081','gold','america','china',' ','1',' ',12.5300000000,1,' ',' ',' ',' '),('20181123301517499010199','baoliangzhu','15589522081','gold','america','china',' ','1',' ',12.5300000000,1,' ',' ',' ',' '),('20181123301517499012442','baoliangzhu','15589522081','gold','america','china',' ','1',' ',12.5300000000,1,' ',' ',' ',' '),('20181123301517499014639','baoliangzhu','15589522081','gold','america','china',' ','1',' ',12.5300000000,1,' ',' ',' ',' '),('20181123301517499019116','baoliangzhu','15589522081','gold','america','china','d3','3','就离开11',12.5300000000,1,' ',' ',' ',' '),('20181123301517499024379','baoliangzhu1','15589522081','gold','america','china','d1','2','路556',12.5300000000,1,' ',' ',' ',' '),('20181123301517499029083','baoliangzhu2','15589522081','gold','america','china',' ','1',' ',12.5300000000,1,' ',' ',' ',' '),('20181123301517499031194','baoliangzhu2','15589522081','gold','america','china',' ','1',' ',12.5300000000,1,' ',' ',' ',' '),('20181123301517499035395','baoliangzhu3','15589522081','gold','america','china',' ','1',' ',12.5300000000,1,' ',' ',' ',' '),('20181123301517499048711','baoliangzhu4','15589522081','gold','america','china',' ','1',' ',12.5300000000,1,' ',' ',' ',' '),('20181123301517499050967','baoliangzhu4','15589522081','gold','america','china',' ','1',' ',12.5300000000,1,' ',' ',' ',' '),('20181210431517539433189','liangbaozhu','15589522081','gold','山东省淄博市淄川区太河镇中国农业银行(洪山分理处店)','山东省潍坊市诸城市百尺河镇车家庄村',' ','1',' ',12.3000000000,1,'36.519656','118.129294','36.108011','119.617942');
/*!40000 ALTER TABLE `application` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `boss`
--

DROP TABLE IF EXISTS `boss`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `boss` (
  `bossphone` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `bosspass` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `bossname` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`bossphone`),
  KEY `bossphone` (`bossphone`,`bossname`),
  KEY `bossname` (`bossname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `boss`
--

LOCK TABLES `boss` WRITE;
/*!40000 ALTER TABLE `boss` DISABLE KEYS */;
INSERT INTO `boss` VALUES ('15589522081','123','zhubaoliang');
/*!40000 ALTER TABLE `boss` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `drivers`
--

DROP TABLE IF EXISTS `drivers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `drivers` (
  `drivernums` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `phone` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `pass` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `carnum` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `cargo` double(255,0) DEFAULT NULL,
  `statue` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `sumlength` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`drivernums`),
  KEY `statue` (`statue`),
  KEY `carnum` (`carnum`),
  KEY `cargo` (`cargo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `drivers`
--

LOCK TABLES `drivers` WRITE;
/*!40000 ALTER TABLE `drivers` DISABLE KEYS */;
INSERT INTO `drivers` VALUES ('d1','朱宝亮','1','1','路556',223,'3','1'),('d2','朱亮宝','123','1','路灯45',15,'3','31'),('d3','ufdsn','455','1','就离开11',1251,'3','51'),('d4','sum','151','1','aaaaaaa',2562,'2','66');
/*!40000 ALTER TABLE `drivers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rootManager`
--

DROP TABLE IF EXISTS `rootManager`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rootManager` (
  `rootname` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `rootpass` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`rootname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rootManager`
--

LOCK TABLES `rootManager` WRITE;
/*!40000 ALTER TABLE `rootManager` DISABLE KEYS */;
INSERT INTO `rootManager` VALUES ('root','root');
/*!40000 ALTER TABLE `rootManager` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-02-02 22:58:42
