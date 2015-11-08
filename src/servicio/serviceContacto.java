package servicio;

import java.util.Date;

import db.BaseDeDatos.BaseDeDatos;
import modelo.DaoContacto;
import modelo.EntityContacto;

public class serviceContacto {
	private  BaseDeDatos basededatos;
	private DaoContacto DaoContacto1; 
	
	public BaseDeDatos getBasededatos() {
		return basededatos;
	}
	
	public void setBasededatos(BaseDeDatos basededatos) {
		this.basededatos = basededatos;
	}
	
	public serviceContacto()  {
		
		
	}
	public String insertar(String nombre, String apellidos, String telefono, String vinculo, String imagen, String id, String fechaNacimieto) {
		EntityContacto contacto1= new EntityContacto (nombre,apellidos,telefono,vinculo,imagen,Integer.parseInt(id),new Date(fechaNacimieto));
		
		DaoContacto1=new DaoContacto(contacto1, basededatos);
		return DaoContacto1.insertar();					
	}
	
	public String selecionar(String nombre) {
		EntityContacto seleccionar_nombre = new EntityContacto ();
	   DaoContacto1=new DaoContacto(seleccionar_nombre,basededatos);
	  return DaoContacto1.SelectNombre();				
		
	}
	
}
