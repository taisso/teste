package praticando_java;

import java.util.ArrayList;
import java.util.List;

public class CoringasEmListas {

	static class A{
		private String nome;
		public A(String nome){ this.nome = nome; };
		public String toString() { return nome; }
	}
	static class B extends A{
		public B(String nome) { super(nome); }
	}
	static class C extends B{
		public C(String nome) { super(nome); }
	}
	static class D extends C{
		public D(String nome) { super(nome); }		
	}
	
        
        
        
	public static void main(String[] args) {
		A a = new A("A");
		B b = new B("B");
		C c = new C("C");
		D d = new D("D");
		
		//Listas com ? extends, podem ser criadas para as classes cujo objeto instanciado passe no teste É-UM da classe informada
		//List<? extends B> listaExtends0 = new ArrayList<A>(); //Um objeto de A não passa no teste É-UM de B
		List<? extends B> listaExtends1 = new ArrayList<B>();
		List<? extends B> listaExtends2 = new ArrayList<C>();
		List<? extends B> listaExtends3 = new ArrayList<D>();
		
		//listas com ? extends são somente leitura para inserção de objetos
		//listaExtends1.add(a);//inválido
		//listaExtends1.add(b);//inválido
		//listaExtends1.add(c);//inválido
		//listaExtends1.add(d);//inválido
		
		//Listas com ? super, podem receber qualquer objeto com hierarquia igual ou superior à classe informada
		List<? super B> listaSuper0 = new ArrayList<A>();//A é super classe de B, ok !
		List<? super B> listaSuper1 = new ArrayList<B>();//B é a própria classe, ok !
		//List<? super B> listaSuper2 = new ArrayList<C>();//C extends B, por isto não pode ser usada
		//List<? super B> listaSuper3 = new ArrayList<D>();//D extends C e B, por isto não pode ser usada

		//listas com ? super, podem ter objetos inseridos, desde que este objeto passe no teste É-UM da classe informada 
		//listaSuper0.add(a);//a não passa não É-UM B
		listaSuper0.add(b);
		listaSuper0.add(c);
		listaSuper0.add(d);
                
                List<? super Float> lista = new ArrayList<>();
                
	}
        
}
