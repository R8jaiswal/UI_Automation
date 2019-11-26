 class Override1 {
	
		 public void parentLSCP()
		{
			 System.out.println("Project"); 
		}
		 public void lscpTester1()
		{
			System.out.println("2nd method have 6 testers");
		}
 }
 class Override2 extends Override1{
	 public void parentLSCP()
		{
			 System.out.println("Override2 override parent"); 
		}
	 public	void lscpTester1()
		{
			System.out.println("Override2- 2nd method have 6 testers");
		}
 }
 class Override3 extends Override2{
	 public void parentLSCP1()
		{
			 System.out.println("Override3 override Second parent"); 
		}
	 public	void lscpTester()
		{
			System.out.println("Override3- 3nd also method have 6 testers");
		}
 }
 class Override {
	 public static void main(String[] args) {
		 Override1 obj1= new Override1();
		 obj1.parentLSCP();
		 obj1.lscpTester1();
		 Override2 obj2= new Override2();
		 obj2.parentLSCP();
		 obj2.lscpTester1();
		 Override3 obj3= new Override3();
		 obj3.parentLSCP();
		 obj3.lscpTester1();
		 Override1 obj4= new Override2();
		 obj4.parentLSCP();
		 obj4.lscpTester1();
		 Override1 obj5= new Override3();
		 obj5.parentLSCP();
		 obj5.lscpTester1();
		 Override2 obj6= new Override3();	
		 obj6.parentLSCP();
		 obj6.lscpTester1();		 
		
	 }
 }