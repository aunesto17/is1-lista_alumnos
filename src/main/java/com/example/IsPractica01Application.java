package com.example;

import java.util.List;
import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.dominio.Alumno;
import com.example.repositorio.AlumnoRepositorio;




//@EnableAutoConfiguration
@SpringBootApplication
@Controller
public class IsPractica01Application {
	
	AlumnoRepositorio repositorio = new AlumnoRepositorio();

	public static void main(String[] args) {
		SpringApplication.run(IsPractica01Application.class, args);
	}
	
	@RequestMapping("/alumnos")
	@ResponseBody
	
	public List<Alumno> alumnos1() {
		//return repositorio.listar_n();
		return repositorio.listar_p();
		//return repositorio.listar_p();
	}
//   sorting
	/*
	Collections.sort(alumnos, new Comparator<Alumno>(){
		@override
		public int compare(Alumno alumno1,Alumno alumno2)
		{
			return alumno1.nombres.compareTo(alumno2.nombres);
		}
	});*/
}
