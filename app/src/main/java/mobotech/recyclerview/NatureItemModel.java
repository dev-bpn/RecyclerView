package mobotech.recyclerview;

/**
 * Created by Dell on 12/7/2015.
 */
public class NatureItemModel {

    private String mName;
    private String mDes;
    private int mThumbnail;

    public NatureItemModel(String mName, String mDes, int mThumbnail) {
        this.mName = mName;
        this.mDes = mDes;
        this.mThumbnail = mThumbnail;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public String getDes() {
        return mDes;
    }

    public void setDes(String des) {
        this.mDes = des;
    }

    public int getThumbnail() {
        return mThumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.mThumbnail = thumbnail;
    }

}