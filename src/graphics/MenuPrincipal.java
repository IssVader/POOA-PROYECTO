package graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import data.Datos;

public class MenuPrincipal extends JFrame {
	private Ventana menu;
	
	private Ventana datos;
	
	private Elemento Fondo,casa,imagen1,imagen2,imagen3;
	final static private int Anchura=800, Altura=600;
	private JLabel nombre,edad,usuario,c;
	private JTextField n,e,u,con;
	private JButton boton1,boton2,boton3;
	private ArrayList<Datos> salvar;
	private JLabel registrar;
	private JButton botonRegistrar;
	
	
	
	
	public MenuPrincipal(){
		c=new JLabel("continuar");
		con=new JTextField();
		salvar=new ArrayList<Datos>();
		c.setBounds(400,0,100,50);
		con.setBounds(500,0,100,50);
		
		//salvar=Datos.leer();
		botonRegistrar=new JButton("Registrar");
		botonRegistrar.setBounds(0,0,100,50);
		
		datos=new Ventana();
		datos.add(c);
		datos.add(con);
		datos.add(botonRegistrar);
		botonRegistrar.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent o) {
				Datos usuarios=new Datos();
				usuarios.setEdad(Integer.parseInt(e.getText()));
				usuarios.setNombre(n.getText());
				usuarios.setUsuario(u.getText());
				salvar.add(usuarios);
				Datos.escribir(salvar);
				for(Datos dato: salvar)
				{
					System.out.println(dato.getEdad());
					System.out.println(dato.getNombre());
				}
			}
			
		});
		
		
		
		
		Fondo=new Elemento(0,0,Anchura,Altura,"../imagenes/Lighthouse.jpg");
		//datos.add(Fondo);
		casa=new Elemento(3,4,100,80,"../imagenes/casa.png");
		
		//botones
		boton1=new JButton("opcion1");
		boton2=new JButton("opcion2");
		boton3=new JButton("opcion3");
		
		boton1.setBounds(0,200,100,50);
		imagen1=new Elemento(0,300,100,50,"../imagenes/casa.png");
		datos.add(imagen1);
		boton1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e)
			{
				setContentPane(menu);
			}});
		boton2.setBounds(300,200,100,50);
		
		
		boton3.setBounds(600,200,100,50);
		
		datos.add(boton1);
		datos.add(boton2);
		datos.add(boton3);
		
		
		//genero ventanas
		nombre=new JLabel("Nombre:");
		edad=new JLabel("Edad:");
		usuario=new JLabel("Usuario:");
		//
		n=new JTextField();
		e=new JTextField();
		u=new JTextField();
		//posision y tamano
		nombre.setBounds(0,10,100,50);
		edad.setBounds(0,70,100,50);
		usuario.setBounds(0,130,100,50);
		
		n.setBounds(120,10,100,50);
		e.setBounds(120,70,100,50);
		u.setBounds(120,130,100,50);
		
		datos.add(nombre);
		datos.add(edad);
		datos.add(usuario);
		datos.add(n);
		datos.add(e);
		datos.add(u);
		setContentPane(datos);
		setLayout(null);
		
		
		
		
		
		
		
		
		menu=new Ventana();
		//setContentPane(menu);
		setVisible(true);
		setBounds(0,0,Anchura,Altura);
		
		menu.add(Fondo);
		menu.add(casa);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
				
		
	}
	
	public static void main(String[] arg){
		new MenuPrincipal();
	}
	
	

}
