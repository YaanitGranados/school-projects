public class Circulo extends AreaCirculo{
	public static void main (String args[]){
		int num=(int)(Math.random()*10);
		double n=Math.random();
		float nu=(float)(Math.random());
		
		Circulo a1= new Circulo ();
		a1.Calcular(num);
		
		Circulo a2= new Circulo ();
		a2.Calcular(n);
		
		Circulo a3= new Circulo ();
		a3.Calcular(nu);
	}
	public Circulo(){
		super();
	}
}




class AreaCirculo{
	
	public AreaCirculo(){
		
	}
	
	public void Calcular (int r){
		System.out.println("(int)El radio es: "+r);
		double res=(Math.PI)*(r*r);
		System.out.println("El area del circulo es "+res);
	}
	public void Calcular(double r){
		System.out.println("(double)El radio es: "+r);
		double res=(Math.PI)*(r*r);
		System.out.println("El area del circulo es "+res);
	}
	
	public void Calcular (float r){
		System.out.println("(float)El radio es: "+r);
		double res=(Math.PI)*(r*r);
		System.out.println("El area del circulo es "+res);
	}
}