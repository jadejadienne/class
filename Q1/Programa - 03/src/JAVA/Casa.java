package JAVA;

public class Casa {
    String cor;
    Porta p1;
    Porta p2;
    Porta p3;
	
	
	public void Pintar(String cor){
		System.out.println("Sua casa foi pintada de " + cor.toUpperCase());

	}
	public int EstaoAbertas(){
		int abertas = 0;
		if (p1.condicao == true) {
			abertas++;
		}
		if (p2.condicao == true) {
			abertas++;
		}
		if (p3.condicao == true) {
			abertas++;
		}
		
		return abertas;
	}
	
		public void setPorta1(Porta porta1) {
	        this.p1 = porta1;
	    }
	
	    public void setPorta2(Porta porta2) {
	        this.p2 = porta2;
	    }
	
	    public void setPorta3(Porta porta3) {
	        this.p3 = porta3;
	    }
	
	
	

}
