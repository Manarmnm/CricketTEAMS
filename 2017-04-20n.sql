-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: teamselectiondb
-- ------------------------------------------------------
-- Server version	5.7.17-log

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
-- Table structure for table `allrounder_traindata`
--

DROP TABLE IF EXISTS `allrounder_traindata`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `allrounder_traindata` (
  `idallrounder` int(11) NOT NULL AUTO_INCREMENT,
  `Player_ID` varchar(45) DEFAULT NULL,
  `Player_Name` varchar(45) DEFAULT NULL,
  `Player_Role` varchar(45) DEFAULT NULL,
  `Player_Category` varchar(45) DEFAULT NULL,
  `Match_Type` varchar(45) DEFAULT NULL,
  `Nationality` varchar(45) DEFAULT NULL,
  `Total_Match` varchar(45) DEFAULT NULL,
  `Bat_StrikeRate` varchar(45) DEFAULT NULL,
  `Bat_Average` varchar(45) DEFAULT NULL,
  `Bowl_Economy` varchar(45) DEFAULT NULL,
  `Bowl_Average` varchar(45) DEFAULT NULL,
  `TotWickets` varchar(45) DEFAULT NULL,
  `BatSrate_Weight` varchar(45) DEFAULT NULL,
  `BatAver_Weight` varchar(45) DEFAULT NULL,
  `BowlEcon_Weight` varchar(45) DEFAULT NULL,
  `BowlAver_Weight` varchar(45) DEFAULT NULL,
  `Result` varchar(45) DEFAULT NULL,
  `Error` varchar(45) DEFAULT NULL,
  `Epoc` varchar(45) DEFAULT NULL,
  `Sum` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idallrounder`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `allrounder_traindata`
--

LOCK TABLES `allrounder_traindata` WRITE;
/*!40000 ALTER TABLE `allrounder_traindata` DISABLE KEYS */;
INSERT INTO `allrounder_traindata` VALUES (13,'ALL001','Shakib Al Hasan ','ALL ROUNDER','All Rounder','IPL','Bangladesh','59','130.45','21.61','20.84','6.79','70','0.01678368768054288','0.7117490873384266','0.43619395250748305','0.3166224934628882','1','0.0','99','409.3782492854745'),(14,'ALL002','Glenn Maxwell','ALL ROUNDER','All Rounder','IPL','Australia','44','167.41','29.36','33.82','7.47','17','0.6440735948217896','0.731435671897688','0.7510669835359031','0.8842776302462209','1','0.0','99','409.4884882170098'),(15,'ALL003','Mohammad Nabi ','ALL ROUNDER','All Rounder','IPL','Afghanisthan','54','141.7','19','24.49','7.25','57','0.5259220372698922','0.8942966013839083','0.1938778785276631','0.8204121533326221','1','0.0','99','410.1594236905414'),(16,'ALL004',' Marlon Samuels','ALL ROUNDER','All Rounder','IPL','West Indeis','55','115.57','28.38','27.76','7.64','21','0.14447824322011368','0.14362684179741278','0.6088118677125977','0.5495212273923119','1','0.0','99','406.80410060642953'),(17,'ALL005','Dwayne Bravo','ALL ROUNDER','All Rounder','IPL','West Indeis','66','116.53','24.3','28.27','8.46','52','0.44289853068387136','0.6212142652402366','0.7098020916357889','0.3384043096550934','1','0.0','99','409.91611457849007'),(18,'ALL006','JP Duminy','ALL ROUNDER','All Rounder','IPL','South Africa','71','124.03','38.25','34.7','7.25','17','0.3540268504479024','0.7890983803483569','0.6895550646647934','0.8981446489288024','1','0.0','99','408.19272289537633'),(19,'ALL007','Samiullah Shenwari','ALL ROUNDER','All Rounder','IPL','Ireland','52','117.35','20.46','25.32','6.53','25','0.3685370801920926','0.5150971958515683','0.6380047722784088','0.49428629424534853','1','0.0','99','410.0094801581288'),(20,'ALL008','Samiullah Shenwari','ALL ROUNDER','All Rounder','IPL','Irland','58','136.38','28.02','17.82','7.06','28','0.25970915221663204','0.3765080730097044','0.3601503260136821','0.28051036828520304','1','0.0','99','406.84769533032846'),(21,'ALL009','Mahmudullah','ALL ROUNDER','All Rounder','IPL','Bangladesh','59','114.41','20.23','31.5','7.28','22','0.9610249865065227','0.26029440409240945','0.7480464299721916','0.6940365242001104','1','0.0','99','409.88265872679773'),(22,'ALL010','Peter Borren ','ALL ROUNDER','All Rounder','IPL','Irland','41','122.48','19.75','34.41','6.83','17','0.989761331079357','0.7383390366906298','0.9065537971106976','0.31733118530576776','1','0.0','99','413.22808859826364'),(23,'ALL011','Corey Anderson','ALL ROUNDER','All Rounder','IPL','NewZealand','29','137.58','21.06','35.36','8.25','14','0.09660129457996852','0.8149705429043902','0.03557022384951898','0.5030446197198811','1','0.0','99','408.15000246174515'),(24,'ALL012','Suresh Raina','ALL ROUNDER','All Rounder','IPL','India','65','132.96','29.07','39.92','7.57','12','0.3936302889023584','0.08936199932384484','0.9220578118967376','0.3137051911946718','1','0.0','99','407.8130844347163'),(25,'ALL013','Sean Williams','ALL ROUNDER','All Rounder','IPL','NewZealand','24','122.49','22.77','31.29','7.19','17','0.40129154586529364','0.9889620480970867','0.6859328756066324','0.5684228045070193','1','0.0','99','411.7601917260842'),(26,'ALL014',' Mohammad Hafeez','ALL ROUNDER','All Rounder','IPL','Pakistan','78','114.42','22.49','24.52','6.07','46','0.23206682141620166','0.8114844347522499','0.35267969102304236','0.6011448771305662','1','0.0','99','409.43301428268666'),(27,'ALL015',' Angelo Mathews','ALL ROUNDER','All Rounder','IPL','Sri Lanka','68','119.2','29.08','28.69','6.74','36','0.8290568652822402','0.9346014907598816','0.744870673900674','0.9460657164049349','1','0.0','99','410.5356010329855'),(28,'ALL016','Virat Kohli','ALL ROUNDER','All Rounder','IPL','India','48','134.86','53.44','49.5','8.14','16','0.8442560063882301','0.40297269309548156','0.8148817869389844','0.35434408771559456','1','0.0','99','406.9340000585832'),(29,'ALL0102','TMDilshan','ALL ROUNDER','All Rounder','IPL','SriLanka','221','122.82','29.08','29.56','7.25','64','0.5289287064964192','0.33082267306950713','0.34945675923534086','0.9554512412410807','1','0.0','99','406.7977147237001');
/*!40000 ALTER TABLE `allrounder_traindata` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `batsman_traindata`
--

DROP TABLE IF EXISTS `batsman_traindata`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `batsman_traindata` (
  `idBatsman` int(11) NOT NULL AUTO_INCREMENT,
  `Player_ID` varchar(45) DEFAULT NULL,
  `Player_Name` varchar(45) DEFAULT NULL,
  `Player_Role` varchar(45) DEFAULT NULL,
  `Player_Category` varchar(45) DEFAULT NULL,
  `Match_Type` varchar(45) DEFAULT NULL,
  `Nationality` varchar(45) DEFAULT NULL,
  `Total_Match` varchar(45) DEFAULT NULL,
  `Innings` varchar(45) DEFAULT NULL,
  `Bat_StrikeRate` varchar(45) DEFAULT NULL,
  `Bat_Average` varchar(45) DEFAULT NULL,
  `High_Score` varchar(45) DEFAULT NULL,
  `No50s` varchar(45) DEFAULT NULL,
  `No100s` varchar(45) DEFAULT NULL,
  `SRate_Weight` varchar(45) DEFAULT NULL,
  `Average_Weight` varchar(45) DEFAULT NULL,
  `Result` varchar(45) DEFAULT NULL,
  `Error` varchar(45) DEFAULT NULL,
  `Epoc` varchar(45) DEFAULT NULL,
  `Sum` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idBatsman`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `batsman_traindata`
--

LOCK TABLES `batsman_traindata` WRITE;
/*!40000 ALTER TABLE `batsman_traindata` DISABLE KEYS */;
INSERT INTO `batsman_traindata` VALUES (12,'BAT001','CH Gayle','BATSMAN','Opening Batsman','IPL','West Indies','93','92','153.28','43.22','175','20','5','0.3444909614462616','0.7028963816884013','1','0.0','99','203.86958307783755'),(13,'BAT002','RG Sharma','BATSMAN','Opening Batsman','IPL','India','143','139','131.51','33.42','109','29','1','0.5364906651304008','0.9509858997158613','1','0.0','99','205.28604789815873'),(14,'BAT003','SK Raina','BATSMAN','Opening Batsman','IPL','India','148','144','138.45','34.14','100','29','1','0.8302937779092023','0.1974321740611841','1','0.0','99','203.18979485295418'),(15,'BAT004','V koli','BATSMAN','Opening Batsman','IPL','India','139','131','130.43','38.05','113','26','4','0.6590902290600246','0.49902716850923307','1','0.0','99','203.83499842548179'),(16,'BAT005','AB de Villiers','BATSMAN','Opening Batsman','IPL','South Africa','120','109','149.33','39.24','133','21','3','0.9764716229741588','0.23489344746731686','1','0.0','99','203.26503909007408'),(17,'BAT006','YK Pathan','BATSMAN','Opening Batsman','IPL','India','135','122','146.78','30.67','100','12','1','0.9517654187103167','0.9248320166775372','1','0.0','99','205.7005053808441'),(18,'BAT007','MS Dhoni','BATSMAN','Opening Batsman','IPL','India','144','129','138.71','39.54','70','16','0','0.6047099023465774','0.8610577446007623','1','0.0','99','204.63978182264384'),(19,'BAT008','Yuvraj Singh','BATSMAN','Opening Batsman','IPL','India','109','106','131.55','25.77','83','11','0','0.30119031588028455','0.6197860122083007','1','0.0','99','204.66037452571217'),(20,'BAT009','DA Warner','BATSMAN','Opening Batsman','IPL','Australia','101','101','142.31','38.05','109','32','2','0.21105848214830833','0.953699756901837','1','0.0','99','204.68130005348496'),(21,'BAT010','KA Pollard','BATSMAN','Opening Batsman','IPL','West Indies','107','98','148.13','28.76','78','9','0','0.9719380703320721','0.5642370943776167','1','0.0','99','204.64420927747008'),(22,'BAT011','SR Watson','BATSMAN','Opening Batsman','IPL','Australia','95','92','140.6','32.56','104','14','2','0.41907854797758626','0.04276963875399532','1','0.0','99','202.4337221283669'),(23,'BAT012','DR Smith','BATSMAN','Opening Batsman','IPL','Australia','80','78','133.45','29.39','80','15','0','0.3489600740386064','0.15871416006434141','1','0.0','99','202.8095429340551'),(24,'BAT013','BB McCullum','BATSMAN','Opening Batsman','IPL','New Zealand','93','93','129.6','28.05','158','11','2','0.3796092266852485','0.31522358002666184','1','0.0','99','203.43087667606315'),(25,'BAT014','V Sehwag','BATSMAN','Opening Batsman','IPL','India','104','104','155.44','27.55','122','16','2','0.2617309369338089','0.06462854024930466','1','0.0','99','202.40700646324086'),(26,'BAT015','RV Uthappa','BATSMAN','Opening Batsman','IPL','India','136','130','128.65','29.47','83','17','0','0.2321379638513878','0.8245646738799329','1','0.0','99','205.00821437835202'),(27,'BAT016','AC Gilchrist','BATSMAN','Opening Batsman','IPL','Australia','80','80','138.39','27.22','109','11','2','0.16144797807555109','0.22294585580732748','1','0.0','99','202.94508044886638'),(28,'BAT017','M Vijay','BATSMAN','Opening Batsman','IPL','India','100','100','123.39','26.43','127','13','2','0.9518308075523522','0.9537558432382567','1','0.0','99','206.4238221527134'),(29,'BAT018','JP Duminy','BATSMAN','Opening Batsman','IPL','South Africa','77','73','124.87','39.86','78','14','0','0.3202315013621609','0.23276103845181634','1','0.0','99','202.84880729058042'),(30,'BAT019','NV Ojha','BATSMAN','Opening Batsman','IPL','India','99','88','118.48','21.05','94','6','0','0.776570065402179','0.5894970794049884','1','0.0','99','205.49048117526073'),(31,'BAT020','AT Rayudu','BATSMAN','Opening Batsman','IPL','India','110','103','126.28','27.47','81','13','0','0.06277389117145786','0.2040552766734647','1','0.0','99','202.80047500499228'),(32,'BAT021','DA Miller','BATSMAN','Opening Batsman','IPL','South Africa','61','60','144.39','36.09','101','8','1','0.514011905048225','0.7931650228736954','1','0.0','99','204.57927360908275'),(33,'BAT021','SE Marsh','BATSMAN','Opening Batsman','IPL','South Africa','62','61','132.35','40.98','115','18','1','0.019979176595319927','0.04264630626111941','1','0.0','99','202.12035815557425'),(34,'BAT022','S Dhawan','BATSMAN','Opening Batsman','IPL','India','114','113','121.14','32.18','95','25','0','0.23623428929304954','0.43788502056963385','1','0.0','99','203.5713107816124'),(35,'BAT023','KD Karthik','BATSMAN','Opening Batsman','IPL','India','139','122','125.01','23.97','86','12','0','0.5602332159015593','0.21676655751849716','1','0.0','99','203.36601287248826'),(36,'BAT024','DJ Hussey','BATSMAN','Opening Batsman','IPL','Australia','64','61','122.97','26.97','71','5','0','0.7961592048994863','0.2896891956251605','1','0.0','99','203.73878421235287'),(37,'BAT025','GJ Maxwell','BATSMAN','Opening Batsman','IPL','Australia','43','43','161.61','23.53','95','6','0','0.8309866442687663','0.4274007409196174','1','0.0','99','204.35391968011106'),(38,'BAT026','JA Morkel','BATSMAN','Opening Batsman','IPL','South Africa','91','68','141.95','24.34','73','3','0','0.8939187279936733','0.41155296849304224','1','0.0','99','204.34381079094464'),(39,'BAT027','AM Rahane','BATSMAN','Opening Batsman','IPL','India','96','90','121.77','35.51','103','24','1','0.22579580930125112','0.011141944217428312','1','0.0','99','202.21897925184348'),(40,'BAT028','RA Jadeja','BATSMAN','Opening Batsman','IPL','India','126','99','121.45','23.14','48','0','0','0.17709425452993444','0.602274362066559','1','0.0','99','204.7760576145709'),(41,'BAT029','MEK Hussey','BATSMAN','Opening Batsman','IPL','Australia','59','58','122.64','38.76','116','15','1','0.9324406374503303','0.2096023929338846','1','0.0','99','203.31409300087594'),(42,'BAT030','MK Pandey','BATSMAN','Opening Batsman','IPL','India','90','83','118.42','25.98','114','7','1','0.30346522838221296','0.9235600421744432','1','0.0','99','205.84927315225445'),(43,'BAT031','G Gambhir','BATSMAN','Opening Batsman','IPL','India','133','132','124.7','31.17','93','32','0','0.23974626828844253','0.05096272940500227','1','0.0','99','202.35932315291285'),(44,'BAT032','WP Saha','BATSMAN','Opening Batsman','IPL','India','90','69','131.77','25.94','115','5','1','0.5152273088942677','0.23012831209247575','1','0.0','99','203.29095392645272'),(45,'BAT033','DJ Bravo','BATSMAN','Opening Batsman','IPL','West Indeis','106','83','126.32','22.94','70','4','0','0.3321900316993062','0.7433368410437885','1','0.0','99','205.5383749600358'),(46,'BAT034','LRPL Taylor','BATSMAN','Opening Batsman','IPL','NewZealand','55','54','123.72','25.42','81','3','0','0.044718574876922046','0.7863881152395824','1','0.0','99','205.16103426040468'),(47,'BAT035','SS Tiwary','BATSMAN','Opening Batsman','IPL','India','80','64','119.53','27.81','61','6','0','0.9663488310233604','0.046753292747649416','1','0.0','99','202.9863495359946'),(48,'BAT036','ML Hayden','BATSMAN','Opening Batsman','IPL','Australia','32','32','137.51','36.09','93','8','0','0.2510699187261217','0.26116437130709613','1','0.0','99','202.91529870258614'),(49,'BAT037','JH Kallis','BATSMAN','Opening Batsman','IPL','South Africa','98','96','109.22','28.55','89','17','0','0.004656652874936324','0.4826057202855688','1','0.0','99','203.71160733898867'),(50,'BAT038','BJ Hodge','BATSMAN','Opening Batsman','IPL','Australia','66','63','125.22','33.33','73','6','0','0.09546098288876594','0.28139572672356505','1','0.0','99','202.9297182178849'),(51,'BAT039','AJ Finch','BATSMAN','Opening Batsman','IPL','Australia','53','52','124.78','28.06','88','11','0','0.007565645085130811','0.5457230078777997','1','0.0','99','203.9704251136291'),(52,'BAT040','SC Ganguly','BATSMAN','Opening Batsman','IPL','India','59','56','106.08','25.45','91','7','0','0.9713983067032202','0.7532028390727971','1','0.0','99','205.91402654031333'),(53,'BAT041','A Symonds','BATSMAN','Opening Batsman','IPL','West Indeis','39','36','129.86','36.07','117','5','1','0.9879148045167381','0.22733758921031133','1','0.0','99','203.40493770426013'),(54,'BAT042','KP Pietersen','BATSMAN','Opening Batsman','IPL','Australia','36','36','134.72','37.07','103','4','1','0.8927115946623038','0.8511804169664327','1','0.0','99','204.98837931262926'),(55,'BAT043','Harbhajan Singh','BATSMAN','Opening Batsman','IPL','India','125','77','143.66','16.65','64','1','0','0.5709238150816012','0.5012270365491158','1','0.0','99','205.44189023219963'),(56,'BAT044','ST Jayasuriya','BATSMAN','Opening Batsman','IPL','Sri Lanka','30','30','144.36','27.42','114','4','1','0.5340783675007413','0.47202146001008155','1','0.0','99','204.1123364606805'),(57,'BAT045','DPMD Jayawardene','BATSMAN','Opening Batsman','IPL','Sri Lanka','80','78','123.25','28.06','110','10','1','0.05487085197519567','0.6550602713175179','1','0.0','99','204.4028182874907'),(58,'BAT046','F du Plessis','BATSMAN','Opening Batsman','IPL','South Africa','51','45','128.05','30.64','73','8','0','0.18609858096971046','0.8219537433800496','1','0.0','99','204.8562370626406'),(59,'BAT047','SV Samson','BATSMAN','Opening Batsman','IPL','West Indeis','52','48','119.12','24.76','76','5','0','0.8939896484500175','0.77069223283309','1','0.0','99','205.901789224997'),(60,'BAT0100','Jayasuriya','BATSMAN','Opening Batsman','IPL','SriLanka','30','30','144.36','27.42','114','4','1','0.14169336565385365','0.9876010943255777','1','0.0','99','205.73691642900565');
/*!40000 ALTER TABLE `batsman_traindata` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bowler_traindata`
--

DROP TABLE IF EXISTS `bowler_traindata`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bowler_traindata` (
  `idbowler` int(11) NOT NULL AUTO_INCREMENT,
  `Player_ID` varchar(45) DEFAULT NULL,
  `Player_Name` varchar(45) DEFAULT NULL,
  `Player_Role` varchar(45) DEFAULT NULL,
  `Player_Category` varchar(45) DEFAULT NULL,
  `Match_Type` varchar(45) DEFAULT NULL,
  `Nationality` varchar(45) DEFAULT NULL,
  `Total_Match` varchar(45) DEFAULT NULL,
  `Bowl_Economy` varchar(45) DEFAULT NULL,
  `Bowl_Average` varchar(45) DEFAULT NULL,
  `TotWickets` varchar(45) DEFAULT NULL,
  `No5Wickets` varchar(45) DEFAULT NULL,
  `BowlEconomy_Weight` varchar(45) DEFAULT NULL,
  `BowlAverage_Weight` varchar(45) DEFAULT NULL,
  `Result` varchar(45) DEFAULT NULL,
  `Error` varchar(45) DEFAULT NULL,
  `Epoc` varchar(45) DEFAULT NULL,
  `Sum` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idbowler`)
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bowler_traindata`
--

LOCK TABLES `bowler_traindata` WRITE;
/*!40000 ALTER TABLE `bowler_traindata` DISABLE KEYS */;
INSERT INTO `bowler_traindata` VALUES (7,'BOWL001','SL Malinga','BOWLER','Fast Bowler','IPL','Sri Lanka','98','6.67','17.08','143','1','0.2920203216960761','0.15193829657142038','1','0.0','99','207.3205508274549'),(8,'BOWL002','A Mishra','BOWLER','Fast Bowler','IPL','India','112','7.27','23.53','124','1','0.9546215703916054','0.5888095100209678','1','0.0','99','217.78983970307576'),(9,'BOWL003','DJ Bravo','BOWLER','Fast Bowler','IPL','West Indies','106','8.19','22.58','122','0','0.44158173631456743','0.04780897482900758','1','0.0','99','207.6596081193116'),(10,'BOWL004','PP Chawla','BOWLER','Fast Bowler','IPL','India','124','7.57','25.74','121','0','0.13413641308471186','0.8486793689110468','1','0.0','99','207.11989943187166'),(11,'BOWL005','Harbhajan Singh','BOWLER','Fast Bowler','IPL','India','125','7','26.21','119','0','0.23878576088755069','0.15171813013881727','1','0.0','99','206.0301411788359'),(12,'BOWL006','R Vinay Kumar','BOWLER','Fast Bowler','IPL','India','102','8.27','28.41','101','0','0.1623101377819911','0.46629519693198934','1','0.0','99','205.640099102848'),(13,'BOWL007','A Nehra','BOWLER','Fast Bowler','IPL','India','83','7.77','23.4','100','0','0.544767452567703','0.8426513836885308','1','0.0','99','212.7184982459222'),(14,'BOWL008','R Ashwin','BOWLER','Fast Bowler','IPL','India','111','6.54','24.99','100','0','0.6240658072201551','0.8877106632834071','1','0.0','99','215.22568810177538'),(15,'BOWL009','DW Steyn','BOWLER','Fast Bowler','IPL','South Africa','90','6.72','25.06','92','0','0.6240658072201551','0.8877106632834071','1','0.0','99','215.22568810177538'),(16,'BOWL010','Z Khan','BOWLER','Fast Bowler','IPL','India','89','7.56','26.83','92','0','0.8323290545533982','0.3968907564572862','1','0.0','99','214.61395466472976'),(17,'BOWL011','RP Singh','BOWLER','Fast Bowler','IPL','India','82','7.9','25.97','90','0','0.9951373854876562','0.5307280875540424','1','0.0','99','216.78683132661521'),(18,'BOWL012','PP Ojha','BOWLER','Fast Bowler','IPL','India','92','7.36','26.2','89','0','0.6351320301616572','0.933163609272139','1','0.0','99','214.31326619708364'),(19,'BOWL013','B Kumar','BOWLER','Fast Bowler','IPL','India','77','7.08','22.95','87','0','0.9036217362641794','0.9953337194227169','1','0.0','99','219.27115181667605'),(20,'BOWL014','SP Narine','BOWLER','Fast Bowler','IPL','West Indeis','67','6.21','19.43','85','1','0.12729941663089153','0.6342174740920654','1','0.0','99','207.36737433876837'),(21,'BOWL015','JA Morkel','BOWLER','Fast Bowler','IPL','South Africa','81','8.21','27.75','85','0','0.320510712530475','0.9379405054655995','1','0.0','99','209.35682997217944'),(22,'BOWL016','JA Morkel','BOWLER','Fast Bowler','IPL','South Africa','81','8.21','27.75','85','0','0.5507170838733564','0.020340563086268217','1','0.0','99','208.84911166186004'),(23,'BOWL017','P Kumar','BOWLER','Fast Bowler','IPL','India','144','7.66','37.05','84','0','0.12474012541896887','0.3295464327101633','1','0.0','99','204.54323319297924'),(24,'BOWL018','P Kumar','BOWLER','Fast Bowler','IPL','India','144','7.66','37.05','84','0','0.5561521267233607','0.29802486452796717','1','0.0','99','210.14563737436902'),(25,'BOWL019','SR Watson','BOWLER','Fast Bowler','IPL','Australia','95','7.77','27.49','81','0','0.5191679701542553','0.8081630798927333','1','0.0','99','211.71789095418075'),(26,'BOWL020','IK Pathan','BOWLER','Fast Bowler','IPL','India','102','7.74','32.78','80','0','0.9327586976645873','0.05141511588781602','1','0.0','99','214.33020742659565'),(27,'BOWL021','M Morkel','BOWLER','Fast Bowler','IPL','Sotuh Africa','70','7.69','27.12','77','0','0.6071521658055364','0.1545805607749664','1','0.0','99','210.55012288811466'),(28,'BOWL022','RA Jadeja','BOWLER','Fast Bowler','IPL','India','126','7.26','28.01','77','1','0.7363434663549393','0.16997091868323258','1','0.0','99','212.85693860736345'),(29,'BOWL023','CH Morris','BOWLER','Fast Bowler','IPL','England','73','8.04','26.68','76','1','0.4352657674107549','0.2948995907389499','1','0.0','99','208.58438907094293'),(30,'BOWL024','UT Yadav','BOWLER','Fast Bowler','IPL','India','80','8.38','31.04','74','0','0.6753356989525375','0.798878367436955','1','0.0','99','212.73904487758654'),(31,'BOWL025','MM Patel','BOWLER','Fast Bowler','IPL','India','61','7.49','22.47','73','1','0.2361284740844565','0.28481752162934637','1','0.0','99','206.46447467023546'),(32,'BOWL026','DS Kulkarni','BOWLER','Fast Bowler','IPL','India','67','7.95','29.97','73','0','0.20613092696236424','0.4142730819895219','1','0.0','99','206.01500915526782'),(33,'BOWL027','R Bhatia','BOWLER','Fast Bowler','IPL','India','93','7.95','27.87','73','0','1.2515523222585595E-4','0.408587957079355','1','0.0','99','203.48242325933793'),(34,'BOWL028','MM Sharma','BOWLER','Fast Bowler','IPL','India','61','7.36','23.8','70','0','0.7409718423814493','0.8295209125808174','1','0.0','99','215.68861628926825'),(35,'BOWL029','MM Sharma','BOWLER','Fast Bowler','IPL','India','61','7.93','23.8','70','0','0.5120886166517513','0.15895495430811718','1','0.0','99','209.1968750065879'),(36,'BOWL030','AB Dinda','BOWLER','Fast Bowler','IPL','India','76','8.15','29.57','70','0','0.09632388428907669','0.8992616640036647','1','0.0','99','206.26536484983467'),(37,'BOWL031','AB Dinda','BOWLER','Fast Bowler','IPL','India','76','7.58','29.29','65','0','0.15539569408585313','0.9340688368605436','1','0.0','99','207.29163888830172'),(38,'BOWL032','JH Kallis','BOWLER','Fast Bowler','IPL','South Africa','98','7.98','35.27','65','0','0.059552799238011545','0.42729291340411846','1','0.0','99','203.9774637377184'),(39,'BOWL033','M Muralitharan	','BOWLER','Fast Bowler','IPL','Sri Lanka','66','6.67','26.92','63','0','0.719410026420974','0.6042169029424481','1','0.0','99','215.1607305798636'),(40,'BOWL033','I Sharma','BOWLER','Fast Bowler','IPL','India','70','8.07','35.34','58','1','0.940037912893319','0.5186565009254928','1','0.0','99','215.24745146355448'),(41,'BOWL034','YS Chahal','BOWLER','Fast Bowler','IPL','India','44','7.91','22.07','57','0','0.04972509599905868','0.9728683659119577','1','0.0','99','207.0872383696513'),(42,'BOWL035','SK Warne','BOWLER','Fast Bowler','IPL','Australia','55','7.27','25.38','57','0','0.04972509599905868','0.9728683659119577','1','0.0','99','207.0872383696513'),(43,'BOWL036','Sandeep Sharma','BOWLER','Fast Bowler','IPL','India','43','7.61','22.01','54','0','0.44655960086478846','0.8771794288317357','1','0.0','99','211.9521091711603'),(44,'BOWL037','JP Faulkner','BOWLER','Fast Bowler','IPL','Australia','52','8.53','28.67','53','2','0.3857263087377343','0.4992333479517779','1','0.0','99','208.32604884231188'),(45,'BOWL038','MG Johnson','BOWLER','Fast Bowler','IPL','Australia','43','8.18','25.86','52','0','0.28510289286106055','0.023762782071797238','1','0.0','99','205.61314769741148'),(46,'BOWL039','SB Jakati','BOWLER','Fast Bowler','IPL','India','58','7.99','30.4','47','0','0.19853133137050458','0.1798848397258087','1','0.0','99','205.10736033491654'),(47,'BOWL040','RJ Harris','BOWLER','Fast Bowler','IPL','India','37','7.55','23.26','45','0','0.9058687380104443','0.06334304930771771','1','0.0','99','214.3934391951188'),(48,'BOWL041','A Kumble','BOWLER','Fast Bowler','IPL','India','42','6.57','23.51','45','1','0.052153195889853704','0.29277976503794956','1','0.0','99','204.05972160604105'),(49,'BOWL042','Shakib Al Hasan	2011-2016 ','BOWLER','Fast Bowler','IPL','Bangaladesh','42','7.1','24.88','45','0','0.37175563780904547','0.5136305750022574','1','0.0','99','209.37358910615575'),(50,'BOWL043','AR Patel','BOWLER','Fast Bowler','IPL','India','45','7.38','27.55','43','0','0.11009366047696635','0.9519866258180173','1','0.0','99','206.99688751233742'),(51,'BOWL044','CH Morris','BOWLER','Fast Bowler','IPL','South Africa','39','7.5','24.87','41','0','0.90705332531257','0.9567099833352487','1','0.0','99','218.1004444078519'),(52,'BOWL045','S Aravind','BOWLER','Fast Bowler','IPL','India','29','80.06','20','40','0','0.10706575645425198','0.21784863354325223','1','0.0','99','203.23522394772152'),(53,'BOWL046','R Sharma','BOWLER','Fast Bowler','IPL','India','44','7.02','29.85','40','0','0.6388202315812183','0.7362816447178945','1','0.0','99','213.68243516196705'),(54,'BOWL047','S Sreesanth','BOWLER','Fast Bowler','IPL','India','44','8.14','29.85','40','0','0.22790669185322152','0.4533207756343351','1','0.0','99','206.3618023713568'),(55,'BOWL048','YK Pathan','BOWLER','Fast Bowler','IPL','India','135','7.38','34.17','40','0','0.20860810310080688','0.5616701798487173','1','0.0','99','206.51526492453465'),(56,'BOWL049','P Awana','BOWLER','Fast Bowler','IPL','India','33','8.26','26.38','39','0','0.5628976889289569','0.6683084954000875','1','0.0','99','211.44173386152926'),(57,'BOWL050','Iqbal Abdulla','BOWLER','Fast Bowler','IPL','India','47','7.1','27.73','38','0','0.26794077044348996','0.39949176255736096','1','0.0','99','207.26676133084413'),(58,'Bowl0101','Malinga','BOWLER','Fast Bowler','IPL','SriLanka','98','6.67','17.8','143','1','0.10916057263536419','0.29482984300009407','1','0.0','99','205.32605336514422');
/*!40000 ALTER TABLE `bowler_traindata` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `player_category`
--

DROP TABLE IF EXISTS `player_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `player_category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Role_ID` varchar(45) DEFAULT NULL,
  `Role_Name` varchar(45) DEFAULT NULL,
  `Category` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `player_category`
--

LOCK TABLES `player_category` WRITE;
/*!40000 ALTER TABLE `player_category` DISABLE KEYS */;
INSERT INTO `player_category` VALUES (1,'100','BATSMAN','Opening Batsman'),(2,'101','BOWLER','Fast Bowler'),(3,'100','BATSMAN','Middle Order'),(4,'102','WICKET KEEPER','Wicket Keeper'),(5,'103','ALL ROUNDER','All Rounder'),(6,'100','BATSMAN','Top Order'),(7,'100','BATSMAN','Lower Order'),(8,'101','BOWLER','Swing bowlers'),(9,'101','BOWLER','Slow Bowlers'),(10,'101','BOWLER','Spin bowlers');
/*!40000 ALTER TABLE `player_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `player_role`
--

DROP TABLE IF EXISTS `player_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `player_role` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Role_ID` varchar(45) DEFAULT NULL,
  `Role_Name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `player_role`
--

LOCK TABLES `player_role` WRITE;
/*!40000 ALTER TABLE `player_role` DISABLE KEYS */;
INSERT INTO `player_role` VALUES (1,'100','BATSMAN'),(2,'101','BOWLER'),(3,'102','WICKET KEEPER'),(4,'103','ALL ROUNDER');
/*!40000 ALTER TABLE `player_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teams`
--

DROP TABLE IF EXISTS `teams`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `teams` (
  `Teams_id` int(11) NOT NULL,
  `Team_Name` varchar(45) DEFAULT NULL,
  `Player_Name` varchar(45) DEFAULT NULL,
  `PlayerRole` varchar(45) DEFAULT NULL,
  `Nationality` varchar(45) DEFAULT NULL,
  `Total_Match` varchar(45) DEFAULT NULL,
  `Innings` varchar(45) DEFAULT NULL,
  `High_score` varchar(45) DEFAULT NULL,
  `TotWickets` varchar(45) DEFAULT NULL,
  `Strike_Rate` varchar(45) DEFAULT NULL,
  `Average` varchar(45) DEFAULT NULL,
  `Bowl_Economy` varchar(45) DEFAULT NULL,
  `Bowl_Average` varchar(45) DEFAULT NULL,
  `Total_Catch` varchar(45) DEFAULT NULL,
  `Total_Stump` varchar(45) DEFAULT NULL,
  `Bat_Sweight` varchar(45) DEFAULT NULL,
  `Bat_Aweight` varchar(45) DEFAULT NULL,
  `Bowl_Eweight` varchar(45) DEFAULT NULL,
  `Bowl_Aweight` varchar(45) DEFAULT NULL,
  `Stump_weight` varchar(45) DEFAULT NULL,
  `Catch_weight` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teams`
--

LOCK TABLES `teams` WRITE;
/*!40000 ALTER TABLE `teams` DISABLE KEYS */;
INSERT INTO `teams` VALUES (11,'dff','www','BATSMAN','22','22','22','22',NULL,'22','22','22','22','22','22','0.3050117506457242','0.46739685207592957',NULL,NULL,NULL,NULL),(11,'RCB','mass','BATSMAN','SriLanka','123','111','90',NULL,'143.66','55.65','143.66','143.66','0','0','0.28723535030512637','0.4531720231280518',NULL,NULL,NULL,NULL),(11,'mm','111','BOWLER','SriLanka','111','0','0',NULL,'0','0','8.6','25.66','0','0',NULL,NULL,'0.9413593248955882','0.4655175128378808',NULL,NULL),(12,'mm','mm','BOWLER','SriLanka','110','0','0','200','0','0','8.65','25.55','0','0',NULL,NULL,'-3.0686561156975076E-4','0.6550152466623247',NULL,NULL),(12,'mm','mm','BOWLER','SriLanka','110','0','0','200','0','0','7.55','25.55','0','0',NULL,NULL,'0.9014015535892071','0.6502903596985311',NULL,NULL),(11,'mm','mass','ALL ROUNDER','sri','111','0','0','0','132','35.55','6.5','25.11','0','0','0.023949713181454127','35.55','0.9566366800992225','0.7898360451337137',NULL,NULL),(11,'m','mass','WICKET KEEPER','Sri','112','0','0','0','0','0','0','0','50','111',NULL,NULL,NULL,NULL,'0.5491597122031112','0.6305977052025012');
/*!40000 ALTER TABLE `teams` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_login`
--

DROP TABLE IF EXISTS `user_login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_login` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `First_Name` varchar(45) DEFAULT NULL,
  `Last_Name` varchar(45) DEFAULT NULL,
  `Address` varchar(45) DEFAULT NULL,
  `Country` varchar(45) DEFAULT NULL,
  `Gender` varchar(45) DEFAULT NULL,
  `Date_of_Birth` varchar(45) DEFAULT NULL,
  `NIC` varchar(45) DEFAULT NULL,
  `Contacts_No` varchar(45) DEFAULT NULL,
  `Category` varchar(45) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `User_Name` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  `Job` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1011 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_login`
--

LOCK TABLES `user_login` WRITE;
/*!40000 ALTER TABLE `user_login` DISABLE KEYS */;
INSERT INTO `user_login` VALUES (1007,'Manar','mnm','132/2, Galle Road, Colombo 3','Sri Lanka','Male','Dec 7, 1995','953420546V','774347659','Super Admin','manarmnm@gmail.com','mass','123','Software Engineer'),(1008,'Shalika','Mr.','Colombo 10','Sri Lanka','Male','Mar 10 1985','856655555V','716655566','Manager','sahli@gmail.com','sha','547','Program Manager'),(1009,'Kumar','Sanga','Colombo 4','Sri Lanka','Male','Apr 10 1978','785666655V','777756699','Players','kumar@yahoo.com','kumar','123','Cricket Team Players'),(1010,'manar','mnm','132/2, Galle road, Colombo 3 ','SriLanka','Male','Dec 7, 1995','954885225V','774347659','Manager','mnmmass@gmail.com','mnm','123','Manager');
/*!40000 ALTER TABLE `user_login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wkeeper_traindata`
--

DROP TABLE IF EXISTS `wkeeper_traindata`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wkeeper_traindata` (
  `idWKeeper` int(11) NOT NULL AUTO_INCREMENT,
  `Player_ID` varchar(45) DEFAULT NULL,
  `Player_Name` varchar(45) DEFAULT NULL,
  `Player_Role` varchar(45) DEFAULT NULL,
  `Player_Category` varchar(45) DEFAULT NULL,
  `Match_Type` varchar(45) DEFAULT NULL,
  `Nationality` varchar(45) DEFAULT NULL,
  `Total_Match` varchar(45) DEFAULT NULL,
  `Stumps` varchar(45) DEFAULT NULL,
  `Catchs` varchar(45) DEFAULT NULL,
  `Stumps_Weight` varchar(45) DEFAULT NULL,
  `Catchs_Weight` varchar(45) DEFAULT NULL,
  `Result` varchar(45) DEFAULT NULL,
  `Error` varchar(45) DEFAULT NULL,
  `Epoc` varchar(45) DEFAULT NULL,
  `Sum` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idWKeeper`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wkeeper_traindata`
--

LOCK TABLES `wkeeper_traindata` WRITE;
/*!40000 ALTER TABLE `wkeeper_traindata` DISABLE KEYS */;
INSERT INTO `wkeeper_traindata` VALUES (2,'WK001','Massmnm','WICKET KEEPER','Wicket Keeper','IPL','SriLanka','110','65','85','0.19966662060519916','0.2896007367186035','1','0.0','99','202.6872486123304'),(3,'WK002','Dinesh Karthik','WICKET KEEPER','Wicket Keeper','IPL','India','138','26','72','0.013190161864914136','0.01917825644270959','1','0.0','99','202.0930150035782'),(4,'WK003','MS Dhoni','WICKET KEEPER','Wicket Keeper','IPL','India','143','27','62','0.821799358731342','0.8051444074697013','1','0.0','99','206.35058605810104'),(5,'WK004','Robin Uthappa','WICKET KEEPER','Wicket Keeper','IPL','India','135','26','49','0.8201797812769904','0.853852307529515','1','0.0','99','207.00747632844207'),(6,'WK005','Naman Ojha','WICKET KEEPER','Wicket Keeper','IPL','India','98','10','59','0.3633352729751239','0.8342921101285833','1','0.0','99','211.0484074529514'),(7,'WK006','Adam Gilchrist','WICKET KEEPER','Wicket Keeper','IPL','Australia','80','16','51','0.6539346864097642','0.3808744679899798','1','0.0','99','205.69934842604567'),(8,'WK007','Parthiv Patel','WICKET KEEPER','Wicket Keeper','IPL','India','103','12','51','0.7197150353221885','0.8864809146479823','1','0.0','99','210.88658678604511'),(9,'WK008','WP Saha','WICKET KEEPER','Wicket Keeper','IPL','India','90','15','37','0.45063040493430095','0.7061988661307151','1','0.0','99','207.98520957719336'),(10,'WK009','Kumar Sangakkara','WICKET KEEPER','Wicket Keeper','IPL','Sri Lanka','71','9','34','0.07769386033234138','0.6801849784772923','1','0.0','99','209.86408115270152'),(11,'WK010','MS Bisla','WICKET KEEPER','Wicket Keeper','IPL','India','39','7','17','0.9273804523621685','0.8745652593714691','1','0.0','99','220.12864118046224'),(12,'WK011','SV Samson','WICKET KEEPER','Wicket Keeper','IPL','West Indeis','52','3','50','0.5829060528705696','0.6436936294568419','1','0.0','99','224.8493565435747'),(13,'WK012','M Rawat','WICKET KEEPER','Wicket Keeper','IPL','India','52','3','20','0.6570079259639001','0.7676079214928254','1','0.0','99','231.16158995209344'),(14,'WK013','Dinesh Karthik','WICKET KEEPER','Wicket Keeper','IPL','India','18','2','16','0.6778506783993966','0.756118723973177','1','0.0','99','244.46500754394168'),(15,'WK0105','Kumar Sangakkara','WICKET KEEPER','Wicket Keeper','IPL','SriLanka','235','57','143','0.046513656887949104','0.095309947428059','1','0.0','99','202.20173739975277');
/*!40000 ALTER TABLE `wkeeper_traindata` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-04-20  2:03:06
