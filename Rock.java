public class Rock{
    public static void main(String args[]){
        System.out.println("ROCK MUSIC");
        double bpm_rock = 256.00f;
        String genreRock = "Rock";
        Music music = new Music(bpm_rock, genreRock);
        music.Sing();
    }

}
