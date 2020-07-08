package Exercise6_4;

public class Abecedarian {

    public static boolean isAbecedarian (String str) {
        str = str.toLowerCase();

        for (int i = 0; i < str.length() - 2; i++) {

            String firstLetter = "" + str.charAt(i);
            String secondLetter = "" + str.charAt(i+1);
            int diff = firstLetter.compareTo(secondLetter);
            if (diff >= 0) { // not sure about == 0
                return false; // return false and terminate the method!!!
            }

        }
        return true;
        // what about return here???? There's an error!
        // Error found!! Yay!
        // If method isn't terminated in if body, then it's indeed 'abecedarian'. So, true will return.
    }

    public static void main(String[] args) {
        boolean ans = isAbecedarian("kdlfjwl");

        System.out.println(ans);
    }
}
