/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paracticasexamen;

import static paracticasexamen.Main.Operacion;
import static paracticasexamen.Main.numero1;
import static paracticasexamen.Main.numero2;
import static paracticasexamen.Main.resultado;

 
public class Calculadora {
    
    public Calculadora(){
    }
    
    double operacionCaculadora(int numero1,int numero2,String Operacion){
    
             switch(Operacion){
            case  "+":
                resultado=numero1+numero2;
                break;
                case "-":
                resultado=numero1-numero2;
                break;
                case "*":
                resultado=numero1*numero2;
                break;
                case "/":
                resultado=  (double) numero1 /  numero2;
                break;                                
        }             
             
        return   resultado;
        
    }
    
}
