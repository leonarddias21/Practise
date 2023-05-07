package sample;

 interface InterfaceA {

	void display();
}
 class Test implements InterfaceA{
	public void display() {
		System.out.println("hello");
	}
}
class InterfaceTest{
	public static void main(String[]args) {
		Test t=new Test();
		t.display();
	}
}
