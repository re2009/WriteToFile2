import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LamStremReadWrite {

    public static void main(String[] args) throws IOException {

//        String content = "Hallo Ray Welt2";

    List<String> list = Arrays.asList();
try (Stream<String> stream = Files.lines(Paths.get("C://Reza//lines.txt"))){



    list=stream

            .map(String::toUpperCase)
            .collect(Collectors.toList());


}catch (IOException e){
    e.printStackTrace();
}
   list.forEach(System.out::println);


        System.out.println();
        System.out.println("Done...");

    }

}
