// LIBRERIAS DE CREACION DE OBJETOS JBUTTON
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Monedas extends JFrame{
	
	//BOTONES
	private JButton dolar,euro,yen,dolar_hk;
	
	public Monedas(){
		
		//TITULO DE LA VENTANA
		super ("Conversion de Monedas (MXN)");
		
		//CONTENEDOR DE BOTONES
		Container contenedor = getContentPane();
		contenedor.setLayout ( new FlowLayout() );
		
		//CREACION DE BOTONES
			//BOTON DOLAR
			dolar = new JButton ("Dolar");
			contenedor.add(dolar);
			
			//BOTON EURO
			euro = new JButton ("Euro");
			contenedor.add(euro);
			
			//BOTON YEN
			yen = new JButton ("Yen");
			contenedor.add(yen);
			
			//BOTON DOLAR HONG KONG
		    dolar_hk = new JButton ("Dolar de Hong Kong");
			contenedor.add(dolar_hk);
		   
		   //Instancia de clase interna "ManejadorBoton"
		   //se usa en el manejo de eventos del boton
		   ManejadorBoton manejador = new ManejadorBoton();
		   dolar.addActionListener( manejador );
		   euro.addActionListener ( manejador );
		   yen.addActionListener ( manejador );
		   dolar_hk.addActionListener ( manejador );
		   
		   setSize(500,100);
		   show();
	} //Fin de constructor Main
	
	public static void main (String[] args){
		Main ap = new Main();
		
		ap.addWindowListener(
			new WindowAdapter() {
				public void windowClosing ( WindowEvent e ){
					System.exit(0);
				} // Fin de metodo windowClosing
			} //Fin de clase interna WindowAdapter
			);//fin de addWindowListener
	} //Fin de main
	
	//Clase interna para el manejo de datos del boton
	private class ManejadorBoton implements ActionListener {
		public void actionPerformed ( ActionEvent e ){
			JOptionPane.showMessageDialog (
				null,
				"Seleccionaste: " + e.getActionCommand()
			);
			
			//CONDICIONES
			
				//DOLAR (0.051)
				if (e.getActionCommand() == "Dolar"){
					try{
						Object regresarValor = JOptionPane.showInputDialog (
							null,
							"MXN: ",
							"MXN => Dolar",
							JOptionPane.QUESTION_MESSAGE,
							null,
							null,
							null
						);
						
						double valor_mxn = Double.parseDouble(regresarValor.toString());
						double valor_dolar = 0.051 * valor_mxn;
						
						JOptionPane.showMessageDialog (
							null,
							valor_mxn + " MXN => " + valor_dolar + " Dolares"
						);
					}
					catch(Exception error){
						JOptionPane.showMessageDialog(null,
							"[-]ERROR: Inserta un valor correcto."
						);
					}
				}
				
				//EURO (0.047)
				if (e.getActionCommand() == "Euro"){
					try{
						Object regresarValor = JOptionPane.showInputDialog (
							null,
							"MXN: ",
							"MXN => Euro",
							JOptionPane.QUESTION_MESSAGE,
							null,
							null,
							null
						);
						
						double valor_mxn = Double.parseDouble(regresarValor.toString());
						double valor_euro = 0.047 * valor_mxn;
						
						JOptionPane.showMessageDialog (
							null,
							valor_mxn + " MXN => " + valor_euro + " Euros"
						);
					}
					
					catch (Exception error){
						JOptionPane.showMessageDialog(
							null,
							"[-]ERROR: Inserta un valor correcto."
						);
					}
				}
				
				//YEN (5.53)
				if (e.getActionCommand() == "Yen"){
					try {
						Object regresarValor = JOptionPane.showInputDialog(
							null,
							"MXN: ",
							"MXN => Yen",
							JOptionPane.QUESTION_MESSAGE,
							null,
							null,
							null
						);
						
						double valor_mxn = Double.parseDouble (regresarValor.toString());
						double valor_yen = 5.53 * valor_mxn;
						
						JOptionPane.showMessageDialog (
							null,
							valor_mxn + " MXN => " + valor_yen + " Yenes"
						);
					}
					
					catch (Exception error){
						JOptionPane.showInputDialog(
							null,
							"[-]ERROR: Inserta un valor correcto."
						);
					}
				}
				
				//DOLAR HONG KONG (0.40)
				if (e.getActionCommand() == "Dolar de Hong Kong"){
					try {
						Object regresarValor = JOptionPane.showInputDialog(
							null,
							"MXN: ",
							"MXN => Dolar de Hong Kong",
							JOptionPane.QUESTION_MESSAGE,
							null,
							null,
							null
						);
						
						double valor_mxn = Double.parseDouble(regresarValor.toString());
						double valor_dolarhk = 0.40 * valor_mxn;
						
						JOptionPane.showMessageDialog(
							null,
							valor_mxn + " MXN => " + valor_dolarhk + " Dolar Hongkones"
						);
					}
					
					catch (Exception error){
						JOptionPane.showMessageDialog(
							null,
							"[-]ERROR: Inserta un valor correcto."
						);
					}
				}
			
		}
	}
}
