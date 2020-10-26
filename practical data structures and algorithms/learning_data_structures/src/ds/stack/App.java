package ds.stack;

public class App {
    public static void main(String[] args) {

        // Stack theStack = new Stack(10);

        // theStack.push(20);
        // theStack.push(40);
        // theStack.push(60);
        // theStack.push(80);
        // theStack.push(20);
        // theStack.push(40);
        // theStack.push(60);
        // theStack.push(80);
        // theStack.push(20);
        // theStack.push(40);

        // // stack if full a this point addig one more will return stack is full

        // theStack.push(55);


        // System.out.println("\n\tStack");
        // while(!theStack.isEmpty())
        // {
        //     long velue = theStack.pop();
        //     System.out.println(velue);
        // }


        System.out.println();
        String str = "illuminati";

        System.out.println(reverseString(str));
        System.out.println(str);
        
        
    }

    public static String reverseString(String str)
    {
        int size = str.length();

        CharStack stackChars = new CharStack(size);

        for (int i = 0; i < size; i++) {
            stackChars.push(str.charAt(i));
        }

        String result = "";
        for(int i = 0; i < size; i++)
        {
           result = result + stackChars.pop();
        }

        return result;
    }
}
