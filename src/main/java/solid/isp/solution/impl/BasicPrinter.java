package solid.isp.solution.impl;

import solid.isp.solution.interfaces.IPrint;

public class BasicPrinter implements IPrint {

    @Override
    public void printDocument() {
        System.out.println("Printing Document");
    }
}
