public class Main {

    public static int averageLengthOfWords(String word1, String word2) {
        return (int) Math.round((word1.length() + word2.length()) / 2);
    }

    public static void main(String[] args) {
        System.out.println(averageLengthOfWords("hellocdrere","stupidooooooooo"));
    }


}