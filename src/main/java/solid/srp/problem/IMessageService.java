package solid.srp.problem;

public interface IMessageService {

    void printMessage();

    void sendMesage();

    /*below mention method are not required here*/
    void writeMessage(String msg);

    void replaceMessageContent(String source, String destination);

}
