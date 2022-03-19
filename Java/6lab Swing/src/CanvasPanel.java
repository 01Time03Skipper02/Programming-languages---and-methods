import javax.swing.*;
import java.awt.*;

public class CanvasPanel extends JPanel {
    private int radius = 20;
    private int radiusA = 150;
    private int radiusB = 100;
    private int n = 1;
    public void setRadius(int r){
        radius = r;
        repaint();
    }
    public void setRadiusA(int r){
        radiusA = r;
        repaint();
    }
    public void setRadiusB(int r){
        radiusB = r;
        repaint();
    }
    public void setN(int r){
        n = r;
        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.drawOval(200, 100, radiusA, radiusB);
        g.setColor(Color.RED);
        int buf = 360/n;
        for (int i = 0; i<n; i++){
            g.drawOval((int)(200+(double)radiusA/2-(double)radius/2 + ((double)radiusA/2) * Math.cos(buf)) , (int)(100+(double)radiusB/2-(double)radius/2 + ((double)radiusB/2) * Math.sin(buf)), radius, radius);
            buf += 360 / n;
        }
    }
}