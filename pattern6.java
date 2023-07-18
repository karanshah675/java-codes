
//que: print pattern as shown belove
/*
 *    * * * * * * * * *   
 *   * *               *  
 *  *   *               * 
 * * * * * * * * * * * * *
 * *     *               *
 * *     *               *
 * *     *               *
 * * * * * * * * * * * * *
 */
import java.util.*;

public class pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of your house => ");
        int n = sc.nextInt();
        int max = n * 2;

        //? Upper part of the house
        for (int i = 1; i <= n; i++) {
            //? Print spaces before the asterisks
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }

            //? Print the asterisks and spaces in the house roof
            for (int j = 1; j <= i; j++) {
                if ((j == i) || (j == 1) || (i == n)) {
                    System.out.print(" *"); //? Print asterisk for corners and edges
                } else {
                    System.out.print("  "); //? Print spaces for inner roof
                }
            }

            //? Print the asterisks and spaces for the house walls
            for (int j = 1; j <= max; j++) {
                if (i == 1 || j == max || i == n) {
                    System.out.print(" *"); //? Print asterisk for edges and base
                } else {
                    System.out.print("  "); //? Print spaces for inner walls
                }
            }
            System.out.println(); //? Move to the next line
        }

        //! Lower part of the house
        for (int i = 1; i <= n; i++) {
            //! Print the asterisks and spaces for the house walls
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || i == n) {
                    System.out.print(" *"); //! Print asterisk for edges and base
                } else {
                    System.out.print("  "); //! Print spaces for inner walls
                }
            }

            //! Print the asterisks and spaces for the house base
            for (int j = 1; j <= max; j++) {
                if (j == max || i == n) {
                    System.out.print(" *"); //! Print asterisk for base and edges
                } else {
                    System.out.print("  "); //! Print spaces for inner base
                }
            }
            System.out.println(); //! Move to the next line
            sc.close();
        }
    }
}

