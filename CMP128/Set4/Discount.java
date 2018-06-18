import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Discount
{
	public static void main(String[] args)
	{
		DecimalFormat a = new DecimalFormat("#0.00");
		double sales = Double.parseDouble(JOptionPane.showInputDialog("Enter sales amount: "));
		if(sales > 300.0)
			JOptionPane.showMessageDialog(null, "The final bill is "+a.format((sales*.7)*1.07));
		else
		{
			if(300.0 >= sales && sales > 100.0)
				JOptionPane.showMessageDialog(null, "The final bill is "+a.format((sales*.9)*1.07));
			else
			{
				if(sales > 0)
					JOptionPane.showMessageDialog(null, "The final bill is "+a.format(sales*1.07));
				else
					JOptionPane.showMessageDialog(null, "Error. Sales amount must be above 0.");
			}
		}
	
	}
}