-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssm4xo2n
-- ------------------------------------------------------
-- Server version	5.7.31

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
-- Current Database: `ssm4xo2n`
--

/*!40000 DROP DATABASE IF EXISTS `ssm4xo2n`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `ssm4xo2n` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `ssm4xo2n`;

--
-- Table structure for table `bumen`
--

DROP TABLE IF EXISTS `bumen`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bumen` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bumen` varchar(200) NOT NULL COMMENT '部门',
  PRIMARY KEY (`id`),
  UNIQUE KEY `bumen` (`bumen`)
) ENGINE=InnoDB AUTO_INCREMENT=1680956579543 DEFAULT CHARSET=utf8 COMMENT='部门';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bumen`
--

LOCK TABLES `bumen` WRITE;
/*!40000 ALTER TABLE `bumen` DISABLE KEYS */;
INSERT INTO `bumen` VALUES (21,'2023-04-08 12:11:47','部门1'),(22,'2023-04-08 12:11:47','部门2'),(23,'2023-04-08 12:11:47','部门3'),(24,'2023-04-08 12:11:47','部门4'),(25,'2023-04-08 12:11:47','部门5'),(26,'2023-04-08 12:11:47','部门6'),(27,'2023-04-08 12:11:47','部门7'),(28,'2023-04-08 12:11:47','部门8'),(1680956579542,'2023-04-08 12:22:58','生产部');
/*!40000 ALTER TABLE `bumen` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg'),(2,'picture2','upload/picture2.jpg'),(3,'picture3','upload/picture3.jpg'),(7,'APIKey','ihML0NfEM0jokUAuBD9tbYtW'),(8,'SecretKey','WK2bRUFf2uNe3oEoQXULpi8Y37aCvFdD');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gongzuohuibao`
--

DROP TABLE IF EXISTS `gongzuohuibao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gongzuohuibao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `renwumingcheng` varchar(200) NOT NULL COMMENT '任务名称',
  `yuangonggonghao` varchar(200) DEFAULT NULL COMMENT '员工工号',
  `yuangongxingming` varchar(200) DEFAULT NULL COMMENT '员工姓名',
  `bumen` varchar(200) DEFAULT NULL COMMENT '部门',
  `tijiaoshijian` date DEFAULT NULL COMMENT '提交时间',
  `xiangguanfujian` longtext COMMENT '相关附件',
  `jindu` varchar(200) DEFAULT NULL COMMENT '进度',
  `beizhu` longtext COMMENT '备注',
  `sfsh` varchar(200) DEFAULT '待审核' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1680956861362 DEFAULT CHARSET=utf8 COMMENT='工作汇报';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gongzuohuibao`
--

LOCK TABLES `gongzuohuibao` WRITE;
/*!40000 ALTER TABLE `gongzuohuibao` DISABLE KEYS */;
INSERT INTO `gongzuohuibao` VALUES (91,'2023-04-08 12:11:47','任务名称1','员工工号1','员工姓名1','部门1','2023-04-08','','0%','备注1','是',''),(92,'2023-04-08 12:11:47','任务名称2','员工工号2','员工姓名2','部门2','2023-04-08','','0%','备注2','是',''),(93,'2023-04-08 12:11:47','任务名称3','员工工号3','员工姓名3','部门3','2023-04-08','','0%','备注3','是',''),(94,'2023-04-08 12:11:47','任务名称4','员工工号4','员工姓名4','部门4','2023-04-08','','0%','备注4','是',''),(95,'2023-04-08 12:11:47','任务名称5','员工工号5','员工姓名5','部门5','2023-04-08','','0%','备注5','是',''),(96,'2023-04-08 12:11:47','任务名称6','员工工号6','员工姓名6','部门6','2023-04-08','','0%','备注6','是',''),(97,'2023-04-08 12:11:47','任务名称7','员工工号7','员工姓名7','部门7','2023-04-08','','0%','备注7','是',''),(98,'2023-04-08 12:11:47','任务名称8','员工工号8','员工姓名8','部门8','2023-04-08','','0%','备注8','是',''),(1680956861361,'2023-04-08 12:27:41','生产任务','111','李凯','生产部','2023-04-08','upload/1680956858434.doc','40%','22','是','111');
/*!40000 ALTER TABLE `gongzuohuibao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gongzuorenwu`
--

DROP TABLE IF EXISTS `gongzuorenwu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gongzuorenwu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `renwumingcheng` varchar(200) NOT NULL COMMENT '任务名称',
  `yuangonggonghao` varchar(200) DEFAULT NULL COMMENT '员工工号',
  `yuangongxingming` varchar(200) DEFAULT NULL COMMENT '员工姓名',
  `bumen` varchar(200) DEFAULT NULL COMMENT '部门',
  `faburiqi` date DEFAULT NULL COMMENT '发布日期',
  `renwufujian` longtext COMMENT '任务附件',
  `renwuneirong` longtext COMMENT '任务内容',
  `renwuyaoqiu` longtext COMMENT '任务要求',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1680956689394 DEFAULT CHARSET=utf8 COMMENT='工作任务';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gongzuorenwu`
--

LOCK TABLES `gongzuorenwu` WRITE;
/*!40000 ALTER TABLE `gongzuorenwu` DISABLE KEYS */;
INSERT INTO `gongzuorenwu` VALUES (81,'2023-04-08 12:11:47','任务名称1','员工工号1','员工姓名1','部门1','2023-04-08','','任务内容1','任务要求1'),(82,'2023-04-08 12:11:47','任务名称2','员工工号2','员工姓名2','部门2','2023-04-08','','任务内容2','任务要求2'),(83,'2023-04-08 12:11:47','任务名称3','员工工号3','员工姓名3','部门3','2023-04-08','','任务内容3','任务要求3'),(84,'2023-04-08 12:11:47','任务名称4','员工工号4','员工姓名4','部门4','2023-04-08','','任务内容4','任务要求4'),(85,'2023-04-08 12:11:47','任务名称5','员工工号5','员工姓名5','部门5','2023-04-08','','任务内容5','任务要求5'),(86,'2023-04-08 12:11:47','任务名称6','员工工号6','员工姓名6','部门6','2023-04-08','','任务内容6','任务要求6'),(87,'2023-04-08 12:11:47','任务名称7','员工工号7','员工姓名7','部门7','2023-04-08','','任务内容7','任务要求7'),(88,'2023-04-08 12:11:47','任务名称8','员工工号8','员工姓名8','部门8','2023-04-08','','任务内容8','任务要求8'),(1680956689393,'2023-04-08 12:24:48','生产任务','111','李凯','生产部','2023-04-08','upload/1680956684678.doc','基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现','<p>基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现</p>');
/*!40000 ALTER TABLE `gongzuorenwu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kehuxinxi`
--

DROP TABLE IF EXISTS `kehuxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kehuxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `kehuxingming` varchar(200) DEFAULT NULL COMMENT '客户姓名',
  `dizhi` varchar(200) DEFAULT NULL COMMENT '地址',
  `dianhua` varchar(200) DEFAULT NULL COMMENT '电话',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `zhuyingyewu` varchar(200) DEFAULT NULL COMMENT '主营业务',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1680956706617 DEFAULT CHARSET=utf8 COMMENT='客户信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kehuxinxi`
--

LOCK TABLES `kehuxinxi` WRITE;
/*!40000 ALTER TABLE `kehuxinxi` DISABLE KEYS */;
INSERT INTO `kehuxinxi` VALUES (101,'2023-04-08 12:11:47','客户姓名1','地址1','电话1','773890001@qq.com','主营业务1'),(102,'2023-04-08 12:11:47','客户姓名2','地址2','电话2','773890002@qq.com','主营业务2'),(103,'2023-04-08 12:11:47','客户姓名3','地址3','电话3','773890003@qq.com','主营业务3'),(104,'2023-04-08 12:11:47','客户姓名4','地址4','电话4','773890004@qq.com','主营业务4'),(105,'2023-04-08 12:11:47','客户姓名5','地址5','电话5','773890005@qq.com','主营业务5'),(106,'2023-04-08 12:11:47','客户姓名6','地址6','电话6','773890006@qq.com','主营业务6'),(107,'2023-04-08 12:11:47','客户姓名7','地址7','电话7','773890007@qq.com','主营业务7'),(108,'2023-04-08 12:11:47','客户姓名8','地址8','电话8','773890008@qq.com','主营业务8'),(1680956706616,'2023-04-08 12:25:06','美达','深圳','13612512512','5656@qq.com','11');
/*!40000 ALTER TABLE `kehuxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `qiyejingfei`
--

DROP TABLE IF EXISTS `qiyejingfei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `qiyejingfei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `pingdanhao` varchar(200) DEFAULT NULL COMMENT '凭单号',
  `xiangmubianhao` varchar(200) DEFAULT NULL COMMENT '项目编号',
  `xiangmumingcheng` varchar(200) DEFAULT NULL COMMENT '项目名称',
  `bumen` varchar(200) DEFAULT NULL COMMENT '部门',
  `daozhangshijian` date DEFAULT NULL COMMENT '到账时间',
  `daozhangjingfei` float DEFAULT NULL COMMENT '到账经费',
  `caozuoren` varchar(200) DEFAULT NULL COMMENT '操作人',
  `bokuandanwei` varchar(200) DEFAULT NULL COMMENT '拨款单位',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1680956765957 DEFAULT CHARSET=utf8 COMMENT='企业经费';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qiyejingfei`
--

LOCK TABLES `qiyejingfei` WRITE;
/*!40000 ALTER TABLE `qiyejingfei` DISABLE KEYS */;
INSERT INTO `qiyejingfei` VALUES (121,'2023-04-08 12:11:47','凭单号1','项目编号1','项目名称1','部门1','2023-04-08',1,'操作人1','拨款单位1'),(122,'2023-04-08 12:11:47','凭单号2','项目编号2','项目名称2','部门2','2023-04-08',2,'操作人2','拨款单位2'),(123,'2023-04-08 12:11:47','凭单号3','项目编号3','项目名称3','部门3','2023-04-08',3,'操作人3','拨款单位3'),(124,'2023-04-08 12:11:47','凭单号4','项目编号4','项目名称4','部门4','2023-04-08',4,'操作人4','拨款单位4'),(125,'2023-04-08 12:11:47','凭单号5','项目编号5','项目名称5','部门5','2023-04-08',5,'操作人5','拨款单位5'),(126,'2023-04-08 12:11:47','凭单号6','项目编号6','项目名称6','部门6','2023-05-08',61,'操作人6','拨款单位6'),(127,'2023-04-08 12:11:47','凭单号7','项目编号7','项目名称7','部门7','2023-04-08',7,'操作人7','拨款单位7'),(128,'2023-04-08 12:11:47','凭单号8','项目编号8','项目名称8','部门8','2023-04-08',8,'操作人8','拨款单位8'),(1680956765956,'2023-04-08 12:26:05','12121','11','生产','生产部','2023-03-01',2000,'11','11');
/*!40000 ALTER TABLE `qiyejingfei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `qiyewenjian`
--

DROP TABLE IF EXISTS `qiyewenjian`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `qiyewenjian` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `wenjianfenlei` varchar(200) DEFAULT NULL COMMENT '文件分类',
  `fengmian` longtext COMMENT '封面',
  `xiangguanbumen` varchar(200) DEFAULT NULL COMMENT '相关部门',
  `wenjian` longtext COMMENT '文件',
  `gengxinshijian` datetime DEFAULT NULL COMMENT '更新时间',
  `wenjianjianjie` longtext COMMENT '文件简介',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1680956659981 DEFAULT CHARSET=utf8 COMMENT='企业文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qiyewenjian`
--

LOCK TABLES `qiyewenjian` WRITE;
/*!40000 ALTER TABLE `qiyewenjian` DISABLE KEYS */;
INSERT INTO `qiyewenjian` VALUES (71,'2023-04-08 12:11:47','标题1','文件分类1','upload/qiyewenjian_fengmian1.jpg,upload/qiyewenjian_fengmian2.jpg,upload/qiyewenjian_fengmian3.jpg','相关部门1','','2023-04-08 20:11:47','文件简介1'),(72,'2023-04-08 12:11:47','标题2','文件分类2','upload/qiyewenjian_fengmian2.jpg,upload/qiyewenjian_fengmian3.jpg,upload/qiyewenjian_fengmian4.jpg','相关部门2','','2023-04-08 20:11:47','文件简介2'),(73,'2023-04-08 12:11:47','标题3','文件分类3','upload/qiyewenjian_fengmian3.jpg,upload/qiyewenjian_fengmian4.jpg,upload/qiyewenjian_fengmian5.jpg','相关部门3','','2023-04-08 20:11:47','文件简介3'),(74,'2023-04-08 12:11:47','标题4','文件分类4','upload/qiyewenjian_fengmian4.jpg,upload/qiyewenjian_fengmian5.jpg,upload/qiyewenjian_fengmian6.jpg','相关部门4','','2023-04-08 20:11:47','文件简介4'),(75,'2023-04-08 12:11:47','标题5','文件分类5','upload/qiyewenjian_fengmian5.jpg,upload/qiyewenjian_fengmian6.jpg,upload/qiyewenjian_fengmian7.jpg','相关部门5','','2023-04-08 20:11:47','文件简介5'),(76,'2023-04-08 12:11:47','标题6','文件分类6','upload/qiyewenjian_fengmian6.jpg,upload/qiyewenjian_fengmian7.jpg,upload/qiyewenjian_fengmian8.jpg','相关部门6','','2023-04-08 20:11:47','文件简介6'),(77,'2023-04-08 12:11:47','标题7','文件分类7','upload/qiyewenjian_fengmian7.jpg,upload/qiyewenjian_fengmian8.jpg,upload/qiyewenjian_fengmian9.jpg','相关部门7','','2023-04-08 20:11:47','文件简介7'),(78,'2023-04-08 12:11:47','标题8','文件分类8','upload/qiyewenjian_fengmian8.jpg,upload/qiyewenjian_fengmian9.jpg,upload/qiyewenjian_fengmian10.jpg','相关部门8','','2023-04-08 20:11:47','文件简介8'),(1680956659980,'2023-04-08 12:24:19','生产部技术','11','upload/1680956643626.jpg','生产部','upload/1680956650962.doc','2023-04-08 20:23:49','<p>基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现</p>');
/*!40000 ALTER TABLE `qiyewenjian` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `qiyexiangmu`
--

DROP TABLE IF EXISTS `qiyexiangmu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `qiyexiangmu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xiangmubianhao` varchar(200) DEFAULT NULL COMMENT '项目编号',
  `xiangmumingcheng` varchar(200) DEFAULT NULL COMMENT '项目名称',
  `xiangmujibie` varchar(200) DEFAULT NULL COMMENT '项目级别',
  `xiangmufenlei` varchar(200) DEFAULT NULL COMMENT '项目分类',
  `xiangmuzilei` varchar(200) DEFAULT NULL COMMENT '项目子类',
  `fuzebumen` varchar(200) DEFAULT NULL COMMENT '负责部门',
  `lixiangshijian` date DEFAULT NULL COMMENT '立项时间',
  `jiexiangshijian` date DEFAULT NULL COMMENT '结项时间',
  `pizhunhao` varchar(200) DEFAULT NULL COMMENT '批准号',
  `xiangguanfujian` longtext COMMENT '相关附件',
  `xiangmujingfei` float DEFAULT NULL COMMENT '项目经费',
  `canyurenyuan` longtext COMMENT '参与人员',
  `xiangmuneirong` longtext COMMENT '项目内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1680956739208 DEFAULT CHARSET=utf8 COMMENT='企业项目';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qiyexiangmu`
--

LOCK TABLES `qiyexiangmu` WRITE;
/*!40000 ALTER TABLE `qiyexiangmu` DISABLE KEYS */;
INSERT INTO `qiyexiangmu` VALUES (111,'2023-04-08 12:11:47','项目编号1','项目名称1','项目级别1','项目分类1','项目子类1','负责部门1','2023-04-08','2023-04-08','批准号1','',1,'参与人员1','项目内容1'),(112,'2023-04-08 12:11:47','项目编号2','项目名称2','项目级别2','项目分类2','项目子类2','负责部门2','2023-04-08','2023-04-08','批准号2','',2,'参与人员2','项目内容2'),(113,'2023-04-08 12:11:47','项目编号3','项目名称3','项目级别3','项目分类3','项目子类3','负责部门3','2023-04-08','2023-04-08','批准号3','',3,'参与人员3','项目内容3'),(114,'2023-04-08 12:11:47','项目编号4','项目名称4','项目级别4','项目分类4','项目子类4','负责部门4','2023-04-08','2023-04-08','批准号4','',4,'参与人员4','项目内容4'),(115,'2023-04-08 12:11:47','项目编号5','项目名称5','项目级别5','项目分类5','项目子类5','负责部门5','2023-04-08','2023-04-08','批准号5','',5,'参与人员5','项目内容5'),(116,'2023-04-08 12:11:47','项目编号6','项目名称6','项目级别6','项目分类6','项目子类6','负责部门6','2023-04-08','2023-04-08','批准号6','',6,'参与人员6','项目内容6'),(117,'2023-04-08 12:11:47','项目编号7','项目名称7','项目级别7','项目分类7','项目子类7','负责部门7','2023-04-08','2023-04-08','批准号7','',7,'参与人员7','项目内容7'),(118,'2023-04-08 12:11:47','项目编号8','项目名称8','项目级别8','项目分类8','项目子类8','负责部门8','2023-04-08','2023-04-08','批准号8','',8,'参与人员8','项目内容8'),(1680956739207,'2023-04-08 12:25:39','2121','基于人脸认证的企业办公系统设计与实现','11','22','33','生产部','2023-03-27','2023-04-15','222','upload/1680956727325.doc',2222,'<p>基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现</p>','<p>基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现</p>');
/*!40000 ALTER TABLE `qiyexiangmu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1,'admin','users','管理员','xp97p69bs9i0smtw1bgpbb1reed4f5sg','2023-04-08 12:22:42','2023-04-08 13:28:11'),(2,1680956595819,'111','yuangong','员工','6rdbeiqp830abyo1unwbjrw96s14eiyi','2023-04-08 12:27:00','2023-04-08 13:28:39'),(3,38,'员工工号8','yuangong','员工','lj7hivc5nv1mz9mk4ghjshvebuqphrs2','2023-04-08 12:27:57','2023-04-08 13:27:58');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tongzhigonggao`
--

DROP TABLE IF EXISTS `tongzhigonggao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tongzhigonggao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gonggaobiaoti` varchar(200) DEFAULT NULL COMMENT '公告标题',
  `faburen` varchar(200) DEFAULT NULL COMMENT '发布人',
  `fabushijian` datetime DEFAULT NULL COMMENT '发布时间',
  `gonggaoneirong` longtext COMMENT '公告内容',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1680956803160 DEFAULT CHARSET=utf8 COMMENT='通知公告';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tongzhigonggao`
--

LOCK TABLES `tongzhigonggao` WRITE;
/*!40000 ALTER TABLE `tongzhigonggao` DISABLE KEYS */;
INSERT INTO `tongzhigonggao` VALUES (131,'2023-04-08 12:11:47','公告标题1','发布人1','2023-04-08 20:11:47','公告内容1','2023-04-08 20:11:47'),(132,'2023-04-08 12:11:47','公告标题2','发布人2','2023-04-08 20:11:47','公告内容2','2023-04-08 20:11:47'),(133,'2023-04-08 12:11:47','公告标题3','发布人3','2023-04-08 20:11:47','公告内容3','2023-04-08 20:11:47'),(134,'2023-04-08 12:11:47','公告标题4','发布人4','2023-04-08 20:11:47','公告内容4','2023-04-08 20:11:47'),(135,'2023-04-08 12:11:47','公告标题5','发布人5','2023-04-08 20:11:47','公告内容5','2023-04-08 20:11:47'),(136,'2023-04-08 12:11:47','公告标题6','发布人6','2023-04-08 20:11:47','公告内容6','2023-04-08 20:11:47'),(137,'2023-04-08 12:11:47','公告标题7','发布人7','2023-04-08 20:11:47','公告内容7','2023-04-08 20:11:47'),(138,'2023-04-08 12:11:47','公告标题8','发布人8','2023-04-08 20:11:47','公告内容8','2023-04-08 20:11:47'),(1680956803159,'2023-04-08 12:26:43','基于人脸认证的企业办公系统设计与实现','李月','2023-04-08 20:26:36','<p>基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现基于人脸认证的企业办公系统设计与实现</p>','2023-04-08 20:27:47');
/*!40000 ALTER TABLE `tongzhigonggao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'admin','admin','管理员','2023-04-08 12:11:47');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wenjianfenlei`
--

DROP TABLE IF EXISTS `wenjianfenlei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wenjianfenlei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `wenjianfenlei` varchar(200) NOT NULL COMMENT '文件分类',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1680956625533 DEFAULT CHARSET=utf8 COMMENT='文件分类';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wenjianfenlei`
--

LOCK TABLES `wenjianfenlei` WRITE;
/*!40000 ALTER TABLE `wenjianfenlei` DISABLE KEYS */;
INSERT INTO `wenjianfenlei` VALUES (61,'2023-04-08 12:11:47','文件分类1'),(62,'2023-04-08 12:11:47','文件分类2'),(63,'2023-04-08 12:11:47','文件分类3'),(64,'2023-04-08 12:11:47','文件分类4'),(65,'2023-04-08 12:11:47','文件分类5'),(66,'2023-04-08 12:11:47','文件分类6'),(67,'2023-04-08 12:11:47','文件分类7'),(68,'2023-04-08 12:11:47','文件分类8'),(1680956625532,'2023-04-08 12:23:45','11');
/*!40000 ALTER TABLE `wenjianfenlei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xinxixiang`
--

DROP TABLE IF EXISTS `xinxixiang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xinxixiang` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuangonggonghao` varchar(200) DEFAULT NULL COMMENT '接送账号',
  `yuangongxingming` varchar(200) DEFAULT NULL COMMENT '接送人',
  `fasongzhanghao` varchar(200) DEFAULT NULL COMMENT '发送账号',
  `fasongren` varchar(200) DEFAULT NULL COMMENT '发送人',
  `liaotianshijian` datetime DEFAULT NULL COMMENT '聊天时间',
  `liaotianneirong` longtext COMMENT '聊天内容',
  `shhf` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1680956828848 DEFAULT CHARSET=utf8 COMMENT='信息箱';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xinxixiang`
--

LOCK TABLES `xinxixiang` WRITE;
/*!40000 ALTER TABLE `xinxixiang` DISABLE KEYS */;
INSERT INTO `xinxixiang` VALUES (51,'2023-04-08 12:11:47','接送账号1','接送人1','发送账号1','发送人1','2023-04-08 20:11:47','聊天内容1',''),(52,'2023-04-08 12:11:47','接送账号2','接送人2','发送账号2','发送人2','2023-04-08 20:11:47','聊天内容2',''),(53,'2023-04-08 12:11:47','接送账号3','接送人3','发送账号3','发送人3','2023-04-08 20:11:47','聊天内容3',''),(54,'2023-04-08 12:11:47','接送账号4','接送人4','发送账号4','发送人4','2023-04-08 20:11:47','聊天内容4',''),(55,'2023-04-08 12:11:47','接送账号5','接送人5','发送账号5','发送人5','2023-04-08 20:11:47','聊天内容5',''),(56,'2023-04-08 12:11:47','接送账号6','接送人6','发送账号6','发送人6','2023-04-08 20:11:47','聊天内容6',''),(57,'2023-04-08 12:11:47','接送账号7','接送人7','发送账号7','发送人7','2023-04-08 20:11:47','聊天内容7',''),(58,'2023-04-08 12:11:47','接送账号8','接送人8','发送账号8','发送人8','2023-04-08 20:11:47','聊天内容8',''),(1680956828847,'2023-04-08 12:27:08','员工工号8','员工姓名8','111','李凯','2023-04-08 20:27:07','11','11221');
/*!40000 ALTER TABLE `xinxixiang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yuangong`
--

DROP TABLE IF EXISTS `yuangong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yuangong` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuangonggonghao` varchar(200) DEFAULT NULL COMMENT '员工工号',
  `yuangongxingming` varchar(200) DEFAULT NULL COMMENT '员工姓名',
  `mima` varchar(200) DEFAULT NULL COMMENT '密码',
  `bumen` varchar(200) DEFAULT NULL COMMENT '部门',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `zhicheng` varchar(200) DEFAULT NULL COMMENT '职称',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `jiatingzhuzhi` varchar(200) DEFAULT NULL COMMENT '家庭住址',
  `touxiang` longtext COMMENT '头像',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yuangonggonghao` (`yuangonggonghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1680956595820 DEFAULT CHARSET=utf8 COMMENT='员工';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yuangong`
--

LOCK TABLES `yuangong` WRITE;
/*!40000 ALTER TABLE `yuangong` DISABLE KEYS */;
INSERT INTO `yuangong` VALUES (31,'2023-04-08 12:11:47','员工工号1','员工姓名1','123456','部门1','男','职称1','13823888881','家庭住址1','upload/yuangong_touxiang1.jpg'),(32,'2023-04-08 12:11:47','员工工号2','员工姓名2','123456','部门2','男','职称2','13823888882','家庭住址2','upload/yuangong_touxiang2.jpg'),(33,'2023-04-08 12:11:47','员工工号3','员工姓名3','123456','部门3','男','职称3','13823888883','家庭住址3','upload/yuangong_touxiang3.jpg'),(34,'2023-04-08 12:11:47','员工工号4','员工姓名4','123456','部门4','男','职称4','13823888884','家庭住址4','upload/yuangong_touxiang4.jpg'),(35,'2023-04-08 12:11:47','员工工号5','员工姓名5','123456','部门5','男','职称5','13823888885','家庭住址5','upload/yuangong_touxiang5.jpg'),(36,'2023-04-08 12:11:47','员工工号6','员工姓名6','123456','部门6','男','职称6','13823888886','家庭住址6','upload/yuangong_touxiang6.jpg'),(37,'2023-04-08 12:11:47','员工工号7','员工姓名7','123456','部门7','男','职称7','13823888887','家庭住址7','upload/yuangong_touxiang7.jpg'),(38,'2023-04-08 12:11:47','员工工号8','员工姓名8','123456','部门8','男','职称8','13823888888','家庭住址8','upload/yuangong_touxiang8.jpg'),(1680956595819,'2023-04-08 12:23:15','111','李凯','111','生产部','男','主任','13612512512','11','upload/1680956616757.jpg');
/*!40000 ALTER TABLE `yuangong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yuangongqingjia`
--

DROP TABLE IF EXISTS `yuangongqingjia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yuangongqingjia` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `qingjiabianhao` varchar(200) DEFAULT NULL COMMENT '请假编号',
  `yuangonggonghao` varchar(200) DEFAULT NULL COMMENT '员工工号',
  `yuangongxingming` varchar(200) DEFAULT NULL COMMENT '员工姓名',
  `bumen` varchar(200) DEFAULT NULL COMMENT '部门',
  `qingjiatianshu` int(11) DEFAULT NULL COMMENT '请假天数',
  `qingjialiyou` longtext COMMENT '请假理由',
  `shenqingshijian` datetime DEFAULT NULL COMMENT '申请时间',
  `sfsh` varchar(200) DEFAULT '待审核' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`),
  UNIQUE KEY `qingjiabianhao` (`qingjiabianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=1680956839810 DEFAULT CHARSET=utf8 COMMENT='员工请假';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yuangongqingjia`
--

LOCK TABLES `yuangongqingjia` WRITE;
/*!40000 ALTER TABLE `yuangongqingjia` DISABLE KEYS */;
INSERT INTO `yuangongqingjia` VALUES (41,'2023-04-08 12:11:47','1111111111','员工工号1','员工姓名1','部门1',1,'请假理由1','2023-04-08 20:11:47','是',''),(42,'2023-04-08 12:11:47','2222222222','员工工号2','员工姓名2','部门2',2,'请假理由2','2023-04-08 20:11:47','是',''),(43,'2023-04-08 12:11:47','3333333333','员工工号3','员工姓名3','部门3',3,'请假理由3','2023-04-08 20:11:47','是',''),(44,'2023-04-08 12:11:47','4444444444','员工工号4','员工姓名4','部门4',4,'请假理由4','2023-04-08 20:11:47','是',''),(45,'2023-04-08 12:11:47','5555555555','员工工号5','员工姓名5','部门5',5,'请假理由5','2023-04-08 20:11:47','是',''),(46,'2023-04-08 12:11:47','6666666666','员工工号6','员工姓名6','部门6',6,'请假理由6','2023-04-08 20:11:47','是',''),(47,'2023-04-08 12:11:47','7777777777','员工工号7','员工姓名7','部门7',7,'请假理由7','2023-04-08 20:11:47','是',''),(48,'2023-04-08 12:11:47','8888888888','员工工号8','员工姓名8','部门8',8,'请假理由8','2023-04-08 20:11:47','是',''),(1680956839809,'2023-04-08 12:27:19','1680956836108','111','李凯','生产部',5,'<p>11</p>','2023-04-08 20:27:16','是','11');
/*!40000 ALTER TABLE `yuangongqingjia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhicheng`
--

DROP TABLE IF EXISTS `zhicheng`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhicheng` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhicheng` varchar(200) NOT NULL COMMENT '职称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1680956569644 DEFAULT CHARSET=utf8 COMMENT='职称';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhicheng`
--

LOCK TABLES `zhicheng` WRITE;
/*!40000 ALTER TABLE `zhicheng` DISABLE KEYS */;
INSERT INTO `zhicheng` VALUES (11,'2023-04-08 12:11:47','职称1'),(12,'2023-04-08 12:11:47','职称2'),(13,'2023-04-08 12:11:47','职称3'),(14,'2023-04-08 12:11:47','职称4'),(15,'2023-04-08 12:11:47','职称5'),(16,'2023-04-08 12:11:47','职称6'),(17,'2023-04-08 12:11:47','职称7'),(18,'2023-04-08 12:11:47','职称8'),(1680956569643,'2023-04-08 12:22:49','主任');
/*!40000 ALTER TABLE `zhicheng` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-13 23:03:34
