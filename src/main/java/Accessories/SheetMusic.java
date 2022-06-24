package Accessories;

public class SheetMusic extends Accessories{

    private String songTitle;

    public SheetMusic(double sellingPrice, double buyingPrice, String nameOfAccessory, String songTitle1) {
        super(sellingPrice, buyingPrice, nameOfAccessory);

        this.songTitle = songTitle1;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

}
