package practice.desginpaterns.cor;

public class Infologprocessor extends LogProcessor{
    public Infologprocessor(LogProcessor nextLogPorcessor) {
        super(nextLogPorcessor);
    }
    public  void log(int logLevel, String message){
        if(logLevel == LogProcessor.INFO){
            System.out.println(String.format("Info Log : %s",message));
        }
        else
            super.log(logLevel,message);

    }
}
