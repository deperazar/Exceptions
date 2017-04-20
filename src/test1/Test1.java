/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;
/**
 *
 * @author Estudiante
 */
import java.util.*;
public class Test1 {

    public Test1(){  
    }
    
    public double divideByZero(int denominador) 
            throws ArithmeticException{
        double result=0;
        if(denominador==0){
            throw new IllegalArgumentException();
        }
            result=25/denominador;
            return result;
    }
    
    public static void main(String[] args) {
        
        Test1 j=new Test1();
        Scanner teclado=new Scanner (System.in);
        
        int denominador=0;
        double result=0;
        
        for(int i=0;i<5;i++){
            denominador=teclado.nextInt();
            try{
                result=j.divideByZero(denominador);
                System.out.println(result);
            }
            catch(ArithmeticException e){
                System.out.println("Error");
                e.printStackTrace();
            }
            catch(IllegalArgumentException f){
                System.out.println("Error");
                f.printStackTrace();
            }
        }
    }
}
