package Clase6Tema5;

import Entities.Carrito;
import Entities.Descuento;
import Entities.ItemCarrito;
import Entities.Persona;
import Entities.Producto;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona cliente = new Persona("Perez", "Juan", "5512455");
		Carrito carritoCompra = new Carrito(cliente);
		Descuento descHoy = new Descuento("Solo por hoy 5% off", 5.00);
		
		carritoCompra.setDesc(descHoy);
		
		Producto prod1 = new Producto("Arroz", 34.00);
		Producto prod2 = new Producto("Fideos", 31.05);
		Producto prod3 = new Producto("Pan", 20.99);
		
		carritoCompra.appendItemCarito(new ItemCarrito(prod1, 2));
		carritoCompra.appendItemCarito(new ItemCarrito(prod2, 1));
		carritoCompra.appendItemCarito(new ItemCarrito(prod3, 4));
		
		carritoCompra.mostrarCarrito();

	}

}
