import java.util.Scanner;

public class QuestionService {
    
    Question[] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionService(){
        questions[0] = new Question(1, "Size of Integer in Java?", "16 bit", "32 bit", "64 bit", "128 bit", "32 bit");
        questions[1] = new Question(2, "Which of the following is not a Java feature?", "Object-oriented", "Use of pointers", "Portable", "Dynamic and Extensible", "Use of pointers");
        questions[2] = new Question(3, "Which of these cannot be used for a variable name in Java?", "identifier & keyword", "identifier", "keyword", "none of the mentioned", "keyword");
        questions[3] = new Question(4, "What is the extension of java code files?", ".js", ".txt", ".class", ".java", ".java");
        questions[4] = new Question(5, "Which environment variable is used to set the java path?", "MAVEN_Path", "JavaPATH", "JAVA", "JAVA_HOME", "JAVA_HOME");
    }
    public void displayQuestions(){
         
        for(Question q : questions)
        {
            System.out.println(q); //overrides toString() method of Question class to display question details
            
            Scanner sc = new Scanner(System.in);
            selection[q.getId()-1] = sc.nextLine();
        }
    }

    public void getScore()
    {
        int score = 0;
        for(Question q : questions)
        {
            if(q.getanswer().equalsIgnoreCase(selection[q.getId()-1]))
            {
                score++;
            }
        }
        System.out.println("Your score is: " + score + " out of " + questions.length);
    }
}
