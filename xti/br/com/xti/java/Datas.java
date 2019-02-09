package br.com.xti.java;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Datas {

	public static void main(String[] args) {
		
		//01 de Jan 1970 
/*		System.out.println(System.currentTimeMillis());
		
		Date agora = new Date();
		System.out.println(agora);
		
		Date data = new Date(1_000_000_000_000L);
		System.out.println(data);
		
		// Métodos
		data.getTime(); // Recupera a hora atual em milisegundos
		data.setTime(1_000_000_000_000L); // define um tempo em milissegundos
		System.out.println(data.compareTo(agora)); // compara essa data com uma outra data 
												   //(Se a data for menor que a outra data, retorna valor -1,
*/												   //iguai retorna 0 se for maior retorn 1.
//=======================================================================================
		//CALENDAR --> Classes Abstrata não pode ser instanciada
		
/*		Calendar c = Calendar.getInstance(); // Retorna uma instancia de calendario
		new GregorianCalendar(); // --> possivel criar um calendario
		c.set(1980, Calendar.FEBRUARY, 12);
		System.out.println(c.getTime());
		
		System.out.println(c.get(Calendar.YEAR)); // ano
		System.out.println(c.get(Calendar.MONTH)); // mes (mes 0 - 11 --> 0 = Janeiro, 1 = Fevereiro, 2 = Março ...)
		System.out.println(c.get(Calendar.DAY_OF_MONTH)); // dia do mes  */
		
//=======================================================MODIFICA A DATA		
/*		c.set(Calendar.YEAR, 1972); // altera o ano
		c.set(Calendar.MONTH, Calendar.MARCH); // altera o mes
		c.set(Calendar.DAY_OF_MONTH, 25);
		System.out.println(c.getTime());
		
		c.clear(Calendar.MINUTE);
		c.clear(Calendar.SECOND);
		System.out.println(c.getTime());
		
		c.add(Calendar.DAY_OF_MONTH, 1); // aumenta os dias do mes
		c.add(Calendar.YEAR, 1); // adiciona uma unidade ao ano
		System.out.println(c.getTime());
		
		c.add(Calendar.DAY_OF_MONTH, -1); // diminui os dias do mes
		c.add(Calendar.YEAR, -1); // diminui uma unidade ao ano
		System.out.println(c.getTime());	*/
//==========================================================		
		//SAUDAÇÃO COM BOM DIA, BOA TARDE OU BOA NOITE
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1.getTime());
		int hora = c1.get(Calendar.HOUR_OF_DAY);
		if(hora < 12) {
			System.out.println("Bom dia");
		} else if (hora > 12 && hora < 18) {			
			System.out.println("Boa tarde");
		} else if(hora > 18) {
			System.out.println("Boa noite");
		}
	
	}

}
