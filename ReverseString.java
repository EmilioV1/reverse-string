
/**
 * Program to reverse strings.
 * 
 * @author Emilio Valladares 
 * @version 1/19/2020
 */
public class ReverseString {
    
    public static void main(String args[]) {
        String e = reverse("Emilio");
        System.out.println(e);
    }
    
    public static String reverse(String e) {
        char [] letters = new char [e.length()];
        
        int letterIndex = 0;
        for(int i = e.length()-1; i >= 0; i--) {
            letters[letterIndex] = e.charAt(i);
            letterIndex++;
        }
        
        String reverse = "";
        for(int i = 0; i < e.length(); i++) {
            reverse = reverse + letters[i];  
        }
        
        return reverse;
    }
}