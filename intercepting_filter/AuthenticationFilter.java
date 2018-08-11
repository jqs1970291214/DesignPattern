package DesignPattern.intercepting_filter;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/11 18:17
 */
public class AuthenticationFilter implements Filter {
    @Override
    public void execute(String req) {
        System.out.println("Authenticating Request: " + req);

    }
}
