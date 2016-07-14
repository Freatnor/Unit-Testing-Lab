package ly.generalassemb.drewmahrt.oofundamentals;

/**
 * Created by Jonathan Taylor on 7/13/16.
 */
public class Mouse extends Mammal {
    private boolean mIsAlbino;

    public Mouse(boolean isAlbino){
        super(4, 3, false, "Mouse");
        mIsAlbino = isAlbino;
    }

    public boolean isAlbino() {
        return mIsAlbino;
    }

    public void setIsAlbino(boolean isAlbino) {
        this.mIsAlbino = isAlbino;
    }

    @Override
    public String makeNoise() {
        return "Squeak!";
    }

    @Override
    public String toString() {
        return "Mouse" + (mIsAlbino? " (has white fur)" : "");
    }
}