
public class Ejercito {
	private String nombre;
	private int tamanioEjercito;
	unidadArmada[] Ejercito = new unidadArmada[tamanioEjercito];
	unidadArmada[] ejercitosMuertos ;
	
	
	public Ejercito(String nombre, int tamanioEjercito) {
		this.nombre=nombre;
		this.tamanioEjercito=tamanioEjercito;
		
		Ejercito = new unidadArmada[tamanioEjercito];
		for(int i=0; i<tamanioEjercito-1;i++) {
			Ejercito [i]=unidadArmada.generarUnidad();
			}
	
		
	}
	public Ejercito (String nombre) {
		this.nombre=nombre;
		tamanioEjercito=10;
		Ejercito = new unidadArmada[tamanioEjercito];
		for(int i=0; i<tamanioEjercito-1;i++) {
			Ejercito [i]=unidadArmada.generarUnidad();
			}
	
		
		}
	public void formacion() {
		
		
		
		}
	public void ataca(Ejercito ejercito2) {
		int aleatorio= (int)(Math.random())*(ejercito2.tamanioEjercito);
		for(int i=0;i<tamanioEjercito-1;i++) {
			Ejercito [i].atacar(ejercito2.Ejercito [aleatorio]);
			}
	}
	public void retirarFallecidos() {
		int contador=0;
		ejercitosMuertos= new unidadArmada [contador];
		for(int i=0;i<tamanioEjercito-1;i++) {
			if(Ejercito[i].estaViva()==false) {
				 contador= i++;

				}
			}
		for(int i=0;i<tamanioEjercito-1;i++) {
			for(int y=0;y<contador-1;y++) {
				if(Ejercito[i].estaViva()==false) {
					ejercitosMuertos[i]=Ejercito[i];
					
				}
				
			}
				

				}
			}
		
	

	public boolean puedeLuchar() {
		int contador=0;
		 
			for(int i=0;i<Ejercito.length-1;i++) {
				
			
			
			}
			
	
		
		return contador>0;
		
		
	}
	public String toString() {
		return nombre+"con"+tamanioEjercito+"Unidades";
		
	}
}
