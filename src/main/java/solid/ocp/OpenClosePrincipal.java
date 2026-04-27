package solid.ocp;

import solid.ocp.solution.EmailNotification;
import solid.ocp.solution.NotificationSolution;
import solid.ocp.solution.PushNotification;
import solid.ocp.solution.SMSNotification;

public class OpenClosePrincipal {

    public static void main(String[] args) {
//        Notification.notifyCustomer(Notification.messageType.SMS, "Your application is received");
//        Notification.notifyCustomer(Notification.messageType.EMAIL, "Your application is approved");

        //By this we can extent the code we can add n number for notifcation now
        NotificationSolution emailNotification = new EmailNotification();
        NotificationSolution smsNotification = new SMSNotification();
        emailNotification.notifyCustomer("Your application is received");
        smsNotification.notifyCustomer("Your application is received");

        //push notification added
        //open for extension
        NotificationSolution pushNotification = new PushNotification();
        pushNotification.notifyCustomer("Your application is received");

    }
}
