/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj1;

import javax.swing.JFrame;
import javax.swing.*;    
import javax.swing.event.*; 
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class TableExample {
    
    JFrame f;
    TableExample()
    {
     f=new JFrame();
     f.setSize(500, 500);
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     
     String data[][]={{"id","raajan","giri","22 billlion"},{"2","hari","sapkota","2 million"}};
     String column[]={"ID","FirstName","LastName","NetWorth"};
     final JTable jt=new JTable(data,column);
     jt.setCellSelectionEnabled(true);
        ListSelectionModel select=jt.getSelectionModel();
        select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        select.addListSelectionListener(new ListSelectionListener(){
        public void valueChanged(ListSelectionEvent e)
        {
   String Data = null;  
                int[] row = jt.getSelectedRows();  
                int[] columns = jt.getSelectedColumns();  
                for (int i = 0; i < row.length; i++) {  
                  for (int j = 0; j < columns.length; j++) {  
                    Data = (String) jt.getValueAt(row[i], columns[j]);  
                  } }  
                System.out.println("Table element selected is: " + Data);    
              }       
            }); 
     
     
     JScrollPane sp=new JScrollPane(jt);    
            f.add(sp);  
              
            f.setVisible(true);
    
    }
    
    
    
    public static void main (String args[])
    {
     new TableExample();   
    }
    
    
}