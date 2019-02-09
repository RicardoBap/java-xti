package br.com.xti.poo;

public class Funcionario {
	
    public String nome; // atributo private afeta classe funcionario externo
    private boolean ativo;
//-----------------------------------    
    public String getNome() {
    	return nome;
    }
    
    public void setNome(String _nome) {
    	this.nome = _nome;
    }
//-----------------------------------
    public boolean isAtivo() {
    	return ativo;
    }
    public void setAtivo(boolean _ativo) {
    	this.ativo = _ativo;
    }
//-----------------------------------	

} // fim class
