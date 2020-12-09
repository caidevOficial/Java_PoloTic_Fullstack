-- a) Obtener la lista completa de todos los empleados.
SELECT * FROM `empleado`;
-- b) Obtener la lista completa de todos los departamentos.
SELECT * FROM `departamento`;
-- c) Obtener los empleados que tengan el cargo “secretario”.
SELECT * FROM `empleado` WHERE cargo = "FrontEnd Dev";
-- d) Obtener una lista de los nombres y sueldos de cada uno de los empleados.
SELECT nombre,sueldo FROM `empleado`;
-- e) Obtener los datos de los empleados que tengan el cargo de “vendedores” y 
-- que su sueldo sea mayor a $25.000.
SELECT * FROM `empleado` WHERE (cargo = "FrontEnd Dev" AND sueldo>25000);
-- f) Obtener una lista con el nombre, cargo y salario de cada uno de los empleados.
SELECT nombre,cargo,sueldo FROM `empleado`;
-- g) Ordenar esta lista por salario.
SELECT * FROM `empleado` ORDER BY sueldo;