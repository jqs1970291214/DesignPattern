package DesignPattern.intercepting_filter;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/11 18:18
 */
public class DebugFilter implements Filter {
    @Override
    public void execute(String req) {
        System.out.println("Debug Request: " + req);
    }
}
