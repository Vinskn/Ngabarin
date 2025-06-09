package utils;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class PanelUtils extends JPanel {
    private final int cornerRadius;
    private final int shadowSize;
    private final Color shadowColor;
    private final Color backgroundColor;

    public PanelUtils(int cornerRadius, int shadowSize) {
        this(cornerRadius, shadowSize, new Color(0, 0, 0, 80), Color.WHITE);
    }

    public PanelUtils(int cornerRadius, int shadowSize, Color shadowColor, Color backgroundColor) {
        this.cornerRadius = cornerRadius;
        this.shadowSize = shadowSize;
        this.shadowColor = shadowColor;
        this.backgroundColor = backgroundColor;

        setOpaque(false); // penting agar background default tidak menimpa
        setLayout(new BorderLayout()); // bebas diubah
    }

    @Override
    protected void paintComponent(Graphics g) {
        int width = getWidth();
        int height = getHeight();

        Graphics2D g2 = (Graphics2D) g.create();

        // Smooth rendering
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Shadow
        if (shadowSize > 0) {
            g2.setColor(shadowColor);
            g2.fillRoundRect(
                shadowSize, shadowSize,
                width - shadowSize * 2,
                height - shadowSize * 2,
                cornerRadius, cornerRadius
            );
        }

        // Background
        g2.setColor(backgroundColor);
        g2.fillRoundRect(
            0, 0,
            width - shadowSize,
            height - shadowSize,
            cornerRadius, cornerRadius
        );

        g2.dispose();
        super.paintComponent(g);
    }

    // Optional: setter untuk ubah warna di runtime
    public void setBackgroundColor(Color color) {
        this.repaint();
    }

    public void setShadowColor(Color color) {
        this.repaint();
    }
}
