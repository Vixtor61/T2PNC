package com.uca.capas.tarea2.controller;


import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@RequestMapping("/alumno")
	public @ResponseBody String alumno() {
		
		String nombre = "Victor Ernesto";
		String apellido = "Solorzano Chicas";
		String carnet = "00198117";
		String carrera = "Ing Informatica";
		String annio = "Cuarto";
		String res = 	"<b> Nombre: </b> " + nombre + "<br>" +
						"<b> Npellido: </b> " + apellido + "<br>" +
						"<b> Carnet: </b> " + carnet + "<br>"+
						"<b> Carrera: </b> " + carrera + "<br>" +
						"<b> Año: </b> " + annio + "<br>";
			return res;
			
	}
	
	@RequestMapping("/fecha")
	public @ResponseBody String fecha(HttpServletRequest resquest) {
		
		int annio  = Integer.parseInt(resquest.getParameter("annio")); 
		int mes = Integer.parseInt(resquest.getParameter("mes"));
		int dia = Integer.parseInt(resquest.getParameter("dia"));
		
		String[] diasEspannol = {"Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};
		
		Calendar newdate = Calendar.getInstance(); 
		newdate.set(annio, mes, dia);
	    
	    return "El dia es:  " +  diasEspannol[newdate.get(Calendar.DAY_OF_WEEK)-1] ;
	}
		
}
	