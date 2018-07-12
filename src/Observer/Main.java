package Observer;

public class Main {
	public static void main(String[] args) {
        ConcreteSubject server = new ConcreteSubject();
        
        Observer userZhang = new ConcreteObserver("ZhangSan");
        Observer userLi = new ConcreteObserver("LiSi");
        Observer userWang = new ConcreteObserver("WangWu");
        
        server.registerOberver(userZhang);
        server.registerOberver(userLi);
        server.registerOberver(userWang);
        server.setInfomation("PHP������������õ����ԣ�");
        
        System.out.println("----------------------------------------------");
        server.removeObserver(userZhang);
        server.setInfomation("JAVA������������õ����ԣ�");
        
    }
}
