package hotel;

import java.util.ArrayList;
import java.util.List;

public class Recepcao {
	
	private List<Estadia> estadias;
	private double lucro = 0;
	
	public Recepcao() {
		
		estadias = new ArrayList<>();
		
	}
	
	public void checkin(String nome,String tipo,int idade,int dias,double valor) {
		
		estadias.add(new Estadia(nome,tipo,idade,dias,valor));
		
	}
	
	public void checkout(String nome) {
		
		Estadia estadia = encontraEstadia(nome);
		if (estadia == null)
			throw new NullPointerException("Esse animal não está hospedado.");
		this.lucro += estadia.getValor() * estadia.getDias();
		estadias.remove(estadia);
		
	}
	
	private Estadia encontraEstadia(String nome) {
		
		for(Estadia estadia:estadias)
			if (estadia.getNome().equals(nome))
				return estadia;
		return null;
		
	}
	
	public int getNumDeHospedes() {
		
		return estadias.size();
		
	}
	
	public double getLucroTotal() {
		
		return lucro;
		
	}
	
	public String toString() {
		
		String aux = "";
		for(Estadia estadia:estadias)
			aux += estadia.getNome() + "(" + estadia.getTipo() + "): " + estadia.getDias() + " dias com o preï¿½o de R$ " + estadia.getValor() + "\n";
		
		return "Estadias:\n" + aux;
		
	}
	
}
