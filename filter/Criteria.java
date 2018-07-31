package DesignPattern.filter;

import java.util.List;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/7/31 22:00
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> toCriteria);
}
