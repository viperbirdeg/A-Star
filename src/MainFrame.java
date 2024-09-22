import javax.swing.*;

public class MainFrame extends JFrame {

    MainPanel mp = new MainPanel();

    public MainFrame(String newText) throws InterruptedException {
        initialize();
        changeText(newText);
    }

    public void initialize() {
        setLayout(null);
        setBounds(mp.getBounds());
        add(mp);
        setTitle("A-Star");
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void changeText(String newText) throws InterruptedException {
        Thread.sleep(1000 * 3);
        mp.setMainLabelText(newText);
    }

}

