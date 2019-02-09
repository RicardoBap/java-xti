package br.com.xti.logica;
public class AutoBoxing {

	public static void main(String[] args) {
		
		/*Integer x = new Integer(555); // empacotado
		int a = x.intValue(); // desempacotar
		a++; // incrementa
		
		x = new Integer(a); // re-empacotar
		System.out.println(x.intValue());  */
		
		Integer x = 555;
		x++; // desempacotando, incrementando, reenpacotando
		System.out.println(x); 
		
		// x.intValue();
		
		Boolean v = new Boolean("true");
		if(v) {
			System.out.println(v);
		}
		
	}

}