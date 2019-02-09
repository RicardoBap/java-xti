package br.com.xti.erros;

public class SenhaTest {
	
	static void autentica(String senha) throws SenhaInvalidaException {
		if ("1234".equals(senha)) {
			//autenticado
			System.out.println("Autenticado");
		} else {
			//senha incorreta
			throw new SenhaInvalidaException("Senha incorreta");
		} // fim else
	} // fim metodo
//---------------------------------------------------------------
	public static void main(String[] args) {
		
		try {
			autentica("134");			
		} catch (SenhaInvalidaException e) {
			e.printStackTrace(); // empilha os erros
			System.out.println(e.getMessage());
		}
//---------------------------------------------------------------					

	} // fim main
} // fim class
