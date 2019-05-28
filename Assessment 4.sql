DROP TABLE ORDERS CASCADE CONSTRAINTS;
DROP TABLE ITEMS CASCADE CONSTRAINTS;

CREATE TABLE ORDERS (
   ORDER_NO          VARCHAR(4)CONSTRAINT ORD_ORDER_NUM_NN NOT NULL,
   ORDER_DATE         DATE,
   CUSTOMER_NAME      VARCHAR(50) CONSTRAINT ORD_CUST_NAME_NN NOT NULL,
   POSTAGE            NUMBER(4,2) CONSTRAINT ORD_POSTAGE_NN NOT NULL,
   ORDER_TOTAL        NUMBER(8,2) CONSTRAINT ORD_TOTAL_NN NOT NULL,
      CONSTRAINT ORD_ORDER_NO_PK PRIMARY KEY (ORDER_NO)
      );
  
CREATE TABLE ITEMS 
   (ITEM_NUMBER          VARCHAR(3)  CONSTRAINT ITEMS_NUM_NN NOT NULL, 
    ITEM_DESCRIPTION     VARCHAR(30) CONSTRAINT ITEMS_DESC_NN NOT NULL, 
    ITEM_SIZE            VARCHAR(2), 
    ITEM_COST            NUMBER(5,2), 
    QTY                  NUMBER(3)  CONSTRAINT ITEMS_QTY_NN NOT NULL, 
    ORDER_NO             VARCHAR(4)CONSTRAINT ITEMS_ORDER_NUM_NN NOT NULL,
        CONSTRAINT ITEMS_ITEM_COST CHECK (ITEM_COST >= 0), 
        CONSTRAINT ITEMS_QUANTITY CHECK (QTY >= 0),     
        CONSTRAINT ITEMS_ITEM_NUM_PK PRIMARY KEY (ITEM_NUMBER),
        CONSTRAINT ITEMS_ORDER_NO_FK FOREIGN KEY (ORDER_NO)
           REFERENCES ORDERS (ORDER_NO)
           );
           

INSERT INTO ORDERS VALUES ('O102', '24/JUN/2014', 'Mark GROOMBRIDGE', 10.00, 31.60);
INSERT INTO ORDERS VALUES ('O103', '16/APR/2014', 'Anton BERGHAUS', 10.00, 82.60);
INSERT INTO ORDERS VALUES ('O104', '12/MAR/2014', 'Sue BARLOW', 10.00, 43.60);
INSERT INTO ORDERS VALUES ('O105', '04/AUG/2014', 'Graham KNIGHT', 10.00, 45.30);
INSERT INTO ORDERS VALUES ('O106', '06/JUN/2014', 'Eric MUNG', 10.00, 64.30);
INSERT INTO ORDERS VALUES ('O107', '16/JUL/2014', 'Hayley BURTON', 10.00, 45.40);
INSERT INTO ORDERS VALUES ('O108', '30/SEP/2014', 'Jono DEPP', 10.00, 47.60);
INSERT INTO ORDERS VALUES ('O109', '02/SEP/2014', 'Shane BENNETT', 10.00, 94.40);
INSERT INTO ORDERS VALUES ('O110', '02/MAY/2014', 'Apollo RAGNALL', 10.00, 25.40);
INSERT INTO ORDERS VALUES ('O111', '09/FEB/2014', 'Jason HOPE', 10.00, 34.00);
INSERT INTO ORDERS VALUES ('O112', '18/OCT/2014', 'Tegan TEAL', 10.00, 76.10);
INSERT INTO ORDERS VALUES ('O113', '09/AUG/2014', 'Raynie GULSON', 10.00, 31.70);
INSERT INTO ORDERS VALUES ('O114', '26/JUL/2014', 'Largo CARIBBEAN', 10.00, 15.70);
INSERT INTO ORDERS VALUES ('O115', '01/MAY/2014', 'Dick CASSIDY', 0.00, 23.90);
INSERT INTO ORDERS VALUES ('O116', '13/APR/2014', 'Scott DUBLIN', 10.00, 72.40);
INSERT INTO ORDERS VALUES ('O117', '07/JUN/2014', 'James ENDEAVOUR', 10.00, 38.70);
INSERT INTO ORDERS VALUES ('O118', '09/APR/2014', 'Candi NORTHWOOD', 10.00, 73.80);
INSERT INTO ORDERS VALUES ('O119', '06/SEP/2014', 'Roy HICKSON', 10.00, 21.10);
INSERT INTO ORDERS VALUES ('O120', '06/MAY/2014', 'Mini COOPER', 10.00, 24.60);
INSERT INTO ORDERS VALUES ('O121', '26/AUG/2014', 'Ringo JUDE', 10.00, 15.80);I
INSERT INTO ORDERS VALUES ('O122', '27/APR/2014', 'May HAYFIELD', 10.00, 26.70);
INSERT INTO ORDERS VALUES ('O123', '17/JUL/2014', 'Rod CRUICKSHANK', 10.00, 29.40);
INSERT INTO ORDERS VALUES ('O124', '21/SEP/2014', 'Sugar DELONGE', 10.00, 10.00);
INSERT INTO ORDERS VALUES ('O125', '03/DEC/2014', 'Sandy HAY', 10.00, 93.10);
INSERT INTO ORDERS VALUES ('O126', '07/MAR/2014', 'Billy DELL', 10.00, 78.50);
INSERT INTO ORDERS VALUES ('O127', '22/JUL/2014', 'Li SHANKAR', 10.00, 74.60);
INSERT INTO ORDERS VALUES ('O128', '25/FEB/2014', 'Terry ROMMA', 10.00, 54.00);
INSERT INTO ORDERS VALUES ('O129', '26/SEP/2014', 'Ian BLOOMFIELD', 10.00, 26.70);
INSERT INTO ORDERS VALUES ('O130', '03/APR/2014', 'David HAANS', 10.00, 34.70);
INSERT INTO ORDERS VALUES ('O131', '13/APR/2014', 'Pitto CAMERON', 10.00, 35.70);
INSERT INTO ORDERS VALUES ('O132', '17/JUN/2014', 'Matthew PINTO', 10.00, 50.60);
INSERT INTO ORDERS VALUES ('O133', '24/MAY/2014', 'Maddie COLLINS', 10.00, 24.50);
INSERT INTO ORDERS VALUES ('O134', '14/FEB/2014', 'James CROOKS', 0.00, 42.20);
INSERT INTO ORDERS VALUES ('O135', '30/MAR/2014', 'Karla JUDE', 10.00, 86.90);
INSERT INTO ORDERS VALUES ('O136', '09/JAN/2014', 'Aaron BOMBAY', 10.00, 79.90);
INSERT INTO ORDERS VALUES ('O137', '28/APR/2014', 'Noah COHEN', 10.00, 55.80);
INSERT INTO ORDERS VALUES ('O138', '04/AUG/2014', 'Moses CLEVELAND', 10.00, 40.80);


