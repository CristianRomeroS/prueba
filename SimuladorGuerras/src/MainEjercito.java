
public class MainEjercito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercito koreano=new Ejercito("korea",10);
		Ejercito Ruso=new Ejercito("Por Rusia",5);
		koreano.formacion();
		Ruso.formacion();
		int Dia=1;
		while(koreano.puedeLuchar() && Ruso.puedeLuchar()) {
			System.out.println("******************************");
			System.out.println(Dia+"díaGuerra");
			System.out.println("******************************");
			
			int aleatorio;
			aleatorio=(int)(Math.random()*10);
			if(aleatorio%2==0) {
				koreano.ataca(Ruso);
				koreano.retirarFallecidos();
				System.out.println(koreano);
			}else {
				Ruso.ataca(koreano);
				Ruso.retirarFallecidos();
			}
			
		}
	
	}
	

}
