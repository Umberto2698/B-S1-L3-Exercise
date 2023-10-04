package eCommerce;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Cliente {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDateTime now = LocalDateTime.now();
    private int id;

    private String name;

    private String surname;

    private String email;

    private String subscriptionDate = dtf.format(now);

    public Cliente(String name, String surname, String email) {
        this.id = (int) (Math.random() * 100);
        this.name = name;
        this.surname = surname;
        this.email = email;
    }
}
