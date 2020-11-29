package proj_23_24;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
        Worker system=new Worker();
        try {
            system.performance();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
