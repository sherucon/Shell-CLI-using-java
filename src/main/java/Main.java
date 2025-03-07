import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Uncomment this block to pass the first stage
        

        while(true){
            System.out.print("$ ");
            
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            String valid_cmd = "exit echo type";

            if(input.equals("exit 0")){
                break;
            }

            else if(input.startsWith("echo ")){
                System.out.println(input.substring(5,input.length()));
            }

            else if(input.startsWith("type ")){
                if(valid_cmd.contains(input.split(" ")[1])){
                    System.out.println(input.split(" ")[1] + " is a shell builtin");
                }
                else{
                    System.out.println(input.split(" ")[1] + ": not found");
                }
            }

            else{
                System.out.println(input + ": command not found");
            }
        }
    }
}
