package prj1;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class GUI {

    JFrame frame;
    JTable table;

    GUI() {
        frame = new JFrame();
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String data[][] = {{"1", "raajan", "Giri"},
        {"2", "hari", "Giri"},
        {"3", "sachin", "puri"}};
        String column[]
                = {"Id", "Name", "Sirname"};
        table = new JTable(data, column);

        table.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(table);
         
        
        
        frame.add(sp);
        frame.add(table);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new GUI();

    }

}
