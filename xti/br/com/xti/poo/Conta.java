package br.com.xti.poo;

public class Conta implements java.io.Serializable { // implemntes para a classe serializable
	
	String cliente;
	transient double saldo; // transiente nao esta funcionando || funciona no serializa2
//--------------------------------GETTERS E SETTTERS
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
//--------------------------------CONSTRUTOR
	public Conta() {}
	public Conta(String _cliente, double _saldo) {
		this.cliente = _cliente;
		this.saldo = _saldo;
	}
//--------------------------------	
	public void exibeSaldo() {
		System.out.println(cliente + " seu saldo é " + saldo);
	}
	
	void saca(double valor) {
		// ver se tem autorização
		// se limite do dia não foi ultrapassado
		// se tem saldo na conta
		// --> deduzir do saldo o valor do saque
		// atualizar registro do banco
		// entregar o dinheiro pro cliente
		
		//saldo = saldo - valor;
		saldo -= valor;		
	}
	
	public void deposita(double valor) {
		saldo += valor;
	}
	
	public void transferePara(Conta destino, double valor) {
		this.saca(valor);
		destino.deposita(valor);;
	}
	

}
