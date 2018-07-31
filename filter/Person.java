package DesignPattern.filter;

import java.util.Date;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/7/31 21:58
 */
public class Person {
    private String name;
    private Date birthday;
    private double weight;

    public Person(String name, Date birthday, double weight) {
        this.name = name;
        this.birthday = birthday;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
