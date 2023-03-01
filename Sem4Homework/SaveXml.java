package Sem4Homework;

import java.io.FileWriter;
import java.io.IOException;

public class SaveXml extends SaveFile {
    @Override
    public void save(Object object) {

        try (FileWriter writer = new FileWriter("Planner.xml", true)) {
            var res = object;
            writer.write(res + "\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
