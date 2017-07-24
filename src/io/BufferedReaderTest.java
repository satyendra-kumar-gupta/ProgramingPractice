package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SATYENDRA_GUPTA on 25-07-2017.
 */
public class BufferedReaderTest {
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String address = br.readLine();
        System.out.println(address);

        // Shortcut
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        System.out.println(name);

        // Shortcut++
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).readLine());


        BufferedReader bufferedReader1 = new BufferedReader(new FileReader("C:\\Users\\SATYENDRA_GUPTA\\IdeaProjects\\ProgramingPractice\\src\\sample\\AutoBoxing.java"));
        while ((bufferedReader1.readLine()) != null){
            System.out.println(bufferedReader1.readLine());
        }
    }
}
