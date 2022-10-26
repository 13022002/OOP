import java.util.*;
public class PrintStar {
		    public static void main(String[] args)
		    {
		        @SuppressWarnings("resource")
				Scanner s = new Scanner(System.in);
		        System.out.println("Sô dòng muốn in: ");
		        int rows = s.nextInt();
	
		        for (int i = 1; i <= rows; i++) {
		            for (int j = rows-1; j >= i; j--) {
		                System.out.print(" ");
		            }
		            for (int j = 1; j <= 2*i-1; j++) {
		                System.out.print("*");
		            }
		            System.out.println();
		        }
		    }
	}
