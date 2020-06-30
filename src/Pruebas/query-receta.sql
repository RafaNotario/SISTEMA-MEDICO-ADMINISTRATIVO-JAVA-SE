SELECT
	t_personales.nombre,t_personales.apellidos, 
	t_consultas.fecha,t_consultas.peso, t_consultas.TA,t_consultas.cita,t_consultas.fechacita,
	t_recetas.medicamento,t_recetas.tratamiento,
	c_medicamentos.nombre AS nommedic,
	c_tratamientos.nombre AS nomtratam
FROM
	t_personales
INNER JOIN
	t_consultas 
ON
	t_consultas.expediente = t_personales.expediente
INNER JOIN 
	t_recetas 
ON
	t_consultas.id_consultas = t_recetas.id_consultas AND t_consultas.id_consultas = $P{parameter1}
INNER JOIN
	c_medicamentos
ON
	c_medicamentos.clave = t_recetas.medicamento
INNER JOIN
	c_tratamientos
ON
	c_tratamientos.clave = t_recetas.tratamiento;
