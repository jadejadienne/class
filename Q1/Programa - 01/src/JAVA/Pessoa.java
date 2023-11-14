package JAVA;

public class Pessoa {
	int idade;
	String nome;
	
	
	public void Aniversario() {
		this.idade = this.idade + 1;
		System.out.println("Você fez aniversário!!!");
	}
	
	public void MostrarIdade() {
		System.out.println("Idade : " + this.idade);
	}

}
