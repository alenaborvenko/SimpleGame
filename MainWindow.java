import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MainWindow extends JFrame {

    public MainWindow(){
        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320,345);
        setLocation(400,400);
        LayoutManager grid = new GridLayout();
        setLayout(grid);
        JButton start = new JButton("Start");
        start.addActionListener(new ButtonEvent());
        start.setDefaultCapable(true);
        start.setBackground(Color.black);
        start.setText("START");
         start.setSize(100,200);
        add(start, -1);
        JButton exit = new JButton("Exit:");
        exit.addActionListener(new ButtonEvent());
        exit.setDefaultCapable(true);
        exit.setBackground(Color.black);
        exit.setText("EXIT");
        exit.setSize(100,100);
        add(exit, -1);
      //  add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
    }


    private class ButtonEvent extends MainWindow implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
           if( e.getActionCommand().equals("EXIT")) System.exit(0);
           else if(e.getActionCommand().equals("START")){
               MainWindow.this.remove(-1);
               MainWindow.this.remove(-1);
               repaint();
                add(new GameField());
                setVisible(true);
            }
        }
    }
}
