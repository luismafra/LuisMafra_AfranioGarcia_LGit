package hotel;

public class Hotel {

	Recepcao recepcao;

	public Hotel() {
		recepcao = new Recepcao();
	}

	public void checkIn(String nome, String tipo, int idade, int dias, double valor) {
		recepcao.checkIn(nome, tipo, idade, dias, valor);
	}

	public void checkOut(String nome) {
		recepcao.checkOut(nome);
	}

	public int getNumDeHospedes() {
		return recepcao.getNumDeHospedes();
	}

	public double getLucroTotal() {
		return recepcao.getLucroTotal();
	}

	public String toString() {
		return recepcao.toString();
	}

}
