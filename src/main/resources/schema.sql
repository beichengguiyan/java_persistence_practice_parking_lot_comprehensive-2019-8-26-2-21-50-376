CREATE TABLE parkinglot (
  parkingLotID VARCHAR(36) PRIMARY KEY,
  availablePositionCount int(4) NOT NULL，
  count int(4) NOT NULL，
  id VARCHAR(36)
)；

CREATE TABLE employee (
  id int(4) PRIMARY KEY,
  name VARCHAR(64) NOT NULL,
  age   int(4) NOT NULL
);