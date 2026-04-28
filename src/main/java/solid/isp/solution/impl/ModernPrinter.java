package solid.isp.solution.impl;

import solid.isp.solution.interfaces.IFax;
import solid.isp.solution.interfaces.IPrint;
import solid.isp.solution.interfaces.IScanner;

public class ModernPrinter implements IPrint, IScanner, IFax {
    @Override
    public void faxDocument() {
        System.out.println("Faxing the Document");
    }

    @Override
    public void printDocument() {
        System.out.println("Printing the Document");
    }

    @Override
    public void scanDocument() {
        System.out.println("Scanning the Document");
    }
}
