package Exercice3Generic;

import java.util.Set;

public class Feuille <T> implements Arbre<T> {
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

}
