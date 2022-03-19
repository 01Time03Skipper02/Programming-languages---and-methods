import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class PictureForm {
    private JPanel mainPanel;
    private JSpinner radiusSpinner;
    private JTextField areaField;
    private CanvasPanel canvasPanel1;
    private JSpinner spinnerA;
    private JSpinner spinnerB;
    private JSpinner spinnerN;

    public PictureForm ( ) {
        radiusSpinner.setValue(20);
        radiusSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int radius = (int)radiusSpinner.getValue();
                double area = Math.PI*radius*radius;
                areaField.setText(String.format("%.2f", area));
                canvasPanel1.setRadius(radius);
            }
        });
        spinnerA.setValue(150);
        spinnerA.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int radiusA = (int)spinnerA.getValue();
                canvasPanel1.setRadiusA(radiusA);
            }
        });
        spinnerB.setValue(100);
        spinnerB.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int radiusB = (int)spinnerB.getValue();
                canvasPanel1.setRadiusB(radiusB);
            }
        });
        spinnerN.setValue(1);
        spinnerN.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int n = (int)spinnerN.getValue();
                canvasPanel1.setN(n);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("PictureForm");
        frame.setContentPane(new PictureForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}