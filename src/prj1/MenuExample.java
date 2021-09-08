/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj1;
import javax.swing.*;
public class MenuExample {
    
    JMenu menu, submenu;
    JMenuItem i1,i2,i3,i4,i5;
    
    MenuExample()
    {
    JFrame f=new JFrame();
    JMenuBar mb=new JMenuBar();
    menu=new JMenu("menu");
    submenu=new JMenu("submenu");
    i1=new JMenuItem("Iteam 1");
    i2=new JMenuItem("Iteam 2");
    i3=new  JMenuItem("Iteam 3");
    i4= new JMenuItem("Iteam 4");
    i5=new JMenuItem("iteam 5");
            
            
    menu.add(i1);menu.add(i2);menu.add(i3);
    submenu.add(i4); submenu.add(i5);
    
    menu.add(submenu);
    mb.add(menu);
    f.setJMenuBar(mb);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
    
    }public static void main(String args[])  
{  
new MenuExample();  
}
    
}
