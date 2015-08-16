create table GASTOS (id_gastos integer primary key auto_increment,
                        id_tarjeta integer,
                        fecha date,
                        concepto varchar(120),
                        cantidad float,
foreign key(id_tarjeta) references tarjeta(id_tarjeta));