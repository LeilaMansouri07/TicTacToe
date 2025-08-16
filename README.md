# Tic-Tac-Toe (Java Console Game)

A classic **Tic-Tac-Toe** game implemented in Java, playable in the command-line. Two players alternate placing X and O on a 3×3 grid until one wins or the game ends in a tie.

---

## Features
- Simple console interface — players input moves via row and column.
- Alternating turns for Player X and Player O.
- Win detection across rows, columns, and diagonals.
- Detects ties when the board is full with no winner.
- Optionally, you can extend to include:
  - Input validation (e.g. preventing overwriting cells),
  - Replay capability,
  - Computer (AI) opponent,
  - Graphical interface (Swing/JavaFX).

---

## Technologies Used
- **Java** (JDK 8 or higher)
- Core concepts: **2D arrays**, **loops**, **conditionals**, and **Scanner** for input

---

## Getting Started

### Prerequisites
- Java JDK 8+ installed

### Installation & Run
1. Clone the repository:
   ```bash
   git clone https://github.com/LeilaMansouri07/TicTacToe.git
   cd TicTacToe

### Implementation Details

- Board Representation: 3×3 2D array holding characters ' ', 'X', or 'O'.
- Game Loop:
- Display current board.
- Prompt active player for row and column.
- Validate input and update board.
- Check for win or tie.
- Switch turns or end game.
- Win Detection: Check each row, column, and both diagonals for three matching symbols.
-Optional: Use Enums, methods, or classes (e.g., Game, Board, Player) to improve modularity.

### Future Enhancements

- Add validation to prevent invalid or duplicate moves.
- Add option to restart the game after it ends.
- Introduce a computer-controlled opponent (single-player mode).
- Implement a GUI version using Swing or JavaFX.
- Refactor logic into separate classes for model, view, and controller (MVC pattern).
