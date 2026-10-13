package mediatheque;

public class PrintOnlyCDs implements DeviceVisitor {

    @Override
    public void visit(CD cd) {
        System.out.println(cd);
    }

    @Override
    public void visit(Book book) {
        
    }

}

