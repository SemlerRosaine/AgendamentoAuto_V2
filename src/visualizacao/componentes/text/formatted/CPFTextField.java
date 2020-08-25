/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visualizacao.componentes.text.formatted;

import controle.validation.cpf.CPFInputVerifier;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Rosaine Fiorio
 */
public class CPFTextField extends AbstractFormattedTextField {

    public CPFTextField(Boolean required) {
        super(required, "CPF inválido");
        this.setInputVerifier(new CPFInputVerifier());
        try {
            super.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("###.###.###-##")));
        } catch (ParseException ex) {
            Logger.getLogger(CPFTextField.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public CPFTextField() {
        this(false);
    }
}
