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
//		Listar por Nombre
		return repositorio.listar_n();
//		Listar por Apellido
//		return repositorio.listar_a();
//		Listar por Promedio
//		return repositorio.listar_p();
	}
}
