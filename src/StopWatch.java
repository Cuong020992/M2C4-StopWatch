public class StopWatch {
    double startTime, endTime;

    public StopWatch(){

    }

    void start(){
this.startTime = System.currentTimeMillis();
    }

    void stop(){
        this.endTime = System.currentTimeMillis();
    }

    public double getElapsedTime(){
        return this.endTime - this.startTime;
    }
}
