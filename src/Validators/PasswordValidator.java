package Validators;

public class PasswordValidator {
    public static boolean PasswordValidator(String password , User user){
        if (password.equals(user.getPassword)) return true;
        return false;
    }
}
