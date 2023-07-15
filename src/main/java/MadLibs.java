import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;


/*
 * Create a unique Mad Libs story!
 * https://www.madtakes.com/libs/093.html
 */
public class MadLibs {

    // 1. Make a main method that includes all the steps below
    public static void main(String[] args) {

        final String[] words = {"Adequate", "Anywhere", "Approach", "Activity", "Anything", "Approval", "Advanced", "Although", "Academic", "Advocate", "Accident", "Athletic", "Aircraft", "Activist", "Actually", "Accurate", "Apparent", "Argument", "Analysis", "Audience", "Announce", "Alliance", "Artistic", "Addition", "Absolute", "Attitude", "Birthday", "Behavior", "Bathroom", "Boundary", "Building", "Business", "Capacity", "Champion", "Campaign", "Convince", "Conflict", "Changing", "Ceremony", "Clothing", "Category", "Complain", "Complete", "Computer", "Coverage", "Creative", "Confront", "Conclude", "Civilian", "Concrete", "Critical", "Criminal", "Clinical", "Collapse", "Customer", "Contract", "Consumer", "Consider", "Cultural", "Criteria", "Constant", "Creature", "Creation", "Continue", "Contrast", "Delivery", "Discover", "Directly", "Darkness", "Document", "Dramatic", "Daughter", "Describe", "Division", "Distinct", "Distance", "Decision", "District", "Decrease", "Director", "Dominant", "Dominate", "Designer", "Disorder", "Dialogue", "Detailed", "Disagree", "Disaster", "Exchange", "Everyday", "Exciting", "Exposure", "Exercise", "Existing", "External", "Employer", "Employee", "Emphasis", "Economic", "Everyone", "Evidence", "Electric", "Entirely", "Educator", "Evaluate", "Estimate", "Entrance", "Enormous", "Emission", "Engineer", "Earnings", "Frequent", "Facility", "Fighting", "Friendly", "Favorite", "Familiar", "Football", "Function", "Graduate", "Generate", "Greatest", "Historic", "Hospital", "Headline", "Heritage", "Identify", "Involved", "Industry", "Identity", "Incident", "Investor", "Indicate", "Instance", "Increase", "Innocent", "Interest", "Internal", "Internet", "Judgment", "Lifetime", "Literary", "Language", "Location", "Learning", "Magazine", "Majority", "Movement", "Military", "Minority", "Moreover", "Multiple", "Mortgage", "Musician", "Marriage", "Moderate", "Material", "Mountain", "Maintain", "Neighbor", "Normally", "Negative", "Northern", "Numerous", "National", "Organize", "Official", "Overlook", "Overcome", "Observer", "Opponent", "Ordinary", "Occasion", "Opposite", "Operator", "Original", "Physical", "Probably", "Publicly", "Powerful", "Purchase", "Possibly", "Properly", "Property", "Province", "Platform", "Perceive", "Prospect", "Provider", "Practice", "Priority", "Preserve", "Producer", "Proposed", "Positive", "Previous", "Proposal", "Presence", "Possible", "Politics", "Painting", "Pregnant", "Progress", "Persuade", "Planning", "Personal", "Pleasure", "Portrait", "Position", "Prisoner", "Pressure", "Question", "Recovery", "Remember", "Recently", "Research", "Resemble", "Romantic", "Relative", "Relevant", "Resource", "Response", "Reporter", "Reaction", "Regulate", "Resident", "Register", "Regional", "Religion", "Relation", "Sequence", "Specific", "Somewhat", "Somebody", "Shopping", "Slightly", "Survival", "Survivor", "Software", "Schedule", "Supposed", "Suddenly", "Security", "Shoulder", "Strongly", "Strength", "Strategy", "Straight", "Spending", "Shooting", "Southern", "Standard", "Scenario", "Surprise", "Separate", "Struggle", "Sentence", "Standing", "Sanction", "Stranger", "Surround", "Solution", "Thinking", "Teaching", "Tendency", "Tomorrow", "Together", "Thousand", "Threaten", "Transfer", "Terrible", "Teaspoon", "Teenager", "Training", "Unlikely", "Universe", "Ultimate", "Vacation", "Valuable", "Variable", "Workshop", "Withdraw", "Whatever", "Whenever", "Yourself"};


        // 2. Ask the player to enter a verb
        System.out.println("Welcome to Mad Libs! Enter words or type 'R' for random words.");
        System.out.println("Please enter a verb: ");
        Scanner input = new Scanner(System.in);
        String word2 = input.nextLine();

        if(word2.equals("R")) {
            word2 = getRandom(words);
        }
        // 3. Ask the player to enter a verb ending in 'ing'
        System.out.println("Please enter a verb ending in 'ing': ");
        input = new Scanner(System.in);
        String word3 = input.nextLine();

        if(word3.equals("R")) {
            word3 = getRandom(words);
        }
        // 4. Ask the player to enter a noun
        System.out.println("Please enter a noun: ");
        input = new Scanner(System.in);
        String word4 = input.nextLine();

        if(word4.equals("R")) {
            word4 = getRandom(words);
        }
        // 5. Ask the player to enter an adjective
        System.out.println("Please enter an adjective: ");
        input = new Scanner(System.in);
        String word5 = input.nextLine();

        if(word5.equals("R")) {
            word5 = getRandom(words);
        }
        // 6. Ask the player to enter an occupation
        System.out.println("Please enter an occupation: ");
        input = new Scanner(System.in);
        String word6 = input.nextLine();

        if(word6.equals("R")) {
            word6 = getRandom(words);
        }

        // 7. Ask the player to enter an animal
        System.out.println("Please enter an animal: ");
        input = new Scanner(System.in);
        String word7 = input.nextLine();

        if(word7.equals("R")) {
            word7 = getRandom(words);
        }

        // 8. Ask the player to enter an adjective
        System.out.println("Please enter an adjective: ");
        input = new Scanner(System.in);
        String word8 = input.nextLine();

        if(word8.equals("R")) {
            word8 = getRandom(words);
        }
        // 9. Ask the player to enter a verb ending in 'ing'
        System.out.println("Please enter a verb ending in 'ing': ");
        input = new Scanner(System.in);
        String word9 = input.nextLine();

        if(word9.equals("R")) {
            word9 = getRandom(words);
        }

        // 10. Ask the player to enter a noun
        System.out.println("Please enter a noun: ");
        input = new Scanner(System.in);
        String word10 = input.nextLine();

        if(word10.equals("R")) {
            word10 = getRandom(words);
        }

        // The quotes below have been written as a group of Strings joined together by + signs.
        // The story contains placeholders, indicated by [** **] which you need to replace with
        // the values entered by the player.
        // Note the \n characters represent newlines that move the following text onto the next line


        String quotes = "'My name is " + word2 + "; learn it well, for it`s the " + word3 + " sound of your " + word4 + ".'\n" +
                "'I told Killian I`d be " + word5 + ". I wouldn`t want to be a/an " + word6 + ".'\n" +
                "'I`m a cybernetic " + word7 + ": living tissue over a/an " + word8 + " endoskeleton.'\n" +
                "'If things have gone wrong, I`m " + word9 + " myself, and you`ve got a wet " + word10 + " wrapped around your head.'\n" +
                "- Arnold Schwarzenegger";



        // 11. Print the quotes to the console to display the Mad Lib!
        System.out.println(quotes);

        /*
         * EXTRA:
         * Create a random word generator to allow the user to let the program
         * select a random word.
         */
    }

    public static String getRandom(String[] array) {

        Random random = new Random();
        int index = random.nextInt(array.length);


        return array[index];
    }
}

