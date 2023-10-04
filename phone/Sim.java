package phone;

import java.util.Arrays;

public class Sim {
    private long number;
    private double credit;
    private String[] callList;

    public Sim(long number) {
        if (number < 1000000000 || number >= 10000000000L) {
            System.out.println("Inserisci un numero intero maggiore di 1000000000 e minore di 10000000000.");
        } else {
            this.number = number;
            this.credit = 0;
            this.callList = new String[5];
        }
    }

    public void call(Object o) {
        if (this.credit < 1.5) {
            System.out.println("Credito insufficente, fare una ricarica di almeno 1.5€");
        } else if (this == o) {
            System.out.println("Non puoi chiamare te stesso.");
        } else if (o == null || this.getClass() != o.getClass()) {
            System.out.println("Numero inesistente.");
        } else {
            Sim called = (Sim) o;
            this.credit -= 0.05;
            boolean pieno = false;
            short n = 0;
            for (int i = 0; i < this.callList.length; i++) {
                if (this.callList[i] == null) {
                    this.callList[i] = Long.toString(called.number) + " Durata: 0:28s";
                    pieno = true;
                    break;
                }
                n++;
            }
            if (n == 5 && !pieno) {
                short k = 3;
                for (int i = 0; i < this.callList.length - 1; i++) {
                    if (i + k >= 4) {
                        this.callList[4 - i] = this.callList[4 - i - 1];

                    } else {
                        this.callList[i + k + 1] = this.callList[i + k];
                    }
                }
                this.callList[0] = Long.toString(called.number) + " Durata: 0:50s";
            }
            System.out.println("Chiamata terminata, credito residuo " + this.credit + "€");
        }
    }

    @Override
    public String toString() {
        return "Sim{" +
                "number=" + number + ",\n" +
                "credit=" + credit + "€" + ",\n" +
                "callList=" + Arrays.toString(callList) +
                '}';
    }


    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        if (number < 1000000000 || number >= 10000000000L) {
            System.out.println("Inserisci un numero intero maggiore di 1000000000 e minore di 10000000000.");
        } else {
            this.number = number;
        }
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        if (credit > 0) {
            this.credit = credit;
        } else {
            System.out.println("Credito non valido.");
        }
    }

    public String[] getCallList() {
        return callList;
    }
}
