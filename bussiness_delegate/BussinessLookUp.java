package DesignPattern.bussiness_delegate;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/8 19:37
 */
public class BussinessLookUp {
    public BussinessService getBussinessService(String type) {
        if (type.equalsIgnoreCase("EJB")) {
            return new EJBService();
        } else {
            return new JMSService();
        }
    }
}
