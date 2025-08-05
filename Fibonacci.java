public class Fibonacci{
	int rep;
	Thread t=new Thread();
	public Fibonacci(int _rep){
		rep=_rep;
		int n1=0;
		int n2=1;
		int sig=0;
		System.out.println(n1);
		System.out.println(n2);
		t.start();
		try{
		for(int i=0;i<_rep;i++){
		sig=n1+n2;
		System.out.println(sig);
		n1=n2;
		n2=sig;
		t.sleep(100);
		}
		}catch(Exception e){System.out.println("error: "+e);}
			
	}
	
	public static void main (String args[]){
		Fibonacci f=new Fibonacci(100);
	}
	
	
}