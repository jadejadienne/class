package JAVA;

public class Porta {
	boolean condicao;
	String cor;
	double Dx;
	double Dy;
	double Dz;
	
	
	public void Abrir() {
                if(this.condicao == true) {
			System.out.println("A porta já está ABERTA!");
		}else {
			this.condicao = true;
			System.out.println("Abrindo a porta...");	
		}

	}
	
	public void Fechar() {
		if(this.condicao == false) {
			System.out.println("A porta já está FECHADA!");
		}else {
			this.condicao = false;
			System.out.println("Fechando a porta...");		
		}

	}
	
	public void Pintar(String cor) {
		System.out.println("A porta foi pintada de " + cor.toUpperCase());
	}
	
	public void EstaAberta() {

		if(this.condicao == true) {
			
			System.out.println("Sim! Est� aberta.");
		}else {

			System.out.println("N�o!, Est� fechada.");
		}
	}

}
