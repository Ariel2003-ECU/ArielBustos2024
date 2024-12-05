package clases;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author ariel
 */
public class Calculadora {
    //Abributos     
   private Stack<String>Rehacer;
   private Stack <String> Deshacer;
   public Integer num1;
   public Integer num2;
 
   //Constructor
   public Calculadora(){
    Rehacer=new Stack<>();
    Deshacer=new Stack<>();
    num1=this.num1;
    num2=this.num2;
    
   }
   //Metodo Suma
   public Integer Suma(Integer Resultado){
      num1+num2;
       return Resultado;
    }
}
