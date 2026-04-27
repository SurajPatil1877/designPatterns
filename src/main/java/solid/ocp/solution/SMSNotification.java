package solid.ocp.solution;

public class SMSNotification extends NotificationSolution {
    @Override
    public void notifyCustomer(String messageBody) {
        System.out.println("SMS  sent content is: " + messageBody);
    }
}
