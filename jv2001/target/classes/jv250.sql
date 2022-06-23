DROP TABLE Sample10;
CREATE TABLE Sample10 (
	no 			INT(11)			DEFAULT NULL,
	name 		VARCHAR(20)		DEFAULT NULL,
	birthday 	DATE			DEFAULT NULL,
	address 	VARCHAR(40)		DEFAULT NULL
);

SELECT * FROM Sample10;

INSERT INTO Sample10 VALUES (1, '유비', '1996-10-25', '대구 중구 반월당');
INSERT INTO Sample10 VALUES (2, '관우', '1995-9-25', '대구 중구 반월당');

CREATE TABLE Customer (
	cid			BIGINT			PRIMARY KEY AUTO_INCREMENT,
	name  		VARCHAR(20)		NOT NULL,
	ssn			VARCHAR(14)		NOT NULL,
	phone		VARCHAR(14)		NOT NULL,
	customerId	VARCHAR(16)		NOT NULL,
	passwd		VARCHAR(16)		NOT NULL,
	regDate 	TIMESTAMP		NOT NULL		DEFAULT CURRENT_TIMESTAMP
) AUTO_INCREMENT = 1001;

SELECT * FROM Customer;
INSERT INTO Customer (name, ssn, phone, customerId, passwd)
VALUES ('유비','901213-1234567','010-2323-2323','java', '1111');

INSERT INTO Customer (name, ssn, phone, customerId, passwd)
VALUES ('관우','901213-1234567','010-2323-2323','java', '1111');

INSERT INTO Customer (name, ssn, phone, customerId, passwd)
VALUES ('장비','901213-1234567','010-2323-232ㄴ3','java', '1111');

UPDATE Customer SET ssn='901212-1234567', phone='010-3434-3555' WHERE cid=1001;

DELETE FROM Customer WHERE cid=1005;
DELETE FROM Customer WHERE cid=1004;


/**/

CREATE TABLE Account(
	aid				BIGINT			PRIMARY KEY AUTO_INCREMENT,
	accountNum		VARCHAR(11)		NOT NULL,			-- 111-11-1111
	balance			DOUBLE			NOT NULL	DEFAULT 0.0,
	interestRate	DOUBLE			NOT NULL	DEFAULT 0.0,	-- NULL 은 값 자체가 없다는 뜻
	overdraft		DOUBLE			NOT NULL	DEFAULT 0.0,
	accountType		CHAR(1)			NOT NULL	DEFAULT 'S',
	customerId		BIGINT			NOT NULL,					-- 외래키
	regDate 		TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP,
	
	CONSTRAINT Account_CustomerId_FK FOREIGN KEY (customerId) REFERENCES Customer(cid)	-- 외래키를 썼을 때 제약을 말해주는 것
)AUTO_INCREMENT = 3001;

SELECT * FROM Account;
SELECT * FROM Customer;
INSERT INTO Account (accountNum, balance, interestRate, customerId)
VALUES ('333-33-3333',10000.0, 1.4, 1001);

/*이제 두개의 테이블 나온다, innerjoin 가장빠르고 많이 사용한다. 교집합 가져온거*/
SELECT * FROM Account, Customer 
WHERE Acount.customerId = Customer.cid AND Customer.ssn = '901212-1234567';

/*위와 같은 결과값 위에것을 많이 쓰지만 이렇게 기억하세요 */
SELECT * FROM Account a INNER JOIN Customer c ON a.customerId = c.cid;

SELECT * FROM Account a INNER JOIN Customer c ON a.customerId = c.cid
WHERE c.ssn = '901212-1234567';







