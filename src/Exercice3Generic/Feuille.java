package Exercice3Generic;

import java.util.List;
import java.util.Set;

public class Feuille <T,S> implements Arbre<T>, Sommable<S> {
    private T i;

    public Feuille(T i) {
        this.i = i;
    }

    @Override
    public int taille() {
        return 1;
    }

    @Override
    public boolean contient(T val) {
        return val.equals(i);
    }

    @Override
    public Set<T> valeurs() {
        return Set.of(i);
    }

    @Override
    public String toString() {
        return "Feuille{" +
                "i=" + i +
                '}';
    }

    @Override
    public S sommer(List<S> valeurs) {
        return (S) this.i;
    }
}
