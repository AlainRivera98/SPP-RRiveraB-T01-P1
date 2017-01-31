//Nombre: Roberto Alain Rivera Bravo
//Matrícula: A01411516
//Carrera: IMT11

package spp.rriverab.t01.p1;

import java.util.Scanner;
        

public class SPPRRiveraBT01P1 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        int mat;
        double cal1, cal2, cal3, cal4, cal5, pro;
        String res;
        
        System.out.println("Calculadora de resultado y promedio \n");
        
        System.out.println("Introduzca su matrícula: ");
        mat = teclado.nextInt();
        
        System.out.println("Introduzca su primera calificación: ");
        cal1 = teclado.nextDouble();
        System.out.println("Introduzca su segunda calificación: ");
        cal2 = teclado.nextDouble();
        System.out.println("Introduzca su tercera calificación: ");
        cal3 = teclado.nextDouble();
        System.out.println("Introduzca su cuarta calificación: ");
        cal4 = teclado.nextDouble();
        System.out.println("Introduzca su quinta calificación: ");
        cal5 = teclado.nextDouble();
        
        pro = (cal1+cal2+cal3+cal4+cal5)/5;
        
        if(pro>=7){
            res = "APROBADO";
        }
        else{
            res = "REPROBADO";
        }
        
        System.out.println("Matrícula: " +mat);
        System.out.println("Resultado: " +res);
        System.out.println("Promedio: " +pro);
        
        
    }
    
}
