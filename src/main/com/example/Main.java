package com.example;

import picocli.CommandLine;

@CommandLine.Command(name = "greeter", description = "Say hello in many different ways!")
public class Main {

    @CommandLine.Option(names = {"--name"}, description = "The name of whomst to greet!")
    private String name = "World";

    public static void main(String[] args) {
        Main application = new Main();
        CommandLine cmd = new CommandLine(application);

        try {
            cmd.parseArgs(args);
        } catch (Exception e) {
            cmd.usage(System.out);
            return;
        }

        System.out.printf("Hello, %s!\n", application.name);
    }
}
