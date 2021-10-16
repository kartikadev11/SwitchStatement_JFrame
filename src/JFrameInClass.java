import javax.imageio.IIOException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class JFrameInClass {

    JFrameInClass(){
        JFrame myFrameWindow;

        myFrameWindow = new JFrame("Login to account");
        myFrameWindow.setLayout(null);
        myFrameWindow.setSize(400,400);
        myFrameWindow.setResizable(false);

        JLabel myLabel = new JLabel();
        myLabel.setText("Username");
        myLabel.setBounds(50,40,200,30);

        JTextField myText = new JTextField();
        myText.setBounds(50,70,300,30);

        JLabel myLabel1 = new JLabel();
        myLabel1.setText("Password");
        myLabel1.setBounds(50,110,200,30);

        JPasswordField myPWD = new JPasswordField();
        myPWD.setBounds(50,140,300,30);

        JButton myLoginBtn = new JButton();
        myLoginBtn.setBounds(150,180,90,30);
        myLoginBtn.setText("Login");

        JButton myCancelBtn = new JButton();
        myCancelBtn.setBounds(258,180,90,30);
        myCancelBtn.setText("Cancel");

        JLabel myWeb = new JLabel();
        myWeb.setBounds(50,250,350,30);
        myWeb.setText("* Don't Have Account ? Register here..");
        myWeb.setForeground(Color.BLUE);
        myWeb.setToolTipText("Please click to register");
        myWeb.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        myWeb.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Desktop myDesktop = Desktop.getDesktop();
                try {
                    myDesktop.browse(new URI("http://mimoapps.xyz"));
                }catch (IOException ex) {
                    ex.printStackTrace();
                }catch (URISyntaxException ex){
                    ex.printStackTrace();
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        myFrameWindow.add(myLabel);
        myFrameWindow.add(myText);
        myFrameWindow.add(myLabel1);
        myFrameWindow.add(myPWD);
        myFrameWindow.add(myLoginBtn);
        myFrameWindow.add(myCancelBtn);
        myFrameWindow.add(myWeb);
        myFrameWindow.setLayout(null);
        myFrameWindow.setVisible(true);
        myFrameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new JFrameInClass();
    }
}
