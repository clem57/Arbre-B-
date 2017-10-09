package arbre;

import java.util.ArrayList;
import java.util.UUID;

public class Noeud<E> {
	public UUID iD;
	public ArrayList<E> ensbValeurs;
	public ArrayList<UUID> ensbPointeurs;
	public Noeud<E> parent;
	public int niveau;
	public ArrayList<UUID> voisin;
	public float remplissage;
	public boolean isRacine;
	public boolean isFeuille;
	public boolean isIntermediaire;
		
	public Noeud(ArrayList<E> ensbValeurs, boolean isRacine, boolean isFeuille, boolean isIntermediaire) {
		this.iD = UUID.randomUUID();
		this.ensbValeurs = ensbValeurs;
		this.ensbPointeurs = null;
		this.parent = determinationParent();
		this.niveau = determinationNiveau();
		this.voisin = determinationVoisins();
		this.remplissage = determinationRemplissage();
		this.isRacine = isRacine;
		this.isFeuille = isFeuille ;
		this.isIntermediaire = isIntermediaire;
	}	
	
	
	
	public Noeud<E> determinationParent(){
		if (this.isRacine) {
			return null;
		}
	}
	
	public int determinationNiveau() {
		if (this.isRacine) {
			return 0;
		}
	}	
	
	public ArrayList<UUID> determinationVoisins(){}
	
	public float determinationRemplissage() {}
	
	public String toString() {}

}
