package practice.desginpaterns.cor;

public class ErorrLogProcessor extends LogProcessor{
    public ErorrLogProcessor(LogProcessor nextLogPorcessor) {
        super(nextLogPorcessor);
    }

    public  void log(int logLevel, String message){
        if(logLevel == LogProcessor.ERROR){
            System.out.println(String.format("Error Log : %s",message));
        }
        else
            super.log(logLevel,message);
    }
}
