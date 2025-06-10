// import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int row = 5;
        int col = 5;
        System.out.println("No. of rows = "+row);
        // int row = sc.nextInt();
        System.out.println("No. of cols = "+ col);
        // int col = sc.nextInt();
        // sc.close();
        System.out.println("Here is your Pattern:");
        hollowRect(row, col);
        iRHP(row, col);
        iHP(row, col);
        floydTri(row, col);
        binTri(row, col);
        butterfly();
        solidRhombus(row);
        hollowRhom(row);
        diamond(row);
        numPyramid(row);
        palindromic(row);
    }

    public static void hollowRect(int row, int col) {
        System.out.println("\nHollow Rectangle: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 || i == row - 1) {
                    System.out.print(" * ");
                } else if (j == 0 || j == col - 1) {
                    System.out.print(" * ");
                } else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }

    public static void iRHP(int row,int col){
        System.out.println("\nInverted and Rotated Half-Pyramid: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(j<row-i-1){
                    System.out.print("   ");
                }else System.out.print(" * ");
            }
            System.out.println();
        }
    }
    
    public static void iHP(int row, int col){
        System.out.println("\nInverted Half Pyramid:");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(j>=row-i){
                    System.out.print("   ");
                }else System.out.print(" "+(j+1)+" ");
            }
            System.out.println();
        }
    }

    public static void floydTri(int row, int col){
        System.out.println("\nFLOYD'S Triangle");
        int count = 1;
        for (int i=0; i<row; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(" "+(count++)+" ");
            }
            System.out.println();
        }
    }

    public static void binTri(int row, int col){
        System.out.println("\n0/1 Triangle: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<i+1; j++){
                if((i+j)%2==0){
                    System.out.print(" 1 ");
                }else System.out.print(" 0 ");
            }
            System.out.println();
        }
    }

    public static void butterfly(){
        System.out.println("\nButter Fly");
        int n = 4;
        // top
        for(int i=0; i<n; i++){
            // left-top
            for(int j=0; j<n; j++){
                if(j<=i){       // i ki val abhi increment nhi hui h isliye condition m -1 kia 
                    System.out.print(" * ");
                }else System.out.print("   ");
            }
            // right-top
            for(int j=0; j<n; j++){
                if(j<n-1-i){        // i ki val upr vale loop me use ho gyi and voh increment ho gyi h isliye condition m -1 bhi kia 
                    System.out.print("   ");
                }else System.out.print(" * ");
            }
            System.out.println();
        }
        // bottom
        for(int i=0; i<n; i++){
            // left-bottom
            for(int j=0; j<n; j++){
                if(j<n-i){              // i ki val abhi increment nhi hui h isliye condition m -1 kia 
                    System.out.print(" * ");        
                }else System.out.print("   ");
            }
            // right-bottom
            for(int j=0; j<n; j++){
                if(j<=i-1){     // i ki val upr vale loop me use ho gyi and voh increment ho gyi h isliye condition m -1 bhi kia 
                    System.out.print("   ");
                }else System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void solidRhombus (int row){
        System.out.println("\nSolid Rhombus");
        // row
        for(int i=0; i<row; i++){
            // space cols
            for(int j=0; j<row; j++){
                if(j<row-i-1)System.out.print("  ");
                
            }
            // stars
            System.out.println(" * * * * *");
        }
    }

    public static void hollowRhom (int row){
        System.out.println("\nHollow Rhombus");
        // row
        for(int i=0; i<row; i++){
            // space cols
            for(int j=0; j<row; j++){
                if(j<row-i-1)System.out.print("  ");
                
            }
            // hollow rhombus
            for (int j=0; j<row; j++){
                if(i==0||i==row-1||j==0||j==row-1){
                    System.out.print(" *");
                }else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void diamond (int row){
        System.out.println("\nDiamond");
        // top-half
        for(int i=0; i<row; i++){
            // spaces
            for(int j=0; j<row-i;j++){
                System.out.print("  ");
            }
            // stars
            for(int j=0; j<=2*i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        // bottom-half
        for(int i=0; i<row; i++){
            // spaces
            for(int j=0; j<=i;j++){
                System.out.print("  ");
            }
            // stars
            for(int j=0; j<=2*((row-i)-1); j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void numPyramid (int row){
        System.out.println("\nNumber Pyramid: ");
        // rows
        for(int i=0; i<row; i++){
            // spaces
            for(int j=0; j<row-i;j++){
                System.out.print("  ");
            }
            // Num
            for(int j=0; j<=i; j++){
                System.out.print(i+"   ");
            }
            System.out.println();
        }
    }

    public static void palindromic (int row){
        System.out.println("\nPalindromic");
        
        for(int i=0; i<row; i++){
            // spaces
            for(int j=0; j<row-i;j++){
                System.out.print("  ");
            }
            // num
            for(int j=i+1; j>=1; j--){
                System.out.print(j+" ");
            }
            for(int j=2; j<=i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

}