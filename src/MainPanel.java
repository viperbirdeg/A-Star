import javax.swing.*;

public class MainPanel extends JPanel {

    JLabel mainLabel = new JLabel();

    public MainPanel(){
        initialize();
    }

    public void initialize(){
        setLayout(null);
        setBounds(0,0,500,500);
        mainLabel.setBounds(200,240,100,20);
        mainLabel.setText("Hola Mundo!");
        add(mainLabel);
    }

    public String getMainLabelText(){
        return mainLabel.getText();
    }

    public void setMainLabelText(String newText){
        mainLabel.setText(newText);
    }
}
