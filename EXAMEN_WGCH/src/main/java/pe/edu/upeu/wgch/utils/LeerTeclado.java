package pe.edu.upeu.wgch.utils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 *
 * @author WilliamGabCh
 */
public class LeerTeclado {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public int leer(int valor, String msg){
        System.out.println(msg);
        try {
            valor=Integer.parseInt(br.readLine());
            
        } catch (Exception e) {
            valor=leer(valor, msg);
        }
        return valor;
    }
        
    public long leer(long valor, String msg) {
        System.out.println(msg);
        try {
            valor=Long.parseLong(br.readLine()); 
        } catch (Exception e) {
            valor=leer(valor, msg);
        }
        return valor;
    }  
    public double leer(double valor, String msg){
        System.out.println(msg);
        try {
            valor=Double.parseDouble(br.readLine());
            
        } catch (Exception e) {
            valor=leer(valor, msg);
        }
        return valor;
    }
    public char leer(char valor, String msg){
        System.out.println(msg);
        try {
            valor=br.readLine().charAt(0);
            
        } catch (Exception e) {
            valor=leer(valor, msg);
        }
        return valor;
    }
    public String leer(String valor, String msg){
        System.out.println(msg);
        try {
            valor=String.valueOf(br.readLine());
            
        } catch (Exception e) {
            valor=leer(valor, msg);
        }
        return valor;
    }
    public boolean leer(boolean valor, String msg){
        System.out.println(msg);
        try {
            valor=Boolean.parseBoolean(br.readLine());
            
        } catch (Exception e) {
            valor=leer(valor, msg);
        }
        return valor;
    }
    
}
