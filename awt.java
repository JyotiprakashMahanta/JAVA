import java.awt.Frame;
import java.awt.Label;
import java.awt.event.*;

import javafx.scene.control.CheckBox;

class J extends Frame {
    CheckBox c1 = new CheckBox("Hydrabad");
    CheckBox c2 = new CheckBox("Bangolar");

    J() {
        add(c1);
        add(c2);
        setBounds(0, 0, 500, 500);
        setLayout(null);
        setVisible(true);
        c1.setBounds(20, 20, 50, 50);
        c2.setBounds(100, 20, 50, 50);
    }
}

class Dipu {
    public static void main(String args[]) {
        J nn = new J();
    }
}
