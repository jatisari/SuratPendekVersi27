package net.agusharyanto.suratpendek;

public class Surat {
    private int mId; //id
    private String name; // nama surat
    private String filePath; //nama file
    public Surat()
    {
    }
    public Surat(int id, String name, String filepath)
    {
        setName(name);
        setFilePath(filepath);
    }
    public int getmId() {
        return mId;
    }
    public void setmId(int mId) {
        this.mId = mId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFilePath() {
        return filePath;
    }
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
