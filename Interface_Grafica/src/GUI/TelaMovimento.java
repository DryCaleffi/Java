package GUI;
import javax.swing.*;
import java.awt.*;

public class TelaMovimento extends JFrame {

        protected Dimension dLabel, dFrame, dTextField, dButton, dTextArea;
        protected Label lblvalor, lblsaldo;
        protected TextField txtValor, txtSaldo;
        protected Button cmdEntrada, cmdRetirada, cmdConsulta, cmdSair;
        protected TextArea txtArea;

        //construtor personalizado da janela
    public TelaMovimento() {
        //definir a aparencia da janela.
        dFrame = new Dimension(350, 400);
        dLabel = new Dimension (40,  20 );
        dTextField = new Dimension(150, 20);
        dButton = new Dimension (95,  20 );
        dTextArea = new Dimension (300,  140);


        //Aparencia da Janela

        setSize(dFrame);
        setTitle("Controle Caixa");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);// fecha a janela
        setLayout(null);

//Definindo aparencia do controle
        lblvalor = new Label("Valor: ");
        lblvalor.setSize(dLabel);
        lblvalor.setLocation(25,50);
        add(lblvalor);

        lblsaldo = new Label("Saldo: ");
        lblsaldo.setSize(dLabel);
        lblsaldo.setLocation(25,80);
        add(lblsaldo);

        txtValor = new TextField(null);
        txtValor.setSize(dTextField);
        txtValor.setLocation(75,50);
        add(txtValor);

        txtSaldo = new TextField(null);
        txtSaldo.setSize(dTextField);
        txtSaldo.setLocation(75,80);
        add(txtSaldo);

        cmdEntrada = new Button("Depositar");
        cmdEntrada.setSize(dButton);
        cmdEntrada.setLocation(25,150);
        add(cmdEntrada);

        cmdRetirada = new Button("Sacar");
        cmdRetirada.setSize(dButton);
        cmdRetirada.setLocation(225,150);
        add(cmdRetirada);

        cmdConsulta = new Button("Consultar");
        cmdConsulta.setSize(dButton);
        cmdConsulta.setLocation(25,185);
        add(cmdConsulta);

        cmdSair = new Button("Sair");
        cmdSair.setSize(dButton);
        cmdSair.setLocation(225,185);
        add(cmdSair);

        txtArea = new TextArea(null);
        txtArea.setSize(dTextArea);
        txtArea.setLocation(25,220);
        add (txtArea);



    }

}
