package org.wcci;

public class LogicProblems {
    /*
     * squirrelPlay()
     * The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is between
     * 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. Given an int temperature
     * and a boolean isSummer, return true if the squirrels play and false otherwise.
     *
     * Examples:
     * - squirrelPlay(70, false) → true
     * - squirrelPlay(95, false) → false
     * - squirrelPlay(95, true) → true
     */
    int temp = 75;
    boolean isSummer = false;

    public boolean squirrelPlay(int temp, boolean isSummer) {
        if ((temp < 60) || (temp > 100)) {
            return false;
        } else if ((temp >= 60) && (temp <= 100) && (isSummer = true)) {
            return true;
        } else if ((temp >= 60) || (temp <= 90)) {
            return true;
        } else {
            return false;
        }
    }
/*    public static void main(String[] args) { // Test for squirrelPlay method
        System.out.println(new LogicProblems().squirrelPlay(75,false));
    }*/

    /*
     * nearTen()
     * Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b) is the
     * remainder of dividing a by b, so (7 % 5) is 2.
     *
     * Examples:
     * - nearTen(12) → true
     * - nearTen(17) → false
     * - nearTen(19) → true
     */
    int num = 12;

    public boolean nearTen(int num) { // If I comment out the previous method, these errors go away?
        if ((num > 0) && (num % 10 <= 2)) {
            return true;
        } else {
            return false;
        }
    }

/*    public static void main(String[] args) { // Test for nearTen method
        System.out.println(new LogicProblems().nearTen(12));
    }*/
}

