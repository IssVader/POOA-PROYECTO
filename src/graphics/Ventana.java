package graphics;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Ventana extends JPanel {
public final static int Altura=600,Anchura=800;
private ArrayList<Dibujable> elementos;


public Ventana(){
	elementos=new ArrayList<Dibujable>();
	setBounds(0,0,Anchura,Altura);
	setVisible(true);	
	
	}
public void add(Dibujable d){
	elementos.add(d);
}
public void paint(Graphics g){
	super.paint(g);
	for(Dibujable elemento:elementos){
		elemento.dibujar(g);
	}
		
}

public ArrayList<Dibujable>getElementos(){
	return this.elementos;
}



}
