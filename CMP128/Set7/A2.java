import javax.swing.JOptionPane;

public class A2 
{
	public static void main(String[] args)
	{
		double a = Double.parseDouble(JOptionPane.showInputDialog("Enter the first leg of the triangle: "));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Enter the second leg of the triangle: "));
		hypo(a,b);
	}
	
	private static void hypo(double a,double b)
	{
		JOptionPane.showMessageDialog(null, "The hypotenuse is of length: "Math.sqrt(a*a) + Math.sqrt(b*b));
	}
}