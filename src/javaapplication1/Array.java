/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author x12340121
 */
public class Array {
//email subject message
    
    private String Email;
    private String Subject;
    private String message;
    /**
     * @param args the command line arguments
     */
    public Array (){
        Email = new String ();
        Subject = new String ();
        message = new String ();
        
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
