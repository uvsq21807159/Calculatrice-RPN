import java.util.*;
import java.util.Stack.*;
public class MoteurRPN  extends PileVideException {
	
	//MoteurRPN RPN = new MoteurRPN();
	
      public static Operandes RPN(Stack <TypeDeRetour>stack)throws PileVideException   
       { 
    	  
    	  if(stack.empty())
    	  {
    		  throw new PileVideException();
    		 
    	  }
    	  else
    	  {
    		  TypeDeRetour  tks = stack.pop();
    		  
    		  switch(tks.getType())
    		  {
    		     case OPERANDE:
    			    return (Operandes)tks;
    		     case OPERATEUR:
    		    	 Operandes x = RPN(stack);
    		    	 Operandes y = RPN(stack);
    		    	 // on utilise la fonction eval pour claculer les 2 Operandes
    		    	 return ((Operation) tks).eval(x,y);
    		    default:
    		       throw new IllegalStateException("type de retour inconnu" + tks.getType());
    		    	 
    		  }
    	  }
    	   
    	    
       }
      
       
}
