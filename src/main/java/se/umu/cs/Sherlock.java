package se.umu.cs;

import java.io.IOException;

public class Sherlock {

    public static void main(String[] args) throws IOException {

        String[] parts;
        String owner;
        String name;
        Repository repository;

        checkArguments(args);

        /*
        Options options = new Options();

        Option output = new Option("o","output", true, "");
        output.setRequired(false);
        options.addOption(output);

        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, args);

        if(cmd.hasOption("o")) {
            switch(cmd.getOptionValue("o")) {
                case "license":
                    // Only analyze license
                    break;
                case "all":
                    // Analyze everything
                    break;
                default:
                    // Analyze everything
            }
        }
        else {
            // Analyze everything
        }
        */

        parts = args[0].split("/");
        owner = parts[0];
        name = parts[1];

        String temp;

        APIManagerTwo apiManagerTwo = new APIManagerTwo();
        temp = apiManagerTwo.fetchRepositoryFoundation(name, owner);

        System.out.println(temp);

    }

    private static void checkArguments(String[] args) throws IllegalArgumentException {
        if(args.length != 1) {
            throw new IllegalArgumentException();
        }
        else if(!args[0].contains("/")) {
            throw new IllegalArgumentException();
        }
    }

}

// https://stackoverflow.com/questions/51475415/graphql-java-class-generator
// https://stackoverflow.com/questions/1688099/converting-json-data-to-java-object
// https://github.com/chentsulin/awesome-graphql#lib-java
// https://graphql.org/code/#tools
