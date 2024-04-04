package library;

public interface Publication {
	public void open();
	public void close();
	public void leafTrough(int page);
	public void advancePage();
	public void backPage();
}
