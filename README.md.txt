Run techstore_all.sql to initialize database structure
Run techstore_data.sql to feed data to the database

While trying to bulid and run with NetBeans IDE, it may automatically add MySQL version and cause incompatibility. 
To solve this problem simply remove following config from pom.xml
<mysql.version>8.0.13</mysql.version>