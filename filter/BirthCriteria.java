package DesignPattern.filter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/7/31 22:01
 */
public class BirthCriteria implements Criteria {

    private Date before;

    @Override
    public List<Person> meetCriteria(List<Person> toCriteria) {
        List<Person> beforeList = new ArrayList<>();
        for (Person person : toCriteria) {
            Date birth = person.getBirthday();
            if (birth != null && birth.before(before)) {
                beforeList.add(person);
            }
        }
        return beforeList;
    }

    public BirthCriteria(Date before) {
        this.before = before;
    }

}
