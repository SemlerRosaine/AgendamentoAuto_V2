/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visualizacao.componentes.text.txt;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPasswordField;

/**
 *
 * @author Jhonnatan
 */
public abstract class PasswordFieldEnterAction extends JPasswordField{

    public PasswordFieldEnterAction() {
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
