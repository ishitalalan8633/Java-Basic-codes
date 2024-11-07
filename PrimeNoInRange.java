import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		for(int i = n; i<=k; i++){
		    if(isPrime(i)){
		       System.out.println(i);
		    }
		}

	}
    static boolean isPrime(int n){
	      int count = 0;
	      for(int i = 1; i<=n; i++){
	        if(n%i == 0){
	            count ++;
	        }
	      }
	      if(count == 2){
	        return true;
	      }
	      return false;
   }
}
