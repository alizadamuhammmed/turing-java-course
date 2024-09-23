package az.edu.turing.module01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RandomSeatAssigner {
    public static void main(String[] args) {
        String[] students = {"Muhammed", "Huseyn", "Leyla", "Ali",
                "Bahruz", "Turqut", "Shammad", "Aysel", "Nurcan", "Javad", "Saleh",
        "Maharram", "Elshan" , "Araz" , "Adil", "AnarF", "Royal" , "Omar" , "AnarK",
                "Ayten" , "Joshgun" , "Kanan", "Farid", "Hikmat", "Ilkin"};
        int numberOfStudents = students.length;

        List<String> listOfStudents = Arrays.asList(students);
        Collections.shuffle(listOfStudents);

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(listOfStudents.get(i) + " - yer " + (i+1) );
        }


    }

}
