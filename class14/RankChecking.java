package class14;

import java.util.Scanner;

public class RankChecking {
    public static void main(String[] args) {
        /**
         * Cho ngươời dùng nhập mức rank hiện tại
         * 1. Kiểm tra mức rank ng dùng nhập có hợp lệ không
         * 2. Tuỳ theo mức rank của người dùng và mức rank người dùng nhập
         * mà sẽ thể hiện ra các câu thoại khác nhau
         */


        // Cho phép nhập mức rank từ người dùng
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vui lòng nhập mức rank của bạn: ");
        String rankInput = scanner.nextLine();


        // gold --> Gold : "gold" = "g" + "old" --> "G" + "old"  --> "Gold"

        // kiểm tra người dùng nhập có hợp lệ không
        // Gold, Silver, Diamond, Challenge <- danh sách hợp lệ
        // A <- user nhập
        // Nếu A == bất kỳ 1 item nào trong danh sách hợp lệ thì người dùng hợp lệ
        //                       0      1           2           3
        String[] rankList = {"Gold", "Silver", "Diamond", "Challenge", "Bạc", "Vàng", "Kim cương", "Thách đấu"}; // Gold,  gold , golD, gOld

        boolean isUserInputValid = false;
        String rankInputLowerCaseWithFirstLetterCapitalize = "";

        while (!isUserInputValid) {
            String rankInputLowerCase = rankInput.toLowerCase();
            // gold -> Gold
            String firstLetter = rankInputLowerCase.substring(0,
                    1).toUpperCase();
            String remain = rankInputLowerCase.substring(1);
            rankInputLowerCaseWithFirstLetterCapitalize = firstLetter + remain;

            for (int i = 0; i < rankList.length; i++) {
                String rankItem = rankList[i];

                if (rankInputLowerCaseWithFirstLetterCapitalize.equals(
                        rankItem)) {
                    // Gold --> toLowerCase --> gold == rankItem -> gold
                    isUserInputValid = true;
                    break;
                }
            }

            if (isUserInputValid) {
                System.out.println(
                        "Người dùng nhập hợp lệ: " + rankInputLowerCaseWithFirstLetterCapitalize);
            } else {
                System.out.print("Vui lòng nhập lại: ");
                rankInput = scanner.nextLine();
            }
        }


        // So sánh rank thực tế và rank được ng dùng nhập
        // bạc, Bạc, Vàng, Kim cương, Thách đấu
        switch (rankInputLowerCaseWithFirstLetterCapitalize) {
            case "Bạc":
                rankInputLowerCaseWithFirstLetterCapitalize = "Silver";
                break;
            case "Vàng":
                rankInputLowerCaseWithFirstLetterCapitalize = "Gold";
                break;
            case "Kim cương":
                rankInputLowerCaseWithFirstLetterCapitalize = "Diamond";
                break;
            case "Thách đấu":
                rankInputLowerCaseWithFirstLetterCapitalize = "Challenge";
                break;
            default:
                break;
        }


        String actualRank = "Silver";
        if (actualRank.equals(rankInputLowerCaseWithFirstLetterCapitalize)) {
            System.out.println("Bạn thật trung thực, cho bạn 100G nè ^.^");
        } else {
            System.out.println("Bạn thật hư -_-");
        }


    }
}
