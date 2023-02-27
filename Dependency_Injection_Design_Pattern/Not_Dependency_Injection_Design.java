package Dependency_Injection_Design_Pattern;

public class Not_Dependency_Injection_Design {
    
public class C {
	String s ;
	C(String s){
		this.s = s ;
	}
}

public class A {
	private C c ; 
	A(String s){
	this.c = new C(s); 
	}
}

public class B extends A{
	B(String s){
	super(s);
	}

}

//if i change constractor of C i need to change all Constractor in all clasess
public class C2 {
	String s ,s1;
	
	C2(String s ,String s1 ){
		this.s = s ;
		this.s1 = s1 ;
	}
}

public class A2 {
	private C2 c ; 
	A2(String s,String s1){
	this.c = new C2(s,s1);

	}
}

public class B2 extends A2{
	B2(String s,String s1){
	super(s,s1);
	}

}


}
