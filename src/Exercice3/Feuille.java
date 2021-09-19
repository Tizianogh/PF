import Exercice3.Arbre;

import java.util.Set;

class Feuille implements Arbre {
    int valeur;

    @Override
    public int taille() {
        return 1;
    }

    @Override
    public boolean contient(Integer val) {
        return val.equals(valeur);
    }

    @Override
    public Set<Integer> valeurs() {
        return null;
    }

    @Override
    public Integer somme() {
        return valeur;
    }

    @Override
    public Integer min() {
        return valeur;
    }

    @Override
    public Integer max() {
        return valeur;
    }

    @Override
    public boolean estTrie() {
        return true;
    }
}