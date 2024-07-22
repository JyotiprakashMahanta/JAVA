class Ex{

	int x=10;

	void m1(){
		x=5;
		System.out.println("This is m1 method");
	}
	void m2(){
		Ex xe=new Ex();
		xe.x=7;
	}
	void m3(){
		x=12;
		Ex xe=new Ex();
		xe.x=14;
	}
	void m4(){
		x=16;
		Ex xe=this;
		xe.x=18;
	}
	void m5(){
		Ex xe=new Ex();
		xe.x=21;
	}
	void m6(){
		int x;
		x=22;
	}
	void m7(){
		int x;
		this.x=23;
	}
}
class Test03 {
	public static void main(String[] args){
		Ex xe=new Ex();
		System.out.println(xe.x);
		xe.m1();
		System.out.println(xe.x);
		xe.m2();
		System.out.println(xe.x);
		xe.m3();
		System.out.println(xe.x);
		xe.m4();
		System.out.println(xe.x);
		xe.m5();
		System.out.println(xe.x);
		xe.m6();
		System.out.println(xe.x);
		xe.m7();
		System.out.println(xe.x);
	} 
}