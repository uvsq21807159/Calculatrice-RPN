import java.util.Stack.*;
public enum Operation implements TypeDeRetour {
	
	 PLUS("+")
	{
		 @Override
		    public Operandes eval(Operandes x,Operandes y)
		    {
		    	return  new Operandes((x.getValeur()) + (y.getValeur()));
		    }
	} ,
	MOINS("-")
	{
		@Override
	    public Operandes eval(Operandes x,Operandes y)
	    {
	    	return  new Operandes((x.getValeur()) - (y.getValeur()));
	    }
	}
	,MULT("*")
	{
		@Override
	    public Operandes eval(Operandes x,Operandes y)
	    {
	    	return  new Operandes((x.getValeur()) * (y.getValeur()));
	    }
	}
	, DIV("/")
	{
		
		   @Override
	       public Operandes eval(Operandes x,Operandes y)
	       {   try
	           {
	    	   return  new Operandes((x.getValeur()) / (y.getValeur()));
	    			    
	           }catch(ArithmeticException e)
	           {
	        	   System.out.println("division par zero!!!);")          }
	           
	      }
	       
		
	};

	
	
	public abstract Operandes eval(Operandes x , Operandes y);
	
	private  String symbole   ;
   	
	 Operation(String symbole)
	 {
			this.symbole = symbole;
	 }
	 public String toString()
	 {
		 return symbole;
	 }
	 @Override
	 public Type getType()
	 {
		 return Type.OPERATEUR;
	 }
	
		
}		  
