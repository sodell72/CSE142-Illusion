// Sean O'Dell, CSE 142, Spring 2015, Section BG
// Programming Assignment #3, 04/21/15
//
// This program's behavior is to draw illusions of different sizes and positions

import java.awt.*;

public class Illusion {
   public static void main(String[] args) {
      DrawingPanel panel = new DrawingPanel(500, 400);
      panel.setBackground(Color.GRAY);
      Graphics g = panel.getGraphics();
      drawSubFigure(g, 90, 3, 0, 0);
      drawSubFigure(g, 90, 3, 120, 10);
      drawSubFigure(g, 80, 5, 250, 50);
      drawGrid(g, 2, 100, 10, 10, 120);
      drawGrid(g, 3, 40, 5, 350, 20);
      drawGrid(g, 4, 50, 5, 230, 160);
   }
   
   // Draws sub figure with its top left corner at a given x and y location.  Size determines the
   // diameter of the filled circle and nCircles determines the number of black circles drawn.
   public static void drawSubFigure(Graphics g, int size, int nCircles, int x, int y) {
      g.setColor(Color.RED);
      g.fillOval(x, y, size, size);
      g.setColor(Color.BLACK);
      for(int i = 1; i <= nCircles; i++) {
         g.drawOval(x + size / 2 - i * size / nCircles / 2, y + size / 2 - i * size / nCircles / 2,
                    i * size / nCircles, i * size / nCircles);
      }
      g.drawLine(x, y + size / 2, x + size / 2, y);
      g.drawLine(x + size / 2, y, x + size, y + size / 2);
      g.drawLine(x + size, y + size / 2, x + size / 2, y + size);
      g.drawLine(x + size / 2, y + size, x, y + size / 2);
   }
   
   // Draws grid of sub figures with its top left corner at a given gridX and gridY location.
   // nRowsCols determines the number of rows and columns.  subFigSize determines the diameter
   // of the sub figures. nCircles determines the number of black circles drawn in the sub figures.
   public static void drawGrid(Graphics g, int nRowsCols, int subFigSize, int nCircles, int gridX,
                               int gridY) {
      g.setColor(Color.LIGHT_GRAY);
      g.fillRect(gridX, gridY, nRowsCols * subFigSize, nRowsCols * subFigSize);
      g.setColor(Color.RED);
      g.drawRect(gridX, gridY, nRowsCols * subFigSize, nRowsCols * subFigSize);
      for(int row = 1; row <= nRowsCols; row++) {
         for(int column = 1; column <= nRowsCols; column++) {
            drawSubFigure(g, subFigSize, nCircles, gridX + subFigSize * column - subFigSize, 
                          gridY + subFigSize * row - subFigSize);
         }
      }
   }
}