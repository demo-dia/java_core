package javacore.ch05.steam;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) throws IOException {
        String contents=new String(Files.readAllBytes(Paths.get("e:\\cr.txt")),StandardCharsets.UTF_8);
        List<String> words= Arrays.asList(contents.split(","));
       /* long count=0;
        for(String w:words){
            if(w.length()>2) count++;
        }
        System.out.println(count);*/

        long count=words.stream().filter(w->w.length()>3).count();
        System.out.println(count);
    }

}
