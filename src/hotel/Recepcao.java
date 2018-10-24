package hotel;

import java.util.ArrayList;
import java.util.List;

public class Recepcao {
	
	private List<Estadia> estadias;
	private double lucro = 0;
	
	public Recepcao() {
		
		estadias = new ArrayList<>();
		
	}
	
	public void checkIn(String nome,String tipo,int idade,int dias,double valor) {
		if(nome == null)
			throw new NullPointerException("Nome não pode ser nulo");
		if(tipo == null)
			throw new NullPointerException("Tipo não pode ser nulo");
		if(nome.trim().equals(""))
			throw new NullPointerException("Nome não pode ser vazio");
		if(tipo.trim().equals(""))
			throw new NullPointerException("Tipo não pode ser vazio");
		
		estadias.add(new Estadia(nome,tipo,idade,dias,valor));
		
	}
	
	public void checkOut(String nome) {
		
		Estadia estadia = encontraEstadia(nome);
		if (estadia == null)
			throw new NullPointerException("Esse animal nao esta hospedado.");
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
			aux += estadia.getNome() + " (" + estadia.getTipo() + "): " + estadia.getDias() + " dias com o preco de R$ " + estadia.getValor() + "\n";
		
		return "Estadias:\n" + aux;
		
	}
	
}
