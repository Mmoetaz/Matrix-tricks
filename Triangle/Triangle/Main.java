/*By MhamedMoetaz Boughalmi*/
package Triangle;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*print matrix size*/
		Scanner size=new Scanner(System.in);
		System.out.print("Matrix Size (X*X):");
			int n=size.nextInt();
		System.out.println();
		
		/*matrix declaration(instance)*/
		char [][] mat=new char[n+1][n+1];
		
		/*creating new instance from triangle class*/
		Triangle T=new Triangle();
		
		/*calling methods from triangle class */
		System.out.println("1st Diagonal");
		T.draw(mat, n);
		T.display(mat, n);
		System.out.println("\n\n2nd Diagonal:");
		T.draw_inv(mat, n);
		T.display(mat, n);
		
		
		System.out.println("\n\n\nEnd.");
	}

}
