/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle.validation.text;

import controle.validation.MyInputVerifier;
import javax.swing.JTextField;

/**
 *
 * @author Jhonnatan
 */
public class TextInputVerifier extends MyInputVerifier<JTextField> {

    @Override
    public Boolean verifyFieldValue(JTextField component) {
        if ("".equals(component.getText().trim())) {
            this.invalidAction(component);
        } else {
            this.validAction(component);
        }
        return true;
    }

    @Override
    public Boolean runValidation(JTextField component) {
        if ("".equals(component.getText().trim())) {
            return false;
        } else {
            return true;
        }
    }
}
