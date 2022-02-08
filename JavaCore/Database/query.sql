INSERT INTO `quanlybanhang`.`customer` (`cID`, `cName`, `cAge`) VALUES ('1', 'Minh Quan', '10');
INSERT INTO `quanlybanhang`.`customer` (`cID`, `cName`, `cAge`) VALUES ('2', 'Ngoc Oanh', '20');
INSERT INTO `quanlybanhang`.`customer` (`cID`, `cName`, `cAge`) VALUES ('3', 'Hong Ha', '50');

INSERT INTO `quanlybanhang`.`orderr` (`oID`, `cID`, `oDate`) VALUES ('1', '1', '2006-03-21');
INSERT INTO `quanlybanhang`.`orderr` (`oID`, `cID`, `oDate`) VALUES ('2', '2', '2006-03-23');
INSERT INTO `quanlybanhang`.`orderr` (`oID`, `cID`, `oDate`) VALUES ('3', '1', '2006-03-16');

INSERT INTO `quanlybanhang`.`product` (`pID`, `pName`, `pPrice`) VALUES ('1', 'May Giat', '3');
INSERT INTO `quanlybanhang`.`product` (`pID`, `pName`, `pPrice`) VALUES ('2', 'Tu Lanh', '5');
INSERT INTO `quanlybanhang`.`product` (`pID`, `pName`, `pPrice`) VALUES ('3', 'Dieu Hoa', '7');
INSERT INTO `quanlybanhang`.`product` (`pID`, `pName`, `pPrice`) VALUES ('4', 'Quat', '1');
INSERT INTO `quanlybanhang`.`product` (`pID`, `pName`, `pPrice`) VALUES ('5', 'Bep Dien', '2');

INSERT INTO `quanlybanhang`.`orderdetail` (`oID`, `pID`, `odQTY`) VALUES ('1', '1', '3');
INSERT INTO `quanlybanhang`.`orderdetail` (`oID`, `pID`, `odQTY`) VALUES ('1', '3', '7');
INSERT INTO `quanlybanhang`.`orderdetail` (`oID`, `pID`, `odQTY`) VALUES ('1', '4', '2');
INSERT INTO `quanlybanhang`.`orderdetail` (`oID`, `pID`, `odQTY`) VALUES ('2', '1', '1');
INSERT INTO `quanlybanhang`.`orderdetail` (`oID`, `pID`, `odQTY`) VALUES ('3', '1', '8');
INSERT INTO `quanlybanhang`.`orderdetail` (`oID`, `pID`, `odQTY`) VALUES ('2', '5', '4');
INSERT INTO `quanlybanhang`.`orderdetail` (`oID`, `pID`, `odQTY`) VALUES ('2', '3', '3');

SELECT oID, oDate,oPrice FROM Orders;

SELECT c.cName, p.pName FROM customer AS c
JOIN orderr AS o
ON o.cID = c.cID
JOIN orderdetail AS od
ON od.oId = o.oID
JOIN Product AS p
ON p.pID = od.pID

SELECT * FROM Customer AS c
WHERE c.cID NOT IN (SELECT c.cID FROM Orderr)

SELECT o.oID,o.oDate,SUM(p.pPrice*od.odQTY) AS Price FROM Orderr AS o
JOIN OrderDetail AS od
ON od.oID = o.oID
JOIN Product AS p
ON p.pID = od.pID
GROUP BY o.oID
