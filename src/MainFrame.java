import javax.swing.*;
import java.awt.*;

/**
 * Created by ocean on 16-7-3.
 */

public class MainFrame extends JFrame {
    MainFrame() {
        super();
        this.setTitle("main");
        this.setSize(1500, 750);
        this.setLayout(new BorderLayout());
        JPanel conPanel = new UserPanel();
        JPanel drawPanel = new DrawPanel();
        this.add(conPanel, BorderLayout.NORTH);
        this.add(drawPanel, BorderLayout.CENTER);
        this.setVisible(true);
    }
}
