public class Main {
    public static void main(String[] args) {
        String word = "a3$e";
        Boolean ans = isValid(word);
        System.out.println(ans);
    }
    static boolean isValid(String word) {
        int n = word.length();
        if ( n < 3){
            return false;
        }
        Boolean isVowel = false;
        Boolean isConsonant = false;
        for (int i = 0; i < n; i++) {
            Character ch = word.charAt(i);
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    isVowel = true;
                } else {
                    isConsonant = true;
                }
            } else if (!Character.isDigit(ch)) {
                        return false;
            }
        }
        return isVowel && isConsonant;
        }
    }
