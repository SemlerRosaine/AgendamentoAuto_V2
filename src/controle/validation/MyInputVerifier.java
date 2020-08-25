/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle.validation;

import java.awt.Color;
import javax.swing.InputVerifier;
import javax.swing.JComponent;

/**
 *
 * @author Jhonnatan
 */
public abstract class MyInputVerifier<K extends JComponent> extends InputVerifier {

    @Override
    public boolean verify(JComponent jc) {
        return verifyFieldValue((K)jc);
    }
    
    public abstract Boolean verifyFieldValue(K component);
    
    public Boolean isValidValue(K component){
        if(this.runValidation(component)){
            this.validAction(component);
            return true;
        }else{
            this.invalidAction(component);
            return false;
        }
    }
    
    public abstract Boolean runValidation(K component);
    
    protected void invalidAction(K component){
        component.setBackground(new Color(255, 160, 122));
    }
    
    protected void invalidAction(K component, String invalidTooltipMessage){
        this.invalidAction(component);
        component.setToolTipText(invalidTooltipMessage);
    }
    
    protected void validAction(K component){
        component.setBackground(Color.WHITE);
        component.setToolTipText(null);
    }
    
}
