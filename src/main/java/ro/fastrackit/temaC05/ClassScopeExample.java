package ro.fastrackit.temaC05;

public class ClassScopeExample {
    public int amount = 0;

    static void exempleMethod() {
        int amount = 0;
        amount++;
        System.out.println(amount);

    }

    public Integer anotherexempleMethod() {
        int anotheramount = 0;
        anotheramount = amount + 4;
        return anotheramount;
    }

}
