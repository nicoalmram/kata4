package kata4;

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
