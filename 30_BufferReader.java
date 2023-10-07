import java.util.*; // * means everything // used in modern days ex - scanner
import java.io.InputStreamReader;
import java.io.BufferedReader;

// input of data

class Buffer{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Enter a number");
        // int a = System.in.read();  it takes input and converts it into ascii form
        // System.out.println(a);

        // older way to take input 
        // InputStreamReader inp = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(inp); // this read the entire line string format
        // int num = Integer.parseInt(bf.readLine()); // . string will be converted into integer
        // System.out.println(num);

        // modern way
        Scanner intScanner = new Scanner(System.in);
        int num2 = intScanner.nextInt();
        System.out.println(num2);

        // use different scanner object for different data-types

        
        Scanner strScanner = new Scanner(System.in);
        System.out.println("Enter a char");
        // java does not take input as character it only takes input as string
        String str = strScanner.nextLine(); 
        System.out.println(str);
        // we can convert the string into char by .charAt(index) function
        char c1 = str.charAt(0);
        System.out.println(c1);
    } 
}