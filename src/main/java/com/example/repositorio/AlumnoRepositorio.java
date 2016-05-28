package com.example.repositorio;

import java.util.List;
import java.util.Arrays;
import java.util.*;
import org.apache.commons.*;

import com.example.dominio.Alumno;

public class AlumnoRepositorio{
	Alumno[] data = {
			new Alumno("Juan"	, "Perez"	, 15),
			new Alumno("Maria"	, "Flores"	, 11),
			new Alumno("Jose"	, "Ruiz"	, 10),
			new Alumno("Mutta"	, "Jaxa"	, 5),
			new Alumno("Kira"	, "Yagami"	, 20),
			new Alumno("Luffy"	, "Monkey"	, 19),
			new Alumno("Arlong"	, "Kiogyn"	, 13),
			new Alumno("Hibito"	, "Jaxa"	, 12),
			new Alumno("Roger"	, "Waters"	, 18),
			new Alumno("David"	, "Gilmour"	, 9),
			new Alumno("Alex"	, "Baylon"	, 1),
			new Alumno("Zeno"	, "Zoldick"	, 14),
			new Alumno("Gon"	, "Freecs"	, 16),
	};
	
	List<Alumno> alumnos = Arrays.asList(data);
	
	public List<Alumno> listar_n(){
		Collections.sort(alumnos, new Comparator<Alumno>(){
			@Override
			public int compare(Alumno alumno1,Alumno alumno2)
			{
				return alumno1.nombres.compareTo(alumno2.nombres);
			}
		});
		return alumnos;
	}
	
	public List<Alumno> listar_a(){
		Collections.sort(alumnos, new Comparator<Alumno>(){
			@Override
			public int compare(Alumno alumno1,Alumno alumno2)
			{
				return alumno1.apellidoPaterno.compareTo(alumno2.apellidoPaterno);
			}
		});
		return alumnos;
	}
	
	public List<Alumno> listar_p(){
		Collections.sort(alumnos, new Comparator<Alumno>(){
			@Override
			public int compare(Alumno alumno1,Alumno alumno2)
			{
				return alumno1.promedio.compareTo(alumno2.promedio);
			}
		});
		return alumnos;
	}
}

