import com.xebisco.yield.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        ContextTime time = new ContextTime();
        time.setTargetSleepTime(16_666);
        ApplicationManager manager = new ApplicationManager(time);
        PlatformInit init = new PlatformInit();
        new Application(manager, HelloYieldScene.class, Global.swingPlatform(), init);
        manager.run();
    }
}