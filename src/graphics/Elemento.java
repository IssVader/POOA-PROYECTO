package graphics;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Elemento implements Dibujable{
	
	Image campo;
	private int X;
	private int Y;
	private int Anchura;
	private int Altura;
	
	public 	Elemento(int X,int Y,int Anchura,int Altura,String URL){
		this.X=X;
		this.Y=Y;
		this.Anchura=Anchura;
		this.Altura=Altura;
				campo=new ImageIcon(this.getClass().getResource(URL)).getImage();
	}

	public void dibujar(Graphics g) {
		g.drawImage(campo,X,Y,Anchura,Altura,null);
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
