package africa.semicolon.deitelExercises.tddTest;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FilesSearch {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter path name");
        Path path = Paths.get(input.nextLine());
        if(Files.exists(path)){
            System.out.println(path.getFileName() + " exists");
        }
        if(Files.isDirectory(path)){
            System.out.println(path.getFileName() + " is a directory");
        }
        if(path.isAbsolute()){
            System.out.println("Is an absolute path");
        }
        System.out.println("Last modified: "+Files.getLastModifiedTime(path));
        System.out.println("Size: "+Files.size(path));
        System.out.println("Absolute path : "+path.toAbsolutePath());

        DirectoryStream<Path>dStream = Files.newDirectoryStream(path);

        for (Path p : dStream){
            System.out.println(p);
        }
    }

}
