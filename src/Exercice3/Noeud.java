package Exercice3;

import java.util.*;

class Noeud implements Arbre {
    private Set<Arbre> fils;

    Noeud(Set<Arbre> fils) {
        this.fils = fils;
    }

    @Override
    public int taille() {
        int tot = 0;
        for (Arbre f : fils) {
            tot += f.taille();
        }
        return tot;
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
            tot += f.somme();
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
        List<Arbre> transformedSetToList = new ArrayList<>(fils);

        for (int i = 0; i < this.fils.size(); i++) {
            if (transformedSetToList.get(i).min() > transformedSetToList.get(i + 1).min()) {
                return false;
            }
            this.estTrie();
        }
        return true;
    }
}