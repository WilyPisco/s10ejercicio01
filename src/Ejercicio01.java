
import java.util.Scanner;



public class Ejercicio01 {

   
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
       System.out.println("\tESTADOS CIVILES\n1:SOLTERO(A)\n2:SOLTERO(A) CONVIVIENTE O VIUDO(A)"+
               "\n3CASADO(A) O SEPARADO(A)\n4:GUARDIAN\n");
       System.out.println("INGRESE EL ESTADO CIVIL");
       int estado=input.nextInt();
       double impuesto=0;
       System.out.println("INGRESE SALARIO ANUAL");
       double ingreso=input.nextDouble();
       if(estado==1){//SOLTERO
           if(ingreso<=8350){
           impuesto=0;
             
           }
           else if(ingreso<=33950){
           impuesto=0;   
            
           }
           else if(ingreso<=82250){
           impuesto=0;   
           
           }
           else if(ingreso<=171550){
           impuesto=0;
           }
           else if(ingreso<=372950){
           impuesto=0;
           }
           else{
           
           }
       }
       else if(estado==2){//SOLTERO CONVIVIENTE O VIUDO(A)
       
       }
       else if(estado==3){//CASADO(A) O SEPARADO
       
       }
       else if(estado==4){//GUARDIAN
       
       }
       
       
       System.out.println("EL IMPUESTO ACUMULADO ES: ");
        
    }
    
}
