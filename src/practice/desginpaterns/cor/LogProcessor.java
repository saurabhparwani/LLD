package practice.desginpaterns.cor;

public abstract class LogProcessor {
    private String description;
    private LogProcessor nextLogPorcessor;

    public static int INFO = 1;
    public static int DEBUG = 2;
    public  static int ERROR = 3;


    public LogProcessor(LogProcessor nextLogPorcessor) {
        this.nextLogPorcessor = nextLogPorcessor;
    }

    public  void log(int logLevel, String message){
        if(this.nextLogPorcessor != null)
            this.nextLogPorcessor.log(logLevel,message);
        else
            System.out.println("Invalid log level");

    }
}
