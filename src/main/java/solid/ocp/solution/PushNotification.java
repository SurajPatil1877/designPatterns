package solid.ocp.solution;

public class PushNotification extends NotificationSolution {

    @Override
    public void notifyCustomer(String messageBody) {
        System.out.println("Push Notification sent content is: " + messageBody);
    }
}
