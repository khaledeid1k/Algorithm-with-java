package Dependency_Injection_Design_Pattern;

public class Dependency_Injection_Design {
    public class C {
        String s ;
        C(String s){
            this.s = s ;
        }
    }
    
    public class A {
        private C c ; 
        A(C c){
        this.c = c ;
        }
    }
    
    public class B extends A{
        B(C c){
        super(c);
        }
    
    }


    

public class C2 {
	String s ,s1;
	C2(String s,String s1){
		this.s = s ;
      	this.s1 = s1 ;
	}
}

public class A2 {
	private C2 c ; 
	A2(C2 c){
	this.c = c ;
	}
}

public class B2 extends A2{
	B2(C2 c){
	super(c);
	}

}


}
