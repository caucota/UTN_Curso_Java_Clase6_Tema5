package Clase6Tema5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import Entities.Carrito;
import Entities.DescuentoPorMonto;
import Entities.ItemCarrito;
import Entities.Persona;
import Entities.Producto;

public class Ejercicio2 {

	public static void main(String[] args) {
		String[] itemCart = new String[3];
		Producto prodRead = new Producto("", 0.0);
		int cantidad = 0;
		Double totalCompra = 0.0;
		Double montoDescuento = 0.0;
		
		Persona cliente = new Persona("Perez", "Juan", "1512455");
		Carrito carritoCompra = new Carrito(cliente);
		DescuentoPorMonto descHoy = new DescuentoPorMonto("No hay descuento", 0.00);
		carritoCompra.setDesc(descHoy);
		
		try {
			for(String lines : Files.readAllLines(Paths.get("C:\\Users\\fcaucota\\eclipse-workspace\\Clase6Tema5\\src\\resources\\ListaItems.txt"))) {
				itemCart = lines.split("\t");
				cantidad = Integer.parseInt(itemCart[0]);
				prodRead = new Producto(itemCart[2].toString(), Double.parseDouble(itemCart[1]) );
				carritoCompra.appendItemCarito(new ItemCarrito(prodRead, cantidad));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		totalCompra = carritoCompra.calcularTotal();
		montoDescuento = carritoCompra.getDesc().getMontoDescuento(totalCompra);
		System.out.println("Total: " + (totalCompra - montoDescuento));
		//carritoCompra.mostrarCarrito();

	}

}
