
CREATE DATABASE management;
USE management;

CREATE TABLE Customer
(
    cID   INT AUTO_INCREMENT PRIMARY KEY,
    cName VARCHAR(60),
    cAge INT,
);
CREATE TABLE Order
(
    oID INT AUTO_INCREMENT PRIMARY KEY,
    cID INT FORGEIN KEY REFERENCES Customer(cID),
    oDate DATE,
    oTotalPrice DOUBLE
);
CREATE TABLE Product
(
    pID INT AUTO_INCREMENT PRIMARY KEY,
    pName varchar(60),
    pPrice DOUBLE
);
CREATE TABLE OrderDetai;l
(
    oID INT,
    pID INT,
    odQTY INT,
    PRIMARY KEY(oID,pID),
); 
