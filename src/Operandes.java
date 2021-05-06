
public class Operandes  implements TypeDeRetour {
	
	private final double valeur;
	
	public Operandes(double val)
	{
		this.valeur = val;
	}
	public double getValeur()
	{
		 return valeur;
	}
	
	
	@Override
	 public Type getType()
	 {
		 return Type.OPERANDE;
	 }

}
