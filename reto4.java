import java.util.Scanner;

public class reto4 {
    public static void main(String[] args) {
        
int c;

Scanner lectura=new Scanner(System.in);

System.out.println("ingrese el tamaño deseado del sudoku");
c=lectura.nextInt();

int[][] tengohambre = new int[c][c];

for(int i=0; i<c; i++){
    
    for(int j=0; j<c; j++){
        System.out.println("dijite los numero deseados de las colomnas ");
        tengohambre[i][j]=lectura.nextInt();
    }

    
}

for(int i=0; i<c; i++){
    for(int j=0; j<c; j++){
        System.out.print(tengohambre[i][j] +"\t");
        
    }
System.out.println("-");
}
lectura.close();
   }
}
