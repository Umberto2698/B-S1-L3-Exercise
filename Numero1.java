import figure.Rettangolo;

public class Numero1 {
    public static void main(String[] args) {

        Rettangolo primoRettangolo = new Rettangolo(12.4, 7.5);
        Rettangolo secondoRettangolo = new Rettangolo(3.9, 18);

        System.out.println(primoRettangolo.area());
        System.out.println(secondoRettangolo.perimetro());

        stampaRettangolo(primoRettangolo);
        stampaDueRettangoli(primoRettangolo, secondoRettangolo);

        System.out.println(primoRettangolo.getClass());

    }

    public static void stampaRettangolo(Object o) {
        if (o.getClass() != figure.Rettangolo.class) {
            System.out.println("Questo metodo funziona solo sui rettangoli.");
        } else {
            Rettangolo rettangolo = (Rettangolo) o;
            System.out.println("Perimetro = " + rettangolo.perimetro() + " Area = " + rettangolo.area());
        }
    }

    public static void stampaDueRettangoli(Object o1, Object o2) {
        if (o1.getClass() != figure.Rettangolo.class || o2.getClass() != figure.Rettangolo.class) {
            System.out.println("Questo metodo funziona solo sui rettangoli.");

        } else {
            Rettangolo rettangolo1 = (Rettangolo) o1;
            Rettangolo rettangolo2 = (Rettangolo) o2;
            double sommaPerimetri = rettangolo1.perimetro() + rettangolo2.perimetro();
            double sommaArea = rettangolo1.area() + rettangolo2.area();
            System.out.println("Perimetro 1 = " + rettangolo1.perimetro() + " Area 1 = " + rettangolo1.area());
            System.out.println("Perimetro 2 = " + rettangolo2.perimetro() + " Area 2 = " + rettangolo2.area());
            System.out.println("La somma dei perimetri è = " + sommaPerimetri + " La somma delle aree è = " + sommaArea);
        }
    }
}
