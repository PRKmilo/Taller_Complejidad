package co.edu.unbosque.model;

import java.util.ArrayList;

public class TreeSort {
	public static Nodo raiz;
	public static ArrayList<Integer> retorno;
	
	public TreeSort() {
		raiz=null;
		retorno=new ArrayList<>();
	}
	
	



	public void insertar(int i,Object numero) {
		Nodo n=new Nodo(i);
		System.out.println("este es el indice "+i);
		n.contenido = numero;
		if(raiz == null) {
			
			raiz = n;
		}else {
			Nodo aux = raiz;
			
			while(aux != null) {
				n.padre=aux;
				if(n.llave >= aux.llave) {
					
					aux=aux.derecha;
				}else {
					
					aux=aux.izquierda;
				}
			}
			if(n.llave < n.padre.llave) {
				
				n.padre.izquierda = n;
			}else {
				n.padre.derecha=n;
			}
		}
	}
	
	public void recorrer(Nodo n) {
		if(n != null) {
			recorrer(n.izquierda);
			
			recorrer(n.derecha);
			if(n.padre != null) {
				retorno.add(n.padre.llave);
				
			}
		}
	}
	
	public Nodo encontrarnodo(int value,Nodo raiz) {
		Nodo aux=raiz;
		while(aux.llave != value) {
			if(value < aux.llave) {
				aux=aux.izquierda;
			}else {
				aux=aux.derecha;
			}if(aux==null) {
				return null;
			}
		}
		return aux;
	}
	
	public Nodo ancestro(Nodo raiz,Nodo x,Nodo y) {
		if(raiz == null) {
			return null;
		}
		if(raiz == x || raiz == y) {
			return raiz;
		}
		Nodo left = ancestro(raiz.izquierda,x,y);
		
		Nodo right = ancestro(raiz.derecha,x,y);
		
		if (left != null && right != null) {
			return raiz;
		}
		
		if (left != null) {
			return left;
		}
		
		if (right != null) {
			return right;
		}
		
		return null;
	}
	
	public void regreso() {
		
		System.out.println(retorno);
			
	}

}
