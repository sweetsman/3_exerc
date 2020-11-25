package exercises;

public class t24 {
    public static void main(String[] args) {
        int random=(int)(Math.random()*13);
        int random1=(int)(Math.random()*4) ;
        String word=null;

        switch(random) {
            case 0: word=" Ace ";
                break;
            case 1: word=" 2 ";
                break;
            case 2: word=" 3 ";
                break;
            case 3: word=" 4 ";
                break;
            case 4: word=" 5 ";
                break;
            case 5: word=" 6 ";
                break;
            case 6: word=" 7 ";
                break;
            case 7: word=" 8 ";
                break;
            case 8: word=" 9 ";
                break;
            case 9: word=" 10 ";
                break;
            case 10: word=" Jack ";
                break;
            case 11: word=" Queen ";
                break;
            case 12: word=" King ";
                break;
        }

        String word1=null;

        switch(random1) {
            case 0: word1=" Clubs ";
                break;
            case 1: word1=" Diamonds ";
                break;
            case 2: word1=" Hearts ";
                break;
            case 3: word1=" Spades ";
                break;
        }

        System.out.print("The card you picked is " + word + " of " + word1);
    }
}
