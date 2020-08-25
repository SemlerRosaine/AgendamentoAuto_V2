/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visualizacao.componentes.text.formatted;

import controle.validation.date.DateInputVerifier;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Jhonnatan
 */
public class DataTextField extends AbstractFormattedTextField {

    public DataTextField(Boolean required) {
        super(required, "Data inválida");
        this.setInputVerifier(new DateInputVerifier());
        try {
            super.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("##/##/####")));
        } catch (ParseException ex) {
            Logger.getLogger(CPFTextField.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public DataTextField() {
        this(false);
    }
}
