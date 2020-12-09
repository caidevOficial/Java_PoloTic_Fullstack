-- a) Obtener la lista completa de todos los participantes.
SELECT * FROM `participante`;
-- b) Obtener la lista completa de todas las categorías.
SELECT * FROM `categoria`;
-- c) Obtener todas las participantes mujeres.
SELECT * FROM participante WHERE sexo = 'F';
-- d) Obtener el nombre y apellido de las mujeres inscriptas en la categoría “Damas B”.
SELECT * FROM `participante` WHERE `id_categoria` = (SELECT id_categoria FROM categoria WHERE nombre_categoria='DAMAS A');
-- e) Obtener los datos de los participantes que tengan una edad entre 25 y 37 años.
SELECT * FROM `participante` WHERE edad BETWEEN 27 AND 35;
-- f) Obtener la lista completa de inscripciones, especificando nombre y apellido de 
-- cada uno de los inscriptos.
SELECT i.*, p.nombre,p.apellido FROM inscripcion i, participante p WHERE i.id_participante = p.id_participante;
