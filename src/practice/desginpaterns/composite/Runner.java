package practice.desginpaterns.composite;

public class Runner {
    public static void main(String[] args){
        Directory movies = new Directory("Movies");
        File file = new File("Border");
        movies.addFile(file);

        Directory comedyMovies = new Directory("Comedy");
        File hulchul = new File("Hulchul");
        comedyMovies.addFile(hulchul);
        movies.addFile(comedyMovies);

        movies.ls();
    }
}
