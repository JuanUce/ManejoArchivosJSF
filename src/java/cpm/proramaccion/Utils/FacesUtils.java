/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpm.proramaccion.Utils;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

/**
 *
 * @author Juan Quishpe
 */
public class FacesUtils {
    
     public static void addErrorMesage(String cliId, String message){
  
           FacesContext.getCurrentInstance().addMessage(cliId, new FacesMessage(FacesMessage.SEVERITY_ERROR,message,message));
                     
    }
      
    public static String getPath(){
        try {
            ServletContext ctx= (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
            //Obtiene a ruta del war extendido en el DISCO
          return ctx.getRealPath("/");
            
        } catch (Exception e) {
            addErrorMesage("getPath()","ms:"+e.getLocalizedMessage());
        }
        return null;
    }
    
}
