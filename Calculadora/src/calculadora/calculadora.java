package Calculadora;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class calculadora {
    public static void main(String[] args) {
        String operacao = JOptionPane.showInputDialog("Digite a operação");
        String firstNumber = JOptionPane.showInputDialog("Digite o primeiro valor");
        String secondNumber = JOptionPane.showInputDialog("Digite o segundo valor");
       
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);
        
        if("somar".equals(operacao)){
            int soma = number1 + number2;
            JOptionPane.showMessageDialog(null, "O resultado da soma é: "+soma, "Soma de dois valores", JOptionPane.PLAIN_MESSAGE );
        } else
        if("subtrair".equals(operacao)){
            int sub = number1 - number2;
            JOptionPane.showMessageDialog(null, "O resultado da subtração é: "+sub, "Subtração de dois valores", JOptionPane.PLAIN_MESSAGE );
        }else
        if("multiplicar".equals(operacao)){
            int mult = number1 * number2;
            JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: "+mult, "Multiplicação de dois valores", JOptionPane.PLAIN_MESSAGE );
        }else{
        if("dividir".equals(operacao)){
            int div = number1 / number2;
            JOptionPane.showMessageDialog(null, "O resultado da divisão é: "+div, "Divisão de dois valores", JOptionPane.PLAIN_MESSAGE );
        } else{
            JOptionPane.showMessageDialog(null, "ERROR ", "ERROR", JOptionPane.PLAIN_MESSAGE );
        }
        }
            
        
       
    }
 
}
