package JAVA;

public class Cliente {
	String nome;
	String cpf;
	String telefone;
	Endereco ender = new Endereco();
	
	public void MostrarCliente() {
		System.out.println("====== Informações do cliente ===== ");
		System.out.println("Nome : " + this.nome);
		System.out.println("CPF : " + this.cpf);
		System.out.println("Telefone : " + this.telefone);
		System.out.println("Endereço : " + this.ender.cidade + ", " + this.ender.bairro + ", " + this.ender.rua + ", " + this.ender.numero);
		System.out.println("===================================== ");

	}
	
	

}
