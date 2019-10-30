/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4;

/**
 *
 * @author Usuario
 */
public class Mail {
    
    String mail;
    
    public Mail (String mail) {
        this.mail = mail;
    }
    
    public String getDomain() {
        return this.mail.substring(this.mail.indexOf("@") + 1);
    }
    
    public static boolean isMail(String lineFile) {
        return lineFile.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    }
    
}
