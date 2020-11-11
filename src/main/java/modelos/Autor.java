package modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="autor")
public class Autor {
	@Id
	@GeneratedValue( strategy=GenerationType.AUTO )
	@Column(name="autor_id")
	private int id;
	@Column(name="nombre")
	private String nombre;
	@Column(name="apellido")
	private String apellido;
	@Column(name="edad")
	private int edad;
	@Column(name="mail")
	private String email;
	/*@OneToOne(targetEntity = Manga.class)
	@JoinColumn(name="manga_id")
	private Manga m;*/
	
	//Contructores
	public Autor() {
		super();
	}
	public Autor(String nombre, String apellido, int edad, String email) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.email = email;
	}
	
	//Getters 6& Setters
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public int getEdad() {
		return edad;
	}
	public String getEmail() {
		return email;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	// To String 
	@Override
	public String toString() {
		return "Autor [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", email="
				+ email + "]";
	}
}
