public class Areas extends Trapecio
{public static void main (String args[]){
	Areas t=new Areas(3,7,9);
	t.areaTrapecio();
	}
	public Areas(int a, int b, int c){
		super(a,b,c);
	}
}


	class Trapecio{
		int b,B,h;
		public Trapecio(int _b, int _B, int _h){
			b= _b; B= _B; h= _h;
		}
		public void areaTrapecio(){
			float res=((b+B)*h)/2;
			System.out.println("El area es igual a: "+res);
		}
	}
	
	

