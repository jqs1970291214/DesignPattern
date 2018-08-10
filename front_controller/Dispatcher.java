package DesignPattern.front_controller;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/10 16:16
 */
public class Dispatcher {
    private StudentView studentView;
    private HomeView homeView;

    public Dispatcher() {
        this.homeView = new HomeView();
        this.studentView = new StudentView();
    }

    public void dispatch(String req) {
        if (req.equalsIgnoreCase("STUDENT")) {
            studentView.show();
        } else {
            homeView.show();
        }
    }
}
