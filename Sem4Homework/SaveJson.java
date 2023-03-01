package Sem4Homework;

import java.io.FileWriter;
import java.io.IOException;

public class SaveJson extends SaveFile {
    @Override
    public void save(Object object) {

        try (FileWriter writer = new FileWriter("Planner.json", true)) {
            // var res = object.read();
            var res = object;
            writer.write(res + "\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
