package mediatheque;

public interface DeviceVisitor {

    public void visit(CD cd);
    public void visit(Book book);
}
