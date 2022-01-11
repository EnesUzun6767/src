package day35Encapsulation.encapsulation;

public class Credentials {
    private String username, password;

    public Credentials(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    public boolean isStrongPassword(String password){

        boolean isStrongPassword = false;

        boolean hasOneLetter = false;
        boolean hasOneDigit = false;
        boolean hasOneSpecialChar = false;


        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            if (Character.isLetter(each)) {
                hasOneLetter = true;
            }else if (Character.isDigit(each)){
                hasOneDigit = true;
            }else {
                hasOneSpecialChar = true;
            }
        }

        if (hasOneLetter==true && hasOneDigit==true && hasOneSpecialChar==true &&
                password.length()>8 && !password.contains(" ")){
            isStrongPassword= true;
        }
        return isStrongPassword;
    }

    public String getPassword(){
        return password;
    }

    public String getUsername(){
        return username;
    }

    public void setPassword(String password) {
        if (!isStrongPassword(password)) {
            System.err.println("Password is not strong");
            return;
        }else {
            this.password = password;
        }

    }


    public void setUsername(String username){
        this.username = username;
    }


    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}


/*
2. create a class named Credentials
            Variables:
                username, password

            Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is strong password
                            Characteristics of strong passwords are:
                                    1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit

                getPassword(): reads the password
                getUsername(): reads the username
                setUsername(): sets the username
                setPassword(): sets a new password
                                    the new password MUST be a strong password

                toString():

            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)



 */