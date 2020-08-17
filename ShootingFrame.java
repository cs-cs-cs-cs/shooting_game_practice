import javax.swing.*;

public class ShootingFrame extends JFrame {
    public ShootingPanel panel;

    public ShootingFrame() {
        panel = new Shootting Panel();

        this.add(panel);
        this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowevent e{
                super.windowClosed(e);
                loop = true;
            }
        })
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Shooting");
        this.setSize(800,800);
        this.setLocationRelativeTo(null);
        this.setVisible(false);
    }
}