package source_pack;

public class condicional {
	
	public static void main(String[] args) {
		int num = 8;
		
		String nombreDia;
		switch(num) {
		case 1:
			nombreDia = "Lunes";
			break;
		case 2:
			nombreDia = "Martes";
			break;
		case 3:
			nombreDia = "Miercoles";
			break;
		case 4:
			nombreDia = "Jueves";
			break;
		case 5:
			nombreDia = "Viernes";
			break;
		case 6:
			nombreDia = "Sabado";
			break;
		case 7:
			nombreDia = "Domingo";
			break;
		default:
			nombreDia = "Incorrecto";
			break;
		}
		System.out.println("El dia de la semana seleccionado es "+nombreDia);
	}
}
