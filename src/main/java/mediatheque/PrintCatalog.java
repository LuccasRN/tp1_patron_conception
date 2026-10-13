package mediatheque;

public class PrintCatalog implements DeviceVisitor {

    @Override
    public void visit(CD cd) {
        System.out.println(cd);
    }

    @Override
    public void visit(Book book) {
        System.out.println(book);
    }

}
