package _10_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String pet = JOptionPane.showInputDialog("What kind of pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		while(happinessLevel<10) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do with your pet?", null, 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Groom", "Feed", "Take out for walk", "Clean up poop", "Give water", "Cuddle" }, null);
System.out.println(task);
			// 5. Use user input to call the appropriate method created in step 4.
if(pet.equalsIgnoreCase("dog")&&task==0) {
	dogGroom();
}
if(pet.equalsIgnoreCase("dog")&&task==1) {
	dogFeed();
}
if(pet.equalsIgnoreCase("dog")&&task==2) {
	dogTakeOut();
}
if(pet.equalsIgnoreCase("dog")&&task==3) {
	dogPoop();
}
if(pet.equalsIgnoreCase("dog")&&task==4) {
	dogWater();
}
if(pet.equalsIgnoreCase("dog")&&task==5) {
	dogCuddle();
}
if(pet.equalsIgnoreCase("cat")&&task==0) {
	catGroom();
}
if(pet.equalsIgnoreCase("cat")&&task==1) {
	catFeed();
}
if(pet.equalsIgnoreCase("cat")&&task==2) {
	catTakeOut();
}
if(pet.equalsIgnoreCase("cat")&&task==3) {
	catPoop();
}
if(pet.equalsIgnoreCase("cat")&&task==4) {
	catWater();
}
if(pet.equalsIgnoreCase("cat")&&task==5) {
	catCuddle();
}

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
if(happinessLevel==10) {
	JOptionPane.showMessageDialog(null, "You love your pet and your pet loves you!");
	break;
}
		}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
static void catGroom() {
	JOptionPane.showMessageDialog(null, "You grab the cat, but the cat doesn't like it. It prefers to groom itself");
	happinessLevel=happinessLevel-1;
}
static void catFeed() {
	JOptionPane.showMessageDialog(null, "The cat eats the food and licks you.");
	happinessLevel=happinessLevel+1;
}
static void catTakeOut() {
	JOptionPane.showMessageDialog(null, "The cat bites you ");
	happinessLevel=happinessLevel-1;
}
static void catPoop() {
	JOptionPane.showMessageDialog(null, "The cat thanks you for cleaning up its poop and then poops again");
	happinessLevel=happinessLevel+1;
}
static void catWater() {
	JOptionPane.showMessageDialog(null, "The cat drinks up the water");
	happinessLevel=happinessLevel+1;
}
static void catCuddle() {
	JOptionPane.showMessageDialog(null, "The cat does not like to be cuddled and bites you.");
	happinessLevel=happinessLevel-1;
}
static void dogGroom() {
	JOptionPane.showMessageDialog(null, "The dog likes to be groomed and licks you.");
	happinessLevel=happinessLevel+1;
}
static void dogFeed() {
	JOptionPane.showMessageDialog(null, "The dog eats the food and licks you.");
	happinessLevel=happinessLevel+1;
}
static void dogTakeOut() {
	JOptionPane.showMessageDialog(null, "The dog licks you ");
	happinessLevel=happinessLevel+1;
}
static void dogPoop() {
	JOptionPane.showMessageDialog(null, "The dog thanks you for cleaning up its poop.");
	happinessLevel=happinessLevel+1;
}
static void dogWater() {
	JOptionPane.showMessageDialog(null, "The dog drinks up the water");
	happinessLevel=happinessLevel+1;
}
static void dogCuddle() {
	JOptionPane.showMessageDialog(null, "The dog likes to be cuddled and licks you.");
	happinessLevel=happinessLevel+1;
}
}