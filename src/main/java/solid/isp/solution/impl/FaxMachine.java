package solid.isp.solution.impl;

import solid.isp.solution.interfaces.IFax;

public class FaxMachine implements IFax {
    @Override
    public void faxDocument() {
        System.out.println("Faxing the Document");
    }
}
