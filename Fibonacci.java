import java.util.Scanner;
public class Fibonacci{
	public static void main(String agrc[]){
        Scanner input=new Scanner(System.in);
        long F0=0,F1=1,ANS=0;
		int N=input.nextInt();
		if(N==0)
            System.out.println("0");
        else if(N==1)
            System.out.println("1");
        else{
        	while(N>=2){
        		ANS=F0+F1;
        		F0=F1;
        		F1=ANS;
        		N--;
        	}
        	System.out.println(ANS);
        }    	
    }
}
