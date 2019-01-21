Git URL: https://github.com/NigDra/Workshop1


# Git Concepts



## Creating a local repository

Let's code

>Preserving our changes
Use the following command
git add .


**Answer: What is the purpose of this command?**
>It's used to create a newer version of the repository in the local machine with the new changes made.


Use the command line to type the command showed below
git commit -m "Message"


**Answer : Why we used it?**
>For when the git repository is updated, this version has this message shown where the changes were made.






## Using Github
Go to github
Create a new repository on github and name it workshop1
Copy the url of your remote repository, in order to link it with our local repository that was created previously
Use the following command to link the remote repository with the local one.
git remote add origin <server>
Using the push command
Using the command line, type the command below
git push origin master



**Answer: What is the purpose of the this command?**
>Is for updating the online repository with the changes made in the local and that were registered with the git add .

## Let's code

>The challenge here is to read n lines of input until you reach EOF, then number and print all lines of content.
Hint: Java's Scanner.hasNext() method is helpful for this problem.
Input Format
Read some unknown n lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.
Output Format
For each line, print the line number, followed by a single space, and then the line content received as input.
Sample Input
Hello world
I am a file
Read me until end-of-file.
Sample Output
1 Hello world
2 I am a file
3 Read me until end-of-file.
taken from https://www.hackerrank.com/challenges/java-end-of-file/problem

Preserve the changes using your partner's github account.
Take a screenshot of the commit report in the github account and include it in the report

Using pull command
Use the first github account to type this command
git pull origin master


**Answer: What that command does?**
>It downloads the latest version of the repository in git if there's alredy the repository in the pc



Include the report on github repository using the commands you have learned



# Maven concepts

##  Create Maven Project

Creating Maven projects is based on the concept of an archetype. Think of an archetype as a predefined template, like a blueprint from which we can generate projects.


**Tasks**
*	Create a new maven project using the command mvn archetype:generate -B -DgroupId=edu.eci -DartifactId=file-spy, take screenshots.
* What do means the -B option in the command?
> It's used to indicate that the project will run in batch mode, that disable the output color
*	What do means the -D option in the command?
> It's used to define a system property of the project
*	What do means the groupId, artifactId properties in the command?
> *GroupID: indicates the group which creates the project
> *artifactID: indicates the name of the .jar that's deployed when compiling the project  
*	Describe the content of the directory that has been created.
> There is the src folder which contains a java folder and the folders named by the words separated by dots in the groupid, also there's the pom
*	Create the folders src/main/resources and src/test/resources

## POM file
POM stands for Project Object Model And this file represents a one stop configuration for the entire project. Open the file to answer the next questions.
**Task:**

-   What do means the word SNAPSHOT in the version value?
 >   Its used to indicate that this version is under development
-   What is the purpose of the packing tag into the POM file?
   > Indicates which type of packaging the folder will have in base of the project type.
-   What is the purpose of the dependencies and dependency tags into the POM file?
> They're for let use external plugins in the project
## Dependency Management

A dependency is a Java library that this project depends on. While developing Java applications, you'll almost always be using other developers libraries, in addition to your own. So if you want to use code that isn't a part of the Java core library, you'll need to add that library as a dependency. Dependencies and Maven are declared inside this dependencies element. With each dependency represented by its own dependency element. Naming follows the GAV convention which stands for Group Artifact and Version.

The multiple dependencies that could be added into the project using Maven could be consulted in the MVNRepository
**Task:**
-   Go to the MVNRepository and search for`tika-core` library. Add a new dependency to the POM file with the last version of this library.

-   Replace the App class in the source folder with the FileSpy class provided in the workshop.

-   What is the functionality of this class?

-   Add the next XML code to the POM file.
>
	<build>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
					<configuration>
					<source>1.8</source>
						<target>1.8</target>
					</configuration>
			</plugin>
		</plugins>
	</build>



This XML in here which indicated both the version of our source code as well as the version of our compiled code that we would like when we compile this code and said source 1.8 target 1.8. Therefore, we can accommodate lambdas.




## Building Lifecycles and Plugins
Maven is based on the idea of a build lifecycle which refers to the process of assembling and distributing an artifact like a JAR file. Maven ships with three lifecycles and you can think of them in terms of distributing an application.
Now within lifecycle, there are phases. For examples, some of the phases that make up the default build lifecycle are the compile, test, package, and install phases.

**Task:**
*	The three principal Maven lifecycles are clean, default and site. Describe each one.
	- Clean: remove all files generated by the previous build
	*	Default: validate that the project is correct and all necessary information is available then runs the project.
	*	Site: generate all the project documentation.

Using the terminal execute the command mvn compile. Take the output screenshot. What is this command using for? What are transitive dependencies?
>This command is used to compile the project and check that everything is ok.

*	Using the terminal execute the command mvn package. Take the output screenshot. What is this command using for?

>This commands compacts the project in in a distributed format, such as JAR files.

*	Using the terminal execute the command mvn install. Take the output screenshot. What is this command using for?


>This command is used to  install  the project in the local machine so other projects can use it.

*	Generate a new maven project in other folder using the maven command line tools, this project should has as groupId "edu.eci" and as artifactId "another-maven-project". Take the output screenshot.

*	Replace the code of the App.java class with the following code and do all the necessary steps to compile the code.

		package edu.eci;

		import edu.eci.FileSpy;

		public class App
		{
		    public static void main( String[] args )throws Exception
		    {
		        FileSpy.main(args);
		    }
		}

All the commands showed here such as mvn compile, mvn install, mvn package, they all come from plugins. And even if you didn't have to explicitly add a plugin to your pom file, a Maven plugin provides developers a way to attach their own tasks called goals to phases. So we have lifecycles, phases, and goals putting it all together, here's how they're related.
Each Maven builds lifecycle such as the default lifecycle has specific phases associated with it. Think of these phases as categories of tasks that need to be performed. We've talked about some of these already such as compile, test, and package. Now at these phases are like categories of tasks, the actual tasks in Maven are called goals, these goals are provided by plugins. In other words, plugins bind goals to phases. These specific plugins are shipped with Maven but you can also use third party plugins and even develop your own. Speaking of plugins and goals, let's run a goal from the exact plugin short for execute.

**Task:**
>*	Use the following command to execute the file-spy application mvn exec:java -Dexec.mainClass="edu.eci.FileSpy". Take the output screenshot.
>* 	But this time you should knew that the application detect events in a folder when you add new files and print on the screen all the files with the text/csv extension. Test the application using the examples files. Take the output screenshot.
