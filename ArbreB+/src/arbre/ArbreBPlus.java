package arbre;

public class ArbreBPlus<E> {
	public Noeud<E> racine;
	public int n;
	
	
	public Noeud<E> chercher(E element) {						
		return (chercherRecursif(racine, element));					
	}
	
	public Noeud<E> chercherRecursif(Noeud<E> noeud, E element){	    //rend l'arbre dont la racine est l'element recherché
		if (noeud.isFeuille) {
			return noeud;			
		}
		if (element<noeud.ensbPointeurs[0] {
			return chercherRecursif(, element);
		}
		if(noeud.getRacine().compareTo(element)>0) {				//si la racine est plus grande que l'elt, on cherche sur le fils gauche
			return chercher(noeud.getfG(), element);
		}
		return chercher(noeud.getfD(), element);					//si la racine est plus petite que l'elt, on cherche sur le fils droit	
	}
}
