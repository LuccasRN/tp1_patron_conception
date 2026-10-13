package mediatheque;

public abstract class Item {
	private String title;

	protected Item(String title) {
		this.title = title;
	}

	@Override 
	public String toString() {
		return title;
	}
	public abstract void accept(DeviceVisitor visitor) ;
}
