class CC 
{
	int a,b,c,d,e;
	CC(int a,int b){
		this.a=a;
		this.b=b;
	}
	CC(int a,int b,int c){
		this(a,b);
		this.c=c;
	}
	CC(int a,int b,int c,int d){
		this(a,b,c);
		this.d=d;
	}
	CC(int a,int b,int c,int d,int e){
		this(a,b,c,d);
		this.e=e;
	}
	public void display(){
		System.out.println(a+" "+ b+" "+c+" "+d+" "+e);
	}
}
