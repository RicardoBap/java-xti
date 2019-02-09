package br.com.xti.logica;
import java.util.ArrayList;

public class ArraySimples {

	public static void main(String[] args) {	
	
	/*
	String[] paises = {"Brasil", "Russia", "India", "China"};	
	System.out.println(Arrays.toString(paises));
	//System.out.println(paises.length);
	
	// pesquisa dentro do Array
	int posicao = Arrays.binarySearch(paises, "Russia");
	System.out.println(posicao);
	
	Arrays.sort(paises, 0, paises.length);
	System.out.println(Arrays.toString(paises));
	
	Double[] valores = {12.35, 346.3456};
	System.out.println(valores[1].doubleValue());   
//---------------------------------------------------------ARRAYS MULTIDIMENSIOANIS	
	/* ARRAYS MULTIDIMENSIONAIS 
	//String[] nome = {"Ricardo", "Sandra", "Beatriz", "Lawrence", "Laura", "Juliana"};
	//System.out.println(nome[4]);
	//System.out.println(Arrays.toString(nome));
	
	String[][] duas = { 
		{"Ricardo", "M", "DF"},
		{"Sandra", "F", "MG"},
		{"Beatriz", "F", "DF"},
		{"Lawrence", "M", "PA"},
		{"Laura", "F", "RJ"},
		{"Juliana", "F", "SP"}
	};	
	duas[1][0] = "SANDRA";	
	System.out.println(duas[1][0] );   
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	//String[] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
	//String[] nipes = {"Espada", "Paus", "Copas", "Ouros"};
	
	Random f = new Random();
	//System.out.println(r.nextInt(10));
	
	int indiceFace = f.nextInt(faces.length);
	String face = faces[indiceFace];
	
	Random n =  new Random();
	int indiceNipe = n.nextInt(nipes.length);
	String nipe = nipes[indiceNipe];
	
	String carta = face + " " + nipe;
	System.out.println(carta); 
	
	Random f = new Random();	
	String face = faces[f.nextInt(faces.length)];	
	String nipe = nipes[f.nextInt(nipes.length)];
	
	String carta = face + " " + nipe;
	System.out.println(carta);  */
	
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	ArrayList<String> cores = new ArrayList<String>();
	cores.add("Branco");  // cores[0] = "Branco";
	cores.add(0, "Vermelho");  // o indice do array
	cores.add("Amarelo");
	cores.add("Azul");
	
	
	System.out.println(cores);  // (cores.toString())
	System.out.println("Tamanho = " + cores.size());
	System.out.println("Elemento = " + cores.get(2));
	System.out.println("Indice Branco = " + cores.indexOf("Branco"));
	
	cores.remove("Branco");
	
	System.out.println("Tem amarelo? " + cores.contains("Amarelo"));
	System.out.println("Tem Cinza ? = " + cores.contains("Cinza"));
	
	}

}


























