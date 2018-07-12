package Chain;


//要处理的文件类，标注文件处理的最低等级
class File {
     private String fileName;
    private int level;
     public String getFileName() {
         return fileName;
     }
     public void setFileName(String fileName) {
         this.fileName = fileName;
     }
     public int getLevel() {
         return level;
     }
     public void setLevel(int level) {
         this.level = level;
     }
 }