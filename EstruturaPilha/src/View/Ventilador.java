package View;

import Controle.Montador;
import Modelagem.Peca;

public class Ventilador {

	public static void main(String[] args) {
		Peca suporte = new Peca(1,"Suporte");
		Peca helice = new Peca(2,"Helice");
		Peca lampada = new Peca(3,"Lampada");
		Peca cupula = new Peca(4,"Cupula");
		
		Montador m = new Montador();
		System.out.println("\n\n---------- Empilhando");
		m.empilhar(suporte);
		m.empilhar(helice);
		m.empilhar(lampada);
		m.empilhar(cupula);
		System.out.println("\n");
		System.out.println("Imprimindo Pilha");
		m.printVentilador();
		
	}
	}


