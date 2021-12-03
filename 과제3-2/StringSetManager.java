import java.util.Locale;
import java.util.Scanner;

enum StringCommand{ADD, REMOVE, CLEAN, QUIT, INVALID};

public class StringSetManager {
    static int size = 0;
    public static void main(String[] args){
        final Scanner scanner = new Scanner(System.in);
        String[] stringSet = new String[100];
        while(true){
            final StringCommand command = getCommand(scanner);
            if(command == StringCommand.QUIT){
                System.out.println("BYE!");
                break;
            }
            switch (command){
                case ADD:{
                    final String str = getString(scanner);
                    add(stringSet, str);
                    break;
                }
                case REMOVE:{
                    final String str = getString(scanner);
                    remove(stringSet, str);
                    break;
                }
                case CLEAN:{
                    clear(stringSet);
                    break;
                }
                default:
                    System.out.println("Unknown Command");
                    break;
            }
            print(stringSet);
        }
        scanner.close();
    }
    private static StringCommand getCommand(Scanner scanner){
        StringCommand command = StringCommand.INVALID;
        try{
            command = StringCommand.valueOf(scanner.next().toUpperCase());
        }
        catch(IllegalArgumentException e){
        }
        return command;
    }
    private static String getString(Scanner scanner){
        String str = scanner.next();
        return str;
    }
    private static void add(String[] stringSet, String str){
        for(int i=0; i<size; i++){
            if(stringSet[i].equals(str)) return;
        }
        stringSet[size++] = str;
        return;
    }
    private static void remove(String[] stringSet, String str){
        for(int i=0; i<size; i++){
            if(stringSet[i].equals(str)){
                for(int j=i; j<size-1; j++){
                    stringSet[j] = stringSet[j+1];
                }
                stringSet[size-1] = null;
                size --;
                break;
            }
        }
        return;
    }
    private static void clear(String[] stringSet){
        for(int i=0; i<size; i++){
            stringSet[i] = null;
        }
        size = 0;
        return;
    }
    private static void print(String[] stringSet){
        System.out.printf("Element Size: %d, Values = [", size);
        for(int i=0; i<size; i++){
            System.out.print(stringSet[i]);
            if(i<size-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
        return;
    }

}
