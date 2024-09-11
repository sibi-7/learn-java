import javax.swing.JOptionPane;
public class Options
{
	public static void main (String []args)
   	{
	
     		String input = JOptionPane.showInputDialog("Enter your Age");
		
		try{
			int number = Integer.parseInt(input);
			if (number >= 18)
			{
     				JOptionPane.showMessageDialog(null,"Your age is eligible " + input);
			}
			else
			{
				JOptionPane.showMessageDialog(null,"your not elligible " +input);
    				System.exit(0);
		        }
		}
		
		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null," invalid datatype " );
		}
			
   	}	
}