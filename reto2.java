import java.util.Scanner;

public class reto2 {
    public static void main(String[] args) {


Scanner lectuScanner=new Scanner(System.in);

System.out.println("COMPETENCIA DE NATACION ");

System.out.println("el ganador sera el que tenga un menor tiempo ");
                


        System.out.println("Ingresar la cantidad de competidores");
int c = lectuScanner.nextInt();

int notas[] = new int[c];
String nom[] = new String[c]; 


for(int p=0;p<c;p++) {
    System.out.println("ingrese el nombre del competidor " +(p+1));
    nom[p]=lectuScanner.next();
}
for(int p=0;p<c;p++) {
    System.out.println("ingrese el tiempo del competidor  " + nom[p]+" en segundos");
    notas[p]=lectuScanner.nextInt();
}
    
     lectuScanner.close();
        
        System.out.println("los competidores registrados son:");
        for(int p=0;p<notas.length;p++) {
            
            System.out.println(nom[p] +" / " +notas[p]);
 
                }
                int menor=0;
                for(int p=0;p <c;p++) {
                   
                    if(p==0){
                            menor=notas[p];
                
                        }else if(notas[p]<menor){
                            menor=notas[p];
                        }
         
                        }
                           System.out.println("el ganador es" + nom+"con  "+menor+" segundos"); 
            }
                
           
        
}

            
