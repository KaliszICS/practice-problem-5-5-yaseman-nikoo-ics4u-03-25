public class Card implements Comparable<Card>{
    public String name, suit;
    public Card(String name, String suit){
        this.name=name;
        this.suit=suit;
    }
    public String getName(){
        return this.name;
    }
     public String getSuit(){
        return this.suit;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSuit(String suit){
        this.suit=suit;
    }
    @Override
    public String toString(){
    
        return this.name +" of "+ this.suit;
    }
    @Override
    public int compareTo(Card card){
        String[] names={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        String[] suits={"Hearts", "Clubs", "Diamonds","Spades"};
        Card[] cards=new Card[52];
        for(int i=0;i<52;i++){
            cards[i]=new Card(names[i%13], suits[i/13]);
            
        }
        
        int cardindex=-1;
        int mycard=-1;
        for(int x=0;x<52;x++){
            if(cards[x].getName().equals(card.getName())&&cards[x].getSuit().equals(card.getSuit())){
                cardindex=x;
        
            }
            if(cards[x].getName().equals(this.name)&&cards[x].getSuit().equals(this.suit)){
                mycard=x;
                
            }
        }
        return mycard- cardindex;
    }

}