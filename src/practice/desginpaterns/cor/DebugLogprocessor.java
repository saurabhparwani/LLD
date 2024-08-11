package practice.desginpaterns.cor;

public class DebugLogprocessor extends LogProcessor{
    public DebugLogprocessor(LogProcessor nextLogPorcessor) {
        super(nextLogPorcessor);
    }

    public  void log(int logLevel, String message){
        if(logLevel == LogProcessor.DEBUG){
            System.out.println(String.format("Debug Log : %s",message));
        }
        else
            super.log(logLevel,message);

    }
}
