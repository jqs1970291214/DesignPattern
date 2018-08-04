package DesignPattern.mediator;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 用户的中介者，聊天室
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/4 17:21
 */
public class ChatRoom {
    public static void showMessage(User user,String message) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = dateFormat.format(new Date());
        System.out.println(time);
        System.out.println(user.getName() + ": " + message);
    }

}
