package practice.desginpaterns.cor;

public class Runner {
    public static void main(String[] args){
        LogProcessor logProcessor = new Infologprocessor(new DebugLogprocessor(new ErorrLogProcessor(null)));
        logProcessor.log(LogProcessor.INFO,"Test info message ");
        logProcessor.log(LogProcessor.DEBUG,"Test debug message ");
        logProcessor.log(LogProcessor.ERROR,"Test error message ");
        logProcessor.log(4,"Test");
    }
}
