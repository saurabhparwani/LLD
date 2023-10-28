package designpatterns.structural.composite.example1;

public class File implements FileSystem {
    String fileName;
    public File(String name) {
        this.fileName = name;
    }
    public void ls() {
        System.out.println("File name " + fileName);
    }
}
