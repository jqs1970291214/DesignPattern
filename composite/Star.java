package DesignPattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/1 11:54
 */
public class Star {
    private String starName;
    private double weight;
    private List<Star> otherStarsWithInTheSameSolarSystem;

    public Star(String starName, double weight) {
        this.starName = starName;
        this.weight = weight;
        otherStarsWithInTheSameSolarSystem = new ArrayList<>();
    }

    public void add(Star star) {
        otherStarsWithInTheSameSolarSystem.add(star);
    }

    public void remove(Star star) {
        otherStarsWithInTheSameSolarSystem.remove(star);
    }

    public List<Star> getStars() {
        return this.otherStarsWithInTheSameSolarSystem;
    }

    public String getStarName() {
        return starName;
    }

    public void setStarName(String starName) {
        this.starName = starName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static void main(String[] args) {
        Star sun = new Star("太阳", 100);
        Star earth = new Star("地球", 2.5);
        Star mars = new Star("火星", 2.1);
        Star moon = new Star("月球", 0.7);
        Star jupiter = new Star("木星", 40);

        sun.add(earth);
        sun.add(mars);
        sun.add(moon);
        sun.add(jupiter);
        sun.remove(moon);

        List<Star> stars = sun.getStars();
        for (Star star : stars) {
            System.out.println(star.getStarName() + ": " + star.getWeight());
        }
    }


}
