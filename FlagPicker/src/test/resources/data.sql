
DROP TABLE continent CASCADE;

CREATE TABLE continent
(
  continent_id int not null PRIMARY KEY,
  continent varchar2(30)
);

DROP TABLE countries CASCADE;

CREATE TABLE countries
(
  countries_id int not null PRIMARY KEY,
  name varchar2(30),
  flag varchar2(10),
  continent varchar2(30)	
);


ALTER TABLE countries ADD FOREIGN KEY (continent) REFERENCES continent(continent);


insert into continent values (1,'Africa');
insert into countries values (2,'Nigeria','NG','Africa');
insert into countries values (3,'Egypt','EG','Africa');

insert into continent values (2,'America');
insert into countries values (5,'Mexico','MX','America');
insert into countries values (4,'USA','US','America');

