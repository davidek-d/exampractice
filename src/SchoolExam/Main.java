package SchoolExam;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ExamQuestion> list = new ArrayList<>();

        for (int i = 0; i <= 14; i++) {
            ExamQuestion e1 = new ExamQuestion(i, 'A');
            e1.setRandomGrade();
            list.add(e1);
        }

        System.out.println(list);

        File f = new File("questions.txt");

        try {
        FileWriter fh = new FileWriter("questions.txt");
        fh.write(String.valueOf(list));
        fh.close();
        }
        catch (IOException _) {
        }



    }
}
