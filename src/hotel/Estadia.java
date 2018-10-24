package hotel;

public class Estadia {
	
	private Animal animal;
	private double valor;
	private int dias;
	
	public Estadia (String nome, String tipo, int idade, int dias, double valor) {
		this.animal = new Animal(nome, tipo, idade);
		this.dias = dias;
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public int getDias() {
		return dias;
	}

	public String getNome () {
		return animal.getNome();
	}
	
	public String getTipo() {
		return animal.getTipo();
	}
	
	public int getIdade() {
		return animal.getIdade();
	}
	
	@Override
	
	public String toString() {
		return this.getNome()+", "+this.getTipo()+", "+this.getDias()+" dias com o preco de R$ "+this.getValor();
	}
	
}
