package billing;

import java.awt.Image;

import javax.swing.ImageIcon;

public final class ImageGenerator {
	public static ImageIcon getIcon(String file, int width, int height) {
		var image = new ImageIcon(ClassLoader.getSystemResource(file));
		return new ImageIcon(image.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
	}

}
