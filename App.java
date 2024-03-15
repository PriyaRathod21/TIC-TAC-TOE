import board.Board;
import game.Game;
import player.Player;
import java.util.*;

public class App {
   public static void main(String[] args) throws Exception {
      System.out.println("******TIC-TAC-TOE********");
      Board b = new Board(3, '-');
      b.printBoardConfig();
      Scanner scn = new Scanner(System.in);
      System.out.print("Please enter the name of Player1: ");
      String name1 = scn.nextLine();
      System.out.print("Please  enter the symbol of Player1: ");
      char symbol1 = scn.nextLine().charAt(0);

      Player p1 = new Player();
      p1.setPlayerNameAndSymbol(name1, symbol1);
      p1.getPlayerNameAndSymbol();

      System.out.print("Please enter the name of Player2: ");
      String name2 = scn.nextLine();
      System.out.print("Please  enter the symbol of Player2: ");
      char symbol2 = scn.nextLine().charAt(0);

      Player p2 = new Player();
      p2.setPlayerNameAndSymbol(name2, symbol2);
      p2.getPlayerNameAndSymbol();

      Game game  = new Game(new Player[] {p1, p2}, b);
      game.play();

   }
}