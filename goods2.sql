-- MySQL dump 10.13  Distrib 5.7.20, for Linux (x86_64)
--
-- Host: localhost    Database: goods
-- ------------------------------------------------------
-- Server version	5.7.20-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
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
INSERT INTO `Manager` VALUES ('15589522081','123','baoliangaaa'),('15589522085','123','zhubaoliang'),('15589522089','123','110');
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
INSERT INTO `application` VALUES ('2','baoliangzhu','15589522081','goods','d','d','d1','2','路灯45',2562.0000000000,1),('20180171101516158032510','22','2','qqqqqqqqqqqqq','山东省潍坊市寒亭区朱里街道后楼村','山东省潍坊市青州市王府街道将军路','d2','1','路灯45',13.0000000000,1),('201801714221516170139531','zhubaoliangdc1','15551251515151','dfdsaf','fdfdsa','fsfa',' ','1',' ',15.0000000000,1),('201801714301516170657023','zhubaoliangdc1','15551251515151','dfdsaf','fdfdsa','fsfa',' ','1',' ',15.3540000000,1),('201802222121516630372229','jakeliang','15589522089','aaa','山东省青岛市平度市明村镇后楼村','山东省潍坊市安丘市兴安街道长安路62号',' ','1',' ',15.0000000000,1),('20180222241516629887374','jakeliang','15589522089','aaa','山东省淄博市桓台县果里镇果里镇幼儿园','山东省潍坊市高密市大牟家镇胶莱河桥',' ','1',' ',12.6000000000,1),('3','22','2','f','d','f','d2','3','就离开11',2562.0000000000,1),('a','22','15589522083','dsfdd','山东省潍坊市寿光市孙家集街道岳寺李村','山东省青岛市胶州市胶北街道大杨路','d2','1','路灯45',1251.0000000000,1),('aa','22','15589522081','df','f','f','d2','1','就离开11',2562.0000000000,1),('aasf','22','15589522083','dsf','d','fd','d2','1','路灯45',1251.0000000000,1),('afds','22','15589522083','dsf','d','fd','d2','1','路灯45',1251.0000000000,1),('agf','22','15589522083','dsf','d','fd','d2','1','路灯45',1251.0000000000,1),('anfdf','22','15589522083','dsf','d','fd','d2','1','路灯45',1251.0000000000,1),('as','22','15589522083','dsf','d','fd','d2','1','路灯45',1251.0000000000,1),('awa','22','15589522083','dsf','d','fd','d2','1','路灯45',1251.0000000000,1),('d','baoliangzhu','2','fd','fd','fd','d2','1','路灯45',1251.0000000000,1),('dadfsdg','22','15589522083','dsf','shishsihsihsishishsihsihshsi','fd','d2','2','路灯45',1251.0000000000,1),('dasfdv','22','15589522083','dsf','d','fd','d2','1','路灯45',1251.0000000000,1),('dasfdvfds','22','15589522083','dsf','d','fd','d2','2','路灯45',1251.0000000000,1),('dffbbgb','22','15589522083','dsf','d','fd','d2','2','路灯45',1251.0000000000,1),('fdsf','22','15589522083','dsf','d','fd','d2','2','路灯45',1251.0000000000,1),('ghgf','22','15589522083','dsf','d','fd','d2','2','路灯45',1251.0000000000,1),('qefr','22','15589522083','dsf','d','fd','d2','2','路灯45',1251.0000000000,1),('qqwe','22','15589522083','dsf','d','fd','d2','2','路灯45',1251.0000000000,1),('rrr','22','15589522083','dsf','d','fd','d2','2','路灯45',1251.0000000000,1),('sdvfs','22','15589522083','dsf','d','fd','d2','2','路灯45',1251.0000000000,1),('sf','22','15589522083','dsf','d','fd','d2','1','路灯45',1251.0000000000,1),('sss','22','15589522083','dsf','d','fd','d2','2','路灯45',1251.0000000000,1),('ty','fdssfd','255','fdsafa','fdaf','552','aaaaaaaaaaaaaaa','2','路灯',12.5000000000,1);
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
INSERT INTO `boss` VALUES ('1','1','a'),('15589522081','123','baoliangzhu'),('15589522083','123','22'),('15589522089','123','jakeliang'),('2','2','b');
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
INSERT INTO `drivers` VALUES ('d1','朱宝亮','1','2','路556',223,'1','1'),('d2','朱亮宝','123','132','路灯45',15,'3','31'),('d3','ufdsn','455','15','就离开11',1251,'2','51'),('d4','sum','151','51','等等515',2562,'3','66');
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

-- Dump completed on 2018-01-22 22:40:08
