> Take A Screenshot of a Site, Using Java and ChromeDriver

# Requirements

1. Chromedriver downloaded and available on your `PATH`.
2. Google Chrome v59 or newer.
3. Customize the location of your Chrome binary, the URL you want to navigate to, and where you want your screenshot copied to inside `HeadlessChrome.java`.

# Compiling the Test

On my Mac:

    $ javac -classpath .:"selenium-java-3.8.1/libs/*":"selenium-java-3.8.1/client-combined-3.8.1.jar":junit-4.12.jar:commons-io-2.6.jar HeadlessChrome.java

# Running the Test

On my Mac:

    $ java -classpath .:"selenium-java-3.8.1/libs/*":"selenium-java-3.8.1/client-combined-3.8.1.jar":junit-4.12.jar:commons-io-2.6.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore HeadlessChrome
