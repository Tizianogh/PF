package Exercice3Generic;

import java.util.Set;

public interface Arbre<T extends Sommable<T>, S> extends Sommable<S> {

    int taille();

    boolean contient(final T val);

    Set<T> valeurs();
}
