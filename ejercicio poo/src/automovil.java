
public class automovil {
	
	String marca;
	
	int modelo;
	
	int precio;
	
	boolean estado = false;
	
	public automovil() {
		System.out.println("se creo un  objeto de tipo automovil");
	}
	
	public void encender() {
		if (estado == true) {
			System.out.println("el autoovilb ya esta encendido");
		} else {
			System.out.println("el automvil se ha encendido");
			estado = true;
		}
	}
	
	public void apagar(){
		if (estado = false) {
			System.out.println("el autoovilb ya esta apagado");
		} else {
			System.out.println("el automvil se ha apagado");
			estado = false;
		}
	}
	
	public void avanzar(){
		if (estado == true) {
			System.out.println("AVANZANDO");
		} else {
			System.out.println("el auto no avanza porque esta APAGADO");
		}
		
	}
}
