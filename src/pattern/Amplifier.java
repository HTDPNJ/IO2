package pattern;

public class Amplifier
{
    private Voice voice;

    public Amplifier()
    {
    }

    public Amplifier(Voice voice)
    {
        this.voice = voice;
    }
    public void say(){
        System.out.println(voice.getVoice()*1000);
    }
}
