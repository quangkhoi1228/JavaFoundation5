package class18;

public class Main {

    /**
     * Cho phép định nghĩa các mức Rank: Silver, Gold, Diamond
     * 1. Mỗi mức rank sẽ có tên
     * 2. Cho phép nhập mức rank và so sánh với mức rank hiện tại của người dùng
     * và trả lời lại 1 câu
     * --
     * <p>
     * Gold
     * - name = Gold
     * <p>
     * <p>
     * Silver
     * - name = Silver
     * <p>
     * <p>
     * Diamond
     * - name = Diamond
     * <p>
     * <p>
     * Rank
     * - name: String
     */

    public static void main(String[] args) {
        // Bộ câu trả lời tuỳ theo mức rank hiện tại của người dùng
        JohnSmith johnSmithSilver = new JohnSmith();

//        johnSmithSilver.setAnswerForSilver("Chào bạn");
        johnSmithSilver.setAnswerForSilver(null);


        System.out.println(
                "Giá trị johnSmithSilver.answer Silver: "
                        + johnSmithSilver.getAnswerForSilver());

    }


}
