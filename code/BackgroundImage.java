import javax.swing.*;
import java.awt.*;

class BackgroundImage extends JPanel {
    private Image backgroundImage;

    public BackgroundImage(ImageIcon imageIcon) {
        this.backgroundImage = imageIcon.getImage();
        setLayout(null); // Para permitir posicionamento absoluto dos componentes
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, this.getWidth(), this.getHeight(), this);
    }
}
