import java.util.Scanner;

public class reto1 {
    public static void main(String[] args) {

Scanner lectuScanner=new Scanner(System.in);

System.out.println("Ingresar la cantidad de notas");
int c = lectuScanner.nextInt();
double notas[] = new double[c];



for(int p=0;p<notas.length;p++) {
    System.out.println("ingrese la nota " +(p+1));
    notas[p]=lectuScanner.nextDouble();
        }
         double suma=0;
        for(int p=0;p<notas.length;p++) {
            suma+=notas[p];
                }
                double div=suma/c;
                System.out.println("su promedio es de "+div);

                if(div<3){
                    System.out.println("reprobaste");
        
                }else if(div<4){
                    System.out.println("pasaste raspando");
                }else{
                    System.out.println("aprovaste con buenos resutados");
                }
                lectuScanner.close();
        
        
    }
}
