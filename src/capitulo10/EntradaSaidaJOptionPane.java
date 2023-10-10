package capitulo10;

import javax.swing.*;

public class EntradaSaidaJOptionPane {
    public static void main(String[] args) {

        // obtém a entrada de usuário a partir dos diálogos de entrada JOptionPane
        String firstNumber =
                JOptionPane.showInputDialog("Enter first intteger");
        String secondNumber =
                JOptionPane.showInputDialog("Enter second number");
        // converte String em valores int para utilização em um cálculo
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);

        int sun = number1 + number2;
        // exibe o resultado em um diálogo de mensagem JOptionPane
        JOptionPane.showMessageDialog(null,"The sum is: " + sun,
                "Sum of two Integers", JOptionPane.PLAIN_MESSAGE);
        //Se o primeiro argumento for null, a caixa de diálogo será exibida no centro da tela
        //O segundo argumento é a mensagem a exibir
        //O terceiro argumento —"Sum é a String que deve aparecer na barra de título na parte superior
        //O diálogo PLAIN_MESSAGE não exibe um ícone à esquerda da mensagem

    }
}
