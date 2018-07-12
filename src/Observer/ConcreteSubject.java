package Observer;
import java.util.*;

public class ConcreteSubject implements Subject{
	private List<Observer> list;
	private String message;
	
	public ConcreteSubject() {
		// TODO Auto-generated constructor stub
		list  = new ArrayList<Observer>();
	}
	
	public void setInfomation(String s) {
        this.message = s;
        System.out.println("������Ϣ�� " + s);
        //��Ϣ���£�֪ͨ���й۲���
        notifyObserver();
    }
	
	
	@Override
	public void registerOberver(Observer ob) {
		// TODO Auto-generated method stub
		list.add(ob);
	}

	@Override
	public void removeObserver(Observer ob) {
		// TODO Auto-generated method stub
		if(!list.isEmpty())
			list.remove(ob);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(int i = 0; i < list.size(); i++) {
            Observer oserver = list.get(i);
            oserver.update(message);
        }
	}
	
}
