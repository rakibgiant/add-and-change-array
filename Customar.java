import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customar {
    String name,newname;
    List<String> someList = new ArrayList<String>();
    Scanner input = new Scanner(System.in);
    //creat a method addname
    public void addname(){
        System.out.println("Do u wanna add customar?yes(1)/no(2)");
        int chiose = input.nextInt();
        switch(chiose){
            case 1: 
            addCustomar();//switch to addCustomar
            case 2:
            System.out.println("Thank you!!!");
            customarinfo();//switch to customarinfo
            break;
        }
    }
    //creat a method addCustomar
    public void addCustomar() {
        System.out.println("How many Customar u wanna add?: ");
        int customar_num = input.nextInt();
        input.nextLine();
        for(int i = 0; i < customar_num; i++){
            System.out.println("Please entre the customar name: ");
            name = input.nextLine();
            someList.add(name);
            //add name in ArrayList
        }
    }
    //creat a method called customarinfo
    public void customarinfo() {
        System.out.println("Your Customar list is :");
        System.out.println(someList);
        
    }
    //creat  a method called change_name
    public void change_name(){
        System.out.println("Please entre the old name here: ");
        String name = input.nextLine();
        int index = someList.indexOf(name);
        System.out.println("Please entre the new name here: ");
        String newname = input.nextLine();
        for(int i = 0; i<someList.size();i++){
            if (someList.contains(name)){
                someList.set(index, newname);
                System.out.println("Name change Succesfull.");
                break;
            }else{
                System.out.println("Sorry Ur name can't find in the List!!!");
                break;
            }
        }

    }
    
}