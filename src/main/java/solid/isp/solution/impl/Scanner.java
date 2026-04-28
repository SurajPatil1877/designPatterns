package solid.isp.solution.impl;

import solid.isp.solution.interfaces.IScanner;

public class Scanner implements IScanner {

    @Override
    public void scanDocument() {
        System.out.println("Scanning the Document");
    }
}
