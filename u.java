import java.awt.*;
import java.awt.event.*;

class Jyoti extends Frame {
    Label label = new Label("JAVA AWT Tutorials");
    TextField textField = new TextField();
    TextArea textArea = new TextArea();
    Button button = new Button("Click me");
    Font font = new Font("", Font.ITALIC, 22);

    Jyoti() {
        setTitle("java qwt tutorials");
        setLayout(null);
        setBounds(200, 200, 500, 600);
        setVisible(true);
        add(label);
        add(textField);
        add(textArea);
        add(button);
        label.setBounds(50, 60, 350, 30);
        textField.setBounds(50, 100, 280, 30);
        textArea.setBounds(50, 200, 300, 200);
        button.setBounds(50, 400, 280, 30);
        setFont(font);
    }
}

class Dipu {
    public static void main(String args[]) {
        Jyoti jj = new Jyoti();
    }
}
