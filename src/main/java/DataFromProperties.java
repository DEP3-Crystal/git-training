import com.google.gson.Gson;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class DataFromProperties {
    public static void writeOnProperties() throws IOException {
        OutputStream out = new FileOutputStream("src/main/resources/media.properties");
        Properties p = new Properties();
        int i = 0;
        for (DigitalVideoDisc n : Order.orders) {
            i = i + 1;
            p.setProperty(i + "", n.toString());
        }
        p.store(out, null);
    }

    public static void readFromProperties() {

    }

    public static void writeOnJson() throws IOException {
        Writer writer = Files.newBufferedWriter(Paths.get("src/main/resources/media.json"));
        Gson json = new Gson();
        json.toJson(Order.orders, writer);
        writer.close();
    }

    public static List readFromJson() throws IOException {

        Reader reader = Files.newBufferedReader(Paths.get("src/main/resources/media1.json"));

        Gson gson = new Gson();
        List<DigitalVideoDisc> books = Arrays.asList(gson.fromJson(reader, DigitalVideoDisc[].class));

        return books;
    }

}

