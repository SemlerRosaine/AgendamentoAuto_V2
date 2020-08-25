/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle.validation.date;

import controle.validation.MyInputVerifier;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import visualizacao.componentes.text.formatted.DataTextField;

/**
 *
 * @author Jhonnatan
 */
public class DateInputVerifier extends MyInputVerifier<DataTextField> {

    @Override
    public Boolean verifyFieldValue(DataTextField component) {
        String value = component.getText()
                .replaceAll(" ", "")
                .replaceAll("/", "");
        try {
            if (component.getRequired() || !("".equals(value))) {
                new SimpleDateFormat("dd/MM/yyyy").parse(component.getText().trim());
            }
            this.validAction(component);
        } catch (ParseException ex) {
            this.invalidAction(component, component.getInvalidTooltipMessage());
        }
        return true;
    }

    @Override
    public Boolean runValidation(DataTextField component) {
        String value = component.getText()
                .replaceAll(" ", "")
                .replaceAll("/", "");
        try {
            if (component.getRequired() || !("".equals(value))) {
                new SimpleDateFormat("dd/MM/yyyy").parse(component.getText().trim());
            }
            return true;
        } catch (ParseException ex) {
            return false;
        }
    }
}
