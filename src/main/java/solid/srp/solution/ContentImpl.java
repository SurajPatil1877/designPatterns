package solid.srp.solution;

public class ContentImpl implements IContentService {
    private String content;
    private IMessageServiceSolution messageService = new MessageImpl();

    @Override
    public void writeMessage(String msg) {
        content = msg;
        messageService.printMessage(content);
    }

    @Override
    public void replaceMessageContent(String source, String destination) {
        content = content.replace(source, destination);
        messageService.sendMesage(content);
    }
}
