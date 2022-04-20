import java.util.Scanner;
public class test{

    public static void main(String[] args) {
	new test();
    }

    public test(){
	Scanner console = new Scanner(System.in);
	
	while(true){
	    System.out.print("N: ");
	    double n = console.nextDouble();
	    System.out.print("M: ");
	    double m = console.nextDouble();

	    int result = 0;

	    for(int i = 1; i <= n; i++){
	        if(i % m == 1){
		    result = i*i;
		    System.out.println(result);
	        }
	    }
	    if(result == 0) System.out.println("NO");	
        }
    }
}