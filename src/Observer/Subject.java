package Observer;

public interface Subject {
	public void registerOberver(Observer ob);
	public void removeObserver(Observer ob);
	public void notifyObserver();
}
