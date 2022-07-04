package shedulewater.green.model;

@
package packageName;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plant {

    public enum Pot 
    @Id
    private int id;
    private String name;
    private int age;

    

    public Plant(int id, String name, int age, Pot pot) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.pot = pot;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Pot getPot() {
        return this.pot;
    }

    public void setPot(Pot pot) {
        this.pot = pot;
    }

    public Plant id(int id) {
        setId(id);
        return this;
    }

    public Plant name(String name) {
        setName(name);
        return this;
    }

}
