# gradle-starter

A template repository for creating new Java projects built with Gradle.

The only requirement before starting is having [JDK 8] or later installed.

[JDK 8]: https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

## Getting started

Just clone the project, then you'll have a Java "Hello, world" application
ready to go.

```
$ git clone https://github.com/nicholastmosher/gradle-starter.git your-project-name
$ cd your-project-name
$ ./gradlew run
```

### Resetting git history

If you don't want my initial commit in your history, just delete the `.git` repo
and re-initialize the repository.

```
$ rm -rf .git/
$ git init
$ git add ./
$ git commit -m "Initial commit"
```
