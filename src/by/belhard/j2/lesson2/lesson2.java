package by.belhard.j2.lesson2;

public class lesson2 {

    public static void main(String[] args) {
        int x=22;
        if (x==20){
            x--;
        } else if (x==21) {
            x++;
        } else {
            x /=2;
        }

//        System.out.println(x);
        System.out.println ((x % 2 == 0) ? (x / 2) : (-x));

    }
}
