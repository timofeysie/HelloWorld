class Alpha 
{
	String getType() { return "alpha"; }
}
class Beta extends Alpha 
{
	String getType() { return "beta"; }
}
class Gamma extends Beta {
	static int a = 1;
	int b = 1;
	int c;
	String getType() { return "gamma"; }
	public static void main(String[] args) 
	{
		//Gamma g1 = new Alpha();
		//Gamma g2 = new Beta();  // both cause error: incompatable types
		//System.out.println(g1.getType()+" "+g2.getType());
		Gamma g3 = new Gamma();
		System.out.println(Gamma.a+" "+g3.b+" "+g3.c); // 2 1 3
	}
	static {a=2;}
	{c=3;}
}