import java.util.Scanner;

enum Command{ADD, LIST, SUM, MIN, MAX, QUIT, INVALID};

public class ArrayEnum {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int index = 0;
        int values[] = new int[100];
        while(true){
            final Command command = getCommand(scanner);
            if(command == Command.QUIT){
                System.out.println("Bye!");
                break;
            }
            switch(command){
                case ADD:
                    final int newValue = getValue(scanner);
                    values[index] = newValue;
                    index++;
                    break;
                case LIST:
                    printList(values, index);
                    break;
                case SUM:
                    System.out.println(getSum(values, index));
                    break;
                case MIN:
                    System.out.println(getMin(values, index));
                    break;
                case MAX:
                    System.out.println(getMax(values, index));
                    break;
                case INVALID:
                    System.out.println("Invalid Command");
                    break;
                default:
                    break;
            }
        }
        scanner.close();
    }
    private static Command getCommand(Scanner scanner){
        String input = scanner.next();
        Command command;
        try{
            command = Command.valueOf(input.toUpperCase());
        }
        catch(IllegalArgumentException e) {
            command = Command.INVALID;
            String trash = scanner.nextLine(); //버퍼 비우기
        }
        return command;
    }
    private static int getValue(Scanner scanner){
        int input = scanner.nextInt();
        return input;
    }
    private static void printList(int values[], int size){
        for(int i=0; i<size; i++){
            System.out.printf("%d ", values[i]);
        }
        System.out.println();
    }
    private static int getSum(int values[], int size){
        int sum = 0;
        for(int i=0; i<size; i++){
            sum += values[i];
        }
        return sum;
    }
    private static int getMin(int values[], int size){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<size; i++){
            if(min > values[i]){
                min = values[i];
            }
        }
        return min;
    }
    private static int getMax(int values[], int size){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<size; i++){
            if(max < values[i]){
                max = values[i];
            }
        }
        return max;
    }


}
