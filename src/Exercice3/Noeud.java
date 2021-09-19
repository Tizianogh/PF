import Exercice3.Arbre;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class Noeud implements Arbre {
    private Set<Arbre> fils;

    Noeud(Set<Arbre> fils) {
        this.fils = fils;
    }

    @Override
    public int taille() {

        return 0;
    }

    @Override
    public boolean contient(Integer val) {
        for (Arbre a : fils) {
            if (a.contient(val)) return true;
        }
        return false;
    }

    @Override
    public Set<Integer> valeurs() {
        Set<Integer> valeurs = new HashSet<>();

        for (Arbre a : fils) {
            valeurs.addAll(a.valeurs());
        }

        return valeurs;
    }

    @Override
    public Integer somme() {
        int tot = 0;
        for (Arbre f : fils) {
            tot += f.taille();
        }
        return tot;
    }

    @Override
    public Integer min() {
        return Collections.min(this.valeurs());
    }

    @Override
    public Integer max() {
        return Collections.max(this.valeurs());
    }

    @Override
    public boolean estTrie() {

        for (int i = 0; i < fils.size() - 1; i++) {
            if (fils[i] > fils[i + 1]) {
                return true;
            }
        }
    }
}