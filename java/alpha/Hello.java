public class Hello{
  public static void main(String[] args){

	System.out.print("Hello World\n");
	int i,a,b,c;

	System.out.print("a=1, b=2, c=3\n\ty=ax+bx+c");
	a=1;b=2;c=3;
	double wynik;
	wynik = (b*b + (-4.0 * a * c) );
	System.out.print("wynik = ");
	System.out.print(wynik);

private class PobierzDane{
	System.out.print("\nPodaj a [0-256]\n\ta= ");
	Scanner reader = new Scanner(System.in);
	//get user input for a
	a=reader.nextInt();

	System.out.print("\nPodaj b [0-256]\n\tb= ");
	//get user input for a
	b=reader.nextInt();

	System.out.print("\nPodaj c [0-256]\n\tc= ");
	//get user input for a
	c=reader.nextInt();
}


  }
}
