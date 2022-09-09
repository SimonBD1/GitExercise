import java.util.Scanner;

public class SuperGreeter {
        Scanner scanner = new Scanner(System.in);



    public void start(){
        System.out.println("det virker!");

    }
    public void greet (){
        System.out.println("Hvad hedder du?");
        String navn =scanner.nextLine();
        System.out.println("hej "+navn);
    }
    public void smallTalk (){
        System.out.println("Hvor gammel er du?");
        int alder = scanner.nextInt();
        System.out.println(alder +" Det er lige gammelt nok til mig ;)");
    }
    public static void main (String [] args) {
    SuperGreeter sg= new SuperGreeter();
    sg.start();
    sg.greet();
    sg.smallTalk();

    }
}
