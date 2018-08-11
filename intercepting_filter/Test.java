package DesignPattern.intercepting_filter;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/11 18:26
 */
public class Test {
    public static void main(String[] args) {
        Target target = new Target();

        FilterManager manager = new FilterManager(target);

        Filter authenticate = new AuthenticationFilter();
        Filter debug = new DebugFilter();

        manager.setFilter(authenticate);
        manager.setFilter(debug);

        String req = "/homePage";
        String req2 = "/detailPage";
        String req3 = "/exitPage";

        manager.filterRequest(req);
        manager.filterRequest(req2);
        manager.filterRequest(req3);

    }
}
