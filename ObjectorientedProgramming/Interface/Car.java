package ObjectorientedProgramming.Interface;

public class Car{
    private Engine engine;
    private MediaPlayer media = new MediaPlayer();
    public Car(){
        engine = new PowerEngine();
    }
    public void engineStart(){
        engine.Start();
    }
    public void engineStop(){
        engine.Stop();
    }
    public void mediaStart(){
        media.Start();
    }
    public void mediaStop(){
        media.Stop();
    }
}
