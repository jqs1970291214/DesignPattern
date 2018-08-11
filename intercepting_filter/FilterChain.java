package DesignPattern.intercepting_filter;

import java.util.ArrayList;
import java.util.List;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/11 18:21
 */
public class FilterChain {
    private List<Filter> filterList = new ArrayList<>();

    private Target target;

    public void addFilter(Filter filter) {
        this.filterList.add(filter);
    }

    public void execute(String req) {
        for (Filter filter : filterList) {
            filter.execute(req);
        }
        target.execute(req);
    }

    public void setTarget(Target target) {
        this.target = target;
    }

}
