import phone.Sim;

public class Numero2 {
    public static void main(String[] args) {

        Sim primoNumero = new Sim(3662913708L);
        Sim secondoNumero = new Sim(3332113708L);
        secondoNumero.call(primoNumero);
        secondoNumero.setCredit(10);
        secondoNumero.call(primoNumero);
        Sim terzoNumero = new Sim(3272198758L);
        secondoNumero.call(terzoNumero);
        System.out.println(secondoNumero.toString());
        secondoNumero.call(terzoNumero);
        secondoNumero.call(primoNumero);
        secondoNumero.call(terzoNumero);
        System.out.println(secondoNumero.toString());
        secondoNumero.call(terzoNumero);
        System.out.println(secondoNumero.toString());
    }
}
