package my.home.radio;

import my.home.radio.application.Application;
import org.apache.log4j.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        LOGGER.info("Application has been started");
        try {
            Application application = new Application();
            application.run();
        } catch (InterruptedException e) {
            LOGGER.error("Wait call error", e);
        }
    }
}
