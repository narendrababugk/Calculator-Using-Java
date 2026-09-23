class method{
	double res=0;
	
	void add(double val){
		res+=val;
		System.out.print("\nResult:"+res);
		System.out.println("\n");
	}
	void sub(double val){
		res-=val;
		System.out.print("\nResult:"+res);
		System.out.println("\n");
	}
	void mul(double val){
		res*=val;
		System.out.print("\nResult:"+res);
		System.out.println("\n");
	}
	void div(double val){
		if(res==0 || val==0){
			System.out.print("Division is not possible");
		}
		else{
		res/=val;
		System.out.print("\nResult:"+res);
		System.out.println("\n");
		}
	}
	void mod(double val){
		if(res==0 || val==0){
			System.out.print("Modulus is not possible");
		}
		else{
		res%=val;
		System.out.print("\nResult:"+res);
		System.out.println("\n");
		}
	}
	void clear(double val){
		if(val==01.0){
			res=0;
		}
		System.out.print("\nResult:"+res+"\n\n");
	}
}