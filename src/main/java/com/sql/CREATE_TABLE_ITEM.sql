CREATE TABLE ITEM (
                      ID NUMBER,
                      CONSTRAINT ITEM_PK PRIMARY KEY (ID),
                      NAME NVARCHAR2(100) NOT NULL,
                      DATE_CREATED TIMESTAMP(6) WITH TIME ZONE,
                      LAST_UPDATED_DATE TIMESTAMP(6) WITH TIME ZONE,
                      DESCRIPTION NVARCHAR2(100) NOT NULL
);