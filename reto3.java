public class reto3 {
    public static void main(String[] args) {
        
        String[][] teclado = {
            {"Esc ","f1 ","f2 ","f3 ","f4 ","f5 ","f6 ","f7 ","f8 ","f9 ","f10 ","f11 ","f12 ","prt ","scroll ","pause "},
            {"|","1","2","3","4","5","6","7","8","9","0","'","¿","Borrar","Insert","Home","Page up","Num lock","/","*","-"},
            {"Tab","Q","W","E","R","T","Y","U","I","O","P","´´","+"," ","Delete","End","Page Down","7","8","9","+"},
            {"Caps lock","A","S","D","F","G","H","J","K","L","Ñ","{}","}"," "," "," "," ","4","5","6"," "},
            {"Shift","Z","X","C","V","B","N","M",",",".","-"," ","Shift"," "," ","↑"," "," ","1","2","3","Enter"," "},
            {"Ctrl","WIN","Alt"," "," ","ESPACIO"," "," "," ","Alt gr","WIN","SEL","Ctrl","-","←","↓","→"," ","0"," ","."},
        };


        for(int i=0; i<teclado.length; i++){
            for(int j=0; j<teclado[i].length; j++){
                System.out.print(teclado[i][j]+"\t");
                
            }

            System.out.println();

    }
}
}
