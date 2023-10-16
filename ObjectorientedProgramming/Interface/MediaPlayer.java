package ObjectorientedProgramming.Interface;

public class MediaPlayer implements Media{

    @Override
    public void Start() {
        System.out.println("Start the media");
    }

    @Override
    public void Stop() {
        System.out.println("Stop the engine");
    }
}
