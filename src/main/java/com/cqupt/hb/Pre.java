package com.cqupt.hb;



class Fruit<T>{
	T t;
	public void set(T t){
		this.t =t;
	}
	public T get(){
		return  t;
	}
}
class Apple extends Fruit{
	
}
class Li extends Apple{
	public static void main(String[] args) {
		Fruit<Integer> f = new Fruit<Integer>();
		f.set(123);
		Integer i =f.get();
	}
}

