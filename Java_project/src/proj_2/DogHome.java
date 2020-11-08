package proj_2;

public class DogHome {
    public static void main(String[] args) {
        Dog[] sobaka=new Dog[5];
        for(int i=0;i<sobaka.length;i++)
        {
            sobaka[i]=new Dog("Jora"+i,7);
            System.out.println(sobaka[i].toString());
        }
    }
}
