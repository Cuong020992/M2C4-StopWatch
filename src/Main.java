public class Main {

    public static void main(String[] args) {
	// write your code here
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i =0;i<10000;i++){
            for (int j= 0;j<10000;j++){
                System.out.println(i);
            }
        }
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}
