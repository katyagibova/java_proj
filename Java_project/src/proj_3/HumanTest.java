package proj_3;

public class HumanTest {
    public static void main(String[] args){
        Human person = new Human();
        person.setAge(25);
        Hand hand = new Hand();
        hand.setFingers(5);
        person.setHand(hand);
        System.out.println(person.getAge() + " " + hand.getFingers() + " " + person.getHand());
    }
}