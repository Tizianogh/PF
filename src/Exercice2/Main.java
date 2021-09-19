package Exercice2;

public class Main {
    public static void main(String[] args) {
        Paire<String, String> pair1 = new Paire<>("Salut", "10");

        System.out.println("-------------------");
        System.out.println(pair1.fst());
        System.out.println(pair1.snd());
        System.out.println(pair1);
        System.out.println("-------------------");
        Paire newPaireFst = pair1.changeFst(10.0);

        System.out.println(newPaireFst.fst());
        System.out.println(newPaireFst.snd());
        System.out.println(newPaireFst);
        System.out.println("-------------------");
        Paire newPaireSnd = newPaireFst.changeSnd(10f);

        System.out.println(newPaireSnd.fst());
        System.out.println(newPaireSnd.snd());
        System.out.println(newPaireSnd);

        System.out.println("-------------------");
        Paire<String, Paire> paireComposed = new Paire<>("Salut", pair1);

        System.out.println(paireComposed);
    }
}
