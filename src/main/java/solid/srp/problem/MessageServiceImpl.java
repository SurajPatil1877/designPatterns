package solid.srp.problem;

public class MessageServiceImpl implements IMessageService {

    private String content;

    @Override
    public void writeMessage(String msg) {
        content = msg;
    }

    @Override
    public void replaceMessageContent(String source, String destination) {
        content = content.replace(source, destination);
    }

    @Override
    public void printMessage() {
        System.out.println("Message is: " + content);
    }

    @Override
    public void sendMesage() {
        System.out.println("Message sent  and content is : " + content);
    }
}
