package JAVA;

public class Main {

	public static void main(String[] args) {
		Porta p1 = new Porta();
		p1.condicao = false;
		p1.cor = "Azul";
		p1.Dx = 0.600;
		p1.Dy = 2;
		p1.Dz = 0.05;

		p1.EstarAberta();
		p1.Abrir();
		p1.Fechar();
		p1.Pintar("Preto");
		p1.EstarAberta();
		p1.Fechar();
		p1.Abrir();
		p1.EstarAberta();
		
		
		

	}

}
