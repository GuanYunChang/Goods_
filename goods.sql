/*
 Navicat MySQL Data Transfer

 Source Server         : zhu
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : goods

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 17/01/2018 14:33:53
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for Manager
-- ----------------------------
DROP TABLE IF EXISTS `Manager`;
CREATE TABLE `Manager`  (
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `pass` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`phone`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of Manager
-- ----------------------------
INSERT INTO `Manager` VALUES ('15589522081', '123', 'baoliangaaa');
INSERT INTO `Manager` VALUES ('15589522085', '123', 'zhubaoliang');
INSERT INTO `Manager` VALUES ('15589522089', '123', '110');

-- ----------------------------
-- Table structure for application
-- ----------------------------
DROP TABLE IF EXISTS `application`;
CREATE TABLE `application`  (
  `acnum` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `boss` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `goods` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `start` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `destination` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `drivernum` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `statue` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `car` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `weight` double(255, 10) NULL DEFAULT NULL,
  PRIMARY KEY (`acnum`) USING BTREE,
  INDEX `bossname`(`boss`) USING BTREE,
  INDEX `bossphone`(`phone`) USING BTREE,
  INDEX `drivernum`(`drivernum`) USING BTREE,
  INDEX `statue`(`statue`) USING BTREE,
  INDEX `car`(`car`) USING BTREE,
  INDEX `weight`(`weight`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of application
-- ----------------------------
INSERT INTO `application` VALUES ('2', 'baoliangzhu', '15589522081', 'goods', 'd', 'd', 'd1', '2', '路灯45', 2562.0000000000);
INSERT INTO `application` VALUES ('20180171101516158032510', '22', '2', 'qqqqqqqqqqqqq', 'qqqqqqqqqqqqqqqqqqq', 'qqqqqqqqqqqqqqq', 'd2', '1', '路灯45', 13.0000000000);
INSERT INTO `application` VALUES ('201801714221516170139531', 'zhubaoliangdc1', '15551251515151', 'dfdsaf', 'fdfdsa', 'fsfa', ' ', '1', ' ', 15.0000000000);
INSERT INTO `application` VALUES ('201801714301516170657023', 'zhubaoliangdc1', '15551251515151', 'dfdsaf', 'fdfdsa', 'fsfa', ' ', '1', ' ', 15.3540000000);
INSERT INTO `application` VALUES ('2022', '22', '2', 'fdas', 'fddd', 'dddd', 'd3', '1', '路灯45', 12.0000000000);
INSERT INTO `application` VALUES ('3', '22', '2', 'f', 'd', 'f', 'd2', '3', '就离开11', 2562.0000000000);
INSERT INTO `application` VALUES ('a', '22', '15589522083', 'dsfdd', 'd', 'fd', 'd2', '1', '路灯45', 1251.0000000000);
INSERT INTO `application` VALUES ('aa', '22', '15589522081', 'df', 'f', 'f', 'd2', '1', '就离开11', 2562.0000000000);
INSERT INTO `application` VALUES ('aasf', '22', '15589522083', 'dsf', 'd', 'fd', 'd2', '1', '路灯45', 1251.0000000000);
INSERT INTO `application` VALUES ('afds', '22', '15589522083', 'dsf', 'd', 'fd', 'd2', '1', '路灯45', 1251.0000000000);
INSERT INTO `application` VALUES ('agf', '22', '15589522083', 'dsf', 'd', 'fd', 'd2', '1', '路灯45', 1251.0000000000);
INSERT INTO `application` VALUES ('anfdf', '22', '15589522083', 'dsf', 'd', 'fd', 'd2', '1', '路灯45', 1251.0000000000);
INSERT INTO `application` VALUES ('as', '22', '15589522083', 'dsf', 'd', 'fd', 'd2', '1', '路灯45', 1251.0000000000);
INSERT INTO `application` VALUES ('awa', '22', '15589522083', 'dsf', 'd', 'fd', 'd2', '1', '路灯45', 1251.0000000000);
INSERT INTO `application` VALUES ('d', 'baoliangzhu', '2', 'fd', 'fd', 'fd', 'd2', '1', '路灯45', 1251.0000000000);
INSERT INTO `application` VALUES ('dadfsdg', '22', '15589522083', 'dsf', 'd', 'fd', 'd2', '2', '路灯45', 1251.0000000000);
INSERT INTO `application` VALUES ('dasfdv', '22', '15589522083', 'dsf', 'd', 'fd', 'd2', '1', '路灯45', 1251.0000000000);
INSERT INTO `application` VALUES ('dasfdvfds', '22', '15589522083', 'dsf', 'd', 'fd', 'd2', '2', '路灯45', 1251.0000000000);
INSERT INTO `application` VALUES ('dffbbgb', '22', '15589522083', 'dsf', 'd', 'fd', 'd2', '2', '路灯45', 1251.0000000000);
INSERT INTO `application` VALUES ('fdsf', '22', '15589522083', 'dsf', 'd', 'fd', 'd2', '2', '路灯45', 1251.0000000000);
INSERT INTO `application` VALUES ('ghgf', '22', '15589522083', 'dsf', 'd', 'fd', 'd2', '2', '路灯45', 1251.0000000000);
INSERT INTO `application` VALUES ('qefr', '22', '15589522083', 'dsf', 'd', 'fd', 'd2', '2', '路灯45', 1251.0000000000);
INSERT INTO `application` VALUES ('qqwe', '22', '15589522083', 'dsf', 'd', 'fd', 'd2', '2', '路灯45', 1251.0000000000);
INSERT INTO `application` VALUES ('rrr', '22', '15589522083', 'dsf', 'd', 'fd', 'd2', '2', '路灯45', 1251.0000000000);
INSERT INTO `application` VALUES ('sdvfs', '22', '15589522083', 'dsf', 'd', 'fd', 'd2', '2', '路灯45', 1251.0000000000);
INSERT INTO `application` VALUES ('sf', '22', '15589522083', 'dsf', 'd', 'fd', 'd2', '1', '路灯45', 1251.0000000000);
INSERT INTO `application` VALUES ('sss', '22', '15589522083', 'dsf', 'd', 'fd', 'd2', '2', '路灯45', 1251.0000000000);
INSERT INTO `application` VALUES ('ty', '22', '15589522083', 'dsf', 'd', 'fd', 'd2', '2', '路灯45', 1251.0000000000);

-- ----------------------------
-- Table structure for boss
-- ----------------------------
DROP TABLE IF EXISTS `boss`;
CREATE TABLE `boss`  (
  `bossphone` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `bosspass` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `bossname` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`bossphone`) USING BTREE,
  INDEX `bossphone`(`bossphone`, `bossname`) USING BTREE,
  INDEX `bossname`(`bossname`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of boss
-- ----------------------------
INSERT INTO `boss` VALUES ('1', '1', 'a');
INSERT INTO `boss` VALUES ('15589522081', '123', 'baoliangzhu');
INSERT INTO `boss` VALUES ('15589522083', '123', '22');
INSERT INTO `boss` VALUES ('2', '2', 'b');

-- ----------------------------
-- Table structure for drivers
-- ----------------------------
DROP TABLE IF EXISTS `drivers`;
CREATE TABLE `drivers`  (
  `drivernums` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `pass` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `carnum` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `cargo` double(255, 0) NULL DEFAULT NULL,
  `statue` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `sumlength` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`drivernums`) USING BTREE,
  INDEX `statue`(`statue`) USING BTREE,
  INDEX `carnum`(`carnum`) USING BTREE,
  INDEX `cargo`(`cargo`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of drivers
-- ----------------------------
INSERT INTO `drivers` VALUES ('d1', '朱宝亮', '1', '2', '路556', 223, '1', '1');
INSERT INTO `drivers` VALUES ('d2', '朱亮宝', '123', '132', '路灯45', 15, '1', '31');
INSERT INTO `drivers` VALUES ('d3', 'ufdsn', '455', '15', '就离开11', 1251, '2', '51');
INSERT INTO `drivers` VALUES ('d4', 'sum', '151', '51', '等等515', 2562, '3', '66');

-- ----------------------------
-- Table structure for rootManager
-- ----------------------------
DROP TABLE IF EXISTS `rootManager`;
CREATE TABLE `rootManager`  (
  `rootname` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `rootpass` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`rootname`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of rootManager
-- ----------------------------
INSERT INTO `rootManager` VALUES ('root', 'root');

SET FOREIGN_KEY_CHECKS = 1;
