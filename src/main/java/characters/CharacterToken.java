package main.java.characters;

import main.java.capabilities.CapabilitySet;

import javax.swing.*;
import java.awt.*;

public class CharacterToken extends JPanel {

    /**
     * Current capabilities/statuses
     */
    private final CapabilitySet capabilitySet = new CapabilitySet();

    public Image image;

    public CharacterToken(Image image) {
        this.image = image;
        setPreferredSize(new Dimension(50, 50)); // Set preferred size for the token
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw circle
        g.setColor(Color.BLACK);
        g.fillOval(0, 0, getWidth(), getHeight());

        // Draw image inside the circle
        if (image != null) {
            int imageWidth = image.getWidth(this);
            int imageHeight = image.getHeight(this);
            int x = (getWidth() - imageWidth) / 2;
            int y = (getHeight() - imageHeight) / 2;
            g.drawImage(image, x, y, this);
        }
    }

    /**
     * Add a capability to this Actor.
     *
     * @param capability the Capability to add
     */
    public void addCapability(Enum<?> capability) {
        capabilitySet.addCapability(capability);
    }

}