INSERT INTO ITEMS VALUES ('I1', 'Easy Breezy Jacket', 'M', 58.99, 1, 'O128');
INSERT INTO ITEMS VALUES ('I2', 'Coco Pant', 'M', 78.99, 1, 'O128');
INSERT INTO ITEMS VALUES ('I3', 'Radiant Dress', 'L', 30.00, 1, 'O130');
INSERT INTO ITEMS VALUES ('I4', 'Denim Jacket', 'L', 05.00, 1, 'O125');
INSERT INTO ITEMS VALUES ('I5', 'Butterfly Crop Top', 'S', 22.99, 1, 'O102');
INSERT INTO ITEMS VALUES ('I6', 'Sleeveless Trench Coat', 'L', 31.00, 1, 'O111');
INSERT INTO ITEMS VALUES ('I7', 'Embellished Knit Top', 'XL', 23.00, 1, 'O123');
INSERT INTO ITEMS VALUES ('I8', 'Baseball cap', '', 15.50, 1, 'O115');
INSERT INTO ITEMS VALUES ('I9', 'Varsity Sweater', 'L', 28.99, 1, 'O128');
INSERT INTO ITEMS VALUES ('I10', 'Front Zip Crop Top', 'S', 07.00, 1, 'O127');
INSERT INTO ITEMS VALUES ('I11', 'Ghita Skirt', 'M', 01.99, 4, 'O131');
INSERT INTO ITEMS VALUES ('I12', 'No Doubt Rolled Short', 'M', 26.50, 3, 'O126');
INSERT INTO ITEMS VALUES ('I13', 'Crewneck sweater', 'M', 09.00, 1, 'O109');
INSERT INTO ITEMS VALUES ('I14', 'Khaki pants', 'M', 30.99, 1, 'O130');
INSERT INTO ITEMS VALUES ('I15', 'Skinny jeans', 'S', 22.00, 1, 'O122');
INSERT INTO ITEMS VALUES ('I16', 'Black cashmere wrap', 'L', 20.50, 1, 'O120');
INSERT INTO ITEMS VALUES ('I17', 'Fleece vest', 'M', 17.99, 1, 'O117');
INSERT INTO ITEMS VALUES ('I18', 'Light waterproof coat', 'S', 03.00, 1, 'O125');
INSERT INTO ITEMS VALUES ('I19', 'Leather blazer', 'XS', 25.99, 4, 'O105');
INSERT INTO ITEMS VALUES ('I20', 'Cashmere hoodie', 'L', 29.00, 1, 'O129');
INSERT INTO ITEMS VALUES ('I21', 'Gray flannel pants', 'L', 31.50, 1, 'O131');
INSERT INTO ITEMS VALUES ('I22', 'Cotton polo', 'M', 20.00, 1, 'O120');
INSERT INTO ITEMS VALUES ('I23', 'Light waterproof coat', 'S', 16.99, 1, 'O122');
INSERT INTO ITEMS VALUES ('I24', 'Capri pants', 'L', 04.99, 3, 'O104');
INSERT INTO ITEMS VALUES ('I25', 'Ribbed cotton tank', 'M', 15.00, 1, 'O115');
INSERT INTO ITEMS VALUES ('I26', 'Khaki shorts', 'L', 20.50, 1, 'O130');
INSERT INTO ITEMS VALUES ('I27', 'Sleeveless Trench Coat', 'S', 11.50,1, 'O131');
INSERT INTO ITEMS VALUES ('I28', 'Sleeveless Trench Coat', 'M', 17.99, 4, 'O117');
INSERT INTO ITEMS VALUES ('I29', 'Denim Jacket', 'S', 20.00, 1, 'O120');
INSERT INTO ITEMS VALUES ('I30', 'Cotton polo', 'L', 08.99, 1, 'O118');
INSERT INTO ITEMS VALUES ('I31', 'Coco Pant', 'M', 18.00, 1, 'O118');
INSERT INTO ITEMS VALUES ('I32', 'Leather blazer', 'L', 14.00, 1, 'O114');
INSERT INTO ITEMS VALUES ('I33', 'Fleece vest', 'L', 28.00, 1, 'O128');
INSERT INTO ITEMS VALUES ('I34', 'Khaki pants', 'S', 22.00, 3, 'O122');
INSERT INTO ITEMS VALUES ('I35', 'Muscle Tee', 'M', 12.99, 1, 'O122');
INSERT INTO ITEMS VALUES ('I36', 'Trench Coat', 'M', 03.00, 1, 'O133');
INSERT INTO ITEMS VALUES ('I37', 'Crewneck sweater', 'XL', 07.00, 1, 'O107');
INSERT INTO ITEMS VALUES ('I38', 'Varsity Sweater', 'M', 08.99, 1, 'O108');
INSERT INTO ITEMS VALUES ('I39', 'Rainbow scarf', '', 12.00, 1, 'O112');

