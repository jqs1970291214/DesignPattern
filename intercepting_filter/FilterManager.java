package DesignPattern.intercepting_filter;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/11 18:23
 */
public class FilterManager {
    private FilterChain chain;

    public FilterManager(Target target) {
        chain = new FilterChain();
        chain.setTarget(target);
    }

    public void setFilter(Filter filter) {
        chain.addFilter(filter);
    }

    public void filterRequest(String req) {
        chain.execute(req);
    }
}
