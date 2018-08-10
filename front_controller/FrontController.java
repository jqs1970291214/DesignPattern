package DesignPattern.front_controller;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/10 16:18
 */
public class FrontController {
    private Dispatcher dispatcher;

    public FrontController() {
        this.dispatcher = new Dispatcher();
    }

    private boolean isAuthenticUser(String req) {
        System.out.println("User is authenticated successfully");
        return true;
    }

    private void trackRequest(String req) {
        System.out.println("Page requested: " + req);
    }

    public void dispatchRequest(String req) {
        //记录请求
        trackRequest(req);

        //验证身份，调度请求
        if (isAuthenticUser(req)) {
            dispatcher.dispatch(req);
        }
    }


}
