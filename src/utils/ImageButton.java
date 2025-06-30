package utils;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class ImageButton extends JButton {
    private final Image backgroundImage;
    private final int cornerRadius;

    public ImageButton(Image image, String text, int cornerRadius) {
        super(text);
        this.backgroundImage = image;
        this.cornerRadius = cornerRadius;

        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);

        setHorizontalTextPosition(SwingConstants.CENTER);
        setVerticalTextPosition(SwingConstants.CENTER);
        setForeground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        // Aktifkan anti-aliasing
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Clip rounded
        Shape clip = new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);
        g2.setClip(clip);

        // Gambar background image
        g2.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);

        // Gambar komponen default (misal teks)
        super.paintComponent(g);
    }
}

