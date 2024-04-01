package Controle;

import Modelagem.Peca;

public class Montador {
	
	private int tamanhoPilha=4;
	private Peca[]ventilador;
	private int ponteiro;
	
	public Montador () {
	this.ventilador = new Peca[tamanhoPilha];
	this.ponteiro=0;
	
}

	public Peca[] getVentilador() {
	return ventilador;
}

	public void setVentilador(Peca[] ventilador) {
	this.ventilador = ventilador;
}

	public void empilhar(Peca peca) {
	System.out.println("Empilhando objeto"+peca.getNome());
		movimentarPilha();
		ventilador[0]= peca;
		ponteiro++;
		printVentilador ();
	}
	public void movimentarPilha() {
		for(int i=0; i<ponteiro;i++) {
		if(ponteiro-i <ventilador.length) {
		ventilador[ponteiro-i]= ventilador[ponteiro-i-1];
		
		}
		}
		ventilador[0]=null;
	}
	public void printVentilador() {
		String retorno="";
		for (int i=0;i<ventilador.length;i++) {
		retorno+= String.format("\t\t[%s] => %s" , i , ventilador [i] != null ?  ventilador[i].getNome():"");
		
	}
		System.out.println(retorno);

}
}