package solid.srp;

import solid.srp.problem.IMessageService;
import solid.srp.problem.MessageServiceImpl;

public class SingleResponsibilityPrinciple {
    public static void main(String[] args) {
        // Problem
        IMessageService service = new MessageServiceImpl();
        service.writeMessage("Hi Welcome to Java Design Pattern");
        service.printMessage();

        service.replaceMessageContent("Hi", "Hello");
        service.printMessage();
        service.sendMesage();

        //Solution

    }
}
