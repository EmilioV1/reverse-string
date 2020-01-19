
/**
 * Program to reverse strings.
 * 
 * @author Emilio Valladares 
 * @version 1/19/2020
 */
public class ReverseString {
    
    public static void main(String args[]){
        String e = reverse("Emilio");
        System.out.println(e);
    }
    
    public static String reverse(String e){
        char [] letters = new char [e.length()];
        
        for(int i = 0; i<e.length(); i++){
            System.out.println(e.charAt(i));
        }
        return e;
    }
}