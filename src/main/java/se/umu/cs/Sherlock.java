package se.umu.cs;

import org.apache.commons.cli.*;

public class Sherlock {

    public static void main(String[] args) throws Exception {

        String[] parts;
        String owner;
        String name;
        Repository repository;

        examineArguments(args);

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

        parts = args[0].split("/");
        owner = parts[0];
        name = parts[1];

        APIManager apiManager = new APIManager();
        repository = apiManager.fetchRepository(name, owner);

    }

    private static void examineArguments(String[] args) throws IllegalArgumentException {
        if(args.length != 1) {
            throw new IllegalArgumentException();
        }
        else if(!args[0].contains("/")) {
            throw new IllegalArgumentException();
        }
    }

}
