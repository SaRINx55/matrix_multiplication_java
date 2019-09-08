package myPackage;
import java.util.*;
public class Matrix_multiplication {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("enter no of rows and columns");
        int row=0,column=0;
        row=s.nextInt();
        column=s.nextInt();
        int[][] a=new int[row][column];
        int[][] b=new int[row][column];
        int[][] res=new int[row][column];

        System.out.println("enter elements of the first matrix");
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                a[i][j]=s.nextInt();

            }
        }
        System.out.println("enter elements of the second matrix");
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                b[i][j]=s.nextInt();

            }
        }

        //main logic pf matrix multiplication:--
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                for (int k=0;k<row;k++){
                    res[i][j]+=a[i][k]*b[k][j];
                }
            }
        }

        //printing
        System.out.println("following is the result");
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.println(res[i][j]);
            }
        }
    }
}
