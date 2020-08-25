/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle.validation.placa;

import controle.ValidaCpf;
import controle.validation.MyInputVerifier;
import visualizacao.componentes.text.formatted.PlacaVeiculoTextField;

/**
 *
 * @author Jhonnatan
 */
public class PlacaInputVerifier extends MyInputVerifier<PlacaVeiculoTextField> {

    @Override
    public Boolean verifyFieldValue(PlacaVeiculoTextField component) {
        String value = component.getText()
                .replaceAll(" ", "")
                .replaceAll("-", "");
        if ("".equals(value)) {
            this.invalidAction(component);
        } else {
            this.validAction(component);
        }
        return true;
    }

    @Override
    public Boolean runValidation(PlacaVeiculoTextField component) {
        String value = component.getText()
                .replaceAll(" ", "")
                .replaceAll("-", "");
        if ("".equals(value)) {
            return false;
        } else {
            return true;
        }
    }
}
