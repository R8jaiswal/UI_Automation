
class Demo {

	static int a=0;
	int b;
	
}
public class Test
{
	public static void main(String[] args) {
		
	
	Demo obj1= new Demo();
	Demo obj2= new Demo();
	obj1.a=10;
	obj1.b=20;
	obj2.a=30;
	obj2.b=40;
	System.out.println(obj1.a);
	System.out.println(obj1.b);
	System.out.println(obj2.a);
	System.out.println(obj2.b);
}
}