/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package login.java;

/**
 *
 * @author RC_Student_lab
 */
public class LoginJava {
    
    public LoginJava() {
    

}
public boolean checkUserName (String username){
  
    
    if (username.contains ("_") && username.length() <=5) {
        return true;
    }else{
        return false;
    }    
}

public boolean checkPasswordComplexity (String password) {

String capital = ".*[A-Z].*"; //Checks capital letters 
String small = ".*[a-z].*"; //Checks small letters 
String special = ".*[!@#$%^&*(),.?\":{}|<>].*";//Checks special characters 
String digit = ".**\\d.*";// Checks digit characters

if (password.length()>=8 && password.matches(capital) && password.matches(small) && password.matches(digit) && password.matches(special)){
    
    return true;
}
else {
    return false;
    }
}
public boolean checkCellPhoneNumber (String phone) {
    
    String saCode = "+27";
    String firstThreeChars = phone.substring(0,3); //Gets characters from index 0 to 2 (inclusive)
    
    int fourthDigit = Character.getNumericValue(phone.charAt(3)); //Gets and coverts the fourth digit
    if (phone.length() <=12 && firstThreeChars.equals(saCode) && fourthDigit >=6 && fourthDigit <=8){
        return true;
        
    }else{
        return false;
    }
}


public String registerUser(String username, String password, String phone){
        
    boolean validatePhone = checkCellPhoneNumber (phone);
    boolean validateUsername = checkUserName (username);
    boolean validatePassword = checkPasswordComplexity (password);
        
    if (validatePhone ==true && validateUsername ==true && validatePassword ==true){
        return "User is successfully registered";
    }else {
        return "User registration failed!!!!!";
    }
 }       
         

public boolean loginUser(String username, String password, boolean validPassword){
    boolean validateUsername = checkUserName (username);
    boolean validatePassword = checkPasswordComplexity (password);
    
    if (validateUsername ==true && validPassword ==true){
        return true;
    }else{
        return false;
    }
}

public String returnLoginStatus(String username, String password){
    boolean validUsername = checkUserName (username);
    boolean validPassword = checkPasswordComplexity (password);
    
    if (validUsername ==true && validPassword ==true){
        return "A succesful login";
    }else{
        return "A failed login";
    }
}

    private boolean checkCellPhoneNumber(String phone) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}



