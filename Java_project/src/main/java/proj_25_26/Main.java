package proj_25_26;

public class Main {
    public static void main(String[] args){
        HashMapClass<Integer,String> myHashMap=new HashMapClass<>(10);
        myHashMap.add(1,"raspberry");
        myHashMap.add(2,"potato");
        myHashMap.add(3,"strawberry");
        System.out.println(myHashMap.get(1));
        myHashMap.remove(2);
    }
}
