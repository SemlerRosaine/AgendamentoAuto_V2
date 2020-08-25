/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle.validation.cpf;

import controle.ValidaCpf;
import controle.validation.MyInputVerifier;
import visualizacao.componentes.text.formatted.CPFTextField;

/**
 *
 * @author Jhonnatan
 */
public class CPFInputVerifier extends MyInputVerifier<CPFTextField> {

    @Override
    public Boolean verifyFieldValue(CPFTextField component) {
        String value = component.getText()
                .replaceAll(" ", "")
                .replaceAll("\\.", "")
                .replaceAll("-", "");
        if (component.getRequired() && (!ValidaCpf.isCPF(value) || "".equals(value))) {
            this.invalidAction(component);
        } else if (!component.getRequired() && !"".equals(value) && !ValidaCpf.isCPF(value)) {
            this.invalidAction(component, component.getInvalidTooltipMessage());
        } else {
            this.validAction(component);
        }
        return true;
    }

    @Override
    public Boolean runValidation(CPFTextField component) {
        String value = component.getText()
                .replaceAll(" ", "")
                .replaceAll("\\.", "")
                .replaceAll("-", "");
        if (component.getRequired() && (!ValidaCpf.isCPF(value) || "".equals(value))) {
            return false;
        } else if (!component.getRequired() && !"".equals(value) && !ValidaCpf.isCPF(value)) {
            return false;
        } else {
            return true;
        }
    }
}
