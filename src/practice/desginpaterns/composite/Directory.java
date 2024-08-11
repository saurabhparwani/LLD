package practice.desginpaterns.composite;

import java.util.ArrayList;

public class Directory implements FileSystem{
    private String directoryName;
    private ArrayList<FileSystem> files;

    public Directory(String directoryName){
        this.directoryName = directoryName;
        this.files = new ArrayList<>();
    }

    public void addFile(FileSystem fileSystem){
        files.add(fileSystem);
    }
    @Override
    public void ls() {
       System.out.println("Accessing Directory :: "+this.directoryName);
       for(FileSystem fileSystem:files)
           fileSystem.ls();
    }
}
