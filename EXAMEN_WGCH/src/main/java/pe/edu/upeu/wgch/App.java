package pe.edu.upeu.wgch;
import pe.edu.upeu.wgch.examen.ResolucionExamen;
import pe.edu.upeu.wgch.utils.LeerTeclado;
/**
 *
 * @author WilliamGabCh
 */
public class App {
 
    public static void main(String[] args) {
        int opcion;
        LeerTeclado lt = new LeerTeclado();
        ResolucionExamen Ejercicios = new ResolucionExamen();
        try {
            opcion = lt.leer(0, "ELIJA UN EJERCICIO DEL 2 al 5: ");

            switch (opcion) {
                case 2:
                    System.out.println("-- EJERCICIO 2 \n --------------");
                    Ejercicios.ejercicio_2();
                    break;
                case 3:
                    System.out.println("-- EJERCICIO 3 \n --------------");
                    Ejercicios.ejercicio_3();
                    break;
                case 4:
                    System.out.println("-- EJERCICIO 4 \n --------------");
                    Ejercicios.ejercicio_4();
                    break;
                case 5:
                    System.out.println("-- EJERCICIO 5 \n --------------");
                    int a = lt.leer(0, "Ingrese numero base");
                    int b = lt.leer(0, "Ingrese la potencia");
                    
                    int respuesta = Ejercicios.ejercicio_5(a,b);
                    System.out.println("RESULTADO: "+respuesta);
                    
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }
        } catch (Exception e) {
            lt.leer(0, "Debes insertar un número");
        }
    }
}
