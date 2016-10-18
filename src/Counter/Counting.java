package Counter;
import java.awt.event.*;
import javax.swing.*;

public class Counting implements ActionListener {
    private JLabel text;
    private int x;
    
    public Counting(JLabel text,int n){
        this.text = text;
        this.x = n;
    }
    
    public void actionPerformed(ActionEvent ae){
        this.x++;
        this.text.setText("" + this.x);
    }
}

//toda variable empleada en el constructor y asignada a su respectiva contraparte dentro de counting 
//se retorna y actualiza tras cada actionPerformed