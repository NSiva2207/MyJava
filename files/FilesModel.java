package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesModel {
    public static void main(String[] args) throws IOException {
        //Files.list(Paths.get(".")).forEach(System.out::println);
        Path path = Paths.get("./Resources/data.txt");
       Files.lines(path)
               .map(String::toUpperCase)
               .filter(str -> str.contains("A"))
               .forEach(System.out::println);
       Path path1 = Paths.get("./Resources/file.txt");
       List<String> str = List.of("Apple","Bat","cat","Dog");
       Files.write(path1,str);

    }
}
