package DynamicFactory;

class Factory {
	Fruit f ;
	public Fruit getInstance(String fruitName) {    
		
        if ("Apple".equals(fruitName)) {//��ôд��Ϊ�˱���null.equal(),��ָ���쳣�����˻������Ϊʲô��  
            f = new Apple();
        }
        if ("Orange".equals(fruitName)) {
            f = new Orange();
        }
        return f;
	}
}
