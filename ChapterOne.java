public class ChapterOne {
    public static void main(String[] args) {
        System.out.println("Max rating = " + Singer.maxRating);

        Singer singer = new Singer("Petya", 15, 30);
        System.out.println("Max rating = " + Singer.maxRating);
        Singer singer1 = new Singer("Anya", 15, 31);
        System.out.println("Max rating = " + Singer.maxRating);
        Singer singer2 = new Singer("An", 14, 28);
        System.out.println("Max rating = " + Singer.maxRating);


    }
}
