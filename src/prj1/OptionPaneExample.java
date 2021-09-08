
package prj1;
import javax.swing.*; 
import java.awt.event.*; 


public class OptionPaneExample extends WindowAdapter{
    
    JFrame f;
    OptionPaneExample()
    {
    f=new JFrame();
   f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    f.setSize(400, 400);
    f.setVisible(true);
    f.setLayout(null);
    f.addWindowListener(this);
    
    
    }
    public void windowClosing(WindowEvent e)
    {
     int a=JOptionPane.showConfirmDialog(f,"Are you sure?");
    if(a==JOptionPane.YES_OPTION)
    {
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    }
    
    public static void main(String []args)
    {
    new OptionPaneExample();
    }
    
    
}
