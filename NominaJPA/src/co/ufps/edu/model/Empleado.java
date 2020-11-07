package co.ufps.edu.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity
@Table (name="empleado")
@NamedQuery(name="Empleado.findAll", query="SELECT m FROM Empleado m")
public class Empleado implements Serializable{
	
	@Id
	@Column(name="codigo")
	String codigo;
	String cedula,nombre;
	@Column(name="fechanacimiento")
	Date fechaNac;
	@Column(name="fechaingreso")
	Date fechaIngre;
	@Column(name="fecharetiro")
	Date fechaRetir;
	
	public Empleado() {
		
	}
	
	public Empleado(String codigo, String cedula, String nombre, Date fechaNac, Date fechaIngre, Date fechaRetir) {
		super();
		this.codigo = codigo;
		this.cedula = cedula;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.fechaIngre = fechaIngre;
		this.fechaRetir = fechaRetir;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	public Date getFechaIngre() {
		return fechaIngre;
	}
	public void setFechaIngre(Date fechaIngre) {
		this.fechaIngre = fechaIngre;
	}
	public Date getFechaRetir() {
		return fechaRetir;
	}
	public void setFechaRetir(Date fechaRetir) {
		this.fechaRetir = fechaRetir;
	}
	
	
}
