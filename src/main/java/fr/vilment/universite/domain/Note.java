package fr.vilment.universite.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_NOTE")
public class Note {

	@EmbeddedId
    private NoteId id;
	
	@Column(name = "NOTE")
	private int note;
	
	@ManyToOne
	@JoinColumn(name = "ID_ETUDIANT", insertable=false, updatable=false)
	private Etudiant etudiant;
	
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	public NoteId getId() {
		return id;
	}
	public void setId(NoteId id) {
		this.id = id;
	}
	public Etudiant getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
}
