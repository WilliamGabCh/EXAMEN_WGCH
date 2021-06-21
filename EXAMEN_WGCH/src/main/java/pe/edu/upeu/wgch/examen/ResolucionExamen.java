
package pe.edu.upeu.wgch.examen;
import jdk.nashorn.internal.ir.BreakNode;
import pe.edu.upeu.wgch.utils.LeerTeclado;
/**
 *
 * @author WilliamGabCh
 */
public class ResolucionExamen {
    public LeerTeclado lt = new LeerTeclado();
    
    public void ejercicio_2(){
        //DECLARACIÓN DE VARIABLES
        double imp_porAuto, acomulado_cat1=0,acomulado_cat2=0,acomulado_cat3=0;
        double precio_AutoCat1;
        int total_autos=0, categoria;
        double porcent_cat1=0.12, porcent_cat2=0.08, porcent_cat3=0.05;
        
        //PROCESO
        total_autos=lt.leer(0,"--Ingrese el TOTAL DE AUTOS: ");
        
        for(int i=1;i<=total_autos;i++){
            System.out.println("--------------AUTO N° "+i+"--------------");
            categoria=lt.leer(0,"Número de CATEGORIA (1,2,3): ");
            precio_AutoCat1=lt.leer(0.0, "PRECIO del auto: ");

           switch(categoria){
               case 1:
                    imp_porAuto=precio_AutoCat1*porcent_cat1;
                    acomulado_cat1=acomulado_cat1+imp_porAuto;
                    System.out.println("    *** Su impuesto es: "+imp_porAuto);
                break;
               case 2:
                    imp_porAuto=precio_AutoCat1*porcent_cat2;
                    acomulado_cat2+=imp_porAuto;
                    System.out.println("    *** Su impuesto es: "+imp_porAuto);
                 break;
               case 3:
                    imp_porAuto=precio_AutoCat1*porcent_cat3;
                    acomulado_cat3+=imp_porAuto;
                    System.out.println("    *** Su impuesto es: "+imp_porAuto);
                break;
           }
        }
        //RESULTADO
        System.out.println("");
        System.out.println("------IMPUESTO POR CATEGORIA-----");
        System.out.println("    CATEGORIA 1: "+acomulado_cat1);
        System.out.println("    CATEGORIA 2: "+acomulado_cat2);
        System.out.println("    CATEGORIA 3: "+acomulado_cat3);
        System.out.println("------IMPUESTO TOTAL-----");
        System.out.println("    Total: "+(acomulado_cat1+acomulado_cat2+acomulado_cat3));
  
    }
    
    public void ejercicio_3(){
        //Declaración de variables
        int a=0,b=0;
            //procedimiento
        for (a=1;a<=20;a++){
            System.out.println("---- TABLA DEL "+a+" ----");
            for(b=1;b<=10;b++){
                //resultado
               System.out.println(a+" x "+b+" = "+a*b);
            }
           
        }
    }
    
    public void ejercicio_4(){
        //declaración de variables
        int a=1, b=1,c;
        int divi=0;
        System.out.println("- NUMEROS PERFECTOS - ");
        c=lt.leer(0, "Ingrese un número: ");
        //proceso
        while(b<=c){
//            System.out.println(""+b);
            divi=0;
            a=1;
                while (a<=b/2){
                if(b%a == 0){
                    divi = divi+a;}
                a++;
            }
            //resultado
            if (b==divi){
                System.out.println(b+" Es Perfecto");
            } 
            b++;
        }
        System.out.println("--");
    }
    
    public int ejercicio_5(int a, int b){

        if (b == 0) {
            return 1;
        }
        else {
           return a * ejercicio_5(a, b - 1);

        }
    }
}
