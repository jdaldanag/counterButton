package Counter;
import javax.swing.*;
import java.awt.*;

public class UserInterface implements Runnable {
    private JFrame frame;
    private int x = 0;
    
    public UserInterface(){  }
    
    private void createComponents(Container container){
        GridLayout layout = new GridLayout(4,1);    //layout 4 filas y 1 columna
        container.setLayout(layout);
        
        JLabel jumpLine1 = new JLabel(" ");
        JLabel count = new JLabel("" + x);
        JLabel jumpLine2 = new JLabel(" ");
        JButton button = new JButton("Click!");
        
        Counting action = new Counting(count,x);    //implementacion de Counting
        button.addActionListener(action);           //asignacion de la accion al boton
        
        container.add(jumpLine1);
        container.add(count);
        container.add(jumpLine2);
        container.add(button);
    }
    
    public void run(){
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(100,100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }
}
