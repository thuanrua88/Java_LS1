package lession01;

public class SP4_9 {
    enum Cards{
        Spade, Heart, Diamond, Club
    }
    public static void main(String[] args) {
        Cards card = Cards.Diamond;
        switch (card){
            case Spade:
                System.out.println("SPADE");
                 break;
            case Heart:
                System.out.println("HEARTS");
                break;
            case Diamond:
                System.out.println("DIAMOND");
                break;
            case Club:
                System.out.println("CLUB");
                break;
        }
    }
}
