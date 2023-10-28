package designpatterns.behavioral.command;

public class OpenTextFileOperation implements TextFileOperation{
    private TextFile textFile;
    public OpenTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }
    @Override
    public String execute() {
        System.out.println(String.format("Opening File %s",this.textFile));
        return textFile.open();
    }
}
