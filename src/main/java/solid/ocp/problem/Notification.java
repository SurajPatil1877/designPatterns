package solid.ocp.problem;

public class Notification {
    private static String messageBody;

    public static void notifyCustomer(messageType type, String messageBody) {

        switch (type) {
            case SMS -> System.out.println("SMS sent content is: " + messageBody);
            case EMAIL -> System.out.println("Email sent content is: " + messageBody);
            case PUSH -> System.out.println("PUSH sent content is: " + messageBody); //by implementing the PUSH we have violated the OCP
        }

    }

    public enum messageType {
        //if we want add push notification then we should not modify the notifyCustomer() if done the we are violating the OCP principal
        SMS, EMAIL,PUSH
    }
}
