import java.awt.*;
import java.io.*;
import java.net.URI;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Stream;


public class WriteHistory {
//    String text = new String();

    public static  void main(String[] args) throws Exception {
        String path = "C://Reza//History.txt";
//        String str = "sdkkdhgkshgk";
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please Enter Your text");
//        String str = input.next();

//      Declaration Surfen Date and Time
       LocalDateTime localDateTime = LocalDateTime.now();


//       ======================  Start Test With Internet Link Opener Block =======================
        Desktop link = Desktop.getDesktop();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Internet Address: ");
        String lnk = input.next();
        System.out.println("Enter Your Internet Address Extension: \n(com , de , org) ");
        String ext = input.next();
        link.browse(new URI("www." + lnk + "." + ext));


//       ======================  End of Test With Internet Link Opener Block =======================

//       ======================  Start Write History to File =======================
        try {
            BufferedWriter write = new BufferedWriter(new FileWriter(path, true));

            write.append(' ');

            write.newLine();
            write.append("www." + lnk + "." +ext+"  "+"  ===>  "+ "Surf Date :  "+localDateTime);

            write.close();

            System.out.println("Done...");
            System.out.println("Your Request has been Saved!");

        } catch (Exception e) {
            e.printStackTrace();

        }


    }


}
