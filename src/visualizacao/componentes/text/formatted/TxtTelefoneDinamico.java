/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visualizacao.componentes.text.formatted;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Rosaine Fiorio
 */
public class TxtTelefoneDinamico extends JFormattedTextField {

    public TxtTelefoneDinamico() {
        super();
        try {
            MaskFormatter mf = new MaskFormatter("(##)####-####");
            mf.setPlaceholderCharacter('_');
            super.setFormatterFactory(new DefaultFormatterFactory(mf));
            this.setFocusLostBehavior(JFormattedTextField.COMMIT);
        } catch (ParseException ex) {
            Logger.getLogger(TxtTelefoneDinamico.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(getText() + "(" + getText().length() + ")");
                String valorDigitado = getText();
                if (getText().charAt(getText().length() - 1) != '_') {
                    setFormatterFactory(null);
                    try {
                        MaskFormatter mf = new MaskFormatter(getText() + "/(##)####-####");
                        mf.setPlaceholderCharacter('_');
                        setFormatterFactory(new DefaultFormatterFactory(mf));
                        setFocusLostBehavior(JFormattedTextField.COMMIT);
                        setText(valorDigitado);
                        setCaretPosition(14);
                    } catch (ParseException ex) {
                        Logger.getLogger(TxtTelefoneDinamico.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                super.keyPressed(e);
            }
        });

    }
}