PROMPT ---------------------------------------------------------------
PROMPT Test 1: attempting to insert a non-unique PK
PROMPT Expecting a violation of the PK in the ORDERS table...
INSERT INTO ORDERS VALUES ('O138', '04/AUG/2014', 'Moses CLEVELAND', 10.00, 40.80);
PROMPT ---------------------------------------------------------------
PROMPT Test 2: attempting to an insert an invalid date
PROMPT Expecting a violation of the data type in the ORDER_DATE column...
INSERT INTO ORDERS VALUES ('O139', 'Banana', 'Moses CLEVELAND', 10.00, 40.80);
PROMPT ---------------------------------------------------------------
PROMPT Test 3: attempting to insert a customer name
PROMPT Expecting a violation of the CUSTOMER_NAME charcter restriction...
INSERT INTO ORDERS VALUES ('O140', '04/AUG/2014', 'Kiss-Shot Acerola-Orion Heart-Under-Blade Shinobu Oshino', 10.00, 40.80);
PROMPT ---------------------------------------------------------------
PROMPT Test 4: attempting to insert postage price
PROMPT Expecting a violation of the data type in the POSTAGE column...
INSERT INTO ORDERS VALUES ('O141', '04/AUG/2014', 'Moses CLEVELAND', '10.pp', 40.80);
PROMPT ---------------------------------------------------------------
PROMPT Test 5: attempting to insert a NULL
PROMPT Expecting a violation of the NN in the ORDER_TOTAL column...
INSERT INTO ORDERS VALUES ('O142', '04/AUG/2014', 'Moses CLEVELAND', 10.00, '');
PROMPT ---------------------------------------------------------------
PROMPT Test 6: attempting to insert a non-unique PK
PROMPT Expecting a violation of the PK in the ITEMS table...
INSERT INTO ITEMS VALUES ('I39', 'Rainbow scarf', '', 12.00, 1, 'O112');

PROMPT ---------------------------------------------------------------
PROMPT Test 7: attempting to insert a NULL
PROMPT Expecting a violation of the NN in the ITEM_DESCRIPTION column...
INSERT INTO ITEMS VALUES ('I40', '', '', 12.00, 1, 'O112');

PROMPT ---------------------------------------------------------------
PROMPT Test 8: attempting to insert a size
PROMPT Expecting a violation of the ITEM_SIZE character restriction...
INSERT INTO ITEMS VALUES ('I41', 'Rainbow scarf', 'XXX', 12.00, 1, 'O112');

PROMPT ---------------------------------------------------------------
PROMPT Test 9: attempting to insert a quantity
PROMPT Expecting a violation of the QTY data type in the QTY column...
INSERT INTO ITEMS VALUES ('I42', 'Rainbow scarf', '', 12.00, 'p', 'O112');

PROMPT ---------------------------------------------------------------
PROMPT Test 10: attempting to insert an invalid FK
PROMPT Expecting a violation of the FK in the ORDERS table...
INSERT INTO ITEMS VALUES ('I43', 'Rainbow scarf', '', 12.00, 1, 'O000');