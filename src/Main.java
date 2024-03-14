public class Main {
    public static void main(String[] args) {

        Book book = new Book("Jungle book", "Book about a jungler", "b1", 380, "Steven Hawkings", 88, "Storytelling") {
            @Override
            public void showInfo() {
                System.out.println(name);
                System.out.println(getDescription());
                System.out.println(id);
                System.out.println(price);
                System.out.println(author);
                System.out.println(numberOfPage);
                System.out.println(genre);
            }
        };

        MP3 mp3 = new MP3("Cambridge audio", "Listening audio for Cambridge", "audio1", 672, 120) {
            @Override
            public void showInfo() {
                System.out.println(name);
                System.out.println(getDescription());
                System.out.println(id);
                System.out.println(price);
                System.out.println(duration);
            }
        };

        book.showInfo();
        mp3.showInfo();
    }

}
