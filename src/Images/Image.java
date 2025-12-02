package Images;

public class Image {
    private String fileName;
    private int width;
    private int height;

    public Image(String fileName, int width, int height) {
        this.fileName = fileName;
        this.width = width;
        this.height = height;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFilename(String file) {
        this.fileName = file;
    }

    public boolean isKnownFileType() {
        if (fileName.endsWith(".gif") ||
                fileName.endsWith(".jpg") ||
                fileName.endsWith(".jpeg") ||
                fileName.endsWith(".png") ||
                fileName.endsWith(".webp") ||
                fileName.endsWith(".bmp")) { return true;
    } else {
            return false;
        }
    }

    public boolean isPortrait() {
        return height > width;
    }

    public boolean isLandscape() {
        return height < width;
    }

    @Override
    public String toString() {
        return fileName + " " +  width + " " + height;
    }
}
