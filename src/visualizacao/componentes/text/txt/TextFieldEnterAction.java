/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visualizacao.componentes.text.txt;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author Jhonnatan
 */
public abstract class TextFieldEnterAction extends JTextField {

    public TextFieldEnterAction() {
        super();
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                super.keyPressed(ke);
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    onEnterKeyPress(ke);
                }
            }
        });
    }

    public abstract void onEnterKeyPress(KeyEvent ke);
}
