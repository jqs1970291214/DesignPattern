package DesignPattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/7/31 22:12
 */
public class AndCriteria implements Criteria {
    private List<Criteria> criteriaList;

    @Override
    public List<Person> meetCriteria(List<Person> toCriteria) {
        List<Person> rest = toCriteria;
        for (Criteria criteria : criteriaList) {
            if (rest.size() > 0) {
                rest = criteria.meetCriteria(rest);
            } else {
                break;
            }
        }
        return rest;
    }

    public AndCriteria() {
        criteriaList = new ArrayList<>();
    }

    public void addCriteria(Criteria criteria) {
        criteriaList.add(criteria);
    }
}
