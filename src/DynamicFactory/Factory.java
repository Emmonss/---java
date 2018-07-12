package DynamicFactory;

class Factory {
	Fruit f ;
	public Fruit getInstance(String fruitName) {    
		
        if ("Apple".equals(fruitName)) {//这么写是为了避免null.equal(),空指针异常，有人会问这个为什么吗？  
            f = new Apple();
        }
        if ("Orange".equals(fruitName)) {
            f = new Orange();
        }
        return f;
	}
}
