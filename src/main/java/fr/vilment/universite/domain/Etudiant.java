package fr.vilment.universite.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "T_ETUDIANT")
public class Etudiant {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	@Column(name = "NUMERO_ETUDIANT")
	private int numero_etudiant;
	@Column(name = "NOM")
	private String nom;
	@Column(name = "PRENOM")
	private String prenom;
	@Column(name = "DATE_NAISSANCE")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date date_naissance;
	@Column(name = "SEXE")
	private String sexe;
	@Column(name = "PHOTO")
	private String photo;
	
	@OneToMany(mappedBy="etudiant")
	private List<Note> listNote;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumero_etudiant() {
		return numero_etudiant;
	}
	public void setNumero_etudiant(int numero_etudiant) {
		this.numero_etudiant = numero_etudiant;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public List<Note> getListNote() {
		return listNote;
	}
	public void setListNote(List<Note> listNote) {
		this.listNote = listNote;
	}
}
