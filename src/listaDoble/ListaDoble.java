package listaDoble;

public class ListaDoble {

	//PUNTEROS
	public NodoDoble primero;
	public NodoDoble ultimo;
	public Integer tamaño;
	//CONSTRUCTOR
	public ListaDoble() {
		primero = null;
		ultimo = null;
		tamaño = 0;
	}
	//INSERTAR ELEMENTOS
	public void insertarAlInicio(Persona persona) {
		NodoDoble temp = new NodoDoble(persona);
		if(empty()) {
			primero = temp;
			ultimo = temp;
			tamaño++;
		}else {
			temp.siguiente = primero;
			primero.anterior = temp;
			primero = temp;
		}
	}
	//EMPTY
	public boolean empty() {
		if(tamaño == 0)
			return true;
		return false;		
	}
	//SHOW LIST
	public void mostrarInicio() {
		NodoDoble temp = primero;
		while(temp != null) {
			//LOGICA
			System.out.println("Nombre: " + temp.persona.nombre + "\n" +
							   "edad: " + temp.persona.edad + "\n" + 
							   "ci: " + temp.persona.ci + "\n");
			temp = temp.siguiente;
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
