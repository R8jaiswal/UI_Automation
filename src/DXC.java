
public class DXC {
	 String EmpName;
	 int EmpID;
	protected void Healthcare(String EmpName , int EmpID){
       System.out.println("DXC has: "+EmpName);
       System.out.println("DXC has: "+EmpID);
	
	}
}
 class LSCP extends DXC
{
	 	public static void main(String[] args) {
		// TODO Auto-generated method stub
 LSCP prop= new LSCP();
 prop.Healthcare("Ritika", 11547867);
 
	}

}
