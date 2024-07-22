class Bank 
{
	public static void main(String[] args) 
	{
		//creating instance from BankAccount for the class Bank for Ram and Dam 
		BankAccount b1= new BankAccount();//for Ram
		//initilization b1 instance with Ram object values

		BankAccount b2= new BankAccount();//for Dam
		//initilization b2 instance with Dam object values

		b1.bankName="State Bank of India";
		b1.branchName="SBI";
		b1.ifsc="SBNC2019KKO";
		b1.accNo=102938475638473L;
		b1.accHName="Ram";
		b1.balance=85000;
		b1.mobile[0]=823223446L;
		b1.mobile[1]=12424355665L;

		b2.bankName="UCO bank";
		b2.branchName="UCBA";
		b2.ifsc="UCBAIDR09O";
		b2.accNo=102931234538473L;
		b2.accHName="Dam";
		b2.balance=90000;
		b2.mobile[0]=8523214569L;
		b2.mobile[1]=1474152548L;
		System.out.println("\nb1 object value\n");
		System.out.println("b1.bankName :\t"+b1.bankName);
		System.out.println("b1.ifsc :\t"+b1.ifsc);
		System.out.println("b1.accNo :\t"+b1.accNo);
		System.out.println("b1.accHName :\t"+b1.accHName);
		System.out.println("b1.balance :\t"+b1.balance);
		System.out.println("b1.mobile 1st:\t"+b1.mobile[0]);
		System.out.println("b1.mobile 2nd:\t"+b1.mobile[1]);

		System.out.println("\nb2 object value\n");
		System.out.println("b2.bankName :\t"+b2.bankName);
		System.out.println("b2.ifsc :\t"+b2.ifsc);
		System.out.println("b2.accNo :\t"+b2.accNo);
		System.out.println("b2.accHName :\t"+b2.accHName);
		System.out.println("b2.balance :\t"+b2.balance);
		System.out.println("b2.mobile 1st :\t"+b2.mobile[0]);
		System.out.println("b2.mobile 2nd:\t"+b2.mobile[1]);
	}
}
