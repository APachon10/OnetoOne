package modelos;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="manga")
public class Manga {
	@Id
	@GeneratedValue( strategy=GenerationType.AUTO )
	@Column(name="manga_id")
	private int id;
	@Column(name="titulo")
	private String titulo;
	@Column(name="generos")
	private List<String> generos;
	@OneToOne
	@JoinColumn(name="autor_id")
	private Autor autor;

	//Constructores
	public Manga() {
		super();
	}
	public Manga(int id, String titulo, List<String> generos, Autor autor) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.generos = generos;
		this.autor = autor;
	}
	// Getters && Setters
	public int getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public List<String> getGeneros() {
		return generos;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setGeneros(List<String> generos) {
		this.generos = generos;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	// To String
	@Override
	public String toString() {
		return "Manga [id=" + id + ", titulo=" + titulo + ", generos=" + generos + ", autor=" + autor + "]";
	}
}
