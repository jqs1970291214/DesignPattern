package DesignPattern.filter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/7/31 22:17
 */
public class OrCriteria implements Criteria{
    private List<Criteria> criteriaList;

    @Override
    public List<Person> meetCriteria(List<Person> toCriteria) {
        List<Person> rest = toCriteria;
        Set<Person> restSet = new HashSet<>();
        for (Criteria criteria : criteriaList) {
            rest = criteria.meetCriteria(toCriteria);
            if (rest.size() > 0) {
                restSet.addAll(rest);
            }
        }
        rest.clear();
        rest.addAll(restSet);
        return rest;
    }

    public OrCriteria() {
        criteriaList = new ArrayList<>();
    }

    public void addCriteria(Criteria criteria) {
        criteriaList.add(criteria);
    }
}
