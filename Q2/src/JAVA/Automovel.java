package JAVA;

public class Automovel {
	int Placa;
	String cor;
	int ano;
	String combustivel;
	int numPortas;
	double km;
	String renavan;
	String chassi;
	double valorLocacao;
	Modelo modelo = new Modelo();
	Marca marca = new Marca();
	
	
	public void MostrarCarro(){
		System.out.println("****** DESCRIÇÃO DO CARRO *******");
		System.out.println("Placa: " + this.Placa);
		System.out.println("Cor :" + this.cor);
		System.out.println("Ano: " + this.ano);
		System.out.println("Tipo de combustivel: " + this.combustivel);
		System.out.println("Número de portas: " + this.numPortas);
		System.out.println("Kilometragem: " + this.km);
		System.out.println("Renavan: " + this.renavan);
		System.out.println("Chassi: " + this.chassi);
		System.out.println("Valor da locação: " + this.valorLocacao);
		System.out.println("Modelo :" + this.modelo.descricao);
		System.out.println("Marca: " + this.marca.descricao);
		System.out.println("***********************************");
		
		
	}
	
	public void CadastrarCarro(int placa, String cor, int ano, String combu, int portas, double km, String ren, String cha, double valor, String modelo, String marca) {
		this.Placa = placa;
		this.cor = cor;
		this.ano = ano;
		this.combustivel = combu;
		this.numPortas = portas;
		this.km = km;
		this.renavan = ren;
		this.chassi = cha;
		this.valorLocacao = valor;
		this.modelo.descricao = modelo;
		this.marca.descricao = marca;
	}
	
}
