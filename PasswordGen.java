
public class PasswordGen {

    private String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
    private String numberCase = "1234567890";
    private String specialChars = "~!@#$%&*()_-+={[}]|:;<>.?";

    public String password;
    public int numChars;

    public PasswordGen(int numChars) { // passwordGen constructor.
        password = "";
        this.numChars = numChars;
    }

    public void randomPassGen() { // method that generates random password.

        for (int i = 0; i < numChars; i++) { // loops (length of password) times and adds a random character.

            int random = (int) (Math.random() * 4); // randomly selected integer to decide what kind of character to add

            switch (random) {
                case 0: // Adds a random uppercase letter
                    password += String
                            .valueOf(upperCaseLetters.charAt((int) (Math.random() * upperCaseLetters.length())));
                    break;

                case 1: // adds a random lowercase letter
                    password += String
                            .valueOf(lowerCaseLetters.charAt((int) (Math.random() * lowerCaseLetters.length())));
                    break;

                case 2: // adds a random number
                    password += String.valueOf(numberCase.charAt((int) (Math.random() * numberCase.length())));
                    break;

                case 3: // adds a random special character
                    password += String.valueOf(specialChars.charAt((int) (Math.random() * specialChars.length())));
                    break;

            }

        }
    }

    public boolean lowerCheck(String pass) { // method that checks for a lower case character (returns true or false)

        int count = 0; // counts how many lower case characters there are

        for (int i = 0; i < lowerCaseLetters.length(); i++) { // loops through all possible lower case letters

            if (pass.indexOf(lowerCaseLetters.charAt(i)) != -1) { // checks if the password contains that letter at the
                                                                  // index (i)

                count++; // increments count by 1 if the lowercase letter is found
            }
        }

        if (count > 0) {
            return true; // if the number of lower case letters more than one, returns true
        }
        return false; // otherwise (count is 0), returns false

    }

    public boolean upperCheck(String pass) { // method exactly the same as lowerCheck. but with upperCase

        int count = 0;

        for (int i = 0; i < upperCaseLetters.length(); i++) {
            if (pass.indexOf(upperCaseLetters.charAt(i)) != -1) {
                count++;
            }
        }

        if (count > 0) {
            return true;
        }
        return false;
    }

    public boolean specialCheck(String pass) { // '' '' special characters
        int count = 0;

        for (int i = 0; i < specialChars.length(); i++) {
            if (pass.indexOf(specialChars.charAt(i)) != -1) {
                count++;
            }
        }

        if (count > 0) {
            return true;
        }
        return false;
    }

    public boolean numCheck(String pass) { // '' '' numbers
        int count = 0;

        for (int i = 0; i < numberCase.length(); i++) {
            if (pass.indexOf(numberCase.charAt(i)) != -1) {
                count++;
            }
        }

        if (count > 0) {
            return true;
        }
        return false;
    }

    public void addNeededChar() { // method that adds the character(s) to the password that it might be missing

        if (upperCheck(password) == false) { // calls upperCheck method

            password += String.valueOf(upperCaseLetters.charAt((int) (Math.random() * upperCaseLetters.length()))); // adds
                                                                                                                    // uppercase
                                                                                                                    // character
                                                                                                                    // to
                                                                                                                    // password
                                                                                                                    // if
                                                                                                                    // check
                                                                                                                    // is
                                                                                                                    // false

        } else if (lowerCheck(password) == false) { // calls lowerCheck method

            password += String.valueOf(lowerCaseLetters.charAt((int) (Math.random() * lowerCaseLetters.length()))); // adds
                                                                                                                    // lowercase
                                                                                                                    // character
                                                                                                                    // to
                                                                                                                    // password
                                                                                                                    // if
                                                                                                                    // check
                                                                                                                    // is
                                                                                                                    // false

        } else if (specialCheck(password) == false) { // calls SpecialCheck method

            password += String.valueOf(specialChars.charAt((int) (Math.random() * specialChars.length()))); // adds
                                                                                                            // special
                                                                                                            // character
                                                                                                            // to
                                                                                                            // password
                                                                                                            // if check
                                                                                                            // is false

        } else if (numCheck(password) == false) { // calls numCheck method

            password += String.valueOf(numberCase.charAt((int) (Math.random() * numberCase.length()))); // adds number
                                                                                                        // to password
                                                                                                        // if check is
                                                                                                        // false

        }

    }

    public String getPassword() { // method returns password
        return password;
    }

    public void printPassword() { // method prints password
        System.out.println("Random generated password: " + password);
    }
}
