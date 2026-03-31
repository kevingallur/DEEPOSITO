package cuentas;

public class Main {
	public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
	    try {
	        cuenta1.ingresar(cantidad);
	        System.out.println("Saldo actual: " + cuenta1.estado());

	        cuenta1.retirar(cantidad);
	        System.out.println("Saldo tras retirada: " + cuenta1.estado());

	    } catch (Exception e) {
	        System.out.println("Error: " + e.getMessage());
	    }
	}
	public static void main(String[] args) {

	    CCuenta cuenta1 = new CCuenta(
	        "Antonio López",
	        "1000-2365-85-1230456789",
	        2500,
	        0
	    );

	    operativa_cuenta(cuenta1, 100);
	}
    }

