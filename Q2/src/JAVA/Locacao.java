package JAVA;
import java.time.LocalDateTime;
public class Locacao {
	Automovel carro;
	LocalDateTime dataLocacao;
	LocalDateTime dataDevo;
	double valor;
	Cliente cliente;
	
	public void MostrarLocacao() {
		System.out.println("******Locação de veículos *******");
		System.out.println("Modelo : " + this.carro.modelo);
		System.out.println("Placa: " + this.carro.Placa);
		System.out.println("Cor: " +this.carro.cor);
		System.out.println("Ano : " + this.carro.ano);
		System.out.println("Cliente : " + this.cliente.nome);
		System.out.println("Data de locação : " + this.dataLocacao.toString());
		System.out.println("Data de devolução : " + this.dataLocacao.toString());
		System.out.println("Valor a pagar  :" + this.valor);
		System.out.println("***********************************");

	}
	
	

}
