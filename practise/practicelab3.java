import java.util.*;  

public class practicelab3 {
    public static void main(String[] args) {
    //Scanner sc = new Scanner(System.in);
    text t1 = new text();
    t1.readtext();
    t1.charAt(5);
    t1.length();
    t1.noOfWhiteSpace();
    t1.noOfWords();
    t1.repeatedWords();
    t1.pascalCase();
}}
class text  {
    Scanner sc = new Scanner(System.in);
    String txt;
    void readtext(){
    
    System.out.println("Enter any paragraph");
    txt= sc.nextLine();              //reads string  
  System.out.println("The paragraph you entered is "+ txt);
    }
 
    // text(){System.out.println("Calling from constructor " + txt);}
    public char charAt(int i){
        return txt.charAt(i);
    }
    public int length(){
        int count=0;
        for     (char c: txt.toCharArray()){
            count ++;
        }
        System.out.println( "The count is " + count);
        return count;
    }
    public int noOfWhiteSpace() {
        int count = 0;
        for (char c : txt.toCharArray()) {
            if (c == ' ' || c == '\t') {
                count++;
            }
        }
        System.out.println( "The count of white spaces " + count);
        return count;
    }
    public int noOfWords() {
        int count = 0;
        for (char c : txt.toCharArray()) {
            if (c == ' ' || c == '\t') {
                count++;
            }
        }
        System.out.println( "The count of words are " + (count + 1));
        return count;
    }

public void repeatedWords() {
    String[] words = txt.split("[ \t]+");
    for (int i = 0; i < words.length; i++) {
        for (int j = i + 1; j < words.length; j++) {
            if (words[i].equals(words[j])) {
                System.out.println("Repeated word: " + words[i]);
                break;
            }
        }
    }
}

public void pascalCase() {
    String[] words = txt.split("[ \t]+");
    StringBuilder sb = new StringBuilder();
    for (String word : words) {
        if (word.length() > 0) {
            sb.append(Character.toUpperCase(word.charAt(0)));
            sb.append(word.substring(1).toLowerCase());
        }
    }
    System.out.println("Pascal case: " + sb.toString());
}
}


