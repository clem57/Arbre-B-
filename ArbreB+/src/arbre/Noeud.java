package arbre;

import java.util.ArrayList;
import java.util.UUID;

public class Noeud <E> {
	public UUID iD;
	public ArrayList<E> ensbValeurs;
	public ArrayList<UUID> ensbPointeurs;
	public int niveau;
	public Noeud<E> parent;
	public UUID voisin;
	public float remplissage;
	public boolean isRacine;
	public boolean isFeuille;
	public boolean isIntermediaire;
		
	public Noeud(ArrayList<E> ensbValeurs) {
		this.iD = UUID.randomUUID();
		this.ensbValeurs = ensbValeurs;
		this.ensbPointeurs = null;
		this.niveau = determinationNiveau();
		this.parent = parent;
		this.voisin = voisin;
		this.remplissage = remplissage;
		this.isRacine = isRacine;
		this.isFeuille = isFeuille;
		this.isIntermediaire = isIntermediaire;
	}	
	
	public int determinationNiveau() {}
}
