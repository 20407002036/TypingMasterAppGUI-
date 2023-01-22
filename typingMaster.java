import java.time.LocalTime;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;
public class typingMaster{
    //Creating random words to type
    static String line[] = {"mouse", "eat","cat","helipad","aeroplane","ship","musk","pichai","owner","is","tesla","google",
            "loves","memory","computer"};
    public static void main(String[] args) throws InterruptedException {
        System.out.println("WELCOME TO TYPING MASTER....");
        System.out.println();
        System.out.println("The words are generating to type please wait.....");
        Scanner div= new Scanner(System.in);
        for (int i=1;i<=3;i++){
            TimeUnit.SECONDS.sleep(1);
            System.out.println(i);
        }
        Random rand = new Random();
        for(int j=0;j<4;j++){
            System.out.print(line[rand.nextInt(line.length)] +" ");
        }
        //printing a new line
        System.out.println();
        //getting exact seconds of the day that we are currently at
        double start = LocalTime.now().getSecond();
        String words = div.nextLine();
        double end = LocalTime.now().getSecond();
        double interval = end - start;      //getting exact interval of second we typed
        interval = Math.abs(interval);
        System.out.println(interval);
        // result logic here::
        if(interval<=7){
            System.out.println("Your typing speed is quite fast!");
        }
        else if (interval>7 && interval<=12){
            System.out.println("Your typing speed is average");
        }
        else if(interval>12){
            System.out.println("You need practise!! Your typing speed is very slow!");
        }
        //calculating the words typed by user per second
        double wps = (interval/words.length());
        System.out.println("Words per second is " + wps);
    }
}
/** By Divyam Raj */
