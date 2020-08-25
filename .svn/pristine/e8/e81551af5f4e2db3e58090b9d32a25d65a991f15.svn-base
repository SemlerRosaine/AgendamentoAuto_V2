/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visualizacao.componentes.text;

import controle.validation.MyInputVerifier;
import java.awt.Color;
import javax.swing.JPasswordField;

/**
 *
 * @author Jhonnatan
 */
public abstract class AbstractValidatedPasswordField extends JPasswordField implements Validation {

    private String invalidTooltipMessage;
    private Boolean required;

    public AbstractValidatedPasswordField() {
        this(false);
    }

    public AbstractValidatedPasswordField(Boolean required, String invalidTooltipMessage) {
        this(required);
        this.invalidTooltipMessage = invalidTooltipMessage;
        this.setToolTipText(this.invalidTooltipMessage);
    }

    public AbstractValidatedPasswordField(Boolean required) {
        super();
        this.required = required;
    }

    @Override
    public void setText(String string) {
        super.setText(string);
        this.setBackground(Color.WHITE);
    }

    @Override
    public Boolean runValidation() {
        return ((MyInputVerifier) this.getInputVerifier()).isValidValue(this);
    }

    public abstract Boolean isValidValue();

    public String getInvalidTooltipMessage() {
        return invalidTooltipMessage;
    }

    public void setInvalidTooltipMessage(String invalidTooltipMessage) {
        this.invalidTooltipMessage = invalidTooltipMessage;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }
    
}
