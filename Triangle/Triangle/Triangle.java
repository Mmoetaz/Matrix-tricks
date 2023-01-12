/*By MhamedMoetaz Boughalmi*/
package Triangle;
public class Triangle {
	public int i,j;
	/*1st Diagonal*/
	public void draw(char mat[][],int n) {
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				mat[i][j]=' ';
			}
		}
		for(i=0;i<n;i++) {
			for(j=0;j<i;j++) {
				mat[i][j]='*';
			}
		}	
		
	}
	/*2nd Diagonal*/
	public void draw_inv(char mat[][],int n) {
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				mat[i][j]=' ';
			}
		}
		for(i=0;i<n;i++) {
			for(j=n-i;j<n;j++) {
				mat[i][j]='*';
			}
		}	
		
	}

	/*Display matrix result*/
	public void display(char mat[][],int n) {
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
	}
}
