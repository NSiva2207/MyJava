package ObjectorientedProgramming.Interface;

public class PowerEngine implements Engine {
    @Override
    public void Start() {
        System.out.println("Start the engine");
    }

    @Override
    public void Stop() {
        System.out.println("Stop the engine");
    }
}
