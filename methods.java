class method{
	double res=0;

	//Addition
	void add(double val){
		res+=val;
		System.out.print("\nResult:"+res);
		System.out.println("\n");
	}

	//Substraction
	void sub(double val){
		res-=val;
		System.out.print("\nResult:"+res);
		System.out.println("\n");
	}

	//Multiplication
	void mul(double val){
		res*=val;
		System.out.print("\nResult:"+res);
		System.out.println("\n");
	}

	//Division
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

	//Modulus
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

	//Clear the old answer
	void clear(double val){
		if(val==01.0){
			res=0;
		}
		System.out.print("\nResult:"+res+"\n\n");
	}
}
