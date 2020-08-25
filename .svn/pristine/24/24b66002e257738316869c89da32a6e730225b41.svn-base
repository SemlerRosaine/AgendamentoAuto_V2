/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visualizacao.componentes.text.formatted;

import controle.validation.MyInputVerifier;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JFormattedTextField;
import visualizacao.componentes.text.Validation;

/**
 *
 * @author Jhonnatan
 */
public abstract class AbstractFormattedTextField extends JFormattedTextField implements Validation {

    private String invalidTooltipMessage;
    private Boolean required;

    public AbstractFormattedTextField() {
        this(false);
    }

    public AbstractFormattedTextField(Boolean required) {
        super();
        this.required = required;
        this.setFocusLostBehavior(JFormattedTextField.COMMIT);
        this.addFocusListener(new FocusAdapter() {

            @Override
            public void focusGained(FocusEvent fe) {
                super.focusGained(fe);
                setCaretPosition(0);
                selectAll();
            }
            
        });
    }

    public AbstractFormattedTextField(Boolean required, String invalidTooltipMessage) {
        this(required);
        this.required = required;
        this.invalidTooltipMessage = invalidTooltipMessage;
    }

    @Override
    public void setText(String string) {
        super.setText(string);
        this.setBackground(Color.WHITE);
    }
    
    @Override
    public Boolean runValidation(){
        return ((MyInputVerifier)this.getInputVerifier()).isValidValue(this);
    }

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
