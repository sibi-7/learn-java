import javax.swing.JOptionPane;

public class options
{
  public static void main (String args[])
   {
     String input = JOptionPane.showInputDialog("Enter your name");	
     JOptionPane.showMessageDialog(null,"Your name is " + input);
     System.exit(0);
   }
}