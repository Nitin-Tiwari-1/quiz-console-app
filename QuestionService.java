import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String userAnswer[] = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "What is the capital of France?", "Paris", "London", "Berlin", "Madrid", "Paris");
        questions[1] = new Question(2, "What is the largest planet in our solar system?", "Earth", "Mars", "Jupiter", "Saturn", "Jupiter");
        questions[2] = new Question(3, "What is the chemical symbol for water?", "H2O", "CO2", "NaCl", "O2", "H2O");
        questions[3] = new Question(4, "Who wrote 'Romeo and Juliet'?", "William Shakespeare", "Charles Dickens", "Mark Twain", "Jane Austen", "William Shakespeare");
        questions[4] = new Question(5, "What is the speed of light?", "300,000 km/s", "150,000 km/s", "100,000 km/s", "50,000 km/s", "300,000 km/s");
    }

    public void playQuiz() {
        int i = 0;

        for (Question q : questions) {
            System.out.println("Question no. " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println("1. " + q.getOption1());
            System.out.println("2. " + q.getOption2());
            System.out.println("3. " + q.getOption3());
            System.out.println("4. " + q.getOption4());

            System.out.print("Your answer: ");
            Scanner sc = new Scanner(System.in);
            userAnswer[i] = sc.nextLine();
            i++;
            System.out.println(); // Print a blank line for better readability between questions
        }

        System.out.println("Your answers: ");
        
        for (String s : userAnswer) {
            System.out.println("Answer: " + s);
        }
    }

    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
           Question q = questions[i];
           String ActualAnswer = q.getCorrectOption();
           String userAns = userAnswer[i];
           if (userAns.equals(ActualAnswer)) {
               score++;
           }
        }
        System.out.println("Your score is: " + score + "/" + questions.length);
    }
}
