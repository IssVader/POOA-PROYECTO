package data;

import graphics.Dibujable;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Datos implements Serializable {
	String nombre,usuario;
	int edad;
	//private ArrayList<Datos> elementos;
	
	public Datos( ){
		//this.elementos=elementos;
		
		
	}
	
	public static void escribir(ArrayList<Datos> data){
		try {
			FileOutputStream myFileOutputStream = new FileOutputStream("savegame.dat");
			BufferedOutputStream myBufferedOutputStream = new BufferedOutputStream(myFileOutputStream);
		
			ObjectOutputStream myObjectOutputStream = new ObjectOutputStream(myBufferedOutputStream);
			
			
			myObjectOutputStream.writeObject(data);
		    myBufferedOutputStream.flush();
			
			myObjectOutputStream.close();
			myBufferedOutputStream.close();
			myFileOutputStream.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		}
	public static ArrayList<Datos> leer(){
		ArrayList<Datos> data;
		 data = new ArrayList<Datos>();
		try {
			FileInputStream myFileInputStream = new FileInputStream("savegame.dat");
			ObjectInputStream myObjectInputStream = new ObjectInputStream(myFileInputStream);
			
			
			
			
			try {
				
				data = (ArrayList<Datos>) myObjectInputStream.readObject();
				return data;
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	
			myObjectInputStream.close();
			myFileInputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
		
	}
	public void setNombre(String a){
		this.nombre=a;
			}
	public void setUsuario(String a){
		this.usuario=a;
			}
	public void setEdad(int a){
		this.edad=a;
			}
	public int getEdad()
	{
		return edad;
	}
	public String getNombre()
	{
		return nombre;
	}
	public String getUsuario()
	{
		return usuario;
	}
	
	
	
	
	}


