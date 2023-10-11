package capitulo12.exemplos;

import javax.swing.*;
import java.awt.*;

public class LabelFrame extends JFrame {

    private final JLabel label1; //JLabel apenas com Texto
    private final JLabel label2; //JLabel construído com texto e ícone
    private final JLabel label3; //JLabel com texto e ícone adicionados

    //construtor LabelFrame adiciona JLabel a JFrame
    public LabelFrame() {


        super("Testing JLabel");

        setLayout(new FlowLayout());

        // Construtor JLabel com um argumento de string


        label1 = new JLabel("Label with text");
        label1.setToolTipText("This label1");

        add(label1);

        // construtor JLabel com string, Icon e argumentos de alinhamento
        Icon bug = new ImageIcon(getClass().getResource("/capitulo12/img/bug.png"));
        label2 = new

        JLabel("Label with text and icon", bug, SwingConstants.LEFT);
        label2.setToolTipText("This label2");

        add(label2);

        // Construtor JLabel sem argumentos
        label3 = new

                JLabel();
        label3.setText("Label with icon and text at botton");
        label3.setIcon(bug);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is label3");

        add(label3); // adiciona label3 ao JFrame
    }
}


