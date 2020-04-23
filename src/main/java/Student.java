public class Student {
    private String name;
    private char sex;
    private int japaneseScore;
    private int mathScore;
    private int scienceScore;
    private int societyScore;
    private int englishScore;

    public Student(String[] strings) {
        this.name = strings[0];
        this.sex = strings[1].charAt(0);
        this.japaneseScore = Integer.parseInt(strings[2]);
        this.mathScore = Integer.parseInt(strings[3]);
        this.scienceScore = Integer.parseInt(strings[4]);
        this.societyScore = Integer.parseInt(strings[5]);
        this.englishScore = Integer.parseInt(strings[6]);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getJapaneseScore() {
        return japaneseScore;
    }

    public void setJapaneseScore(int japaneseScore) {
        this.japaneseScore = japaneseScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getScienceScore() {
        return scienceScore;
    }

    public void setScienceScore(int scienceScore) {
        this.scienceScore = scienceScore;
    }

    public int getSocietyScore() {
        return societyScore;
    }

    public void setSocietyScore(int societyScore) {
        this.societyScore = societyScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", japanese_score=" + japaneseScore +
                ", math_score=" + mathScore +
                ", science_score=" + scienceScore +
                ", society_score=" + societyScore +
                ", english_score=" + englishScore +
                '}';
    }
}
