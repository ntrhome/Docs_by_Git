package Interf;

public interface Interf {
	int NO=1, YES=2;
	
	void Foo();
	default void Boo(int x){ System.out.println(x); }

}

