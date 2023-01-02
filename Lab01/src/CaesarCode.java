import java.util.*;
public class CaesarCode {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Input the plaintext message : ");
        String plaintext = sc.nextLine().toLowerCase();
        System.out.println(" Enter shifted : ");
        int shift = sc.nextInt();
        String ciphertext = "";
        char alphabet;
        for(int i=0; i < plaintext.length();i++)
        {
            alphabet = plaintext.charAt(i);
            if(alphabet >= 'a' && alphabet <= 'z')
            {
                // shift alphabet
                alphabet = (char) (alphabet + shift);
                if(alphabet > 'z') {
                    alphabet = (char) (alphabet+'a'-'z'-1);
                }
                ciphertext = ciphertext + alphabet;
            }
        }
        System.out.println(" ciphertext : " + ciphertext.toUpperCase());
    }
}
