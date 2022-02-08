USE Demo;

CREATE TABLE Products (
	id int PRIMARY KEY,
    productCode nvarchar(100),
    productName nvarchar(100),
    productPrice double,
    productAmount int,
    productDescription nvarchar(100),
    productStatus nvarchar(100)
);

INSERT INTO Products VALUES(1,'A','A',1000,1,'A','A');
INSERT INTO Products VALUES(2,'B','B',1000,1,'B','B');
INSERT INTO Products VALUES(3,'C','C',1000,1,'C','C');
INSERT INTO Products VALUES(4,'D','D',1000,1,'D','D');

SELECT * FROM Products;

ALTER TABLE Products
ADD UNIQUE unique_index (productCode);

ALTER TABLE Products
ADD INDEX composite_index (productName, productPrice);

CREATE VIEW view_product AS 
SELECT productCode,productName,productPrice,productStatus FROM demo;

DROP VIEW view_demo;

Delimiter //
Create Procedure allrecords()
    BEGIN
    Select * from Products;
    END//
DELIMITER ;

Delimiter //
Create Procedure addrecord(
	in productcode varchar(45),
    in productname varchar(45),
    in productprice double,
    in productamount int
)
    BEGIN
    INSERT INTO `demo` (`productCode`, `productName`, `productPrice`, `productAmount`, `productDescription`, `productStatus`) VALUES (productcode, productname, productprice, productamount, 'No Description', 'None');
    END//
DELIMITER ;

DELIMITER //
Create Procedure deleterecord(in iddelete int)
    BEGIN
    DELETE FROM `demo` WHERE (`id` = iddelete )

    END//
DELIMITER ;


