import javax.swing.*;
import java.awt.event.KeyEvent;

public class suicide {
    public static void main(String[] args) {
        int positionX = 0;
        int positionY = 0;

        for(int i = 0; i < 10; i++){
            JFrame Suicide = new JFrame("HAHAHA u die now");
            Suicide.setVisible(true);
            Suicide.setSize(200, 200);
            Suicide.add(new JLabel(new ImageIcon("..\\..\\img.png")));
            Suicide.setLocation(positionX,positionY);
            positionX = (int) Math.round(Math.random()*1920);
            positionY = (int) Math.round(Math.random()*1080);
            Suicide.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }


    }
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_SPACE) {
            System.exit(0);
        }
    }
}
