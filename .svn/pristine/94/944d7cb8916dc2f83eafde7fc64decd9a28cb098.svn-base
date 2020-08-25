/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visualizacao.componentes.text.formatted;

import controle.validation.placa.PlacaInputVerifier;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Jhonnatan
 */
public class PlacaVeiculoTextField extends AbstractFormattedTextField {

    public PlacaVeiculoTextField(Boolean required) {
        super(required, "Placa não informada");
        this.setInputVerifier(new PlacaInputVerifier());
        try {
            super.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("UUU-####")));
        } catch (ParseException ex) {
            Logger.getLogger(CPFTextField.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public PlacaVeiculoTextField() {
        this(false);
    }
}
