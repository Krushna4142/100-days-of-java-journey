interface Camera {
  void takePhoto();
}

interface MusicPlayer {
  void playMusic();
}

class Smartphone implements Camera, MusicPlayer {

  @Override
  public void takePhoto() {
    System.out.println("Photo captured");
  }

  @Override
  public void playMusic() {
    System.out.println("Playing music");
  }
}

public class MultipleInheritanceDemo {

  public static void main(String[] args) {

    Smartphone s = new Smartphone();

    s.takePhoto();
    s.playMusic();
  }
}