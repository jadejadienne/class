package JAVA;
public class Main {

	public static void main(String[] args) {
		Porta p1 = new Porta();
		Porta p2 = new Porta();
		Porta p3 = new Porta();
		
		p1.condicao = false;
		p1.cor = "Preto";
		p1.Dx = 1.5;
		p1.Dy = 2;
		p1.Dz = 0.05;
		
		p2.condicao = false;
		p2.cor = "Preto";
		p2.Dx = 1.5;
		p2.Dy = 2;
		p2.Dz = 0.05;
		
		p3.condicao = false;
		p3.cor = "Preto";
		p3.Dx = 1.5;
		p3.Dy = 2;
		p3.Dz = 0.05;
		
		Casa c1 = new Casa();
		c1.cor = "Verde";
		c1.setPorta1(p1);
		c1.setPorta2(p2);
		c1.setPorta3(p3);
		
		c1.Pintar("Azul");
		p1.Abrir();
		p2.Abrir();
		p3.Abrir();
		p3.Fechar();
		System.out.println("Total de portas abertas: " + c1.EstaoAbertas());
		
		

	}

}
