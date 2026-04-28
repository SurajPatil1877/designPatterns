package solid.isp.problem;

//Forcing scan and fax to basic printer
public class BasicPrinter implements IPrinter {
    @Override
    public void printDocument() {
        System.out.println("Printing Document");
    }

    @Override
    public void scanDocument() {
        throw new UnsupportedOperationException("Scan not supported");
    }

    @Override
    public void faxDocument() {
        throw new UnsupportedOperationException("Fax not supported");
    }
}
