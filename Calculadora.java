package calculador;
import javax.swing.JOptionPane;
public class Calculadora {
    public static void main(String[] args) {

        String primeironumero = JOptionPane.showInputDialog("Digite o primeiro numero inteiro ");
        String segundonumero = JOptionPane.showInputDialog("Digite o segundo numero inteiro");
        double num1 = Double.parseDouble(primeironumero);
        double num2 = Double.parseDouble(segundonumero);

        String operacao = JOptionPane.showInputDialog("qual operacao voce deseja fazer? 1-soma 2-multiplicacao 3-subtracao 4- divisao ");
        int op = Integer.parseInt(operacao);

        if (op == 1) {
            double soma = num1 + num2;
            JOptionPane.showMessageDialog(null, "a soma e: " + soma, "soma de dois inteiros", JOptionPane.PLAIN_MESSAGE);
        }
        if (op == 2) {
            double multiplicacao = num1 * num2;
            JOptionPane.showMessageDialog(null, "a multiplicacao e: " + multiplicacao, "multiplicacao de dois inteiros", JOptionPane.PLAIN_MESSAGE);
        }
        if (op == 3) {
            double subtracao = num1 - num2;
            JOptionPane.showMessageDialog(null, "a subtracao e: " + subtracao, "subtracao de dois inteiros", JOptionPane.PLAIN_MESSAGE);
        }
        if (op == 4) {
            double divisao = num1 / num2;
            JOptionPane.showMessageDialog(null, "a divisao e: " + divisao, "divisao de dois inteiros", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
