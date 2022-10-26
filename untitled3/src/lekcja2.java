import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lekcja2 extends JFrame{
    private JPanel panel1;
    private JButton OKButton;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JLabel ImageLabel;

    private ImageIcon iconLinux = new ImageIcon(getClass().getResource("linux.png"));
    private ImageIcon iconApple = new ImageIcon(getClass().getResource("apple.png"));
    private ImageIcon iconWindows = new ImageIcon(getClass().getResource("windows.png"));

    public static ImageIcon resize(ImageIcon src,int destWidth, int destHeight){
        return new ImageIcon(src.getImage().getScaledInstance(destWidth,destHeight, Image.SCALE_SMOOTH));
    }


    public static void main(String[] args){
        lekcja2 Exmaple1 = new lekcja2();
        Exmaple1.setVisible(true);
    }

    public lekcja2() {
        super("cos tam");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,300);

        radioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioButton1.isSelected()){
                    ImageLabel.setIcon(resize(iconLinux,120,120));
                    //ImageLabel.getHorizontalAlignment();
                }


            }
        });
        radioButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioButton2.isSelected()){
                    ImageLabel.setIcon(resize(iconWindows,120,120));

            }
        });
        radioButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    if (radioButton3.isSelected()){
                        ImageLabel.setIcon(resize(iconApple,120,120));
                }

            }
        });
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectOption="";
                if(radioButton1.isSelected()){
                    selectOption="Linux";
                }
                if(radioButton2.isSelected()){
                    selectOption="Windows";
                }
                if(radioButton3.isSelected()){
                    selectOption="Apple";
                }
                JOptionPane.showMessageDialog(lekcja2.this,"wybrano system: "+selectOption);

            }
        });
    }

}
