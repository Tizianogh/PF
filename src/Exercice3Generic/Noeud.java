package Exercice3Generic;

import java.util.*;

public class Noeud<T,S implements Arbre<T>, Sommable<S> {
    private Set<Arbre> fils;

    public Noeud(Set<Arbre> fils) {
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
    public boolean contient(T val) {
        for (Arbre a : fils) {
            if (a.contient(val)) return true;
        }
        return false;
    }

    @Override
    public Set<T> valeurs() {
        Set<T> valeurs = new HashSet<>();

        for (Arbre a : fils) {
            valeurs.addAll(a.valeurs());
        }

        return valeurs;
    }

    @Override
    public String toString() {
        return "Noeud{" +
                "fils=" + fils +
                '}';
    }

    @Override
    public S sommer(List valeurs) {
        return null;
    }
}