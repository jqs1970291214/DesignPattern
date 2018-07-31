package DesignPattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/7/31 22:06
 */
public class WeightCriteria implements Criteria {

    private double weightLimit;

    @Override
    public List<Person> meetCriteria(List<Person> toCriteria) {
        List<Person> okList = new ArrayList<>();
        for (Person person : toCriteria) {
            if (person.getWeight() < weightLimit) {
                okList.add(person);
            }
        }
        return okList;
    }

    public WeightCriteria(double weightLimit) {
        this.weightLimit = weightLimit;
    }
}
