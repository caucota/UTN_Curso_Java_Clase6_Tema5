package Entities;

public class Descuento {
	private String descripcion;
	private Double porcentajeDesc;
	
	public Descuento(String descripcion, Double porcentajeDesc) {
		this.descripcion = descripcion;
		this.porcentajeDesc = porcentajeDesc;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPorcentajeDesc() {
		return porcentajeDesc;
	}
	public void setPorcentajeDesc(Double porcentajeDesc) {
		this.porcentajeDesc = porcentajeDesc;
	}

}
