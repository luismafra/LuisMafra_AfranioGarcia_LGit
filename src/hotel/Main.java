package hotel;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final String CHECKIN = "checkin", CHECKOUT = "checkout", HOSPEDES = "hospedes", LUCRO = "lucro", ESTADIAS = "estadias", SAIR = "sair";
		final String PROMPT = ">";
		Hotel hotel = new Hotel();
		
		String[] op;
		do {
			
			System.out.print(PROMPT);
			op = (sc.nextLine()).split(" ");
			
			switch(op[0]) {
			
			case CHECKIN:
				try {
					hotel.checkIn(op[1], op[2], Integer.parseInt(op[3]), Integer.parseInt(op[4]), Double.parseDouble(op[5]));
				} catch(IllegalArgumentException iae) {
					System.out.println(iae.getMessage());
				} catch(NullPointerException npe) {
					System.out.println(npe.getMessage());
				} catch(ArrayIndexOutOfBoundsException aiobe) {
					System.out.println("Uso incorreto do sistema. Tente: checkin <nome> <tipo> <idade> <dias> <valor>");
				}
				break;
			
			case CHECKOUT:
				try {
					hotel.checkOut(op[1]);
				} catch(NullPointerException npe) {
					System.out.println(npe.getMessage());
				} catch(ArrayIndexOutOfBoundsException aiobe) {
					System.out.println("Uso incorreto do sistema. Tente: checkout <nome>");
				}
				break;
				
			case HOSPEDES:
				System.out.println(hotel.getNumDeHospedes());
				break;
			
			case LUCRO:
				System.out.println(hotel.getLucroTotal());
				break;
				
			case ESTADIAS:
				System.out.println(hotel.toString());
				break;
				
			case SAIR:
				System.exit(0);
				break;
				
			default:
				System.out.println("Uso incorreto do sistema");
				break;
				
			}
			
			
		} while(op[0] != SAIR);
		
	}

}
