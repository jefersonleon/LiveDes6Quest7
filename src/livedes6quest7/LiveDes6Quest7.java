
package livedes6quest7;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class LiveDes6Quest7 {

    /**
     * Faça um algoritmo que leia vários números inteiros e calcule o somatório
     * dos números negativos. O fim da leitura será indicado pelo número 0.
     */
    public static void main(String[] args) {
        int numero, somatorionumNeg;
        somatorionumNeg = 0;
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Informe "
                    + "valores inteiros ou zero (0) para sair\n"
                    + "Digite:"));
            if(numero<0){
                somatorionumNeg = somatorionumNeg + numero;
            }
        }while(numero!=0);
        JOptionPane.showMessageDialog(null, "O Somatório do número "
                + "negativos digitado é: "+somatorionumNeg);
    }
    
}
