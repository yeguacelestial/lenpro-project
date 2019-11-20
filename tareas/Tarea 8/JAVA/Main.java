import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {

    // BOTONES
    private JButton botonCtoF, botonFtoC;

    public Main(){
        //TITULO DE LA VENTANA
        super ("Conversor de temperatura - Hecho por Carlos Nava");

        //CONTENEDOR DE BOTONES
        Container contenedor = getContentPane();
        contenedor.setLayout ( new FlowLayout() );

        // CREACION DE BOTONES
            //BOTON C A F
        botonCtoF = new JButton("°C=>°F");
        contenedor.add(botonCtoF);

            //BOTON F A C
        botonFtoC = new JButton ("°F=>°C");
        contenedor.add(botonFtoC);

        // Creacion de instancia de clase interna ManejadorBoton
        // para usarla en el manejo de eventos del boton

        ManejadorBoton manejador = new ManejadorBoton();
        botonCtoF.addActionListener( manejador );
        botonFtoC.addActionListener( manejador );

        setSize(500,100);
        show();
    } // Fin de constructor Main

    public static void main (String args[]){
        Main ap = new Main();

        ap.addWindowListener(
                new WindowAdapter() {
                    public void windowClosing ( WindowEvent e ){
                        System.exit(0);
                    } // Fin del metodo windowClosing
                } //Fin de clase interna anonima
        ); //Fin de addWindowListener
    } //Fin de main

    //Clase interna para el manejo de datos del boton
    private class ManejadorBoton implements ActionListener {
        public void actionPerformed ( ActionEvent e ){
            JOptionPane.showMessageDialog(null,
                    "Se hará la conversión: " + e.getActionCommand()
            );

            // CONDICIONES

                // °C => °F
            if (e.getActionCommand() == "°C => °F"){

                try { // Intentar procesar la información
                    //Entrada de valores
                    // CREACION DE OBJETO PARA CAPTURAR VALOR
                    Object regresarValor = JOptionPane.showInputDialog(
                            null,
                            "°C: ",
                            "°C => °F",
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            null,
                            null
                    );
                    //System.out.println("Objeto => " + regresarValor);

                    // CASTING DE OBJETO A DOUBLE
                    double valor_c = Double.parseDouble(regresarValor.toString());
                    //System.out.println("double => " + valor_c);

                    // CONVERSION °C A °F (yay!)
                    double conv_c_to_f = (valor_c * 1.8) + 32;
                    //System.out.println(valor_c + "°C => " + conv_c_to_f + "°F");
                    JOptionPane.showMessageDialog(null,
                            valor_c + "°C => " + conv_c_to_f + "°F");
                } //Fin 'try'

                catch (Exception error){ //Si no se introduce un valor válido...
                    JOptionPane.showMessageDialog(null,
                            "[-] No se pudo validar tu valor. No intentes hackear mi programa, pls. :-(");
                }

            }

                // °F => °C
            if (e.getActionCommand() == "°F => °C"){
                //System.out.println("Adios mundo xD");

                try {
                    //Entrada de valores
                    // CREACION DE OBJETO PARA CAPTURAR VALOR
                    Object regresarValor = JOptionPane.showInputDialog(
                            null,
                            "°F: ",
                            "°F => °C",
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            null,
                            null
                    );
                    //System.out.println("Objeto => " + regresarValor);

                    // CASTING DE OBJETO A DOUBLE
                    double valor_f = Double.parseDouble(regresarValor.toString());
                    //System.out.println("double => " + valor_c);

                    // CONVERSION °F A °C (yay!)
                    double conv_f_to_c = (valor_f - 32) / (1.8);
                    //System.out.println(valor_f + "°F => " + conv_f_to_c + "°C");
                    JOptionPane.showMessageDialog(null,
                            valor_f + "°F => " + conv_f_to_c + "°C");
                }
                catch (Exception error){ //Si no se introduce un valor válido...
                    JOptionPane.showMessageDialog(null,
                            "Escribe un valor valido!");
                }
            }
        } // Fin de actionPerformed
    } //Fin de clase ManejadorBoton
} //Fin de clase Main
