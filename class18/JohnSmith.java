package class18;

public class JohnSmith {
    private String answerForSilver = "Tạm biệt";
    private String answerForGold;

    // getter và setter
    // getter
    public String getAnswerForSilver() {
        return this.answerForSilver;
    }

    // setter
    public void setAnswerForSilver(String answerForSilverNew) {
        // answerForSilverNew = Chào bạn

        if (answerForSilverNew == null) {
            System.out.println("Giá trị không hợp lệ");
        } else {
            this.answerForSilver = answerForSilverNew;

            //  this.answerForSilver = Chào bạn
        }
    }


}
