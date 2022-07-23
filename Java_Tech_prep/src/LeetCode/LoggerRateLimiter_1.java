package LeetCode;

import java.util.HashMap;

public class LoggerRateLimiter_1 {

    static class Logger {

        public HashMap<String,Integer> map;

        public Logger() {
            this.map = new HashMap<String,Integer>();
        }

        public boolean shouldPrintMessage(int timestamp, String message) {

            if(map.containsKey(message)) {
                if(map.get(message) > timestamp) return false;
                else {
                    map.put(message, timestamp + 10);
                }
            } else {
                map.put(message, timestamp + 10);
            }

            return true;
        }
    }

    public static void main(String[] args) {
        Logger log = new Logger();
        System.out.println(log.shouldPrintMessage(1,"foo"));
        System.out.println(log.shouldPrintMessage(2,"bar"));
        System.out.println(log.shouldPrintMessage(3,"foo"));
        System.out.println(log.shouldPrintMessage(8,"bar"));
        System.out.println(log.shouldPrintMessage(10,"foo"));
        System.out.println(log.shouldPrintMessage(11,"foo"));


    }
}
