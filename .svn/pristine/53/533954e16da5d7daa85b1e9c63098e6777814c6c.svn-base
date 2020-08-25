/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle.validation.date;

import controle.validation.MyInputVerifier;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import visualizacao.componentes.text.formatted.HoraTextField;

/**
 *
 * @author Jhonnatan
 */
public class HourInputVerifier extends MyInputVerifier<HoraTextField>{

    @Override
    public Boolean verifyFieldValue(HoraTextField component) {
        String value = component.getText()
                .replaceAll(" ", "")
                .replaceAll(":", "");
        try {
            if (component.getRequired() || !("".equals(value))) {
                new SimpleDateFormat("HH:mm").parse(component.getText().trim());
            }
            this.validAction(component);
        } catch (ParseException ex) {
            this.invalidAction(component, component.getInvalidTooltipMessage());
        }
        return true;
    }

    @Override
    public Boolean runValidation(HoraTextField component) {
        String value = component.getText()
                .replaceAll(" ", "")
                .replaceAll(":", "");
        try {
            if (component.getRequired() || !("".equals(value))) {
                new SimpleDateFormat("HH:mm").parse(component.getText().trim());
            }
            return true;
        } catch (ParseException ex) {
            return false;
        }
    }
    
}
