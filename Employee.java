class Employee {
	private int eno;
	private String ename;
	private double sal;

	public void setSal(double sal){
		this.sal=sal;
	}

	public double getSal(){
		return sal;
	}

	public void display(){
		System.out.println(" eno: "+eno);
		System.out.println(" ename: "+ ename);
		System.out.println(" sal: "+ sal);
	}
}
