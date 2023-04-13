class Song{
  void play(){
    System.out.println("Playing Songs");
  }
}

class PopSong extends Song{
  void play(){
    System.out.println("Playing audio with catchy beat and chorus");
  }
}

class JazzSong extends Song{
  void play(){
    System.out.println(" playing the audio with a smooth melody and improvisation");
    super.play();
  }
}

class MusicSystem{
  public static void main(String args[]){
    JazzSong j=new JazzSong();
    j.play();
}
}