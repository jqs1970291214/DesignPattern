package DesignPattern.filter;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/7/31 22:26
 */
public class Test {
    public static void main(String[] args) throws Exception{

        GregorianCalendar calendar = new GregorianCalendar();
        calendar.set(1999, 1, 2);
        Date date1 = calendar.getTime();
        calendar.set(2001, 11, 12);
        Date date2 = calendar.getTime();
        calendar.set(1970, 5, 3);
        Date date3 = calendar.getTime();
        calendar.set(2000, 0, 1);
        Date before = calendar.getTime();

        Person person1 = new Person("Daming", date1, 100.2);
        Person person2 = new Person("Xiaoming", date2, 150.7);
        Person person3 = new Person("Tom", date3, 180.5);

        List<Person> toCriteria = new ArrayList<>();
        toCriteria.add(person1);
        toCriteria.add(person2);
        toCriteria.add(person3);

        BirthCriteria birthCriteria = new BirthCriteria(before);
        WeightCriteria weightCriteria = new WeightCriteria(150.0);

        AndCriteria andCriteria = new AndCriteria();
        OrCriteria orCriteria = new OrCriteria();

        andCriteria.addCriteria(birthCriteria);
        andCriteria.addCriteria(weightCriteria);

        orCriteria.addCriteria(birthCriteria);
        orCriteria.addCriteria(weightCriteria);

        List<Person> result = andCriteria.meetCriteria(toCriteria);

        System.out.println(result.size());
        result = orCriteria.meetCriteria(toCriteria);
        System.out.println(result.size());
    }
}
