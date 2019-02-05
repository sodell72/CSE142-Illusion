// Sean O'Dell, CSE 142, Spring 2015, Section BG
// Programming Assignment #3, 04/21/15
//
// This program's behavior is to display a doodle via Drawing Panel.

import java.awt.*;

public class Doodle {
   public static void main(String[] args) {
      DrawingPanel panel = new DrawingPanel(200,500);
      panel.setBackground(Color.CYAN);
      Graphics g = panel.getGraphics();
      g.setColor(Color.BLACK);
      g.fillRect(50, 100, 100, 300);
      g.setColor(Color.RED);
      g.fillOval(91, 90, 20, 20);
      g.fillOval(91, 390, 20, 20);
      g.setColor(Color.BLUE);
      g.drawLine(100, 110, 100, 389); 
   }
}