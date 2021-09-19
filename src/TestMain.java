import Exercice3Generic.Arbre;
import Exercice3Generic.Feuille;
import Exercice3Generic.Noeud;

import java.util.*;

class TestMain {
    public static void main(String[] args) {
        System.out.println(arbre1());
    }

    public static Arbre arbre1() {
        List<Arbre> listTrees = new ArrayList<>();


        Arbre f1 = new Feuille("Test");
        Arbre f2 = new Feuille(2);
        Arbre f3 = new Feuille(10.00);
        Arbre f4 = new Feuille(10f);
        Arbre f5 = new Noeud(Set.of(f1, f2, f3, f4));

        return f5;
    }
}