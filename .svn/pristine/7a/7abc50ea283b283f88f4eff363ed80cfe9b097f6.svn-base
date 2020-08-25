/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visualizacao.componentes.text.txt;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import visualizacao.componentes.text.formatted.CPFTextField;

/**
 *
 * @author Jhonnatan
 */
public abstract class TextFieldCpfEnterAction extends CPFTextField {

    public TextFieldCpfEnterAction() {
        super();
        onKeyPress();
    }

    public TextFieldCpfEnterAction(Boolean required) {
        super(required);
        onKeyPress();
    }

    public abstract void onEnterKeyPress(KeyEvent ke);

    private void onKeyPress() {
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
}
