package solid.srp.solution;

public class MessageImpl implements IMessageServiceSolution{
    @Override
    public void printMessage(String content) {
        System.out.println("Message is: " + content);
    }

    @Override
    public void sendMesage(String content) {
        System.out.println("Message sent  and content is : " + content);
    }
}
