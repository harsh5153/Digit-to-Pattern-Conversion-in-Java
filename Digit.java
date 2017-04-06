import java.util.*;
import java.util.Scanner;

class Digit
{
	void a(){
		System.out.println("* * *");
	}
	void b(){
		System.out.print("*   *\n");
	}
	void c(){
		System.out.println("*\n*");
	}
	void d(){
		System.out.println("    *\n    *");
	}
	void e(){
		System.out.println("*\n*\n*");//three stars in a left column
	}
	void f(){
		System.out.println("    *\n    *\n    *");// three stars in a right column 
	}
	void g(){
		System.out.println("*");// 1 star in left
	}
	void h(){
		System.out.println("    *"); // 1 star at right
	}
	public static void main(String args[]) {
		System.out.println("ENTER THE NUMBER");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Digit d = new Digit();
		switch(n)
		{
			case 0 : d.a();d.b();d.b();d.b();d.a(); //for zero
				  break;
		    case 1 : d.e();d.c();	//FOR ONE
		    	  break;
		    case 2 : d.a();d.h();d.a();d.g();d.a();//FDR TWO
		    	  break;
		    case 3 : d.a();d.h();d.a();d.h();d.a();//FOR 3
		          break;
		    case 4 : d.c();d.a();d.d();// FOR 4
		    	  break;
		    case 5 : d.a();d.g();d.a();d.h();d.a();//FOR 5
		    	  break;
		    case 6 : d.a();d.g();d.a();d.b();d.a();//FOR 6
		    	  break;
		    case 7 : d.a();d.h();d.f();//  FOR 7
		    	  break;
		    case 8 : d.a();d.b();d.a();d.b();d.a();//FOR 8
		    	  break;
		    case 9 : d.a();d.b();d.a();d.h();d.a();
		    	  break;
		    default :
		    	System.out.println("WARNING! ENTER CORRECT NUMBER!!");
		    	  break;
		} 
	}    
}
