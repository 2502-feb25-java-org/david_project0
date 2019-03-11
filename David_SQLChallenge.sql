create table Products(
ID int identity(1,1) Primary KEY,
name varchar(max),
price money);

insert into Products (name, price) values ('Iphone8', $599);
insert into Products (name, price) values ('Samsung Galaxy 8', $768);
insert into Products (name, price) values ('Android X', $1024);
insert into Products (name, price) values ('iPhone', $200);

create table Customers(
ID int identity (1,1) PRIMARY KEY,
FirstName varchar(max),
LastName varchar(max),
CardNumber nvarchar(max),
);

insert into Customers (FirstName, LastName, CardNumber) values ('Tosin','Abasi','15437652');
insert into Customers (FirstName, LastName, CardNumber) values ('Adamn','Neely','79420394');
insert into Customers (FirstName, LastName, CardNumber) values ('Misha','Mansoor','15437652');
insert into Customers (FirstName, LastName, CardNumber) values ('Tina','Smith','15433875');

create table Orders(
ID int identity(1,1) PRIMARY KEY ,
ProductID int,
CustomerID int,
constraint ProductID foreign key (ID) REFERENCES Products(ID),
constraint CustomerID foreign key (ID) REFERENCES Customers(ID));

insert into Orders (ProductID, CustomerID) values (3,'15433875');
select * from Orders where CustomerID = '15433875';

select * 

 


