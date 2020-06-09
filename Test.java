import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Customar custom = new Customar();
        Scanner input = new Scanner(System.in);
        custom.customarinfo();//check the customar information first
        custom.addname();//add the customar name
        System.out.println("New customar list after Add: ");
        custom.customarinfo();//show the  customar list
        System.out.println("Do u wanna change a name? yes(1)/no(2): ");
        int chios = input.nextInt();//asking for name change
        switch(chios){
            case 1:
            custom.change_name();
            break;
            case 2: 
            System.out.println("Thank you for being with us!!");
            break;
        }
        System.out.println("Customar list : ");
        custom.customarinfo();//show the customar info
    }
}