package main;

public enum EnumFooBarQix {
	
	Foo(3),Bar(5),Qix(7);
	
	private final int value;
	
	private EnumFooBarQix(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
}
