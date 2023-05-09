insert into carreras(nombre, estado, fecha_creacion, codigo) values ( 'Literatura Espacial', true, NOW(), 'LI-2023')
insert into carreras(nombre, estado, fecha_creacion, codigo) values ( 'Ingenieria de Sistemas Informaticos', true, NOW(), 'II-2023')
insert into carreras(nombre, estado, fecha_creacion, codigo) values ( 'Licenciatura en Enfermeria', true, NOW(), 'LE-2023')
insert into carreras(nombre, estado, fecha_creacion, codigo) values ( 'Ingenieria Civil', true, NOW(), 'IC-2023')



insert into encargados(dui, direccion, telefono, nombre, apellido, email, estado, parentesco, estudios) values ('664556893-9', 'San Ildefonso', '6656-9865', 'Margarita', 'Acevedo', 'margarita@mail.com', true, 'MADRE', 'Secudarios')
insert into encargados(dui, direccion, telefono, nombre, apellido, email, estado, parentesco, estudios) values ('004556893-9', 'Honduras', '4456-9865', 'Gabriel', 'Galdamez', 'gabriel@mail.com', true, 'PADRE', 'universitarios')
insert into encargados(dui, direccion, telefono, nombre, apellido, email, estado, parentesco, estudios) values ('094556893-9', 'Choluteca', '2056-9865', 'Elizabeth', 'Ortiz', 'elizabeth@mail.com', true, 'MADRE', 'primaria')

insert into alumnos(dui, direccion, telefono, nombre, apellido, email, estado, fecha_ingreso, fecha_nacimiento,carrera_id, encargado_id) values('784556893-9', 'San Vicente', '8956-9865', 'Eduardo', 'yanez', 'eduardo@mail.com', true, now(), now(),1, 1)
insert into alumnos(dui, direccion, telefono, nombre, apellido, email, estado, fecha_ingreso, fecha_nacimiento,carrera_id, encargado_id) values('454556893-8', 'Zacatecoluca', '4512-9865', 'Raquel', 'Navarrete', 'raquel@mail.com', true, now(), now(),2, 2)
insert into alumnos(dui, direccion, telefono, nombre, apellido, email, estado, fecha_ingreso, fecha_nacimiento,carrera_id, encargado_id) values('654556893-7', 'San Miguel', '5689-8954', 'Marta', 'Aguilar', 'marta@mail.com', true, now(), now(),3, 3)
insert into alumnos(dui, direccion, telefono, nombre, apellido, email, estado, fecha_ingreso, fecha_nacimiento,carrera_id, encargado_id) values('894556893-6', 'Santa Ana', '5689-2345', 'Azucena', 'Díaz', 'azucena@mail.com', true, now(), now(),4, 1)
insert into alumnos(dui, direccion, telefono, nombre, apellido, email, estado, fecha_ingreso, fecha_nacimiento,carrera_id, encargado_id) values('788956893-5', 'San Salvador', '4222-9865', 'Eduvige', 'Gónzalez', 'eduvige@mail.com', true, now(), now(),1, 2)
insert into alumnos(dui, direccion, telefono, nombre, apellido, email, estado, fecha_ingreso, fecha_nacimiento,carrera_id, encargado_id) values('782356893-4', 'Morazon', '2154-9865', 'Santos', 'Pérez', 'santos@mail.com', true, now(), now(),2, 3)
insert into alumnos(dui, direccion, telefono, nombre, apellido, email, estado, fecha_ingreso, fecha_nacimiento,carrera_id, encargado_id) values('784523893-3', 'Chalatenango', '2154-9865', 'Marcelo', 'Romero', 'marcelo@mail.com', true, now(), now(),3, 1)