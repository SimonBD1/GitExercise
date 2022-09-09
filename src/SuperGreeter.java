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
    public static void main (String [] args) {
    SuperGreeter sg= new SuperGreeter();
    sg.start();
    sg.greet();

    }
}
