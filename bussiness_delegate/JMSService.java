package DesignPattern.bussiness_delegate;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/8 19:36
 */
public class JMSService implements BussinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by JSM service");
    }
}
