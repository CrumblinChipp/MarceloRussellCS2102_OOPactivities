public class ArtistDemo {
    
    public static void main(String[] args) {

        Artist artist = new Artist("Charlie Puth", "American", 32, "Music");
        artist.displayInfo();

        System.out.println();

        Singer singer = new Singer("Nayeon Im", "Korean", 29, "Music", Genre.POP);
        singer.displayInfo();

        System.out.println();

        Painter painter = new Painter("Leonardo Da Vinci", 67, "Artwork", Medium.OIL);
        painter.displayInfo();

        System.out.println();

        Writer writer = new Writer("Jobie Hughes", 44, "Writing", WritingStyle.FICTION);
        writer.displayInfo();

        System.out.println();

        Dancer dancer = new Dancer("Hayate", 19, "Dance", dance.HIPHOP);
        dancer.displayInfo();
    }
}