/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visualizacao.componentes.text;

import controle.validation.text.TextInputVerifier;

/**
 *
 * @author Jhonnatan
 */
public class RequiredTextField extends AbstractValidatedTextField {

    public RequiredTextField(Boolean required) {
        super(required, "Preenchimento obrigatório.");
        this.setInputVerifier(new TextInputVerifier());
    }
    
    public RequiredTextField() {
        this(false);
    }

    @Override
    public Boolean isValidValue() {
        if ("".equals(this.getText().trim())) {
            return false;
        } else {
            return true;
        }
    }
}
