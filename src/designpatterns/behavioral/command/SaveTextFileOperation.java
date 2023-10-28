package designpatterns.behavioral.command;

public class SaveTextFileOperation implements TextFileOperation{
    private TextFile textFile;
    public SaveTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }
    @Override
    public String execute() {
        System.out.println(String.format("Saving File %s",this.textFile));
        return textFile.save();
    }
}
