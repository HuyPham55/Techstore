-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: techstore
-- ------------------------------------------------------
-- Server version	8.0.20

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `categories`
--

LOCK TABLES `categories` WRITE;
/*!40000 ALTER TABLE `categories` DISABLE KEYS */;
INSERT INTO `categories` VALUES (1,NULL,'Thiết bị di động cầm tay','https://img.icons8.com/clouds/2x/multiple-smartphones.png','Điện thoại'),(2,NULL,'Máy tính xách tay','https://img.icons8.com/clouds/2x/laptop.png','Laptop');
/*!40000 ALTER TABLE `categories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `customers`
--

LOCK TABLES `customers` WRITE;
/*!40000 ALTER TABLE `customers` DISABLE KEYS */;
INSERT INTO `customers` VALUES (1,NULL,'593 Camylle Dale Suite 479\nNew Aaliyah, WV 98845','alti2ude.com','Aiyana Mann','+6550175330038'),(2,NULL,'47167 McGlynn Track\nSouth Mariliehaven, HI 90985-3140',NULL,'Rowland Volkman','+7378819109819'),(3,NULL,'67234 Buddy Harbors\nPort Jana, SC 88691-7780','dsty.fas@yosketchers.ml','Bella Toy Jr.','+6780555866667'),(4,NULL,'4244 Tressie Plains\nKristinbury, TN 21385-5148',NULL,'Laney Pollich MD','+6707311839243'),(5,NULL,'64299 Rath Garden Suite 831\nPort Sister, VA 32829','jbascara.joshuaz@beveragedictionary.com','Monty Kunze DDS','+9366210890105'),(6,NULL,'8189 Samara Port\nEast Elmerstad, IL 25166','0dangers7c@jowabols.com','Dr. Xander Senger PhD','+7343765517518'),(7,NULL,'869 Walsh Rest Suite 943\nPort Aimee, ME 96810',NULL,'Sadie Feest','+4420800920918'),(8,NULL,'463 Marshall Forges Apt. 410\nRooseveltborough, NY 62751',NULL,'Baron Schmeler','+9915263446336'),(9,NULL,'66429 Herzog Summit\nRubieburgh, RI 16167','qd@gmail.com','Ms. Cora Cormier','+4298879693075'),(10,NULL,'9612 Billie Trail\nWest Katelinside, IN 85709',NULL,'Marjorie Nikolaus MD','+4857988438404'),(11,NULL,'548 Robb Avenue\nPort Odessafurt, GA 87511-8816','jyoann.botquelens@cityquote.com','Ken Upton','+5482075307708'),(12,NULL,'220 Gutmann Plaza\nLake Hollisview, UT 72079-1924','3abdall@lilidirectory.com','Malika Marquardt','+8614408388742'),(13,NULL,'32008 Germaine Parks Suite 753\nKoelpinstad, OR 52412',NULL,'Ms. Violette Schulist','+4707426462536'),(14,NULL,'31816 Marjolaine Place Suite 980\nSchaefermouth, WA 31890-0018','vmr.jaden.r@hayuk.pw','Dr. Brayan Abernathy','+9730621162321'),(15,NULL,'8107 Zieme Curve Apt. 808\nNorth Bradyshire, NE 17273-0330','dhaidarlaeve@frutaa.website','La Thi Bai','+6361852378494');
/*!40000 ALTER TABLE `customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `order_detail`
--

LOCK TABLES `order_detail` WRITE;
/*!40000 ALTER TABLE `order_detail` DISABLE KEYS */;
INSERT INTO `order_detail` VALUES (1,NULL,NULL,'1',1,1),(2,NULL,NULL,'2',2,1),(3,NULL,NULL,'3',3,1),(4,NULL,NULL,'4',4,1),(5,NULL,NULL,'5',5,2),(6,NULL,NULL,'6',6,3),(7,NULL,NULL,'7',7,1),(8,NULL,NULL,'8',8,2),(9,NULL,NULL,'9',9,3),(10,NULL,NULL,'10',10,1);
/*!40000 ALTER TABLE `order_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1,'1991-06-18 00:00:00',NULL,2),(2,'2007-03-22 00:00:00',NULL,4),(3,'1982-08-29 00:00:00',NULL,3),(4,'2002-04-22 00:00:00',NULL,1),(5,'2003-03-05 00:00:00',NULL,6),(6,'2002-05-10 00:00:00',NULL,5),(7,'1976-04-03 00:00:00',NULL,4),(8,'2012-09-21 00:00:00',NULL,6),(9,'2012-09-21 00:00:00',NULL,2),(10,'1999-02-12 00:00:00',NULL,7);
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (1,NULL,'iPhone 12 Pro Max sở hữu diện mạo mới mới với khung viền được vát thẳng và mạnh mẽ như trên iPad Pro 2020, chấm dứt hơn 6 năm với kiểu thiết kế bo cong trên iPhone 6 được ra mắt lần đầu tiên vào năm 2014.','https://cdn.tgdd.vn/Products/Images/42/213033/iphone-12-pro-max-195420-015412-400x400.png','iPhone 12 Pro Max 128GB',33990000,1),(2,NULL,'iPhone 12 được trang bị chipset A14 Bionic - bộ xử lý được trang bị lần đầu trên iPad Air 4 vừa được ra mắt cách đây không lâu, mở đầu xu thế chip 5 nm thương mại trên toàn thế giới.','https://cdn.tgdd.vn/Products/Images/42/228736/iphone-12-128gb-195720-105752-400x400.png','iPhone 12 128GB',26990000,1),(3,NULL,'Trông ngoại hình khá giống nhau, tuy nhiên Samsung Galaxy Note 10+ sở hữu khá nhiều điểm khác biệt so với Galaxy Note 10 và đây được xem là một trong những chiếc máy đáng mua nhất trong năm 2019, đặc biệt dành cho những người thích một chiếc máy màn hình lớn, camera chất lượng hàng đầu.','https://cdn.tgdd.vn/Products/Images/42/206176/samsung-galaxy-note-10-plus-den-400x460-400x460.png','Samsung Galaxy Note 10+',15290000,1),(4,NULL,'OPPO A92 là mẫu smartphone tầm trung vừa mới được OPPO ra mắt đầu tháng 5/2020. Chiếc điện thoại gây ấn tượng với thiết kế màn hình khoét lỗ tràn viền, cụm 4 camera ấn tượng và được bán với mức giá vô cùng phải chăng.','https://cdn.tgdd.vn/Products/Images/42/220654/oppo-a92-tim-400x460-400x460.png','OPPO A92',15290000,1),(5,NULL,'MacBook Air 2020 i3 mới với thiết kế sang trọng, hiệu năng khá, bàn phím Magic lần đầu tiên xuất hiện trên dòng Macbook Air. Với nhiều tính năng hiện đại, đây là chiếc MacBook Air rất đáng sở hữu với mức giá gần như rẻ nhất từ trước đến nay. ','https://cdn.tgdd.vn/Products/Images/44/220174/apple-macbook-air-2020-i3-220174-1-600x600.jpg','Apple MacBook Air 2020',28990000,2),(6,NULL,'Asus VivoBook X509JP i5 (EJ023T) là chiếc laptop học tập - văn phòng mỏng nhẹ, cấu hình mạnh và ổn định cho nhu cầu làm việc, giải trí hằng ngày.','https://cdn.tgdd.vn/Products/Images/44/221617/asus-vivobook-x509jp-i5-ej023t-2gb-221617-600x600.jpg','Asus VivoBook X509JP',17190000,2),(7,NULL,'Laptop HP 15s fq1111TU i3 (193R0PA) sở hữu độ hoàn thiện cao, thân máy mỏng nhẹ cùng cấu hình đủ dùng cho học tập, làm việc văn phòng và lướt web giải trí.','https://cdn.tgdd.vn/Products/Images/44/224012/hp-15s-fq1111tu-i3-193r0pa-224012-224012-600x600.jpg','HP 15s fq1111TU',11390000,2),(8,NULL,'Laptop Acer Aspire 3 A315 56 36YS i3 (NX.HS5SV.008) là chiếc máy có thiết kế gọn nhẹ, hướng tới người dùng văn phòng cần một sản phẩm ổn định đáp ứng được nhu cầu công việc và học tập cơ bản với mức giá thành rẻ.','https://cdn.tgdd.vn/Products/Images/44/224583/acer-aspire-3-a315-56-i3-nxhs5sv008-8-1-224583-600x600.jpg','Acer Aspire 3 A315 56 36YS',13690000,2),(9,NULL,'Laptop Lenovo IdeaPad S145 15IIL i3 (81W8001XVN) thuộc phân khúc laptop học tập văn phòng cơ bản với mức giá tốt. Máy có cấu hình ổn, đủ chạy các ứng dụng văn phòng phổ biến, điểm nổi bật của Lenovo IdeaPad S145 là ổ cứng SSD siêu nhanh, thiết kế mỏng gọn, tinh tế.','https://cdn.tgdd.vn/Products/Images/44/216292/lenovo-ideapad-s145-81w8001xvn-a4-216292-600x600.jpg','Lenovo IdeaPad S145 15IIL',11490000,2),(10,NULL,'Samsung Galaxy Z Fold 2 là tên gọi chính thức của điện thoại màn hình gập cao cấp nhất của Samsung. Với nhiều nâng cấp tiên phong về thiết kế, hiệu năng và camera, hứa hẹn đây sẽ là một siêu phẩm thành công tiếp theo đến từ “ông trùm” sản xuất điện thoại lớn nhất thế giới.','https://cdn.tgdd.vn/Products/Images/42/226099/samsung-galaxy-z-fold-2-061220-021202-400x460.png','Samsung Galaxy Z Fold2',50000000,1);
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-26 16:28:27
