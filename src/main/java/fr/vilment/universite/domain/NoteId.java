package fr.vilment.universite.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class NoteId implements Serializable {

	@Column(name = "ID_ETUDIANT")
    private int id_etudiant;
	@Column(name = "ID_MATIERE")
    private int id_matiere;
 
	public NoteId() {
		
	}

	public NoteId(int id_etudiant, int id_matiere) {
		super();
		this.id_etudiant = id_etudiant;
		this.id_matiere = id_matiere;
	}

	public int getId_etudiant() {
		return id_etudiant;
	}

	public void setId_etudiant(int id_etudiant) {
		this.id_etudiant = id_etudiant;
	}

	public int getId_matiere() {
		return id_matiere;
	}

	public void setId_matiere(int id_matiere) {
		this.id_matiere = id_matiere;
	}
}
