package entities.concretes;
import entities.abstracts.Ientity;

import java.time.LocalDate;

public class Customer implements Ientity {
    private final int id;
    private final String nationalityId;
    private final  String name;
    private final String lastName;
    private final int dateTime;

    public Customer(int id, String nationalityId, String name, String lastName, int dateTime) {
        this.id=id;
        this.nationalityId=nationalityId;
        this.name=name;
        this.lastName=lastName;
        this.dateTime=dateTime;
    }
    public int getId() {
        return id;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDateTime() {
        return dateTime;
    }
}
