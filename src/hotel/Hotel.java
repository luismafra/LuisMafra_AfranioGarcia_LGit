package hotel;

public class Hotel {

	Recepcao recepcao;

	public Hotel() {
		recepcao = new Recepcao();
	}

	public void checkin(String nome, String tipo, int idade, int dias, double valor) {
		recepcao.checkin(nome, tipo, idade, dias, valor);
	}

	public void checkout(String nome) {
		recepcao.checkout(nome);
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
