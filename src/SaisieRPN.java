
import java.util.*;
public class SaisieRPN   
{
	
	private MoteurRPN moteur = null;
	
	private static Optional<TypeDeRetour> typeOperation(String x)
	{
		try{
			return Optional.of(Operation.valueOf(x));
		}
		catch (RuntimeException e)
		{
			return Optional.empty();//on retourne une pile vide
		}
	}
	private static Optional<TypeDeRetour> convertion(String x)
	{
		try{
			// on convertis les string en double
			return Optional.of(new Operandes(Double.parseDouble(x)));
		}
		catch (RuntimeException e)
		{
			return Optional.empty();//on retourne une pile vide
		}
	}
	
	
	
	
	
	public static Stack <TypeDeRetour>  clavier()
    {
		Stack<TypeDeRetour> stack = new Stack<TypeDeRetour>();
		Scanner sc = new Scanner(System.in);
		
		
		while(true)
		{   System.out.println("veuillez saisir ");
			String x = sc.nextLine();
		    if(x.isEmpty()) //this string is empty
			{
				return stack;
			}
			TypeDeRetour st = typeOperation(x).orElse(convertion(x).orElse(null));
			if(st != null)
			{
			   
				 
				   stack.push(st);//on ajoute ce qu'on a entrer dans la pile pour l'utiliser apres 
	          
			}
			else
			{
				System.out.println("erreur de saisie : " + x);
			}
		}
	}	
	
}
			
	
			
	


