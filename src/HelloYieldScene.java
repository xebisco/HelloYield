import com.xebisco.yield.*;

public class HelloYieldScene extends Scene {

    public static final Entity2DPrefab helloWorldPrefab = new Entity2DPrefab(
            new ComponentCreation(Text.class, c -> ((Text) c).setContents("Hello, World!"))
    );

    public HelloYieldScene(Application application) {
        super(application);
    }

    @Override
    public void onStart() {
        instantiate(helloWorldPrefab);
    }

}
