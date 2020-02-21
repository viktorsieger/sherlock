package se.umu.cs;

public class Sherlock {

    public static void main(String[] args) {

        String[] parts;
        String owner;
        String repo;

        if(args.length != 1) {
            throw new IllegalArgumentException();
        }

        parts = args[0].split("/");
        owner = parts[0];
        repo = parts[1];

        try {
            new APIManager();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
