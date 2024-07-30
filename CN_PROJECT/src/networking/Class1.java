package networking;
import java.util.*;
public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count1=0; int count2=0;
		Scanner sc= new Scanner(System.in);
		int d= sc.nextInt();
        while(d>0){
        	for(int i=0;i<=d-count1;i++) {
        		count1+=1+1+i;
        		count2+=2;
        	/*for(int j=0;j<d;j++) {
        		count1+=j+1;
        		count2+=1;
        	}*/
        	}
        	d=d-count1;
        }
        System.out.println(count2);
	}

}
