class Example02 {

	static int a;
	static int b;

	static void m1(){
		a=10; b=20;
	}
	static void m2(int x,int y){
		a=x;
		b=y;
	}
	static void m3(int a,int b){
		a=a;
		b=b;
	}
	static void m4(int a,int b){
		Example02.a=a;
		Example02.b=b;
	} 
}
