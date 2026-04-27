package solid.ocp.solution;

public class EmailNotification extends NotificationSolution {
    @Override
    public void notifyCustomer(String messageBody) {
        System.out.println("Email sent content is: " + messageBody);
    }
}
