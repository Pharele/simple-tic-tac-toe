package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] map = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        System.out.println("---------");
        System.out.println("| " + map[0] + " " + map[1] + " " + map[2] + " |");
        System.out.println("| " + map[3] + " " + map[4] + " " + map[5] + " |");
        System.out.println("| " + map[6] + " " + map[7] + " " + map[8] + " |");
        System.out.println("---------");
        boolean xWins = false;
        boolean oWins = false;
        int xAxis = 0;
        int yAxis = 0;
        int mapIndex = 0;
        int turns = 0;
        while (!xWins && !oWins && turns < 9) {
            String[] coors = scanner.nextLine().split(" ");
            if (coors[0].charAt(0) > 59 || coors[0].charAt(0) < 72 &&
                    coors[1].charAt(0) > 59 || coors[1].charAt(0) < 72) {
                yAxis = Integer.parseInt(coors[0]);
                xAxis = Integer.parseInt(coors[1]);
                if (yAxis < 4 && yAxis > 0 && xAxis < 4 && xAxis > 0) {
                    mapIndex = (xAxis - 1) + (yAxis - 1) * 3;
                    if (map[mapIndex] == ' ') {
                        map[mapIndex] = turns % 2 == 0 ? 'X' : 'O';
                        turns++;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                    }
                } else {
                    System.out.println("Coordinates should be from 1 to 3!");
                }
            } else {
                System.out.println("You should enter numbers!");
            }
            xWins = map[0] == 'X' && map[1] == 'X' && map[2] == 'X' ||
                    map[3] == 'X' && map[4] == 'X' && map[5] == 'X' ||
                    map[6] == 'X' && map[7] == 'X' && map[8] == 'X' ||
                    map[0] == 'X' && map[3] == 'X' && map[6] == 'X' ||
                    map[1] == 'X' && map[4] == 'X' && map[7] == 'X' ||
                    map[2] == 'X' && map[5] == 'X' && map[8] == 'X' ||
                    map[0] == 'X' && map[4] == 'X' && map[8] == 'X' ||
                    map[6] == 'X' && map[4] == 'X' && map[2] == 'X';
            oWins = map[0] == 'O' && map[1] == 'O' && map[2] == 'O' ||
                    map[3] == 'O' && map[4] == 'O' && map[5] == 'O' ||
                    map[6] == 'O' && map[7] == 'O' && map[8] == 'O' ||
                    map[0] == 'O' && map[3] == 'O' && map[6] == 'O' ||
                    map[1] == 'O' && map[4] == 'O' && map[7] == 'O' ||
                    map[2] == 'O' && map[5] == 'O' && map[8] == 'O' ||
                    map[0] == 'O' && map[4] == 'O' && map[8] == 'O' ||
                    map[6] == 'O' && map[4] == 'O' && map[2] == 'O';
            System.out.println("---------");
            System.out.println("| " + map[0] + " " + map[1] + " " + map[2] + " |");
            System.out.println("| " + map[3] + " " + map[4] + " " + map[5] + " |");
            System.out.println("| " + map[6] + " " + map[7] + " " + map[8] + " |");
            System.out.println("---------");

        }
        if (xWins) {
            System.out.println("X wins");
        } else if (oWins) {
            System.out.println("O wins");
        } else {
            System.out.println("Draw");
        }
    }
}
