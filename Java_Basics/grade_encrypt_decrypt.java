package Java_Basics;
public class grade_encrypt_decrypt {
    public static void main(String[] args) {
        char grade = 'M';
        grade = (char)(grade + 8);
        System.out.println("Encrypted Grade is : " + grade);

        grade = (char)(grade - 8);
        System.out.println("Decrypted Grade is : " + grade);

    }
}
