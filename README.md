This project is a simple Number Guessing Game implemented in Java.
The program generates a random number and asks the player to guess it until they succeed, giving hints along the way.

📌 Features

Random number generation within a defined range.

User guesses the number through the console.

Program provides hints (too high / too low).

Counts the number of attempts taken to guess correctly.

▶️ How to Run

Compile the program:

javac GuessingGame.java


Run the program:

java GuessingGame


Example interaction:

Welcome to the Guessing Game!
I'm thinking of a number between 1 and 100.
Enter your guess: 50
Too low! Try again.
Enter your guess: 75
Too high! Try again.
Enter your guess: 63
Correct! You guessed it in 3 attempts!

🛠️ Technologies Used

Java (Core, Random class, Scanner for input).

📚 Future Improvements

Add difficulty levels (Easy/Medium/Hard with different ranges).

Implement a replay option without restarting the program.

Create a GUI version using JavaFX or Swing.
