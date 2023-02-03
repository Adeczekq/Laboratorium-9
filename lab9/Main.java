import java.util.*;

public class Main {
    public static void main(String[] args) {
        zadanie1();
    }
    public static void zadanie1(){
        List<info> u=new ArrayList<>(Arrays.asList
                (new info(1,22,"Adrian"),
                        new info(2,20,"Paweł"),
                        new info(3,21,"Karol"),
                        new info(4,19,"Aleksandra"),
                        new info(5,25,"Angelika"),
                        new info(6,18,"Gabiela")
                ));
        System.out.println(u);
    }
}