class Music{
    
        double bpm;
        String genre;

        Music(double bpm,String genre){
            this.bpm = bpm;
            this.genre = genre;

        }

        void Sing(){
            System.out.println("Genre is "+genre);
            System.out.println("Beats/min is "+bpm);
        }

    
}