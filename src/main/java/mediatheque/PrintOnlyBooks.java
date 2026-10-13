package mediatheque;

public class PrintOnlyBooks implements DeviceVisitor {

    @Override
    public void visit(CD cd) {
    }

    @Override
    public void visit(Book book) {
        System.out.println(book);
    }

}
